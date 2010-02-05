// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g 2010-01-23 01:22:54

package hr.fer.rasip.remes.grammars.expressions.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RemesResourceParser extends Parser {
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


        public RemesResourceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RemesResourceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RemesResourceParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g"; }


    public static class resource_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "resource_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:24:1: resource_expression : ( ID diffOp IS sign_expression | EOF );
    public final RemesResourceParser.resource_expression_return resource_expression() throws RecognitionException {
        RemesResourceParser.resource_expression_return retval = new RemesResourceParser.resource_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID1=null;
        Token IS3=null;
        Token EOF5=null;
        RemesResourceParser.diffOp_return diffOp2 = null;

        RemesResourceParser.sign_expression_return sign_expression4 = null;


        Object ID1_tree=null;
        Object IS3_tree=null;
        Object EOF5_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:25:3: ( ID diffOp IS sign_expression | EOF )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ID) ) {
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
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:25:5: ID diffOp IS sign_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    ID1=(Token)match(input,ID,FOLLOW_ID_in_resource_expression69); 
                    ID1_tree = (Object)adaptor.create(ID1);
                    adaptor.addChild(root_0, ID1_tree);

                    pushFollow(FOLLOW_diffOp_in_resource_expression71);
                    diffOp2=diffOp();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(diffOp2.getTree(), root_0);
                    IS3=(Token)match(input,IS,FOLLOW_IS_in_resource_expression74); 
                    pushFollow(FOLLOW_sign_expression_in_resource_expression77);
                    sign_expression4=sign_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, sign_expression4.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:26:5: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_resource_expression83); 
                    EOF5_tree = (Object)adaptor.create(EOF5);
                    adaptor.addChild(root_0, EOF5_tree);


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
    // $ANTLR end "resource_expression"

    public static class diffOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "diffOp"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:29:1: diffOp : TICK ;
    public final RemesResourceParser.diffOp_return diffOp() throws RecognitionException {
        RemesResourceParser.diffOp_return retval = new RemesResourceParser.diffOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TICK6=null;

        Object TICK6_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:30:3: ( TICK )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:30:5: TICK
            {
            root_0 = (Object)adaptor.nil();

            TICK6=(Token)match(input,TICK,FOLLOW_TICK_in_diffOp96); 
            TICK6_tree = (Object)adaptor.create(TICK6);
            adaptor.addChild(root_0, TICK6_tree);


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
    // $ANTLR end "diffOp"

    public static class sign_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sign_expression"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:33:1: sign_expression : ( PLUS sign_expression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression ) | MINUS sign_expression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression ) | constant );
    public final RemesResourceParser.sign_expression_return sign_expression() throws RecognitionException {
        RemesResourceParser.sign_expression_return retval = new RemesResourceParser.sign_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS7=null;
        Token MINUS9=null;
        RemesResourceParser.sign_expression_return sign_expression8 = null;

        RemesResourceParser.sign_expression_return sign_expression10 = null;

        RemesResourceParser.constant_return constant11 = null;


        Object PLUS7_tree=null;
        Object MINUS9_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_sign_expression=new RewriteRuleSubtreeStream(adaptor,"rule sign_expression");
        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:34:3: ( PLUS sign_expression -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression ) | MINUS sign_expression -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression ) | constant )
            int alt2=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MINUS:
                {
                alt2=2;
                }
                break;
            case NAT:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:34:5: PLUS sign_expression
                    {
                    PLUS7=(Token)match(input,PLUS,FOLLOW_PLUS_in_sign_expression109);  
                    stream_PLUS.add(PLUS7);

                    pushFollow(FOLLOW_sign_expression_in_sign_expression111);
                    sign_expression8=sign_expression();

                    state._fsp--;

                    stream_sign_expression.add(sign_expression8.getTree());


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
                    // 34:27: -> ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression )
                    {
                        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:34:31: ^( UNARY_PLUS[$PLUS, \"UNARY_PLUS\"] sign_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, PLUS7, "UNARY_PLUS"), root_1);

                        adaptor.addChild(root_1, stream_sign_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:35:5: MINUS sign_expression
                    {
                    MINUS9=(Token)match(input,MINUS,FOLLOW_MINUS_in_sign_expression128);  
                    stream_MINUS.add(MINUS9);

                    pushFollow(FOLLOW_sign_expression_in_sign_expression130);
                    sign_expression10=sign_expression();

                    state._fsp--;

                    stream_sign_expression.add(sign_expression10.getTree());


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
                    // 35:27: -> ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression )
                    {
                        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:35:31: ^( UNARY_MINUS[$MINUS, \"UNARY_MINUS\"] sign_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, MINUS9, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_sign_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:36:5: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_sign_expression146);
                    constant11=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant11.getTree());

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

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:39:1: constant : NAT ;
    public final RemesResourceParser.constant_return constant() throws RecognitionException {
        RemesResourceParser.constant_return retval = new RemesResourceParser.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAT12=null;

        Object NAT12_tree=null;

        try {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:40:3: ( NAT )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesResource.g:40:5: NAT
            {
            root_0 = (Object)adaptor.nil();

            NAT12=(Token)match(input,NAT,FOLLOW_NAT_in_constant161); 
            NAT12_tree = (Object)adaptor.create(NAT12);
            adaptor.addChild(root_0, NAT12_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_resource_expression69 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_diffOp_in_resource_expression71 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IS_in_resource_expression74 = new BitSet(new long[]{0x0000008000C00000L});
    public static final BitSet FOLLOW_sign_expression_in_resource_expression77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_resource_expression83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TICK_in_diffOp96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_sign_expression109 = new BitSet(new long[]{0x0000008000C00000L});
    public static final BitSet FOLLOW_sign_expression_in_sign_expression111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_sign_expression128 = new BitSet(new long[]{0x0000008000C00000L});
    public static final BitSet FOLLOW_sign_expression_in_sign_expression130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_sign_expression146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAT_in_constant161 = new BitSet(new long[]{0x0000000000000002L});

}