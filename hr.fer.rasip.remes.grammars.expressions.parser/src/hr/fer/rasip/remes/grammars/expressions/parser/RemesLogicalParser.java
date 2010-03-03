// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g 2010-02-26 10:42:55

package hr.fer.rasip.remes.grammars.expressions.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RemesLogicalParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TRUE", "FALSE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "ASSIGN", "PLUS_A", "MINUS_A", "MUL_A", "DIV_A", "MOD_A", "LT", "LE", "EQ", "NE", "GT", "GE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXCL", "AMPAMP", "BARBAR", "LIT_NOT", "LIT_AND", "LIT_OR", "QUESTION", "COLON", "COMMA", "TICK", "IS", "ID", "NAT", "FLOAT", "COMMENT", "WS", "UNARY_PLUS", "UNARY_MINUS", "UNARY_SIGN", "ARRAY"
    };
    public static final int LT=16;
    public static final int LIT_OR=32;
    public static final int MOD=26;
    public static final int DIV_A=14;
    public static final int EXCL=27;
    public static final int FLOAT=40;
    public static final int ID=38;
    public static final int NAT=39;
    public static final int EOF=-1;
    public static final int LIT_NOT=30;
    public static final int LPAREN=6;
    public static final int UNARY_PLUS=43;
    public static final int LBRACKET=8;
    public static final int RPAREN=7;
    public static final int COMMA=35;
    public static final int IS=37;
    public static final int PLUS=22;
    public static final int BARBAR=29;
    public static final int EQ=18;
    public static final int RBRACKET=9;
    public static final int AMPAMP=28;
    public static final int COMMENT=41;
    public static final int ARRAY=46;
    public static final int NE=19;
    public static final int GE=21;
    public static final int TICK=36;
    public static final int MOD_A=15;
    public static final int MINUS_A=12;
    public static final int UNARY_MINUS=44;
    public static final int MINUS=23;
    public static final int TRUE=4;
    public static final int MUL=24;
    public static final int MUL_A=13;
    public static final int COLON=34;
    public static final int WS=42;
    public static final int QUESTION=33;
    public static final int UNARY_SIGN=45;
    public static final int PLUS_A=11;
    public static final int ASSIGN=10;
    public static final int GT=20;
    public static final int LIT_AND=31;
    public static final int DIV=25;
    public static final int FALSE=5;
    public static final int LE=17;

    // delegates
    // delegators


        public RemesLogicalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RemesLogicalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RemesLogicalParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g"; }


    public static class invariant_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invariant_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:24:1: invariant_expression : ( ternary_expression | EOF );
    public final RemesLogicalParser.invariant_expression_return invariant_expression() throws RecognitionException {
        RemesLogicalParser.invariant_expression_return retval = new RemesLogicalParser.invariant_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        RemesLogicalParser.ternary_expression_return ternary_expression1 = null;


        Object EOF2_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:25:3: ( ternary_expression | EOF )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=TRUE && LA1_0<=LPAREN)||(LA1_0>=PLUS && LA1_0<=MINUS)||LA1_0==EXCL||LA1_0==LIT_NOT||(LA1_0>=ID && LA1_0<=FLOAT)) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:25:5: ternary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternary_expression_in_invariant_expression69);
                    ternary_expression1=ternary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, ternary_expression1.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:26:5: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_invariant_expression75); 
                    EOF2_tree = (Object)adaptor.create(EOF2);
                    adaptor.addChild(root_0, EOF2_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "invariant_expression"

    public static class ternary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternary_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:29:1: ternary_expression : or_expression ( QUESTION or_expression COLON or_expression )? ;
    public final RemesLogicalParser.ternary_expression_return ternary_expression() throws RecognitionException {
        RemesLogicalParser.ternary_expression_return retval = new RemesLogicalParser.ternary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION4=null;
        Token COLON6=null;
        RemesLogicalParser.or_expression_return or_expression3 = null;

        RemesLogicalParser.or_expression_return or_expression5 = null;

        RemesLogicalParser.or_expression_return or_expression7 = null;


        Object QUESTION4_tree=null;
        Object COLON6_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:30:3: ( or_expression ( QUESTION or_expression COLON or_expression )? )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:30:5: or_expression ( QUESTION or_expression COLON or_expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expression_in_ternary_expression88);
            or_expression3=or_expression();

            state._fsp--;

            adaptor.addChild(root_0, or_expression3.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:30:19: ( QUESTION or_expression COLON or_expression )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==QUESTION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:30:20: QUESTION or_expression COLON or_expression
                    {
                    QUESTION4=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_ternary_expression91); 
                    QUESTION4_tree = (Object)adaptor.create(QUESTION4);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION4_tree, root_0);

                    pushFollow(FOLLOW_or_expression_in_ternary_expression94);
                    or_expression5=or_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, or_expression5.getTree());
                    COLON6=(Token)match(input,COLON,FOLLOW_COLON_in_ternary_expression96); 
                    pushFollow(FOLLOW_or_expression_in_ternary_expression99);
                    or_expression7=or_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, or_expression7.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ternary_expression"

    public static class or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:33:1: or_expression : and_expression ( orOp and_expression )* ;
    public final RemesLogicalParser.or_expression_return or_expression() throws RecognitionException {
        RemesLogicalParser.or_expression_return retval = new RemesLogicalParser.or_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesLogicalParser.and_expression_return and_expression8 = null;

        RemesLogicalParser.orOp_return orOp9 = null;

        RemesLogicalParser.and_expression_return and_expression10 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:34:3: ( and_expression ( orOp and_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:34:5: and_expression ( orOp and_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expression_in_or_expression114);
            and_expression8=and_expression();

            state._fsp--;

            adaptor.addChild(root_0, and_expression8.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:34:20: ( orOp and_expression )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BARBAR||LA3_0==LIT_OR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:34:22: orOp and_expression
            	    {
            	    pushFollow(FOLLOW_orOp_in_or_expression118);
            	    orOp9=orOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(orOp9.getTree(), root_0);
            	    pushFollow(FOLLOW_and_expression_in_or_expression121);
            	    and_expression10=and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expression10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "or_expression"

    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:37:1: and_expression : compare_expression ( andOp compare_expression )* ;
    public final RemesLogicalParser.and_expression_return and_expression() throws RecognitionException {
        RemesLogicalParser.and_expression_return retval = new RemesLogicalParser.and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesLogicalParser.compare_expression_return compare_expression11 = null;

        RemesLogicalParser.andOp_return andOp12 = null;

        RemesLogicalParser.compare_expression_return compare_expression13 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:38:3: ( compare_expression ( andOp compare_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:38:5: compare_expression ( andOp compare_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_compare_expression_in_and_expression137);
            compare_expression11=compare_expression();

            state._fsp--;

            adaptor.addChild(root_0, compare_expression11.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:38:24: ( andOp compare_expression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AMPAMP||LA4_0==LIT_AND) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:38:26: andOp compare_expression
            	    {
            	    pushFollow(FOLLOW_andOp_in_and_expression141);
            	    andOp12=andOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(andOp12.getTree(), root_0);
            	    pushFollow(FOLLOW_compare_expression_in_and_expression144);
            	    compare_expression13=compare_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compare_expression13.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "and_expression"

    public static class compare_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:41:1: compare_expression : add_expression ( compareOp add_expression )* ;
    public final RemesLogicalParser.compare_expression_return compare_expression() throws RecognitionException {
        RemesLogicalParser.compare_expression_return retval = new RemesLogicalParser.compare_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesLogicalParser.add_expression_return add_expression14 = null;

        RemesLogicalParser.compareOp_return compareOp15 = null;

        RemesLogicalParser.add_expression_return add_expression16 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:42:3: ( add_expression ( compareOp add_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:42:5: add_expression ( compareOp add_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expression_in_compare_expression160);
            add_expression14=add_expression();

            state._fsp--;

            adaptor.addChild(root_0, add_expression14.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:42:20: ( compareOp add_expression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=LT && LA5_0<=GE)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:42:22: compareOp add_expression
            	    {
            	    pushFollow(FOLLOW_compareOp_in_compare_expression164);
            	    compareOp15=compareOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(compareOp15.getTree(), root_0);
            	    pushFollow(FOLLOW_add_expression_in_compare_expression167);
            	    add_expression16=add_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_expression16.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compare_expression"

    public static class add_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:45:1: add_expression : multiply_expression ( addOp multiply_expression )* ;
    public final RemesLogicalParser.add_expression_return add_expression() throws RecognitionException {
        RemesLogicalParser.add_expression_return retval = new RemesLogicalParser.add_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesLogicalParser.multiply_expression_return multiply_expression17 = null;

        RemesLogicalParser.addOp_return addOp18 = null;

        RemesLogicalParser.multiply_expression_return multiply_expression19 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:46:3: ( multiply_expression ( addOp multiply_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:46:5: multiply_expression ( addOp multiply_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiply_expression_in_add_expression185);
            multiply_expression17=multiply_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiply_expression17.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:46:25: ( addOp multiply_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=PLUS && LA6_0<=MINUS)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:46:27: addOp multiply_expression
            	    {
            	    pushFollow(FOLLOW_addOp_in_add_expression189);
            	    addOp18=addOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(addOp18.getTree(), root_0);
            	    pushFollow(FOLLOW_multiply_expression_in_add_expression192);
            	    multiply_expression19=multiply_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiply_expression19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "add_expression"

    public static class multiply_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiply_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:49:1: multiply_expression : sign_expression ( mulOp sign_expression )* ;
    public final RemesLogicalParser.multiply_expression_return multiply_expression() throws RecognitionException {
        RemesLogicalParser.multiply_expression_return retval = new RemesLogicalParser.multiply_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesLogicalParser.sign_expression_return sign_expression20 = null;

        RemesLogicalParser.mulOp_return mulOp21 = null;

        RemesLogicalParser.sign_expression_return sign_expression22 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:50:3: ( sign_expression ( mulOp sign_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:50:5: sign_expression ( mulOp sign_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sign_expression_in_multiply_expression210);
            sign_expression20=sign_expression();

            state._fsp--;

            adaptor.addChild(root_0, sign_expression20.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:50:21: ( mulOp sign_expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MUL && LA7_0<=MOD)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:50:23: mulOp sign_expression
            	    {
            	    pushFollow(FOLLOW_mulOp_in_multiply_expression214);
            	    mulOp21=mulOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(mulOp21.getTree(), root_0);
            	    pushFollow(FOLLOW_sign_expression_in_multiply_expression217);
            	    sign_expression22=sign_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sign_expression22.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiply_expression"

    public static class sign_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sign_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:53:1: sign_expression : ( PLUS sign_expression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression ) | MINUS sign_expression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression ) | unary_expression );
    public final RemesLogicalParser.sign_expression_return sign_expression() throws RecognitionException {
        RemesLogicalParser.sign_expression_return retval = new RemesLogicalParser.sign_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS23=null;
        Token MINUS25=null;
        RemesLogicalParser.sign_expression_return sign_expression24 = null;

        RemesLogicalParser.sign_expression_return sign_expression26 = null;

        RemesLogicalParser.unary_expression_return unary_expression27 = null;


        Object PLUS23_tree=null;
        Object MINUS25_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_sign_expression=new RewriteRuleSubtreeStream(adaptor,"rule sign_expression");
        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:54:3: ( PLUS sign_expression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression ) | MINUS sign_expression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression ) | unary_expression )
            int alt8=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt8=1;
                }
                break;
            case MINUS:
                {
                alt8=2;
                }
                break;
            case TRUE:
            case FALSE:
            case LPAREN:
            case EXCL:
            case LIT_NOT:
            case ID:
            case NAT:
            case FLOAT:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:54:5: PLUS sign_expression
                    {
                    PLUS23=(Token)match(input,PLUS,FOLLOW_PLUS_in_sign_expression233);  
                    stream_PLUS.add(PLUS23);

                    pushFollow(FOLLOW_sign_expression_in_sign_expression235);
                    sign_expression24=sign_expression();

                    state._fsp--;

                    stream_sign_expression.add(sign_expression24.getTree());


                    // AST REWRITE
                    // elements: sign_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 54:27: -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression )
                    {
                        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:54:31: ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, PLUS23, "UNARY_PLUS"), root_1);

                        adaptor.addChild(root_1, stream_sign_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:55:5: MINUS sign_expression
                    {
                    MINUS25=(Token)match(input,MINUS,FOLLOW_MINUS_in_sign_expression252);  
                    stream_MINUS.add(MINUS25);

                    pushFollow(FOLLOW_sign_expression_in_sign_expression254);
                    sign_expression26=sign_expression();

                    state._fsp--;

                    stream_sign_expression.add(sign_expression26.getTree());


                    // AST REWRITE
                    // elements: sign_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:27: -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression )
                    {
                        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:55:31: ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, MINUS25, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_sign_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:56:5: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unary_expression_in_sign_expression270);
                    unary_expression27=unary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expression27.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sign_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:59:1: unary_expression : ( notOp )* primary_expression ;
    public final RemesLogicalParser.unary_expression_return unary_expression() throws RecognitionException {
        RemesLogicalParser.unary_expression_return retval = new RemesLogicalParser.unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesLogicalParser.notOp_return notOp28 = null;

        RemesLogicalParser.primary_expression_return primary_expression29 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:60:3: ( ( notOp )* primary_expression )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:60:5: ( notOp )* primary_expression
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:60:5: ( notOp )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EXCL||LA9_0==LIT_NOT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:60:6: notOp
            	    {
            	    pushFollow(FOLLOW_notOp_in_unary_expression284);
            	    notOp28=notOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(notOp28.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            pushFollow(FOLLOW_primary_expression_in_unary_expression289);
            primary_expression29=primary_expression();

            state._fsp--;

            adaptor.addChild(root_0, primary_expression29.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:63:1: primary_expression : ( variable | literal | constant | par_expression );
    public final RemesLogicalParser.primary_expression_return primary_expression() throws RecognitionException {
        RemesLogicalParser.primary_expression_return retval = new RemesLogicalParser.primary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesLogicalParser.variable_return variable30 = null;

        RemesLogicalParser.literal_return literal31 = null;

        RemesLogicalParser.constant_return constant32 = null;

        RemesLogicalParser.par_expression_return par_expression33 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:64:3: ( variable | literal | constant | par_expression )
            int alt10=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt10=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt10=2;
                }
                break;
            case NAT:
            case FLOAT:
                {
                alt10=3;
                }
                break;
            case LPAREN:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:64:5: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_primary_expression303);
                    variable30=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable30.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:65:5: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary_expression309);
                    literal31=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal31.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:66:5: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression315);
                    constant32=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant32.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:67:5: par_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_par_expression_in_primary_expression321);
                    par_expression33=par_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, par_expression33.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:70:1: variable : ID ( LBRACKET ternary_expression RBRACKET )? ;
    public final RemesLogicalParser.variable_return variable() throws RecognitionException {
        RemesLogicalParser.variable_return retval = new RemesLogicalParser.variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID34=null;
        Token LBRACKET35=null;
        Token RBRACKET37=null;
        RemesLogicalParser.ternary_expression_return ternary_expression36 = null;


        Object ID34_tree=null;
        Object LBRACKET35_tree=null;
        Object RBRACKET37_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:71:3: ( ID ( LBRACKET ternary_expression RBRACKET )? )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:71:5: ID ( LBRACKET ternary_expression RBRACKET )?
            {
            root_0 = (Object)adaptor.nil();

            ID34=(Token)match(input,ID,FOLLOW_ID_in_variable334); 
            ID34_tree = (Object)adaptor.create(ID34);
            adaptor.addChild(root_0, ID34_tree);

            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:71:8: ( LBRACKET ternary_expression RBRACKET )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LBRACKET) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:71:9: LBRACKET ternary_expression RBRACKET
                    {
                    LBRACKET35=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_variable337); 
                    LBRACKET35_tree = (Object)adaptor.create(LBRACKET35);
                    root_0 = (Object)adaptor.becomeRoot(LBRACKET35_tree, root_0);

                    pushFollow(FOLLOW_ternary_expression_in_variable340);
                    ternary_expression36=ternary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, ternary_expression36.getTree());
                    RBRACKET37=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_variable342); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:74:1: literal : ( TRUE | FALSE );
    public final RemesLogicalParser.literal_return literal() throws RecognitionException {
        RemesLogicalParser.literal_return retval = new RemesLogicalParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set38=null;

        Object set38_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:75:3: ( TRUE | FALSE )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set38=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set38));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:79:1: constant : ( NAT | FLOAT );
    public final RemesLogicalParser.constant_return constant() throws RecognitionException {
        RemesLogicalParser.constant_return retval = new RemesLogicalParser.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set39=null;

        Object set39_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:80:3: ( NAT | FLOAT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set39=(Token)input.LT(1);
            if ( (input.LA(1)>=NAT && input.LA(1)<=FLOAT) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set39));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class par_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "par_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:84:1: par_expression : LPAREN invariant_expression RPAREN ;
    public final RemesLogicalParser.par_expression_return par_expression() throws RecognitionException {
        RemesLogicalParser.par_expression_return retval = new RemesLogicalParser.par_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN40=null;
        Token RPAREN42=null;
        RemesLogicalParser.invariant_expression_return invariant_expression41 = null;


        Object LPAREN40_tree=null;
        Object RPAREN42_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:85:3: ( LPAREN invariant_expression RPAREN )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:85:5: LPAREN invariant_expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_par_expression400); 
            pushFollow(FOLLOW_invariant_expression_in_par_expression403);
            invariant_expression41=invariant_expression();

            state._fsp--;

            adaptor.addChild(root_0, invariant_expression41.getTree());
            RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_par_expression405); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "par_expression"

    public static class compareOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compareOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:90:1: compareOp : ( LT | LE | EQ | NE | GE | GT );
    public final RemesLogicalParser.compareOp_return compareOp() throws RecognitionException {
        RemesLogicalParser.compareOp_return retval = new RemesLogicalParser.compareOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set43=null;

        Object set43_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:91:3: ( LT | LE | EQ | NE | GE | GT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set43=(Token)input.LT(1);
            if ( (input.LA(1)>=LT && input.LA(1)<=GE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set43));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compareOp"

    public static class addOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:99:1: addOp : ( PLUS | MINUS );
    public final RemesLogicalParser.addOp_return addOp() throws RecognitionException {
        RemesLogicalParser.addOp_return retval = new RemesLogicalParser.addOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set44=null;

        Object set44_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:100:3: ( PLUS | MINUS )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set44=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set44));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addOp"

    public static class mulOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:104:1: mulOp : ( MUL | DIV | MOD );
    public final RemesLogicalParser.mulOp_return mulOp() throws RecognitionException {
        RemesLogicalParser.mulOp_return retval = new RemesLogicalParser.mulOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:105:3: ( MUL | DIV | MOD )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set45=(Token)input.LT(1);
            if ( (input.LA(1)>=MUL && input.LA(1)<=MOD) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set45));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mulOp"

    public static class notOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:115:1: notOp : ( EXCL | LIT_NOT );
    public final RemesLogicalParser.notOp_return notOp() throws RecognitionException {
        RemesLogicalParser.notOp_return retval = new RemesLogicalParser.notOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set46=null;

        Object set46_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:116:3: ( EXCL | LIT_NOT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set46=(Token)input.LT(1);
            if ( input.LA(1)==EXCL||input.LA(1)==LIT_NOT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set46));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notOp"

    public static class andOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:120:1: andOp : ( AMPAMP | LIT_AND );
    public final RemesLogicalParser.andOp_return andOp() throws RecognitionException {
        RemesLogicalParser.andOp_return retval = new RemesLogicalParser.andOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set47=null;

        Object set47_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:121:3: ( AMPAMP | LIT_AND )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set47=(Token)input.LT(1);
            if ( input.LA(1)==AMPAMP||input.LA(1)==LIT_AND ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set47));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andOp"

    public static class orOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:125:1: orOp : ( BARBAR | LIT_OR );
    public final RemesLogicalParser.orOp_return orOp() throws RecognitionException {
        RemesLogicalParser.orOp_return retval = new RemesLogicalParser.orOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set48=null;

        Object set48_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:126:3: ( BARBAR | LIT_OR )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLogical.g:
            {
            root_0 = (Object)adaptor.nil();

            set48=(Token)input.LT(1);
            if ( input.LA(1)==BARBAR||input.LA(1)==LIT_OR ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set48));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_ternary_expression_in_invariant_expression69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_invariant_expression75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expression_in_ternary_expression88 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_QUESTION_in_ternary_expression91 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_or_expression_in_ternary_expression94 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_ternary_expression96 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_or_expression_in_ternary_expression99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expression_in_or_expression114 = new BitSet(new long[]{0x0000000120000002L});
    public static final BitSet FOLLOW_orOp_in_or_expression118 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_and_expression_in_or_expression121 = new BitSet(new long[]{0x0000000120000002L});
    public static final BitSet FOLLOW_compare_expression_in_and_expression137 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_andOp_in_and_expression141 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_compare_expression_in_and_expression144 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_add_expression_in_compare_expression160 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_compareOp_in_compare_expression164 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_add_expression_in_compare_expression167 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_multiply_expression_in_add_expression185 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_addOp_in_add_expression189 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_multiply_expression_in_add_expression192 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_sign_expression_in_multiply_expression210 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_mulOp_in_multiply_expression214 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_sign_expression_in_multiply_expression217 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_PLUS_in_sign_expression233 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_sign_expression_in_sign_expression235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_sign_expression252 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_sign_expression_in_sign_expression254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_sign_expression270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notOp_in_unary_expression284 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_primary_expression303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary_expression309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_par_expression_in_primary_expression321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable334 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LBRACKET_in_variable337 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_ternary_expression_in_variable340 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RBRACKET_in_variable342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_par_expression400 = new BitSet(new long[]{0x000001C048C00070L});
    public static final BitSet FOLLOW_invariant_expression_in_par_expression403 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_par_expression405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_compareOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mulOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_notOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orOp0 = new BitSet(new long[]{0x0000000000000002L});

}