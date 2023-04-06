lexer grammar Q01;

fragment COMMENT : [#].*;

WS     : (COMMENT) -> skip ;
CHAR   : . ;


