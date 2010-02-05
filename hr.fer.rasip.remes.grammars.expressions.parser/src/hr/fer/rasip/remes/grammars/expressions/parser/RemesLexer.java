// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g 2010-01-23 01:22:57

package hr.fer.rasip.remes.grammars.expressions.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RemesLexer extends Lexer {
    public static final int TICK=36;
    public static final int GE=21;
    public static final int LT=16;
    public static final int LIT_OR=32;
    public static final int MINUS_A=12;
    public static final int MOD_A=15;
    public static final int MOD=26;
    public static final int DIV_A=14;
    public static final int EXCL=27;
    public static final int MINUS=23;
    public static final int NAT=39;
    public static final int ID=38;
    public static final int EOF=-1;
    public static final int LIT_NOT=30;
    public static final int MUL=24;
    public static final int TRUE=4;
    public static final int MUL_A=13;
    public static final int LPAREN=6;
    public static final int COLON=34;
    public static final int LBRACKET=8;
    public static final int RPAREN=7;
    public static final int WS=41;
    public static final int QUESTION=33;
    public static final int COMMA=35;
    public static final int IS=37;
    public static final int PLUS_A=11;
    public static final int ASSIGN=10;
    public static final int GT=20;
    public static final int BARBAR=29;
    public static final int PLUS=22;
    public static final int LIT_AND=31;
    public static final int DIV=25;
    public static final int RBRACKET=9;
    public static final int EQ=18;
    public static final int COMMENT=40;
    public static final int AMPAMP=28;
    public static final int FALSE=5;
    public static final int LE=17;
    public static final int NE=19;

    // delegates
    // delegators

    public RemesLexer() {;} 
    public RemesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RemesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g"; }

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:11:9: ( 'true' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:11:11: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:12:9: ( 'false' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:12:11: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:14:9: ( '(' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:14:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:15:9: ( ')' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:15:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:16:9: ( '[' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:16:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:17:9: ( ']' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:17:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:19:9: ( ':=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:19:11: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PLUS_A"
    public final void mPLUS_A() throws RecognitionException {
        try {
            int _type = PLUS_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:20:9: ( '+=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:20:11: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_A"

    // $ANTLR start "MINUS_A"
    public final void mMINUS_A() throws RecognitionException {
        try {
            int _type = MINUS_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:21:9: ( '-=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:21:11: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_A"

    // $ANTLR start "MUL_A"
    public final void mMUL_A() throws RecognitionException {
        try {
            int _type = MUL_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:22:9: ( '*=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:22:11: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL_A"

    // $ANTLR start "DIV_A"
    public final void mDIV_A() throws RecognitionException {
        try {
            int _type = DIV_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:23:9: ( '/=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:23:11: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV_A"

    // $ANTLR start "MOD_A"
    public final void mMOD_A() throws RecognitionException {
        try {
            int _type = MOD_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:24:9: ( '%=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:24:11: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD_A"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:26:9: ( '<' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:26:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:27:9: ( '<=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:27:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:28:9: ( '==' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:28:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:29:9: ( '!=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:29:11: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:30:9: ( '>' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:30:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:31:9: ( '>=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:31:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:33:9: ( '+' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:33:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:34:9: ( '-' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:34:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:35:9: ( '*' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:35:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:36:9: ( '/' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:36:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:37:9: ( '%' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:37:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "EXCL"
    public final void mEXCL() throws RecognitionException {
        try {
            int _type = EXCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:39:9: ( '!' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:39:11: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCL"

    // $ANTLR start "AMPAMP"
    public final void mAMPAMP() throws RecognitionException {
        try {
            int _type = AMPAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:40:9: ( '&&' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:40:11: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPAMP"

    // $ANTLR start "BARBAR"
    public final void mBARBAR() throws RecognitionException {
        try {
            int _type = BARBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:41:9: ( '||' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:41:11: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BARBAR"

    // $ANTLR start "LIT_NOT"
    public final void mLIT_NOT() throws RecognitionException {
        try {
            int _type = LIT_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:42:9: ( 'not' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:42:11: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIT_NOT"

    // $ANTLR start "LIT_AND"
    public final void mLIT_AND() throws RecognitionException {
        try {
            int _type = LIT_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:43:9: ( 'and' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:43:11: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIT_AND"

    // $ANTLR start "LIT_OR"
    public final void mLIT_OR() throws RecognitionException {
        try {
            int _type = LIT_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:44:9: ( 'or' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:44:11: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIT_OR"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:46:9: ( '?' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:46:11: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:47:9: ( ':' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:47:11: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:48:9: ( ',' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:48:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "TICK"
    public final void mTICK() throws RecognitionException {
        try {
            int _type = TICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:50:9: ( '\\'' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:50:11: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TICK"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:51:9: ( '=' )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:51:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:54:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:54:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:54:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NAT"
    public final void mNAT() throws RecognitionException {
        try {
            int _type = NAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:58:3: ( ( '0' .. '9' )+ )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:58:5: ( '0' .. '9' )+
            {
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:58:5: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:58:5: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:62:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:62:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:62:10: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:62:10: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:62:24: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:62:24: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:63:5: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:63:10: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:63:38: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:67:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:67:5: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:8: ( TRUE | FALSE | LPAREN | RPAREN | LBRACKET | RBRACKET | ASSIGN | PLUS_A | MINUS_A | MUL_A | DIV_A | MOD_A | LT | LE | EQ | NE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | EXCL | AMPAMP | BARBAR | LIT_NOT | LIT_AND | LIT_OR | QUESTION | COLON | COMMA | TICK | IS | ID | NAT | COMMENT | WS )
        int alt7=38;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:10: TRUE
                {
                mTRUE(); 

                }
                break;
            case 2 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:15: FALSE
                {
                mFALSE(); 

                }
                break;
            case 3 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:21: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 4 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:28: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 5 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:35: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 6 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:44: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 7 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:53: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 8 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:60: PLUS_A
                {
                mPLUS_A(); 

                }
                break;
            case 9 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:67: MINUS_A
                {
                mMINUS_A(); 

                }
                break;
            case 10 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:75: MUL_A
                {
                mMUL_A(); 

                }
                break;
            case 11 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:81: DIV_A
                {
                mDIV_A(); 

                }
                break;
            case 12 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:87: MOD_A
                {
                mMOD_A(); 

                }
                break;
            case 13 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:93: LT
                {
                mLT(); 

                }
                break;
            case 14 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:96: LE
                {
                mLE(); 

                }
                break;
            case 15 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:99: EQ
                {
                mEQ(); 

                }
                break;
            case 16 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:102: NE
                {
                mNE(); 

                }
                break;
            case 17 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:105: GT
                {
                mGT(); 

                }
                break;
            case 18 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:108: GE
                {
                mGE(); 

                }
                break;
            case 19 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:111: PLUS
                {
                mPLUS(); 

                }
                break;
            case 20 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:116: MINUS
                {
                mMINUS(); 

                }
                break;
            case 21 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:122: MUL
                {
                mMUL(); 

                }
                break;
            case 22 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:126: DIV
                {
                mDIV(); 

                }
                break;
            case 23 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:130: MOD
                {
                mMOD(); 

                }
                break;
            case 24 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:134: EXCL
                {
                mEXCL(); 

                }
                break;
            case 25 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:139: AMPAMP
                {
                mAMPAMP(); 

                }
                break;
            case 26 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:146: BARBAR
                {
                mBARBAR(); 

                }
                break;
            case 27 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:153: LIT_NOT
                {
                mLIT_NOT(); 

                }
                break;
            case 28 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:161: LIT_AND
                {
                mLIT_AND(); 

                }
                break;
            case 29 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:169: LIT_OR
                {
                mLIT_OR(); 

                }
                break;
            case 30 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:176: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 31 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:185: COLON
                {
                mCOLON(); 

                }
                break;
            case 32 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:191: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 33 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:197: TICK
                {
                mTICK(); 

                }
                break;
            case 34 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:202: IS
                {
                mIS(); 

                }
                break;
            case 35 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:205: ID
                {
                mID(); 

                }
                break;
            case 36 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:208: NAT
                {
                mNAT(); 

                }
                break;
            case 37 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:212: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 38 :
                // D:\\Dokumenti\\Faks\\PhD\\galileo\\hr.fer.rasip.remes.grammars.expressions.parser\\grammar\\RemesLexer.g:1:220: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\2\31\4\uffff\1\37\1\41\1\43\1\45\1\50\1\52\1\54\1\56\1"+
        "\60\1\62\2\uffff\3\31\6\uffff\2\31\25\uffff\2\31\1\72\2\31\1\75"+
        "\1\76\1\uffff\1\77\1\31\3\uffff\1\101\1\uffff";
    static final String DFA7_eofS =
        "\102\uffff";
    static final String DFA7_minS =
        "\1\11\1\162\1\141\4\uffff\4\75\1\52\5\75\2\uffff\1\157\1\156\1"+
        "\162\6\uffff\1\165\1\154\25\uffff\1\164\1\144\1\60\1\145\1\163\2"+
        "\60\1\uffff\1\60\1\145\3\uffff\1\60\1\uffff";
    static final String DFA7_maxS =
        "\1\174\1\162\1\141\4\uffff\12\75\2\uffff\1\157\1\156\1\162\6\uffff"+
        "\1\165\1\154\25\uffff\1\164\1\144\1\172\1\145\1\163\2\172\1\uffff"+
        "\1\172\1\145\3\uffff\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\12\uffff\1\31\1\32\3\uffff\1\36\1\40\1"+
        "\41\1\43\1\44\1\46\2\uffff\1\7\1\37\1\10\1\23\1\11\1\24\1\12\1\25"+
        "\1\13\1\45\1\26\1\14\1\27\1\16\1\15\1\17\1\42\1\20\1\30\1\22\1\21"+
        "\7\uffff\1\35\2\uffff\1\33\1\34\1\1\1\uffff\1\2";
    static final String DFA7_specialS =
        "\102\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\17\3\uffff\1\14\1\21\1\30"+
            "\1\3\1\4\1\12\1\10\1\27\1\11\1\uffff\1\13\12\32\1\7\1\uffff"+
            "\1\15\1\16\1\20\1\26\1\uffff\32\31\1\5\1\uffff\1\6\1\uffff\1"+
            "\31\1\uffff\1\24\4\31\1\2\7\31\1\23\1\25\4\31\1\1\6\31\1\uffff"+
            "\1\22",
            "\1\34",
            "\1\35",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "\1\42",
            "\1\44",
            "\1\47\4\uffff\1\47\15\uffff\1\46",
            "\1\51",
            "\1\53",
            "\1\55",
            "\1\57",
            "\1\61",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\73",
            "\1\74",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\100",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TRUE | FALSE | LPAREN | RPAREN | LBRACKET | RBRACKET | ASSIGN | PLUS_A | MINUS_A | MUL_A | DIV_A | MOD_A | LT | LE | EQ | NE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | EXCL | AMPAMP | BARBAR | LIT_NOT | LIT_AND | LIT_OR | QUESTION | COLON | COMMA | TICK | IS | ID | NAT | COMMENT | WS );";
        }
    }
 

}