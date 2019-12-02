grammar Lala;

program : block;
block : OFB decls stmts CFB;
decls :  | decls decl;
decl : type ID SEMI;
type : INT | FLOAT | BOOL;
stmts : | stmts stmt;
stmt :  IF OB allexpr CB stmt | IF OB allexpr CB stmt ELSE stmt | WHILE OB allexpr CB stmt | DO stmt WHILE OB allexpr CB SEMI | FOR OB assign allexpr SEMI incdecexpr CB stmt | BREAK SEMI | block
| assign | print;
assign : ID EQUAL allexpr SEMI;
allexpr : allexpr OR andexpr | andexpr;
andexpr : andexpr AND equal | equal;
equal : equal EQUAL EQUAL rel | equal NOT EQUAL rel | rel;
rel : expr LT expr | expr GTE expr | expr GT expr | expr LTE expr | expr;
expr : expr PLUS term | expr MINUS term | term;
term : term MUL factor | term DIV factor | factor MUL term | factor;
incdecexpr : ID PLUS PLUS|  ID MINUS MINUS;
factor :  OB allexpr CB | incdecexpr | ID | NUM | REAL | TRUE | FALSE;
print: PRINT REAL SEMI | PRINT NUM SEMI | PRINT ID SEMI;

INT : 'int';
FLOAT : 'float';
BOOL : 'bool';
IF : 'if';
WHILE : 'while';
ELSE : 'else';
BREAK : 'break';
FOR : 'for';
DO : 'do';
AND : '&&';
PRINT : 'print';
REAL : [0-9]+ . [0-9]*[1-9];
NUM : ( [0] | [1-9][0-9]*);
TRUE : 'true' | '1';
FALSE : 'false' | '0';
LT : '<';
LTE : '<=';
GTE : '>=';
GT : '>';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
SEMI : ';';
EQUAL : '=';
NOT : '!';
OR : '||';
OB : '(';
CB : ')';
WS : [ \t\r\n]+ -> skip;
OFB : '{';
CFB : '}';
ID : ([a-zA-Z])+;
