program Test11; (*Simple circle circumference calculator*)
var
r, d, c : real;   (*variable declaration: radius, dia, circumference*)
PI : real = 3.141592654;

begin
   writeln('Enter the radius of the circle');
   readln(r);
   
   d := 2 * r;
   c :=  PI * d;
   writeln('The circumference of the circle is ', c);
end.