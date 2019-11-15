grammar Lala;

// NON TERMINALS
program: block;
block: OFB print CFB;
// assign: INT ID EQ NUM SEMI;
addexpr: ID EQ NUM NUM PLUS SEMI;
print: PRINT value SEMI;
value: NUM | string;
string: DQ STR DQ;

// TERMINALS
WS: [ \t\r\n]+ -> skip;
PRINT: 'print';
INT: 'int';
EQ: '=';
OFB: '{';
CFB: '}';
SEMI: ';';
PLUS: '+';
DQ: '"';
STR: ([a-zA-Z0-9]+);
NUM: ( [0] | [1-9][0-9]*);
ID: ([a-zA-Z])+;
