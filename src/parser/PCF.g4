grammar PCF;

// règles syntaxiques

program : term EOF ;
term : LIT                                   # Lit
     | VAR                                   # Var
     | term term                             # Apply
     | term OPP term                         # BinOp
     | term OP term                          # BinOp
     | FUN VAR ARROW term                    # Fun
     | FIX VAR term                          # Fix
     | IFZ term THEN term ELSE term          # Cond
     | LET VAR EQUAL term IN term            # Let
     | PARENLEFT term PARENRIGHT             # Par
     ;

// règles lexicales

LIT : '0' | [1-9][0-9]* ;
OPP  : '*' | '/' ;
OP  : '+' | '-' ;
IFZ  : 'ifz';
THEN : 'then';
ELSE : 'else';
LET : 'let';
EQUAL : '=';
IN: 'in';
FUN: 'fun';
FIX: 'fix';
ARROW: '->';
PARENLEFT: '(';
PARENRIGHT: ')';
VAR : [a-zA-Z_] [a-zA-Z0-9_]*;
WS: ('\n' | '\r' | '\t' | ' ') -> skip;
