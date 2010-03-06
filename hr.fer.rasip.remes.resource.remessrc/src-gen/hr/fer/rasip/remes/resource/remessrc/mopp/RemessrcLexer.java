// $ANTLR ${project.version} ${buildNumber}

	package hr.fer.rasip.remes.resource.remessrc.mopp;


import org.antlr.runtime3_2_0.*;

public class RemessrcLexer extends Lexer {
    public static final int INTEGER=13;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int IN_PARENS=6;
    public static final int T__20=20;
    public static final int WHITESPACE=16;
    public static final int FLOAT=15;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T_WRITEABLE=10;
    public static final int TYPE=11;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int IN_BRACES=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T_GLOBAL=8;
    public static final int SL_COMMENT=14;
    public static final int T_URGENT=5;
    public static final int LINEBREAK=17;
    public static final int T_READABLE=9;
    public static final int ARRAY_SIZE=12;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public RemessrcLexer() {;} 
    public RemessrcLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RemessrcLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Remessrc.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:16:7: ( 'remes' )
            // Remessrc.g:16:9: 'remes'
            {
            match("remes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:17:7: ( '{' )
            // Remessrc.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:18:7: ( '}' )
            // Remessrc.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:19:7: ( 'composite' )
            // Remessrc.g:19:9: 'composite'
            {
            match("composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:20:7: ( 'atomic' )
            // Remessrc.g:20:9: 'atomic'
            {
            match("atomic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:21:7: ( 'invariant' )
            // Remessrc.g:21:9: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:22:7: ( 'conditional' )
            // Remessrc.g:22:9: 'conditional'
            {
            match("conditional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:23:7: ( 'init' )
            // Remessrc.g:23:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:24:7: ( 'edges' )
            // Remessrc.g:24:9: 'edges'
            {
            match("edges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:25:7: ( 'entry' )
            // Remessrc.g:25:9: 'entry'
            {
            match("entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:26:7: ( 'edge' )
            // Remessrc.g:26:9: 'edge'
            {
            match("edge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:27:7: ( 'to' )
            // Remessrc.g:27:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:28:7: ( 'var' )
            // Remessrc.g:28:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:29:7: ( '=' )
            // Remessrc.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:30:7: ( 'resource' )
            // Remessrc.g:30:9: 'resource'
            {
            match("resource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:31:7: ( ':' )
            // Remessrc.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:32:7: ( 'const' )
            // Remessrc.g:32:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2725:11: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Remessrc.g:2726:2: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 

            // Remessrc.g:2726:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Remessrc.g:2726:7: ~ ( '\\n' | '\\r' | '\\uffff' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
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

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2729:8: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-'||(LA4_0>='1' && LA4_0<='9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='0') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // Remessrc.g:2730:2: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Remessrc.g:2730:2: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Remessrc.g:2730:3: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Remessrc.g:2730:8: ( '1' .. '9' )
                    // Remessrc.g:2730:9: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Remessrc.g:2730:18: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Remessrc.g:2730:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Remessrc.g:2730:30: '0'
                    {
                    match('0'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2731:6: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Remessrc.g:2732:2: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Remessrc.g:2732:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Remessrc.g:2732:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Remessrc.g:2732:8: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Remessrc.g:2732:9: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Remessrc.g:2732:9: ( '1' .. '9' )
                    // Remessrc.g:2732:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Remessrc.g:2732:20: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Remessrc.g:2732:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Remessrc.g:2732:34: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // Remessrc.g:2732:43: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Remessrc.g:2732:44: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "T_GLOBAL"
    public final void mT_GLOBAL() throws RecognitionException {
        try {
            int _type = T_GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2734:9: ( 'global' )
            // Remessrc.g:2735:2: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_GLOBAL"

    // $ANTLR start "T_READABLE"
    public final void mT_READABLE() throws RecognitionException {
        try {
            int _type = T_READABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2736:11: ( 'readable' )
            // Remessrc.g:2737:2: 'readable'
            {
            match("readable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_READABLE"

    // $ANTLR start "T_WRITEABLE"
    public final void mT_WRITEABLE() throws RecognitionException {
        try {
            int _type = T_WRITEABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2738:12: ( 'writeable' )
            // Remessrc.g:2739:2: 'writeable'
            {
            match("writeable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_WRITEABLE"

    // $ANTLR start "T_URGENT"
    public final void mT_URGENT() throws RecognitionException {
        try {
            int _type = T_URGENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2740:9: ( 'urgent' )
            // Remessrc.g:2741:2: 'urgent'
            {
            match("urgent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_URGENT"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2742:5: ( ( 'integer' | 'natural' | 'boolean' | 'clock' | 'float' ) )
            // Remessrc.g:2743:2: ( 'integer' | 'natural' | 'boolean' | 'clock' | 'float' )
            {
            // Remessrc.g:2743:2: ( 'integer' | 'natural' | 'boolean' | 'clock' | 'float' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt9=1;
                }
                break;
            case 'n':
                {
                alt9=2;
                }
                break;
            case 'b':
                {
                alt9=3;
                }
                break;
            case 'c':
                {
                alt9=4;
                }
                break;
            case 'f':
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // Remessrc.g:2743:3: 'integer'
                    {
                    match("integer"); 


                    }
                    break;
                case 2 :
                    // Remessrc.g:2743:13: 'natural'
                    {
                    match("natural"); 


                    }
                    break;
                case 3 :
                    // Remessrc.g:2743:23: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 4 :
                    // Remessrc.g:2743:33: 'clock'
                    {
                    match("clock"); 


                    }
                    break;
                case 5 :
                    // Remessrc.g:2743:41: 'float'
                    {
                    match("float"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2745:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Remessrc.g:2746:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Remessrc.g:2746:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Remessrc.g:
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
            	    break loop10;
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

    // $ANTLR start "ARRAY_SIZE"
    public final void mARRAY_SIZE() throws RecognitionException {
        try {
            int _type = ARRAY_SIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2747:11: ( ( '[' ) ( ' ' | '\\t' | '\\f' )* ( '1' .. '9' ) ( '0' .. '9' )* ( ' ' | '\\t' | '\\f' )* ( ']' ) )
            // Remessrc.g:2748:2: ( '[' ) ( ' ' | '\\t' | '\\f' )* ( '1' .. '9' ) ( '0' .. '9' )* ( ' ' | '\\t' | '\\f' )* ( ']' )
            {
            // Remessrc.g:2748:2: ( '[' )
            // Remessrc.g:2748:3: '['
            {
            match('['); 

            }

            // Remessrc.g:2748:7: ( ' ' | '\\t' | '\\f' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||LA11_0=='\f'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Remessrc.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // Remessrc.g:2748:27: ( '1' .. '9' )
            // Remessrc.g:2748:28: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            // Remessrc.g:2748:37: ( '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Remessrc.g:2748:38: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // Remessrc.g:2748:48: ( ' ' | '\\t' | '\\f' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\t'||LA13_0=='\f'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Remessrc.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // Remessrc.g:2748:68: ( ']' )
            // Remessrc.g:2748:69: ']'
            {
            match(']'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY_SIZE"

    // $ANTLR start "IN_BRACES"
    public final void mIN_BRACES() throws RecognitionException {
        try {
            int _type = IN_BRACES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2750:10: ( ( '[' ) (~ ( ']' ) )* ( ']' ) )
            // Remessrc.g:2751:2: ( '[' ) (~ ( ']' ) )* ( ']' )
            {
            // Remessrc.g:2751:2: ( '[' )
            // Remessrc.g:2751:3: '['
            {
            match('['); 

            }

            // Remessrc.g:2751:7: (~ ( ']' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\\')||(LA14_0>='^' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Remessrc.g:2751:8: ~ ( ']' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\\')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // Remessrc.g:2751:16: ( ']' )
            // Remessrc.g:2751:17: ']'
            {
            match(']'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN_BRACES"

    // $ANTLR start "IN_PARENS"
    public final void mIN_PARENS() throws RecognitionException {
        try {
            int _type = IN_PARENS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2753:10: ( ( '\\(' ) (~ ( '\\)' ) )* ( '\\)' ) )
            // Remessrc.g:2754:2: ( '\\(' ) (~ ( '\\)' ) )* ( '\\)' )
            {
            // Remessrc.g:2754:2: ( '\\(' )
            // Remessrc.g:2754:3: '\\('
            {
            match('('); 

            }

            // Remessrc.g:2754:8: (~ ( '\\)' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='(')||(LA15_0>='*' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Remessrc.g:2754:9: ~ ( '\\)' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='(')||(input.LA(1)>='*' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // Remessrc.g:2754:18: ( '\\)' )
            // Remessrc.g:2754:19: '\\)'
            {
            match(')'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN_PARENS"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2756:11: ( ( ' ' | '\\t' | '\\f' ) )
            // Remessrc.g:2757:2: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2760:10: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Remessrc.g:2761:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Remessrc.g:2761:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\r') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='\n') ) {
                    alt16=1;
                }
                else {
                    alt16=2;}
            }
            else if ( (LA16_0=='\n') ) {
                alt16=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // Remessrc.g:2761:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Remessrc.g:2761:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Remessrc.g:2761:19: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    public void mTokens() throws RecognitionException {
        // Remessrc.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | INTEGER | FLOAT | T_GLOBAL | T_READABLE | T_WRITEABLE | T_URGENT | TYPE | ID | ARRAY_SIZE | IN_BRACES | IN_PARENS | WHITESPACE | LINEBREAK )
        int alt17=31;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // Remessrc.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // Remessrc.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // Remessrc.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // Remessrc.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // Remessrc.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // Remessrc.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // Remessrc.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // Remessrc.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // Remessrc.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // Remessrc.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // Remessrc.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // Remessrc.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // Remessrc.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // Remessrc.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // Remessrc.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // Remessrc.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // Remessrc.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // Remessrc.g:1:112: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 19 :
                // Remessrc.g:1:123: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 20 :
                // Remessrc.g:1:131: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 21 :
                // Remessrc.g:1:137: T_GLOBAL
                {
                mT_GLOBAL(); 

                }
                break;
            case 22 :
                // Remessrc.g:1:146: T_READABLE
                {
                mT_READABLE(); 

                }
                break;
            case 23 :
                // Remessrc.g:1:157: T_WRITEABLE
                {
                mT_WRITEABLE(); 

                }
                break;
            case 24 :
                // Remessrc.g:1:169: T_URGENT
                {
                mT_URGENT(); 

                }
                break;
            case 25 :
                // Remessrc.g:1:178: TYPE
                {
                mTYPE(); 

                }
                break;
            case 26 :
                // Remessrc.g:1:183: ID
                {
                mID(); 

                }
                break;
            case 27 :
                // Remessrc.g:1:186: ARRAY_SIZE
                {
                mARRAY_SIZE(); 

                }
                break;
            case 28 :
                // Remessrc.g:1:197: IN_BRACES
                {
                mIN_BRACES(); 

                }
                break;
            case 29 :
                // Remessrc.g:1:207: IN_PARENS
                {
                mIN_PARENS(); 

                }
                break;
            case 30 :
                // Remessrc.g:1:217: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 31 :
                // Remessrc.g:1:228: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\26\2\uffff\6\26\4\uffff\2\46\6\26\5\uffff\7\26\1\74"+
        "\1\26\1\uffff\1\46\1\uffff\6\26\3\uffff\14\26\1\uffff\1\124\6\26"+
        "\3\uffff\11\26\1\145\1\26\1\150\1\26\1\uffff\6\26\1\uffff\1\160"+
        "\4\26\1\165\1\166\2\26\1\uffff\1\26\1\172\1\uffff\1\173\5\26\1\166"+
        "\1\uffff\4\26\2\uffff\1\u0085\2\26\2\uffff\1\u0088\1\26\1\u008a"+
        "\6\26\1\uffff\1\26\1\166\1\uffff\1\26\1\uffff\2\166\1\u0093\1\u0094"+
        "\4\26\2\uffff\1\u0099\1\26\1\u009b\1\u009c\1\uffff\1\26\2\uffff"+
        "\1\u009e\1\uffff";
    static final String DFA17_eofS =
        "\u009f\uffff";
    static final String DFA17_minS =
        "\1\11\1\145\2\uffff\1\154\1\164\1\156\1\144\1\157\1\141\3\uffff"+
        "\1\60\2\56\1\154\2\162\1\141\1\157\1\154\1\uffff\1\0\3\uffff\1\141"+
        "\1\155\2\157\1\151\1\147\1\164\1\60\1\162\1\uffff\1\56\1\uffff\1"+
        "\157\1\151\1\147\1\164\2\157\2\0\1\uffff\1\145\1\157\1\144\1\160"+
        "\1\144\1\143\1\155\1\141\1\164\2\145\1\162\1\uffff\1\60\1\142\1"+
        "\164\1\145\1\165\1\154\1\141\1\uffff\2\0\1\163\1\165\1\141\1\157"+
        "\1\151\1\164\1\153\1\151\1\162\1\60\1\147\1\60\1\171\1\uffff\1\141"+
        "\1\145\1\156\1\162\1\145\1\164\1\uffff\1\60\1\162\1\142\1\163\1"+
        "\164\2\60\1\143\1\151\1\uffff\1\145\1\60\1\uffff\1\60\1\154\1\141"+
        "\1\164\2\141\1\60\1\uffff\1\143\1\154\2\151\2\uffff\1\60\1\141\1"+
        "\162\2\uffff\1\60\1\142\1\60\1\154\1\156\2\145\1\164\1\157\1\uffff"+
        "\1\156\1\60\1\uffff\1\154\1\uffff\4\60\1\145\1\156\1\164\1\145\2"+
        "\uffff\1\60\1\141\2\60\1\uffff\1\154\2\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\175\1\145\2\uffff\1\157\1\164\2\156\1\157\1\141\3\uffff\2\71"+
        "\1\56\1\154\2\162\1\141\1\157\1\154\1\uffff\1\uffff\3\uffff\1\163"+
        "\1\156\2\157\1\166\1\147\1\164\1\172\1\162\1\uffff\1\71\1\uffff"+
        "\1\157\1\151\1\147\1\164\2\157\2\uffff\1\uffff\1\145\1\157\1\144"+
        "\1\160\1\163\1\143\1\155\1\141\1\164\2\145\1\162\1\uffff\1\172\1"+
        "\142\1\164\1\145\1\165\1\154\1\141\1\uffff\2\uffff\1\163\1\165\1"+
        "\141\1\157\1\151\1\164\1\153\1\151\1\162\1\172\1\147\1\172\1\171"+
        "\1\uffff\1\141\1\145\1\156\1\162\1\145\1\164\1\uffff\1\172\1\162"+
        "\1\142\1\163\1\164\2\172\1\143\1\151\1\uffff\1\145\1\172\1\uffff"+
        "\1\172\1\154\1\141\1\164\2\141\1\172\1\uffff\1\143\1\154\2\151\2"+
        "\uffff\1\172\1\141\1\162\2\uffff\1\172\1\142\1\172\1\154\1\156\2"+
        "\145\1\164\1\157\1\uffff\1\156\1\172\1\uffff\1\154\1\uffff\4\172"+
        "\1\145\1\156\1\164\1\145\2\uffff\1\172\1\141\2\172\1\uffff\1\154"+
        "\2\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\6\uffff\1\16\1\20\1\22\11\uffff\1\32\1\uffff\1"+
        "\35\1\36\1\37\11\uffff\1\24\1\uffff\1\23\10\uffff\1\34\14\uffff"+
        "\1\14\7\uffff\1\33\17\uffff\1\15\6\uffff\1\33\11\uffff\1\10\2\uffff"+
        "\1\13\7\uffff\1\1\4\uffff\1\21\1\31\3\uffff\1\11\1\12\11\uffff\1"+
        "\5\2\uffff\1\25\1\uffff\1\30\10\uffff\1\17\1\26\4\uffff\1\4\1\uffff"+
        "\1\6\1\27\1\uffff\1\7";
    static final String DFA17_specialS =
        "\27\uffff\1\4\25\uffff\1\1\1\2\26\uffff\1\0\1\3\130\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\31\1\32\1\uffff\1\31\1\32\22\uffff\1\31\7\uffff\1\30\4\uffff"+
            "\1\15\1\uffff\1\14\1\17\11\16\1\13\2\uffff\1\12\3\uffff\32\26"+
            "\1\27\3\uffff\1\26\1\uffff\1\5\1\24\1\4\1\26\1\7\1\25\1\20\1"+
            "\26\1\6\4\26\1\23\3\26\1\1\1\26\1\10\1\22\1\11\1\21\3\26\1\2"+
            "\1\uffff\1\3",
            "\1\33",
            "",
            "",
            "\1\35\2\uffff\1\34",
            "\1\36",
            "\1\37",
            "\1\40\11\uffff\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "\1\44\11\16",
            "\1\44\1\uffff\12\45",
            "\1\44",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "\11\57\1\55\2\57\1\55\23\57\1\55\20\57\11\56\uffc6\57",
            "",
            "",
            "",
            "\1\62\13\uffff\1\60\5\uffff\1\61",
            "\1\63\1\64",
            "\1\65",
            "\1\66",
            "\1\70\12\uffff\1\71\1\uffff\1\67",
            "\1\72",
            "\1\73",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\75",
            "",
            "\1\44\1\uffff\12\45",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\11\57\1\55\2\57\1\55\23\57\1\55\20\57\11\56\uffc6\57",
            "\11\57\1\106\2\57\1\106\23\57\1\106\17\57\12\105\43\57\1\104"+
            "\uffa2\57",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\16\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\11\57\1\106\2\57\1\106\23\57\1\106\17\57\12\105\43\57\1\104"+
            "\uffa2\57",
            "\11\57\1\106\2\57\1\106\23\57\1\106\74\57\1\104\uffa2\57",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\146",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\22\26\1\147\7\26",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0089",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u0092",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u009a",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u009d",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | SL_COMMENT | INTEGER | FLOAT | T_GLOBAL | T_READABLE | T_WRITEABLE | T_URGENT | TYPE | ID | ARRAY_SIZE | IN_BRACES | IN_PARENS | WHITESPACE | LINEBREAK );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( (LA17_69==']') ) {s = 68;}

                        else if ( (LA17_69=='\t'||LA17_69=='\f'||LA17_69==' ') ) {s = 70;}

                        else if ( ((LA17_69>='0' && LA17_69<='9')) ) {s = 69;}

                        else if ( ((LA17_69>='\u0000' && LA17_69<='\b')||(LA17_69>='\n' && LA17_69<='\u000B')||(LA17_69>='\r' && LA17_69<='\u001F')||(LA17_69>='!' && LA17_69<='/')||(LA17_69>=':' && LA17_69<='\\')||(LA17_69>='^' && LA17_69<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_45 = input.LA(1);

                        s = -1;
                        if ( ((LA17_45>='\u0000' && LA17_45<='\b')||(LA17_45>='\n' && LA17_45<='\u000B')||(LA17_45>='\r' && LA17_45<='\u001F')||(LA17_45>='!' && LA17_45<='0')||(LA17_45>=':' && LA17_45<='\uFFFF')) ) {s = 47;}

                        else if ( ((LA17_45>='1' && LA17_45<='9')) ) {s = 46;}

                        else if ( (LA17_45=='\t'||LA17_45=='\f'||LA17_45==' ') ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_46 = input.LA(1);

                        s = -1;
                        if ( (LA17_46==']') ) {s = 68;}

                        else if ( ((LA17_46>='0' && LA17_46<='9')) ) {s = 69;}

                        else if ( (LA17_46=='\t'||LA17_46=='\f'||LA17_46==' ') ) {s = 70;}

                        else if ( ((LA17_46>='\u0000' && LA17_46<='\b')||(LA17_46>='\n' && LA17_46<='\u000B')||(LA17_46>='\r' && LA17_46<='\u001F')||(LA17_46>='!' && LA17_46<='/')||(LA17_46>=':' && LA17_46<='\\')||(LA17_46>='^' && LA17_46<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_70 = input.LA(1);

                        s = -1;
                        if ( (LA17_70==']') ) {s = 68;}

                        else if ( (LA17_70=='\t'||LA17_70=='\f'||LA17_70==' ') ) {s = 70;}

                        else if ( ((LA17_70>='\u0000' && LA17_70<='\b')||(LA17_70>='\n' && LA17_70<='\u000B')||(LA17_70>='\r' && LA17_70<='\u001F')||(LA17_70>='!' && LA17_70<='\\')||(LA17_70>='^' && LA17_70<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_23 = input.LA(1);

                        s = -1;
                        if ( (LA17_23=='\t'||LA17_23=='\f'||LA17_23==' ') ) {s = 45;}

                        else if ( ((LA17_23>='1' && LA17_23<='9')) ) {s = 46;}

                        else if ( ((LA17_23>='\u0000' && LA17_23<='\b')||(LA17_23>='\n' && LA17_23<='\u000B')||(LA17_23>='\r' && LA17_23<='\u001F')||(LA17_23>='!' && LA17_23<='0')||(LA17_23>=':' && LA17_23<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}