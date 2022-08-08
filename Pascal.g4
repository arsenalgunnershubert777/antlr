grammar Pascal;

@header {
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.Stack;
}

@members {
HashMap<String, Double> real_memory = new HashMap<>();
HashMap<String, Boolean> bool_memory = new HashMap<>();
ArrayList<String> variables = new ArrayList<>();
Scanner sc = new Scanner(System.in);
Stack<Boolean> caseStatMatch = new Stack<>();
final double THRESHOLD = .0001;
}

start: progName varDec? mainBlock EOF;

progName: PROGRAM NAME ';'; 


varDec: 
    VAR varLists+;  
    

varLists:
    (varName[true]',')* varName[true] ':' REALTYPE ';' {
        while (!variables.isEmpty()) {
            String var = variables.remove(0);
            if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
                real_memory.put(var, new Double(0.0));
            }
        }

    }
    | NAME ':' REALTYPE '=' expr ';' {
        String var = $NAME.text;
        if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
            Double value = $expr.value;        
            real_memory.put(var, value);
        }
    }
    | (varName[true]',')* varName[true] ':' BOOLEAN ';' {
        while (!variables.isEmpty()) {
            String var = variables.remove(0);
            if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
                bool_memory.put(var, false);
            }
        }
    }
    | NAME ':' BOOLEAN '=' boolExpr';' {
        String var = $NAME.text;
        if (!real_memory.containsKey(var) && !bool_memory.containsKey(var)) {
            Boolean bool = $boolExpr.bool;        
            bool_memory.put(var, bool);
        }
    }
    ;


varName[Boolean active]:
    NAME {if ($active) {variables.add($NAME.text);}}
    //|   varName ',' varName
    ;

mainBlock:   BEGIN statFull[true]* END '.';
                
statFull[Boolean active]:   
    stat[$active] ';'
    ;

stat[Boolean active]:
        NAME ':=' boolExpr {if ($active && bool_memory.containsKey($NAME.text)) {bool_memory.put($NAME.text, new Boolean($boolExpr.bool));}}
    |   NAME ':=' expr  {if ($active && real_memory.containsKey($NAME.text)) {real_memory.put($NAME.text, new Double($expr.value));}}
    |   writeStat[$active]
    |   readStat[$active]
    |   ifStat[$active]
    |   caseStat[$active] 
    ;

writeStat[Boolean active]:
    WRITELN '(' (writeBlock[$active] ',')* writeBlock[$active] ')' {
            if ($active) {
                System.out.println();
            }
        }
    ;

writeBlock[Boolean active]:
    STRING {
        if ($active) {
            String str = $STRING.text;
            String out_str = str.substring(1, str.length()-1);
            System.out.print(out_str);
        }
    }
    | (varName[$active]',')* varName[$active] {
        if ($active) {
            while (!variables.isEmpty()) {
                String var = variables.remove(0);
                if (real_memory.containsKey(var)) { 
                    System.out.print(real_memory.get(var));
                }
                else if (bool_memory.containsKey(var)) {
                    System.out.print(bool_memory.get(var));
                }
            }
        }

    }
    | expr {if ($active) {System.out.print($expr.value);}}
    | boolExpr {if ($active) {System.out.print($boolExpr.bool);}}
    ;

readStat[Boolean active]:
    READLN  '(' (varName[true]',')* varName[true] ')' {
            if ($active) {
                while (!variables.isEmpty()) {
                    String var = variables.remove(0);
                    if (real_memory.containsKey(var)) { 
                        Double value = sc.nextDouble();
                        real_memory.put(var, value);
                    }
                    else if (bool_memory.containsKey(var)) {
                        Boolean bool = sc.nextBoolean();
                        bool_memory.put(var, bool);
                    }
                }
                
            }

        }
    ;

ifStat[Boolean active]: 
        IF '(' nextActive=boolExpr ')' THEN BEGIN statFull[$active && $nextActive.bool]+ END ELSE BEGIN statFull[$active && !$nextActive.bool]+ END
    |   IF '(' nextActive=boolExpr ')' THEN BEGIN statFull[$active && $nextActive.bool]+ END ELSE stat[$active && !$nextActive.bool]
    |   IF '(' nextActive=boolExpr ')' THEN stat[$active && $nextActive.bool] ELSE BEGIN statFull[$active && !$nextActive.bool]+ END
    |   IF '(' nextActive=boolExpr ')' THEN stat[$active && $nextActive.bool] ELSE stat[$active && !$nextActive.bool]
    |   IF '(' nextActive=boolExpr ')' THEN BEGIN statFull[$active && $nextActive.bool]+ END
    |   IF '(' nextActive=boolExpr ')' THEN stat[$active && $nextActive.bool]
    ;

caseBegin[Boolean active]:
    CASE {if ($active) {caseStatMatch.push(false);}}
    ;

caseStat[Boolean active]: caseBegin[$active] '('boolIndex=boolExpr ')'OF boolCase[$active, $boolIndex.bool]+ END {if ($active) {caseStatMatch.pop();} }
    |   caseBegin[$active] '('boolIndex=boolExpr ')'OF boolCase[$active, $boolIndex.bool]+ elseCase[$active] END {if ($active) {caseStatMatch.pop();} }
    |   caseBegin[$active]  '(' doubleIndex=expr ')' OF doubleCase[$active, $doubleIndex.value]+ END {if ($active) {caseStatMatch.pop();} }
    |   caseBegin[$active]  '(' doubleIndex=expr ')' OF doubleCase[$active, $doubleIndex.value]+ elseCase[$active] END {if ($active) {caseStatMatch.pop();} }
    ;

