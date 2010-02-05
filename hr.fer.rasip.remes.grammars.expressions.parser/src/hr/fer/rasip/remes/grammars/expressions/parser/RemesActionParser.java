// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g 2010-01-23 01:22:56

package hr.fer.rasip.remes.grammars.expressions.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RemesActionParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TRUE", "FALSE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "ASSIGN", "PLUS_A", "MINUS_A", "MUL_A", "DIV_A", "MOD_A", "LT", "LE", "EQ", "NE", "GT", "GE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXCL", "AMPAMP", "BARBAR", "LIT_NOT", "LIT_AND", "LIT_OR", "QUESTION", "COLON", "COMMA", "TICK", "IS", "ID", "NAT", "COMMENT", "WS", "UNARY_PLUS", "UNARY_MINUS", "UNARY_SIGN", "ARRAY"
    };
    public static final int LT=16;
    public static final int LIT_OR=32;
    public static final int MOD=26;
    public static final int DIV_A=14;
    public static final int EXCL=27;
    public static final int ID=38;
    public static final int NAT=39;
    public static final int EOF=-1;
    public static final int LIT_NOT=30;
    public static final int LPAREN=6;
    public static final int UNARY_PLUS=42;
    public static final int LBRACKET=8;
    public static final int RPAREN=7;
    public static final int COMMA=35;
    public static final int IS=37;
    public static final int PLUS=22;
    public static final int BARBAR=29;
    public static final int EQ=18;
    public static final int RBRACKET=9;
    public static final int AMPAMP=28;
    public static final int COMMENT=40;
    public static final int ARRAY=45;
    public static final int NE=19;
    public static final int GE=21;
    public static final int TICK=36;
    public static final int MOD_A=15;
    public static final int MINUS_A=12;
    public static final int UNARY_MINUS=43;
    public static final int MINUS=23;
    public static final int TRUE=4;
    public static final int MUL=24;
    public static final int MUL_A=13;
    public static final int COLON=34;
    public static final int WS=41;
    public static final int QUESTION=33;
    public static final int UNARY_SIGN=44;
    public static final int PLUS_A=11;
    public static final int ASSIGN=10;
    public static final int GT=20;
    public static final int LIT_AND=31;
    public static final int DIV=25;
    public static final int FALSE=5;
    public static final int LE=17;

    // delegates
    // delegators


        public RemesActionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RemesActionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RemesActionParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g"; }


    public static class action_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:24:1: action_expression : ( assignment_expression ( COMMA assignment_expression )* | EOF );
    public final RemesActionParser.action_expression_return action_expression() throws RecognitionException {
        RemesActionParser.action_expression_return retval = new RemesActionParser.action_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA2=null;
        Token EOF4=null;
        RemesActionParser.assignment_expression_return assignment_expression1 = null;

        RemesActionParser.assignment_expression_return assignment_expression3 = null;


        Object COMMA2_tree=null;
        Object EOF4_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:25:3: ( assignment_expression ( COMMA assignment_expression )* | EOF )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:25:5: assignment_expression ( COMMA assignment_expression )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_expression_in_action_expression69);
                    assignment_expression1=assignment_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_expression1.getTree());
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:25:27: ( COMMA assignment_expression )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COMMA) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:25:28: COMMA assignment_expression
                    	    {
                    	    COMMA2=(Token)match(input,COMMA,FOLLOW_COMMA_in_action_expression72); 
                    	    pushFollow(FOLLOW_assignment_expression_in_action_expression75);
                    	    assignment_expression3=assignment_expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, assignment_expression3.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:26:5: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_action_expression83); 
                    EOF4_tree = (Object)adaptor.create(EOF4);
                    adaptor.addChild(root_0, EOF4_tree);


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
    // $ANTLR end "action_expression"

    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:29:1: assignment_expression : variable assignOp ternary_expression ;
    public final RemesActionParser.assignment_expression_return assignment_expression() throws RecognitionException {
        RemesActionParser.assignment_expression_return retval = new RemesActionParser.assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.variable_return variable5 = null;

        RemesActionParser.assignOp_return assignOp6 = null;

        RemesActionParser.ternary_expression_return ternary_expression7 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:30:3: ( variable assignOp ternary_expression )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:30:5: variable assignOp ternary_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_variable_in_assignment_expression98);
            variable5=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable5.getTree());
            pushFollow(FOLLOW_assignOp_in_assignment_expression100);
            assignOp6=assignOp();

            state._fsp--;

            root_0 = (Object)adaptor.becomeRoot(assignOp6.getTree(), root_0);
            pushFollow(FOLLOW_ternary_expression_in_assignment_expression103);
            ternary_expression7=ternary_expression();

            state._fsp--;

            adaptor.addChild(root_0, ternary_expression7.getTree());

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
    // $ANTLR end "assignment_expression"

    public static class invariant_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "invariant_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:33:1: invariant_expression : ( ternary_expression | EOF );
    public final RemesActionParser.invariant_expression_return invariant_expression() throws RecognitionException {
        RemesActionParser.invariant_expression_return retval = new RemesActionParser.invariant_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF9=null;
        RemesActionParser.ternary_expression_return ternary_expression8 = null;


        Object EOF9_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:34:3: ( ternary_expression | EOF )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=TRUE && LA3_0<=LPAREN)||(LA3_0>=PLUS && LA3_0<=MINUS)||LA3_0==EXCL||LA3_0==LIT_NOT||(LA3_0>=ID && LA3_0<=NAT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:34:5: ternary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ternary_expression_in_invariant_expression116);
                    ternary_expression8=ternary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, ternary_expression8.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:35:5: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_invariant_expression122); 
                    EOF9_tree = (Object)adaptor.create(EOF9);
                    adaptor.addChild(root_0, EOF9_tree);


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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:38:1: ternary_expression : or_expression ( QUESTION or_expression COLON or_expression )? ;
    public final RemesActionParser.ternary_expression_return ternary_expression() throws RecognitionException {
        RemesActionParser.ternary_expression_return retval = new RemesActionParser.ternary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION11=null;
        Token COLON13=null;
        RemesActionParser.or_expression_return or_expression10 = null;

        RemesActionParser.or_expression_return or_expression12 = null;

        RemesActionParser.or_expression_return or_expression14 = null;


        Object QUESTION11_tree=null;
        Object COLON13_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:39:3: ( or_expression ( QUESTION or_expression COLON or_expression )? )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:39:5: or_expression ( QUESTION or_expression COLON or_expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_expression_in_ternary_expression135);
            or_expression10=or_expression();

            state._fsp--;

            adaptor.addChild(root_0, or_expression10.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:39:19: ( QUESTION or_expression COLON or_expression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==QUESTION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:39:20: QUESTION or_expression COLON or_expression
                    {
                    QUESTION11=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_ternary_expression138); 
                    QUESTION11_tree = (Object)adaptor.create(QUESTION11);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION11_tree, root_0);

                    pushFollow(FOLLOW_or_expression_in_ternary_expression141);
                    or_expression12=or_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, or_expression12.getTree());
                    COLON13=(Token)match(input,COLON,FOLLOW_COLON_in_ternary_expression143); 
                    pushFollow(FOLLOW_or_expression_in_ternary_expression146);
                    or_expression14=or_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, or_expression14.getTree());

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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:42:1: or_expression : and_expression ( orOp and_expression )* ;
    public final RemesActionParser.or_expression_return or_expression() throws RecognitionException {
        RemesActionParser.or_expression_return retval = new RemesActionParser.or_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.and_expression_return and_expression15 = null;

        RemesActionParser.orOp_return orOp16 = null;

        RemesActionParser.and_expression_return and_expression17 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:43:3: ( and_expression ( orOp and_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:43:5: and_expression ( orOp and_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_expression_in_or_expression161);
            and_expression15=and_expression();

            state._fsp--;

            adaptor.addChild(root_0, and_expression15.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:43:20: ( orOp and_expression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BARBAR||LA5_0==LIT_OR) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:43:22: orOp and_expression
            	    {
            	    pushFollow(FOLLOW_orOp_in_or_expression165);
            	    orOp16=orOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(orOp16.getTree(), root_0);
            	    pushFollow(FOLLOW_and_expression_in_or_expression168);
            	    and_expression17=and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expression17.getTree());

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
    // $ANTLR end "or_expression"

    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:46:1: and_expression : compare_expression ( andOp compare_expression )* ;
    public final RemesActionParser.and_expression_return and_expression() throws RecognitionException {
        RemesActionParser.and_expression_return retval = new RemesActionParser.and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.compare_expression_return compare_expression18 = null;

        RemesActionParser.andOp_return andOp19 = null;

        RemesActionParser.compare_expression_return compare_expression20 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:47:3: ( compare_expression ( andOp compare_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:47:5: compare_expression ( andOp compare_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_compare_expression_in_and_expression184);
            compare_expression18=compare_expression();

            state._fsp--;

            adaptor.addChild(root_0, compare_expression18.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:47:24: ( andOp compare_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==AMPAMP||LA6_0==LIT_AND) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:47:26: andOp compare_expression
            	    {
            	    pushFollow(FOLLOW_andOp_in_and_expression188);
            	    andOp19=andOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(andOp19.getTree(), root_0);
            	    pushFollow(FOLLOW_compare_expression_in_and_expression191);
            	    compare_expression20=compare_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, compare_expression20.getTree());

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
    // $ANTLR end "and_expression"

    public static class compare_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:50:1: compare_expression : add_expression ( compareOp add_expression )* ;
    public final RemesActionParser.compare_expression_return compare_expression() throws RecognitionException {
        RemesActionParser.compare_expression_return retval = new RemesActionParser.compare_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.add_expression_return add_expression21 = null;

        RemesActionParser.compareOp_return compareOp22 = null;

        RemesActionParser.add_expression_return add_expression23 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:51:3: ( add_expression ( compareOp add_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:51:5: add_expression ( compareOp add_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_expression_in_compare_expression207);
            add_expression21=add_expression();

            state._fsp--;

            adaptor.addChild(root_0, add_expression21.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:51:20: ( compareOp add_expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=LT && LA7_0<=GE)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:51:22: compareOp add_expression
            	    {
            	    pushFollow(FOLLOW_compareOp_in_compare_expression211);
            	    compareOp22=compareOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(compareOp22.getTree(), root_0);
            	    pushFollow(FOLLOW_add_expression_in_compare_expression214);
            	    add_expression23=add_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add_expression23.getTree());

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
    // $ANTLR end "compare_expression"

    public static class add_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:54:1: add_expression : multiply_expression ( addOp multiply_expression )* ;
    public final RemesActionParser.add_expression_return add_expression() throws RecognitionException {
        RemesActionParser.add_expression_return retval = new RemesActionParser.add_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.multiply_expression_return multiply_expression24 = null;

        RemesActionParser.addOp_return addOp25 = null;

        RemesActionParser.multiply_expression_return multiply_expression26 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:55:3: ( multiply_expression ( addOp multiply_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:55:5: multiply_expression ( addOp multiply_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiply_expression_in_add_expression232);
            multiply_expression24=multiply_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiply_expression24.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:55:25: ( addOp multiply_expression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=PLUS && LA8_0<=MINUS)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:55:27: addOp multiply_expression
            	    {
            	    pushFollow(FOLLOW_addOp_in_add_expression236);
            	    addOp25=addOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(addOp25.getTree(), root_0);
            	    pushFollow(FOLLOW_multiply_expression_in_add_expression239);
            	    multiply_expression26=multiply_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiply_expression26.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:58:1: multiply_expression : sign_expression ( mulOp sign_expression )* ;
    public final RemesActionParser.multiply_expression_return multiply_expression() throws RecognitionException {
        RemesActionParser.multiply_expression_return retval = new RemesActionParser.multiply_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.sign_expression_return sign_expression27 = null;

        RemesActionParser.mulOp_return mulOp28 = null;

        RemesActionParser.sign_expression_return sign_expression29 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:59:3: ( sign_expression ( mulOp sign_expression )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:59:5: sign_expression ( mulOp sign_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sign_expression_in_multiply_expression257);
            sign_expression27=sign_expression();

            state._fsp--;

            adaptor.addChild(root_0, sign_expression27.getTree());
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:59:21: ( mulOp sign_expression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=MUL && LA9_0<=MOD)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:59:23: mulOp sign_expression
            	    {
            	    pushFollow(FOLLOW_mulOp_in_multiply_expression261);
            	    mulOp28=mulOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(mulOp28.getTree(), root_0);
            	    pushFollow(FOLLOW_sign_expression_in_multiply_expression264);
            	    sign_expression29=sign_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sign_expression29.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:62:1: sign_expression : ( PLUS sign_expression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression ) | MINUS sign_expression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression ) | unary_expression );
    public final RemesActionParser.sign_expression_return sign_expression() throws RecognitionException {
        RemesActionParser.sign_expression_return retval = new RemesActionParser.sign_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS30=null;
        Token MINUS32=null;
        RemesActionParser.sign_expression_return sign_expression31 = null;

        RemesActionParser.sign_expression_return sign_expression33 = null;

        RemesActionParser.unary_expression_return unary_expression34 = null;


        Object PLUS30_tree=null;
        Object MINUS32_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_sign_expression=new RewriteRuleSubtreeStream(adaptor,"rule sign_expression");
        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:63:3: ( PLUS sign_expression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression ) | MINUS sign_expression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression ) | unary_expression )
            int alt10=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt10=1;
                }
                break;
            case MINUS:
                {
                alt10=2;
                }
                break;
            case TRUE:
            case FALSE:
            case LPAREN:
            case EXCL:
            case LIT_NOT:
            case ID:
            case NAT:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:63:5: PLUS sign_expression
                    {
                    PLUS30=(Token)match(input,PLUS,FOLLOW_PLUS_in_sign_expression280);  
                    stream_PLUS.add(PLUS30);

                    pushFollow(FOLLOW_sign_expression_in_sign_expression282);
                    sign_expression31=sign_expression();

                    state._fsp--;

                    stream_sign_expression.add(sign_expression31.getTree());


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
                    // 63:27: -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression )
                    {
                        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:63:31: ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, PLUS30, "UNARY_PLUS"), root_1);

                        adaptor.addChild(root_1, stream_sign_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:64:5: MINUS sign_expression
                    {
                    MINUS32=(Token)match(input,MINUS,FOLLOW_MINUS_in_sign_expression299);  
                    stream_MINUS.add(MINUS32);

                    pushFollow(FOLLOW_sign_expression_in_sign_expression301);
                    sign_expression33=sign_expression();

                    state._fsp--;

                    stream_sign_expression.add(sign_expression33.getTree());


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
                    // 64:27: -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression )
                    {
                        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:64:31: ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, MINUS32, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_sign_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:65:5: unary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unary_expression_in_sign_expression317);
                    unary_expression34=unary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expression34.getTree());

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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:68:1: unary_expression : ( notOp )* primary_expression ;
    public final RemesActionParser.unary_expression_return unary_expression() throws RecognitionException {
        RemesActionParser.unary_expression_return retval = new RemesActionParser.unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.notOp_return notOp35 = null;

        RemesActionParser.primary_expression_return primary_expression36 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:69:3: ( ( notOp )* primary_expression )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:69:5: ( notOp )* primary_expression
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:69:5: ( notOp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==EXCL||LA11_0==LIT_NOT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:69:6: notOp
            	    {
            	    pushFollow(FOLLOW_notOp_in_unary_expression331);
            	    notOp35=notOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(notOp35.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            pushFollow(FOLLOW_primary_expression_in_unary_expression336);
            primary_expression36=primary_expression();

            state._fsp--;

            adaptor.addChild(root_0, primary_expression36.getTree());

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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:72:1: primary_expression : ( variable | literal | constant | par_expression );
    public final RemesActionParser.primary_expression_return primary_expression() throws RecognitionException {
        RemesActionParser.primary_expression_return retval = new RemesActionParser.primary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RemesActionParser.variable_return variable37 = null;

        RemesActionParser.literal_return literal38 = null;

        RemesActionParser.constant_return constant39 = null;

        RemesActionParser.par_expression_return par_expression40 = null;



        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:73:3: ( variable | literal | constant | par_expression )
            int alt12=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt12=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt12=2;
                }
                break;
            case NAT:
                {
                alt12=3;
                }
                break;
            case LPAREN:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:73:5: variable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_primary_expression350);
                    variable37=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable37.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:74:5: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary_expression356);
                    literal38=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal38.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:75:5: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_primary_expression362);
                    constant39=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant39.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:76:5: par_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_par_expression_in_primary_expression368);
                    par_expression40=par_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, par_expression40.getTree());

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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:79:1: variable : ID ( LBRACKET ternary_expression RBRACKET )? ;
    public final RemesActionParser.variable_return variable() throws RecognitionException {
        RemesActionParser.variable_return retval = new RemesActionParser.variable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID41=null;
        Token LBRACKET42=null;
        Token RBRACKET44=null;
        RemesActionParser.ternary_expression_return ternary_expression43 = null;


        Object ID41_tree=null;
        Object LBRACKET42_tree=null;
        Object RBRACKET44_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:80:3: ( ID ( LBRACKET ternary_expression RBRACKET )? )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:80:5: ID ( LBRACKET ternary_expression RBRACKET )?
            {
            root_0 = (Object)adaptor.nil();

            ID41=(Token)match(input,ID,FOLLOW_ID_in_variable381); 
            ID41_tree = (Object)adaptor.create(ID41);
            adaptor.addChild(root_0, ID41_tree);

            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:80:8: ( LBRACKET ternary_expression RBRACKET )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACKET) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:80:9: LBRACKET ternary_expression RBRACKET
                    {
                    LBRACKET42=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_variable384); 
                    LBRACKET42_tree = (Object)adaptor.create(LBRACKET42);
                    root_0 = (Object)adaptor.becomeRoot(LBRACKET42_tree, root_0);

                    pushFollow(FOLLOW_ternary_expression_in_variable387);
                    ternary_expression43=ternary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, ternary_expression43.getTree());
                    RBRACKET44=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_variable389); 

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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:83:1: literal : ( TRUE | FALSE );
    public final RemesActionParser.literal_return literal() throws RecognitionException {
        RemesActionParser.literal_return retval = new RemesActionParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:84:3: ( TRUE | FALSE )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set45=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
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
    // $ANTLR end "literal"

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:88:1: constant : NAT ;
    public final RemesActionParser.constant_return constant() throws RecognitionException {
        RemesActionParser.constant_return retval = new RemesActionParser.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAT46=null;

        Object NAT46_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:89:3: ( NAT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:89:5: NAT
            {
            root_0 = (Object)adaptor.nil();

            NAT46=(Token)match(input,NAT,FOLLOW_NAT_in_constant428); 
            NAT46_tree = (Object)adaptor.create(NAT46);
            adaptor.addChild(root_0, NAT46_tree);


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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:92:1: par_expression : LPAREN invariant_expression RPAREN ;
    public final RemesActionParser.par_expression_return par_expression() throws RecognitionException {
        RemesActionParser.par_expression_return retval = new RemesActionParser.par_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN47=null;
        Token RPAREN49=null;
        RemesActionParser.invariant_expression_return invariant_expression48 = null;


        Object LPAREN47_tree=null;
        Object RPAREN49_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:93:3: ( LPAREN invariant_expression RPAREN )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:93:5: LPAREN invariant_expression RPAREN
            {
            root_0 = (Object)adaptor.nil();

            LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_par_expression441); 
            pushFollow(FOLLOW_invariant_expression_in_par_expression444);
            invariant_expression48=invariant_expression();

            state._fsp--;

            adaptor.addChild(root_0, invariant_expression48.getTree());
            RPAREN49=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_par_expression446); 

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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:98:1: compareOp : ( LT | LE | EQ | NE | GE | GT );
    public final RemesActionParser.compareOp_return compareOp() throws RecognitionException {
        RemesActionParser.compareOp_return retval = new RemesActionParser.compareOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:99:3: ( LT | LE | EQ | NE | GE | GT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set50=(Token)input.LT(1);
            if ( (input.LA(1)>=LT && input.LA(1)<=GE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set50));
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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:107:1: addOp : ( PLUS | MINUS );
    public final RemesActionParser.addOp_return addOp() throws RecognitionException {
        RemesActionParser.addOp_return retval = new RemesActionParser.addOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;

        Object set51_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:108:3: ( PLUS | MINUS )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set51=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set51));
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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:112:1: mulOp : ( MUL | DIV | MOD );
    public final RemesActionParser.mulOp_return mulOp() throws RecognitionException {
        RemesActionParser.mulOp_return retval = new RemesActionParser.mulOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set52=null;

        Object set52_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:113:3: ( MUL | DIV | MOD )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set52=(Token)input.LT(1);
            if ( (input.LA(1)>=MUL && input.LA(1)<=MOD) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set52));
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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:118:1: notOp : ( EXCL | LIT_NOT );
    public final RemesActionParser.notOp_return notOp() throws RecognitionException {
        RemesActionParser.notOp_return retval = new RemesActionParser.notOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53=null;

        Object set53_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:119:3: ( EXCL | LIT_NOT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set53=(Token)input.LT(1);
            if ( input.LA(1)==EXCL||input.LA(1)==LIT_NOT ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set53));
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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:123:1: andOp : ( AMPAMP | LIT_AND );
    public final RemesActionParser.andOp_return andOp() throws RecognitionException {
        RemesActionParser.andOp_return retval = new RemesActionParser.andOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set54=null;

        Object set54_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:124:3: ( AMPAMP | LIT_AND )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set54=(Token)input.LT(1);
            if ( input.LA(1)==AMPAMP||input.LA(1)==LIT_AND ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set54));
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
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:128:1: orOp : ( BARBAR | LIT_OR );
    public final RemesActionParser.orOp_return orOp() throws RecognitionException {
        RemesActionParser.orOp_return retval = new RemesActionParser.orOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set55=null;

        Object set55_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:129:3: ( BARBAR | LIT_OR )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set55=(Token)input.LT(1);
            if ( input.LA(1)==BARBAR||input.LA(1)==LIT_OR ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set55));
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

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:133:1: assignOp : ( ASSIGN | PLUS_A | MINUS_A | MUL_A | DIV_A | MOD_A );
    public final RemesActionParser.assignOp_return assignOp() throws RecognitionException {
        RemesActionParser.assignOp_return retval = new RemesActionParser.assignOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set56=null;

        Object set56_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:134:3: ( ASSIGN | PLUS_A | MINUS_A | MUL_A | DIV_A | MOD_A )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesAction.g:
            {
            root_0 = (Object)adaptor.nil();

            set56=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=MOD_A) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set56));
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
    // $ANTLR end "assignOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_assignment_expression_in_action_expression69 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_COMMA_in_action_expression72 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_assignment_expression_in_action_expression75 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_EOF_in_action_expression83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment_expression98 = new BitSet(new long[]{0x000000000000FC00L});
    public static final BitSet FOLLOW_assignOp_in_assignment_expression100 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_ternary_expression_in_assignment_expression103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternary_expression_in_invariant_expression116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_invariant_expression122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expression_in_ternary_expression135 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_QUESTION_in_ternary_expression138 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_or_expression_in_ternary_expression141 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_ternary_expression143 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_or_expression_in_ternary_expression146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expression_in_or_expression161 = new BitSet(new long[]{0x0000000120000002L});
    public static final BitSet FOLLOW_orOp_in_or_expression165 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_and_expression_in_or_expression168 = new BitSet(new long[]{0x0000000120000002L});
    public static final BitSet FOLLOW_compare_expression_in_and_expression184 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_andOp_in_and_expression188 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_compare_expression_in_and_expression191 = new BitSet(new long[]{0x0000000090000002L});
    public static final BitSet FOLLOW_add_expression_in_compare_expression207 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_compareOp_in_compare_expression211 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_add_expression_in_compare_expression214 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_multiply_expression_in_add_expression232 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_addOp_in_add_expression236 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_multiply_expression_in_add_expression239 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_sign_expression_in_multiply_expression257 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_mulOp_in_multiply_expression261 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_sign_expression_in_multiply_expression264 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_PLUS_in_sign_expression280 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_sign_expression_in_sign_expression282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_sign_expression299 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_sign_expression_in_sign_expression301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_sign_expression317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notOp_in_unary_expression331 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_primary_expression_in_unary_expression336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_primary_expression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary_expression356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_par_expression_in_primary_expression368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable381 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LBRACKET_in_variable384 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_ternary_expression_in_variable387 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RBRACKET_in_variable389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAT_in_constant428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_par_expression441 = new BitSet(new long[]{0x000000C048C00070L});
    public static final BitSet FOLLOW_invariant_expression_in_par_expression444 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_par_expression446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_compareOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_addOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_mulOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_notOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});

}