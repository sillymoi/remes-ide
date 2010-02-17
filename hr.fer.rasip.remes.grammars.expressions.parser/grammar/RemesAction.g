grammar RemesAction;

options {
//    backtrack = true; 
//    memoize = true;
    output = AST;
//    ASTLabelType = CommonTree;
}

import RemesLexer;

// The ordering of these tokens must be the same in all Remes grammars
tokens {
  UNARY_PLUS;
  UNARY_MINUS;
  UNARY_SIGN;
  ARRAY;
}

@header {
package hr.fer.rasip.remes.grammars.expressions.parser;
}

action_expression
  : assignment_expression (COMMA! assignment_expression)*
  | EOF
  ;
  
assignment_expression
  : variable assignOp^ ternary_expression
  ;

invariant_expression
  : ternary_expression
  | EOF
  ;

ternary_expression
  : or_expression (QUESTION^ or_expression COLON! or_expression)?
  ;

or_expression
  : and_expression ( orOp^ and_expression )*
  ;

and_expression
  : compare_expression ( andOp^ compare_expression )*
  ;

compare_expression
  : add_expression ( compareOp^ add_expression )*
  ;
  
add_expression
  : multiply_expression ( addOp^ multiply_expression )*
  ;
  
multiply_expression
  : sign_expression ( mulOp^ sign_expression )*
  ;

sign_expression
  : PLUS sign_expression  ->  ^(UNARY_PLUS[$PLUS, "UNARY_PLUS"] sign_expression)
  | MINUS sign_expression ->  ^(UNARY_MINUS[$MINUS, "UNARY_MINUS"] sign_expression)
  | unary_expression
  ;

unary_expression
  : (notOp^)* primary_expression
  ; 

primary_expression
  : variable
  | literal
  | constant
  | par_expression
  ;

variable
  : ID (LBRACKET^ ternary_expression RBRACKET!)? //-> ^(ARRAY[$LBRACKET, "ARRAY"] ID invariant_expression)
  ;
  
literal
  : TRUE
  | FALSE
  ; 

constant
  : NAT
  | FLOAT
  ;

par_expression
  : LPAREN! invariant_expression RPAREN!
  ;

/* Operators */

compareOp
  : LT
  | LE
  | EQ
  | NE
  | GE
  | GT
  ; 

addOp
  : PLUS
  | MINUS
  ;
  
mulOp
  : MUL
  | DIV
  | MOD
  ;
  
notOp
  : EXCL
  | LIT_NOT 
  ;

andOp
  : AMPAMP
  | LIT_AND
  ;
  
orOp
  : BARBAR
  | LIT_OR
  ;

assignOp
  : ASSIGN
  | PLUS_A
  | MINUS_A
  | MUL_A
  | DIV_A
  | MOD_A
  ;
