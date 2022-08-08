program Test8; (*Tests for decision making*)
var
r, d, c, x, grade: real; 
yes, no, z : boolean;
p : boolean = true;

begin
   z := true;
   x := 1;
   c := 1.2;
   
   (*test basic if else then statements*)
    if (z) then
        writeln('Should print here')
    else
        writeln('Not here');
    
    if (x > c) then
        begin
            writeln('Not printing here');
            writeln('nor here');
        end
    else 
        begin
            writeln('Prints here!');
        end;

    (*test basic case statements*)

    case (x) of
        0:writeln('not here');
        1:writeln('print here!');
        2:writeln('not here');
        3:writeln('not here');
        else:writeln('not here either');
    end;

    case (not z) of
        true: 
            begin
                writeln('not here');
                writeln('nope');
            end;
        else:
            begin
                writeln('got to the right place again!');
                writeln('yay!');
            end;
    end;

end. 