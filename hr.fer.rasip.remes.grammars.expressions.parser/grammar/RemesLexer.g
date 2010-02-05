lexer grammar RemesLexer;

options {
  language = Java;
}

@lexer::header {
package hr.fer.rasip.remes.grammars.expressions.parser;
}

TRUE    : 'true';
FALSE   : 'false';

LPAREN  : '(';
RPAREN  : ')';
LBRACKET: '[';
RBRACKET: ']';
          
ASSIGN  : ':=';
PLUS_A  : '+=';
MINUS_A : '-=';
MUL_A   : '*=';
DIV_A   : '/=';
MOD_A   : '%=';  
        
LT      : '<';
LE      : '<=';
EQ      : '==';
NE      : '!=';
GT      : '>';
GE      : '>=';
        
PLUS    : '+';
MINUS   : '-';
MUL     : '*';
DIV     : '/';
MOD     : '%';
        
EXCL    : '!';
AMPAMP  : '&&';
BARBAR  : '||';
LIT_NOT : 'not';
LIT_AND : 'and';
LIT_OR  : 'or';
        
QUESTION: '?';
COLON   : ':';
COMMA   : ','; 
        
TICK    : '\'';
IS      : '=';

ID  
  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

NAT 
  : '0'..'9'+
  ;

COMMENT
  : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
  | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
  ;

WS  
  : ( ' '
  | '\t'
  | '\r'
  | '\n'
  ) {$channel=HIDDEN;}
  ;