program Test10; (*Simple one time calculator*)
var
x, y, z, a: real;   (*variable declaration*)
begin
   writeln('Enter your operation: 1:add 2:subtract 3:multiply 4:divide');
   readln(a);
   writeln('Enter your first value: ');
   readln(x);
   writeln('Enter your second value: ');
   readln(y);

   case (a) of
      1: 
      begin
        z:=x+y;
        writeln('you chose addition!');
      end;
      2:
      begin
        z:=x-y;
        writeln('you chose subtraction!');
      end;
      3:
      begin
        z:=x*y;
        writeln('you chose multiplication!');
      end;
      4:
      begin
        z:=x/y;
        writeln('you chose division!');
      end;
      else:
      begin
        z:=sin(x)*sin(x) + cos(x)*cos(x); (*always returns 1.0*)
        writeln('you didnt pick correctly, let us doing something else');
      end;
   end;

   writeln('Your result is ', z);
end.