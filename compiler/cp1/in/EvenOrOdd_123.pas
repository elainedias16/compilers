program evenOrOdd;
var
  num: integer;
begin
  read(num);

  if (num MOD 2 = 1) then begin
    write(num);
    write(' is odd!');
  end
  else begin
    write(num);
    write(' is even!');
  end
end.
