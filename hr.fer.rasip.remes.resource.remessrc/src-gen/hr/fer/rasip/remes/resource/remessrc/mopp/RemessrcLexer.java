// $ANTLR ${project.version} ${buildNumber}

	package hr.fer.rasip.remes.resource.remessrc.mopp;


import org.antlr.runtime3_2_0.*;

public class RemessrcLexer extends Lexer {
    public static final int INTEGER=12;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=16;
    public static final int FLOAT=14;
    public static final int TEXT=15;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T_WRITEABLE=10;
    public static final int TYPE=11;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T_GLOBAL=8;
    public static final int QUOTED_40_41=6;
    public static final int SL_COMMENT=13;
    public static final int T_URGENT=5;
    public static final int QUOTED_91_93=7;
    public static final int LINEBREAK=17;
    public static final int T_READABLE=9;

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
            // Remessrc.g:29:7: ( '[' )
            // Remessrc.g:29:9: '['
            {
            match('['); 

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
            // Remessrc.g:30:7: ( ']' )
            // Remessrc.g:30:9: ']'
            {
            match(']'); 

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
            // Remessrc.g:31:7: ( '=' )
            // Remessrc.g:31:9: '='
            {
            match('='); 

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
            // Remessrc.g:32:7: ( 'resource' )
            // Remessrc.g:32:9: 'resource'
            {
            match("resource"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:33:7: ( ':' )
            // Remessrc.g:33:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:34:7: ( 'const' )
            // Remessrc.g:34:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2753:11: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Remessrc.g:2754:2: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 

            // Remessrc.g:2754:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Remessrc.g:2754:7: ~ ( '\\n' | '\\r' | '\\uffff' )
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
            // Remessrc.g:2757:8: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // Remessrc.g:2758:2: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Remessrc.g:2758:2: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Remessrc.g:2758:3: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Remessrc.g:2758:8: ( '1' .. '9' )
                    // Remessrc.g:2758:9: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Remessrc.g:2758:18: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Remessrc.g:2758:19: '0' .. '9'
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
                    // Remessrc.g:2758:30: '0'
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
            // Remessrc.g:2759:6: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Remessrc.g:2760:2: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Remessrc.g:2760:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Remessrc.g:2760:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Remessrc.g:2760:8: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // Remessrc.g:2760:9: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Remessrc.g:2760:9: ( '1' .. '9' )
                    // Remessrc.g:2760:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Remessrc.g:2760:20: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Remessrc.g:2760:21: '0' .. '9'
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
                    // Remessrc.g:2760:34: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // Remessrc.g:2760:43: ( '0' .. '9' )+
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
            	    // Remessrc.g:2760:44: '0' .. '9'
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
            // Remessrc.g:2762:9: ( 'global' )
            // Remessrc.g:2763:2: 'global'
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
            // Remessrc.g:2764:11: ( 'readable' )
            // Remessrc.g:2765:2: 'readable'
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
            // Remessrc.g:2766:12: ( 'writeable' )
            // Remessrc.g:2767:2: 'writeable'
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
            // Remessrc.g:2768:9: ( 'urgent' )
            // Remessrc.g:2769:2: 'urgent'
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
            // Remessrc.g:2770:5: ( ( 'integer' | 'natural' | 'boolean' | 'clock' | 'float' ) )
            // Remessrc.g:2771:2: ( 'integer' | 'natural' | 'boolean' | 'clock' | 'float' )
            {
            // Remessrc.g:2771:2: ( 'integer' | 'natural' | 'boolean' | 'clock' | 'float' )
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
                    // Remessrc.g:2771:3: 'integer'
                    {
                    match("integer"); 


                    }
                    break;
                case 2 :
                    // Remessrc.g:2771:13: 'natural'
                    {
                    match("natural"); 


                    }
                    break;
                case 3 :
                    // Remessrc.g:2771:23: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 4 :
                    // Remessrc.g:2771:33: 'clock'
                    {
                    match("clock"); 


                    }
                    break;
                case 5 :
                    // Remessrc.g:2771:41: 'float'
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
            // Remessrc.g:2773:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Remessrc.g:2774:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Remessrc.g:2774:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2775:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Remessrc.g:2776:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Remessrc.g:2776:2: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='-'||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Remessrc.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2778:11: ( ( ' ' | '\\t' | '\\f' ) )
            // Remessrc.g:2779:2: ( ' ' | '\\t' | '\\f' )
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
            // Remessrc.g:2782:10: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Remessrc.g:2783:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Remessrc.g:2783:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\r') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='\n') ) {
                    alt12=1;
                }
                else {
                    alt12=2;}
            }
            else if ( (LA12_0=='\n') ) {
                alt12=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Remessrc.g:2783:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Remessrc.g:2783:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Remessrc.g:2783:19: '\\n'
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

    // $ANTLR start "QUOTED_40_41"
    public final void mQUOTED_40_41() throws RecognitionException {
        try {
            int _type = QUOTED_40_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2786:13: ( ( '(' ) (~ ( ')' ) )* ( ')' ) )
            // Remessrc.g:2787:2: ( '(' ) (~ ( ')' ) )* ( ')' )
            {
            // Remessrc.g:2787:2: ( '(' )
            // Remessrc.g:2787:3: '('
            {
            match('('); 

            }

            // Remessrc.g:2787:7: (~ ( ')' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='(')||(LA13_0>='*' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Remessrc.g:2787:8: ~ ( ')' )
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
            	    break loop13;
                }
            } while (true);

            // Remessrc.g:2787:16: ( ')' )
            // Remessrc.g:2787:17: ')'
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
    // $ANTLR end "QUOTED_40_41"

    // $ANTLR start "QUOTED_91_93"
    public final void mQUOTED_91_93() throws RecognitionException {
        try {
            int _type = QUOTED_91_93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Remessrc.g:2789:13: ( ( '[' ) (~ ( ']' ) )* ( ']' ) )
            // Remessrc.g:2790:2: ( '[' ) (~ ( ']' ) )* ( ']' )
            {
            // Remessrc.g:2790:2: ( '[' )
            // Remessrc.g:2790:3: '['
            {
            match('['); 

            }

            // Remessrc.g:2790:7: (~ ( ']' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\\')||(LA14_0>='^' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Remessrc.g:2790:8: ~ ( ']' )
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

            // Remessrc.g:2790:16: ( ']' )
            // Remessrc.g:2790:17: ']'
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
    // $ANTLR end "QUOTED_91_93"

    public void mTokens() throws RecognitionException {
        // Remessrc.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | SL_COMMENT | INTEGER | FLOAT | T_GLOBAL | T_READABLE | T_WRITEABLE | T_URGENT | TYPE | ID | TEXT | WHITESPACE | LINEBREAK | QUOTED_40_41 | QUOTED_91_93 )
        int alt15=33;
        alt15 = dfa15.predict(input);
        switch (alt15) {
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
                // Remessrc.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // Remessrc.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // Remessrc.g:1:124: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 21 :
                // Remessrc.g:1:135: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 22 :
                // Remessrc.g:1:143: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 23 :
                // Remessrc.g:1:149: T_GLOBAL
                {
                mT_GLOBAL(); 

                }
                break;
            case 24 :
                // Remessrc.g:1:158: T_READABLE
                {
                mT_READABLE(); 

                }
                break;
            case 25 :
                // Remessrc.g:1:169: T_WRITEABLE
                {
                mT_WRITEABLE(); 

                }
                break;
            case 26 :
                // Remessrc.g:1:181: T_URGENT
                {
                mT_URGENT(); 

                }
                break;
            case 27 :
                // Remessrc.g:1:190: TYPE
                {
                mTYPE(); 

                }
                break;
            case 28 :
                // Remessrc.g:1:195: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // Remessrc.g:1:198: TEXT
                {
                mTEXT(); 

                }
                break;
            case 30 :
                // Remessrc.g:1:203: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 31 :
                // Remessrc.g:1:214: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 32 :
                // Remessrc.g:1:224: QUOTED_40_41
                {
                mQUOTED_40_41(); 

                }
                break;
            case 33 :
                // Remessrc.g:1:237: QUOTED_91_93
                {
                mQUOTED_91_93(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\35\2\uffff\6\35\1\50\4\uffff\1\37\2\53\7\35\3\uffff"+
        "\1\35\1\uffff\1\35\1\uffff\6\35\1\100\1\35\2\uffff\1\37\1\uffff"+
        "\1\53\1\uffff\22\35\1\uffff\1\125\17\35\1\145\1\35\1\150\1\35\1"+
        "\uffff\6\35\1\160\4\35\1\165\1\166\2\35\1\uffff\1\35\1\172\1\uffff"+
        "\1\173\5\35\1\166\1\uffff\4\35\2\uffff\1\u0085\2\35\2\uffff\1\u0088"+
        "\1\35\1\u008a\6\35\1\uffff\1\35\1\166\1\uffff\1\35\1\uffff\2\166"+
        "\1\u0093\1\u0094\4\35\2\uffff\1\u0099\1\35\1\u009b\1\u009c\1\uffff"+
        "\1\35\2\uffff\1\u009e\1\uffff";
    static final String DFA15_eofS =
        "\u009f\uffff";
    static final String DFA15_minS =
        "\1\11\1\55\2\uffff\6\55\1\0\4\uffff\1\60\11\55\3\uffff\1\55\1\uffff"+
        "\1\55\1\uffff\10\55\2\uffff\1\56\1\uffff\1\55\1\uffff\22\55\1\uffff"+
        "\24\55\1\uffff\17\55\1\uffff\2\55\1\uffff\7\55\1\uffff\4\55\2\uffff"+
        "\3\55\2\uffff\11\55\1\uffff\2\55\1\uffff\1\55\1\uffff\10\55\2\uffff"+
        "\4\55\1\uffff\1\55\2\uffff\1\55\1\uffff";
    static final String DFA15_maxS =
        "\1\175\1\172\2\uffff\6\172\1\uffff\4\uffff\1\71\11\172\3\uffff"+
        "\1\172\1\uffff\1\172\1\uffff\10\172\2\uffff\1\56\1\uffff\1\172\1"+
        "\uffff\22\172\1\uffff\24\172\1\uffff\17\172\1\uffff\2\172\1\uffff"+
        "\7\172\1\uffff\4\172\2\uffff\3\172\2\uffff\11\172\1\uffff\2\172"+
        "\1\uffff\1\172\1\uffff\10\172\2\uffff\4\172\1\uffff\1\172\2\uffff"+
        "\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\7\uffff\1\17\1\20\1\22\1\24\12\uffff\1\36\1\37"+
        "\1\40\1\uffff\1\34\1\uffff\1\35\10\uffff\1\16\1\41\1\uffff\1\25"+
        "\1\uffff\1\26\22\uffff\1\14\24\uffff\1\15\17\uffff\1\10\2\uffff"+
        "\1\13\7\uffff\1\1\4\uffff\1\23\1\33\3\uffff\1\11\1\12\11\uffff\1"+
        "\5\2\uffff\1\27\1\uffff\1\32\10\uffff\1\21\1\30\4\uffff\1\4\1\uffff"+
        "\1\6\1\31\1\uffff\1\7";
    static final String DFA15_specialS =
        "\12\uffff\1\0\u0094\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\31\1\32\1\uffff\1\31\1\32\22\uffff\1\31\7\uffff\1\33\4\uffff"+
            "\1\17\1\uffff\1\16\1\21\11\20\1\15\2\uffff\1\14\3\uffff\32\30"+
            "\1\12\1\uffff\1\13\1\uffff\1\30\1\uffff\1\5\1\26\1\4\1\30\1"+
            "\7\1\27\1\22\1\30\1\6\4\30\1\25\3\30\1\1\1\30\1\10\1\24\1\11"+
            "\1\23\3\30\1\2\1\uffff\1\3",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\34\25\36",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\41\2\36\1\40\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\42\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15"+
            "\36\1\43\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36"+
            "\1\44\11\36\1\45\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\46\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\47"+
            "\31\36",
            "\0\51",
            "",
            "",
            "",
            "",
            "\1\52\11\20",
            "\1\37\1\55\1\uffff\12\54\7\uffff\32\37\4\uffff\1\37\1\uffff"+
            "\32\37",
            "\1\37\1\55\1\uffff\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff"+
            "\32\37",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\56\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\57\10\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\60\10\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\61"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\62\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\63\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\66"+
            "\13\36\1\64\5\36\1\65\7\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14"+
            "\36\1\67\1\70\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\71\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\72\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10"+
            "\36\1\74\12\36\1\75\1\36\1\73\4\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36"+
            "\1\76\23\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\77\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\101\10\36",
            "",
            "",
            "\1\55",
            "",
            "\1\37\1\55\1\uffff\12\54\7\uffff\32\37\4\uffff\1\37\1\uffff"+
            "\32\37",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\102\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10"+
            "\36\1\103\21\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36"+
            "\1\104\23\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\105\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\106\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\107\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\110\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\111\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36"+
            "\1\112\26\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17"+
            "\36\1\113\12\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36"+
            "\1\114\16\36\1\115\7\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36"+
            "\1\116\27\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14"+
            "\36\1\117\15\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\120"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\121\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\122\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\123\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\124\10\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\36"+
            "\1\126\30\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\127\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\130\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24"+
            "\36\1\131\5\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\132\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\133"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22"+
            "\36\1\134\7\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\24"+
            "\36\1\135\5\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\136"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\137\13\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10"+
            "\36\1\140\21\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\141\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\12"+
            "\36\1\142\17\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10"+
            "\36\1\143\21\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\144\10\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36"+
            "\1\146\23\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22"+
            "\36\1\147\7\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\30"+
            "\36\1\151\1\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\152"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\153\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15"+
            "\36\1\154\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\155\10\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\156\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\157\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\161\10\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\36"+
            "\1\162\30\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22"+
            "\36\1\163\7\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\164\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36"+
            "\1\167\27\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10"+
            "\36\1\170\21\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\171\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\174\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\175"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\176\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\177"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\u0080"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36"+
            "\1\u0081\27\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\u0082\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10"+
            "\36\1\u0083\21\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10"+
            "\36\1\u0084\21\36",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\u0086"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21"+
            "\36\1\u0087\10\36",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\36"+
            "\1\u0089\30\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\u008b\16\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15"+
            "\36\1\u008c\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\u008d\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\u008e\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\u008f\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16"+
            "\36\1\u0090\13\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15"+
            "\36\1\u0091\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\u0092\16\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\u0095\25\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15"+
            "\36\1\u0096\14\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23"+
            "\36\1\u0097\6\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36"+
            "\1\u0098\25\36",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\u009a"+
            "\31\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13"+
            "\36\1\u009d\16\36",
            "",
            "",
            "\1\37\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | SL_COMMENT | INTEGER | FLOAT | T_GLOBAL | T_READABLE | T_WRITEABLE | T_URGENT | TYPE | ID | TEXT | WHITESPACE | LINEBREAK | QUOTED_40_41 | QUOTED_91_93 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_10 = input.LA(1);

                        s = -1;
                        if ( ((LA15_10>='\u0000' && LA15_10<='\uFFFF')) ) {s = 41;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}