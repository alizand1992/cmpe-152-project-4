grammar lala;

// NON TERMINALS
program: block;
block: OFB assign CFB;
assign: INT ID EQ NUM SEMI;

// TERMINALS
WS: [ \t\r\n]+ -> skip;
INT: 'int';
EQ: '=';
OFB: '{';
CFB: '}';
SEMI: ';';
NUM: ( [0] | [1-9][0-9]*);
ID: ([a-zA-Z])+;
