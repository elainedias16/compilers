lexer grammar Pascal;

fragment INT_VALUE  : [0-9]+ ;
fragment REAL_VALUE : INT_VALUE '.' INT_VALUE ;
fragment BOOLEAN_VALUE : (('true') | ('false'));
fragment ID_VALUE   : [A-Za-z][A-Za-z0-9_]* ;
fragment STR_VALUE  : '"'~["]*'"' ;
fragment LINE_COMMENT : '//' ~[\n]* [\n] ;
fragment MULTILINE_COMMENT1 :  '{' ~[}]* '}' ;
//fragment FECH : '*)' ;
//fragment MULTILINE_COMMENT2 : '(*' (~'*)')* '*)' ;

// Ignorar comentários, espaços e quebras de linha. 
WS          : [ \t\n]+      -> skip ;
// COMMENT     : (LINE_COMMENT | MULTILINE_COMMENT1 | MULTILINE_COMMENT2 ) -> skip ;
COMMENT     : (LINE_COMMENT | MULTILINE_COMMENT1) -> skip ;


// Palavras reservadas.
PROGRAM     : 'program' ; 
CONST       : 'const' ;
VAR         : 'var' ;
BEGIN       : 'begin' ;
END         : 'end' ;
LABEL       : 'label' ;
PACKED      : 'packed' ;

FUNCTION    : 'function';
PROCEDURE   : 'procedure';

// Tipos primitivos.
INTEGER     : 'integer' ;
SMALLINT    : 'smallint' ;
LONGINT     : 'longint' ;
REAL        : 'real' ;
BOOLEAN     : 'boolean' ;
STRING      : 'string' ;
CHAR        : 'char' ;
BYTE        : 'byte' ;
ARRAY       : 'array' ;
FILE        : 'file' ;

// Estruturas de controle de fluxo e repetição.
IF          : 'if' ;
THEN        : 'then' ;
ELSE        : 'else' ;
FOR         : 'for' ;
TO          : 'to' ;
DOWNTO      : 'downto' ;
IN          : 'in' ;
WHILE       : 'while' ;
DO          : 'do' ;
CASE        : 'case' ;
OF          : 'of' ;
GOTO        : 'goto' ;
REPEAT      : 'repeat' ;
UNTIL       : 'until' ;

// Operadores lógicos.
AND         : 'and' ; 
OR          : 'or' ;
NOT         : 'not' ;
NIL         : 'nil' ;

RECORD      : 'record' ;
SET         : 'set' ;
TYPE        : 'type' ;
WITH        : 'with' ;

// Manipulação de ponteiros.
POINTER     : '↑' ;
DISPOSE     : 'dispose' ;
NEW         : 'new' ;

// Operadores aritméticos e de comparação.
PLUS        : '+' ;
MINUS       : '-' ; 
ASTERISK    : '*' ; 
SLASH       : '/' ; 
EQUAL       : '=' ; 
LESSTHAN    : '<' ;
GREATERTHAN : '>' ;
LBRACK      : '[' ;
RBRACK      : ']' ;
PERIOD      : '.' ;
COMMA       : ',' ; 
COLON       : ':' ; 
SEMICOLON   : ';' ; 
LPAR        : '(' ;
RPAR        : ')' ;
NOTEQUAL    : '<>' ; 
LEQ         : '<=' ;
BEQ         : '>=' ;
BECOMES     : ':=' ;
RANGE       : '..' ;

// Funções matemáticas.
ABS         : 'abs' ;
ARCTAN      : 'arctan' ;
COS         : 'cos' ;
EXP         : 'exp' ;
LN          : 'ln' ;
SIN         : 'sin' ;
SQR         : 'sqr' ;
SQRT        : 'sqrt' ;
DIV         : 'div' ;
MOD         : 'mod' ;
ROUND       : 'round' ;
TRUNC       : 'trunc' ;

CHR         : 'chr' ;
ORD         : 'ord' ;
PRED        : 'pred' ;
SUCC        : 'succ' ;

ENDOFFILE   : 'eof' ;
EOLN        : 'eoln' ;
ODD         : 'odd' ;

// Manipulação de entrada e saída em arquivos, stdin e stdout.
GET         : 'get' ;
PAGE        : 'page' ;
PUT         : 'put' ;
READ        : 'read' ;
READLN      : 'readln' ;
RESET       : 'reset' ;
REWRITE     : 'rewrite' ;
WRITE       : 'write' ;
WRITELN     : 'writeln' ;

INT_VAL     : INT_VALUE ;
REAL_VAL    : REAL_VALUE ;
STRING_VAL  : STR_VALUE ;
BOOLEAN_VAL : BOOLEAN_VALUE ;

ID          : ID_VALUE ;

UNKNOWN : . ;

// TO DO:
// - construir casos de teste;

// PERGUNTAR AO ZANBOM:
// - regex de comentário de '*)', pois nao é possível negar uma ER;
// - token de 1 pra 1 o nome fica o nome do lexema ao invés do nome to token; 
// - ver o que já pode remover da linguagem, por exemplo manipulação de arquivos;