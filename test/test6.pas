program Test6; (*Tests for boolean expressions*)
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
   x := -1/3;
   writeln(yes and no); (*should output false*)
   writeln(yes or no); (*should output true*)
   writeln(not z); (*should output false*)
   writeln(r < d); (*should output true*)
   writeln(x = x); (*should output true*)
   writeln(c <> c); (*not equal operator, should output false*)
   writeln(x >= x);  (* should output true*)
   writeln(x >= x and no);  (* should output false*)
end. 