program Test5; (*Tests for arithmetic expressions*)
var
r, d, c, x, grade: real; 

begin
   r := 4;
   d := 100;
   c := 0;
   x := -1;
   writeln(d*x); (*Should output -100*)
   r := 150-d/4; (*Should set r to 125*)
   writeln(r + c); (*Should output 125*)
end. 