boolCase[Boolean active, Boolean index]: check=checkBoolCase[$active, $index] ':' statFull[$check.nextActive] 
    |   check=checkBoolCase[$active, $index] ':' BEGIN statFull[$check.nextActive]+ END ';' 
    ;

checkBoolCase[Boolean active, Boolean index] returns[Boolean nextActive]: BOOL
{
    if ($active) {

        if (caseStatMatch.peek() == false) {
            $nextActive = $index == Boolean.parseBoolean($BOOL.text) ? true : false;
            if ($nextActive) {
                caseStatMatch.pop();
                caseStatMatch.push(true);
            }
        }
        else {
            $nextActive = false;
        }
    }
    else {
        $nextActive = false;
    }
};

elseCase[Boolean active]: check=checkElseCase[$active] ':' statFull[$check.nextActive] 
    |   check=checkElseCase[$active] ':' BEGIN statFull[$check.nextActive]+ END ';' 
    ;

checkElseCase[Boolean active] returns[Boolean nextActive]: ELSE 
{
    if ($active) {

        if (caseStatMatch.peek() == false) {
            $nextActive = true;
            if ($nextActive) {
                caseStatMatch.pop();
                caseStatMatch.push(true);
            }
        }
        else {
            $nextActive = false;
        }
    }
    else {
        $nextActive = false;
    }
};


doubleCase[Boolean active, Double index]: check=checkDoubleCase[$active, $index] ':' statFull[$check.nextActive]
    |   check=checkDoubleCase[$active, $index] ':' BEGIN statFull[$check.nextActive]+ END ';'
    ;

checkDoubleCase[Boolean active, Double index] returns[Boolean nextActive]: REAL 
{
    if ($active) {

        if (caseStatMatch.peek() == false) {
            $nextActive = ((Long)Math.round($index)) == (Long)Math.round(Double.parseDouble($REAL.text)) ? true : false;
            if ($nextActive) {
                caseStatMatch.pop();
                caseStatMatch.push(true);
            }
        }
        else {
            $nextActive = false;
        }
    }
    else {
        $nextActive = false;
    }

};

expr returns[Double value]:
    '(' e=expr ')' { $value = $e.value; }
    | el=expr '*' er=expr { $value = $el.value * $er.value; }
    | el=expr '/' er=expr { $value = $el.value / $er.value; }
    | el=expr '+' er=expr { $value = $el.value + $er.value; }
    | el=expr '-' er=expr { $value = $el.value - $er.value; }
    | SINE '(' expr ')' {$value = Math.sin($expr.value); }
    | COSINE '(' expr ')' {$value = Math.cos($expr.value); }
    | LN '(' expr ')' {$value = Math.log($expr.value); }
    | EXP '(' expr ')' {$value = Math.exp($expr.value); }
    | SQRT '(' expr ')' {$value = Math.sqrt($expr.value);}
    | REAL {$value = Double.parseDouble($REAL.text);}
    | NAME
        {
        Double r = real_memory.get($NAME.text);
        if ( r!=null ) $value = r.doubleValue();
        else System.err.println("undefined variable "+$NAME.text);
        }
    ;



boolExpr returns[Boolean bool]:
    '(' b=boolExpr ')' { $bool = $b.bool; }
    | NOT b = boolExpr {$bool = !$b.bool;}
    | bl = boolExpr AND br = boolExpr {$bool = $bl.bool && $br.bool;}
    | bl = boolExpr OR br = boolExpr {$bool = $bl.bool || $br.bool;}
    | el = expr '=' er = expr {$bool = Math.abs($el.value - $er.value) < THRESHOLD ? true : false;}
    | el = expr '<>' er = expr {$bool = Math.abs($el.value - $er.value) > THRESHOLD ? true : false;}
    | el = expr '<' er = expr {$bool = $el.value < $er.value ? true : false;}
    | el = expr '<=' er = expr {$bool = $el.value <= $er.value ? true : false;}
    | el = expr '>' er = expr {$bool = $el.value > $er.value ? true : false;}
    | el = expr '>=' er = expr {$bool = $el.value >= $er.value ? true : false;}
    | BOOL {$bool= Boolean.parseBoolean($BOOL.text);}
    | NAME
        {
        Boolean b = bool_memory.get($NAME.text);
        if ( b!=null ) $bool = b.booleanValue();
        else System.err.println("undefined variable "+$NAME.text);
        } 
    ;


PROGRAM: P R O G R A M;
VAR: V A R;
REALTYPE: R E A L;
BOOLEAN: B O O L E A N;

AND : A N D;
OR: O R;
NOT: N O T;

IF: I F;
THEN: T H E N;
ELSE: E L S E;

CASE: C A S E;
OF: O F;
BEGIN: B E G I N;
END: E N D;


READLN: R E A D L N;
WRITELN: W R I T E L N;

REAL :   [-]?[0-9]* '.'? [0-9]+;

BOOL: TRUE | FALSE;
TRUE: T R U E;
FALSE: F A L S E;

SQRT: S Q R T;
SINE: S I N;
COSINE: C O S;
LN: L N;
EXP: E X P;

NAME : [_A-Za-z][_A-Za-z0-9]*;



STRING: '\''.*?'\'';
WS : [ \t\r\n]+ -> skip ;

COMMENT: '(*' .*? '*)' -> skip;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');