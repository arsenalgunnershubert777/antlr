program Test13; (*tests some nested if-else-then and case statements*)
var
r, d, c, x, grade: real; 
y : real = sin(.56);
yes, no, z : boolean;
begin
    writeln(y); (*outputs y = sin(0.56) which is 0.531*)
    x:=1.0;
    z:= true;

    if (z) then
        y:=2.0 (*y is set to 2*)
    else
        y:=0.0;

    writeln(3.0*(x+y)); (*outputs 9*)

    grade := 4.0;
    case (z) of
        true : 
            begin 
                writeln('correct output for this case statement');
                case (grade) of
                    1: writeln('not correct');
                    2: writeln('not correct');
                    3: writeln('not correct');
                    else: 
                        begin
                            writeln('correct output for this case statement within a case statement');
                        end;
                end;
            end;
        false: writeln(' not correct');
        else: writeln('POOPS');
    end;

    if (z and x < y) then 
        begin
            writeln('correct for first level if statement');
            if (100 = 100) then
                if (true) then
                    writeln('correct for second level if statement')
                else
                    writeln('not supposed to get here')
            else 
                if (false) then
                    begin 
                        writeln('NOPE!!');
                    end
                else 
                    begin
                        writeln('NOT HERE');
                    end;
        end
    else
        begin 
            writeln('other place, not supposed to get here');
        end;

end. 