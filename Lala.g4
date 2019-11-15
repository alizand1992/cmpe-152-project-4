grammar Lala;

// NON TERMINALS
program: block;
block: OFB addexpr CFB;
// assign: INT ID EQ NUM SEMI;
addexpr: ID EQ NUM NUM PLUS SEMI;


// TERMINALS
WS: [ \t\r\n]+ -> skip;
INT: 'int';
EQ: '=';
OFB: '{';
CFB: '}';
SEMI: ';';
PLUS: '+';
NUM: ( [0] | [1-9][0-9]*);
ID: ([a-zA-Z])+;
