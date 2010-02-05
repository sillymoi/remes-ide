grammar RemesResource;

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

resource_expression
  : ID diffOp^ IS! sign_expression
  | EOF
  ;

diffOp
  : TICK
  ;

sign_expression
  : PLUS sign_expression  ->  ^(UNARY_PLUS[$PLUS, "UNARY_PLUS"] sign_expression)
  | MINUS sign_expression ->  ^(UNARY_MINUS[$MINUS, "UNARY_MINUS"] sign_expression)
  | constant
  ;
  
constant
  : NAT
  ;
