program uppercase;

var
  s: string;

function isLower(c: char) : boolean;
begin
  if (ord(c) >= ord('a')) and (ord(c) <= ord('z')) then
  begin
    isLower := true;
  end
  else
  begin
    isLower := false;
  end; 
end;

function toUpperChar(c: char) : char;
begin
  if isLower(c) then
  begin
    toUpperChar := Char(ord(c) - 32);
  end
  else
  begin
    toUpperChar := c;
  end;
end;

function toUpperString(s: string) : string; { var faz passagem por referência }
var
  i: integer;
begin
  for i := 0 to length(s) do
  begin
    s[i] := toUpperChar(s[i]);
  end;

  toUpperString := s;
end;

begin
  readln(s);
  s := toUpperString(s);
  writeln(s);
end.
