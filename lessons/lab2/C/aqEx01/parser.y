
%output "parser.c"
%defines "parser.h"
%define parse.error verbose
%define parse.lac full

%{
#include <stdio.h>

int yylex(void);
void yyerror(char const *s);
%}

%token NUMBER PLUS ENTER LPAR RPAR CHAR_A
%left PLUS  // Soma eh associativa a esquerda.

%%

line: expr ENTER ;
expr: LPAR expr RPAR | CHAR_A 


%%

int main(void) {
    if (yyparse() == 0) printf("PARSE SUCCESSFUL!\n");
    else                printf("PARSE FAILED!\n");
    return 0;
}
