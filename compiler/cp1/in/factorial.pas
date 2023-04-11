program factorial;
var
  n: integer;

function factorial(const n: integer) : integer;
var
  result, i: integer;
begin
  result := 1;
  for i := n downto 1 do
    begin
      result := result * i;
    end;

  factorial := result;
end;

begin
  readln(n);
  writeln(factorial(n)); 
end.
