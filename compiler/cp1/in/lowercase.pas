program lowercase;

var
  s: string;

function isUpper(c: char) : boolean;
begin
  if (ord(c) >= ord('A')) and (ord(c) <= ord('Z')) then
  begin
    isUpper := true;
  end
  else
  begin
    isUpper := false;
  end; 
end;

function toLowerChar(c: char) : char;
begin
  if isUpper(c) then
  begin
    toLowerChar := Char(ord(c) + 32);
  end
  else
  begin
    toLowerChar := c;
  end;
end;

function toLowerString(s: string) : string; { var faz passagem por referência }
var
  i: integer;
begin
  for i := 0 to length(s) do
  begin
    s[i] := toLowerChar(s[i]);
  end;

  toLowerString := s;
end;

begin
  readln(s);
  s := toLowerString(s);
  writeln(s);
end.
