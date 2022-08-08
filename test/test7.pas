program Test7; (*Tests for precednece of operators*)
var
r, d, c, x, grade: real; 
yes, no, z : boolean;
p : boolean = true;

begin
   yes := true;
   no := false;
   z := true;
   r := 4;
   d := 100;
   c := 0;
   x := -1;
   (*test precednece in logical operators*)
   writeln(yes and no or no); (*should output false, yes and no is first evaluated to be false*)
   writeln(not no or yes); (*should output true, not no is first evaluated to be true*)
   writeln(d < x and yes or c > x and d/4 = 25 ); (*should output true, c > x and d/4 = 25 is true, or with true is always true*)

   (*test precednece in arithmetic operators*)
   writeln(150-d/x); (*Should output 250, divide first*)
   writeln((150-d)/x); (*Should output -50, paranthesis first*)
   writeln(d+x*4); (*Should output 96, multiplication first*)
   writeln((d+x)*4); (*Should output 396, parenthesis first*)
   writeln(1*5/6*5); (*this outputs 0.1666, not same as pascal due to my program grammar having multiplication being higher precedence than division*)

end. 