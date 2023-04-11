program mean;

var 
  size, i, sum, element: integer;
  numbers: array of integer;
  result: real;
  
begin
  readln(size);
  setLength(numbers, size);

  for i := 0 to size - 1 do
  begin
    readln(numbers[i]);
    writeln('aqui');
  end;
  
  sum := 0;

  for i := 0 to size do
  begin
    sum := sum + numbers[i];
  end;

  result := sum / size;
  writeln(result);
end.
