package hr.fer.rasip.remes.profile.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import hr.fer.rasip.remes.profile.services.ProfileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProfileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cpu'", "'memory'", "'bandwidth'", "'power'", "'port'", "'min'", "'max'", "'avg'", "'<'", "'<='", "'=='", "'>='", "'>'", "'profile'", "'{'", "'}'", "'resources'", "','", "'constraints'", "':'", "'@'", "'('", "')'", "'\\''"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=9;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=8;

    // delegates
    // delegators


        public InternalProfileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProfileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProfileParser.tokenNames; }
    public String getGrammarFileName() { return "../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g"; }


     
     	private ProfileGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProfileGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePlatformProfile"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:60:1: entryRulePlatformProfile : rulePlatformProfile EOF ;
    public final void entryRulePlatformProfile() throws RecognitionException {
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:61:1: ( rulePlatformProfile EOF )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:62:1: rulePlatformProfile EOF
            {
             before(grammarAccess.getPlatformProfileRule()); 
            pushFollow(FOLLOW_rulePlatformProfile_in_entryRulePlatformProfile61);
            rulePlatformProfile();

            state._fsp--;

             after(grammarAccess.getPlatformProfileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatformProfile68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlatformProfile"


    // $ANTLR start "rulePlatformProfile"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:69:1: rulePlatformProfile : ( ( rule__PlatformProfile__Group__0 ) ) ;
    public final void rulePlatformProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:73:2: ( ( ( rule__PlatformProfile__Group__0 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:74:1: ( ( rule__PlatformProfile__Group__0 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:74:1: ( ( rule__PlatformProfile__Group__0 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:75:1: ( rule__PlatformProfile__Group__0 )
            {
             before(grammarAccess.getPlatformProfileAccess().getGroup()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:76:1: ( rule__PlatformProfile__Group__0 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:76:2: rule__PlatformProfile__Group__0
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__0_in_rulePlatformProfile94);
            rule__PlatformProfile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformProfileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlatformProfile"


    // $ANTLR start "entryRuleResource"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:88:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:89:1: ( ruleResource EOF )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:90:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource121);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:97:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:101:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:102:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:102:1: ( ( rule__Resource__Group__0 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:103:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:104:1: ( rule__Resource__Group__0 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:104:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource154);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleConstraint"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:116:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:117:1: ( ruleConstraint EOF )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:118:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint181);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:125:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:129:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:130:1: ( ( rule__Constraint__Group__0 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:130:1: ( ( rule__Constraint__Group__0 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:131:1: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:132:1: ( rule__Constraint__Group__0 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:132:2: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0_in_ruleConstraint214);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "ruleResourceType"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:145:1: ruleResourceType : ( ( rule__ResourceType__Alternatives ) ) ;
    public final void ruleResourceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:149:1: ( ( ( rule__ResourceType__Alternatives ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:150:1: ( ( rule__ResourceType__Alternatives ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:150:1: ( ( rule__ResourceType__Alternatives ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:151:1: ( rule__ResourceType__Alternatives )
            {
             before(grammarAccess.getResourceTypeAccess().getAlternatives()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:152:1: ( rule__ResourceType__Alternatives )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:152:2: rule__ResourceType__Alternatives
            {
            pushFollow(FOLLOW_rule__ResourceType__Alternatives_in_ruleResourceType251);
            rule__ResourceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResourceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "ruleConstraintType"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:164:1: ruleConstraintType : ( ( rule__ConstraintType__Alternatives ) ) ;
    public final void ruleConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:168:1: ( ( ( rule__ConstraintType__Alternatives ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:169:1: ( ( rule__ConstraintType__Alternatives ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:169:1: ( ( rule__ConstraintType__Alternatives ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:170:1: ( rule__ConstraintType__Alternatives )
            {
             before(grammarAccess.getConstraintTypeAccess().getAlternatives()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:171:1: ( rule__ConstraintType__Alternatives )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:171:2: rule__ConstraintType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType287);
            rule__ConstraintType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleConstraintOperation"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:183:1: ruleConstraintOperation : ( ( rule__ConstraintOperation__Alternatives ) ) ;
    public final void ruleConstraintOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:187:1: ( ( ( rule__ConstraintOperation__Alternatives ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:188:1: ( ( rule__ConstraintOperation__Alternatives ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:188:1: ( ( rule__ConstraintOperation__Alternatives ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:189:1: ( rule__ConstraintOperation__Alternatives )
            {
             before(grammarAccess.getConstraintOperationAccess().getAlternatives()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:190:1: ( rule__ConstraintOperation__Alternatives )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:190:2: rule__ConstraintOperation__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstraintOperation__Alternatives_in_ruleConstraintOperation323);
            rule__ConstraintOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintOperation"


    // $ANTLR start "rule__ResourceType__Alternatives"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:201:1: rule__ResourceType__Alternatives : ( ( ( 'cpu' ) ) | ( ( 'memory' ) ) | ( ( 'bandwidth' ) ) | ( ( 'power' ) ) | ( ( 'port' ) ) );
    public final void rule__ResourceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:205:1: ( ( ( 'cpu' ) ) | ( ( 'memory' ) ) | ( ( 'bandwidth' ) ) | ( ( 'power' ) ) | ( ( 'port' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 10:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            case 13:
                {
                alt1=4;
                }
                break;
            case 14:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:206:1: ( ( 'cpu' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:206:1: ( ( 'cpu' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:207:1: ( 'cpu' )
                    {
                     before(grammarAccess.getResourceTypeAccess().getCpuEnumLiteralDeclaration_0()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:208:1: ( 'cpu' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:208:3: 'cpu'
                    {
                    match(input,10,FOLLOW_10_in_rule__ResourceType__Alternatives359); 

                    }

                     after(grammarAccess.getResourceTypeAccess().getCpuEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:213:6: ( ( 'memory' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:213:6: ( ( 'memory' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:214:1: ( 'memory' )
                    {
                     before(grammarAccess.getResourceTypeAccess().getMemoryEnumLiteralDeclaration_1()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:215:1: ( 'memory' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:215:3: 'memory'
                    {
                    match(input,11,FOLLOW_11_in_rule__ResourceType__Alternatives380); 

                    }

                     after(grammarAccess.getResourceTypeAccess().getMemoryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:220:6: ( ( 'bandwidth' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:220:6: ( ( 'bandwidth' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:221:1: ( 'bandwidth' )
                    {
                     before(grammarAccess.getResourceTypeAccess().getBandwidthEnumLiteralDeclaration_2()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:222:1: ( 'bandwidth' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:222:3: 'bandwidth'
                    {
                    match(input,12,FOLLOW_12_in_rule__ResourceType__Alternatives401); 

                    }

                     after(grammarAccess.getResourceTypeAccess().getBandwidthEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:227:6: ( ( 'power' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:227:6: ( ( 'power' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:228:1: ( 'power' )
                    {
                     before(grammarAccess.getResourceTypeAccess().getPowerEnumLiteralDeclaration_3()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:229:1: ( 'power' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:229:3: 'power'
                    {
                    match(input,13,FOLLOW_13_in_rule__ResourceType__Alternatives422); 

                    }

                     after(grammarAccess.getResourceTypeAccess().getPowerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:234:6: ( ( 'port' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:234:6: ( ( 'port' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:235:1: ( 'port' )
                    {
                     before(grammarAccess.getResourceTypeAccess().getPortEnumLiteralDeclaration_4()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:236:1: ( 'port' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:236:3: 'port'
                    {
                    match(input,14,FOLLOW_14_in_rule__ResourceType__Alternatives443); 

                    }

                     after(grammarAccess.getResourceTypeAccess().getPortEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceType__Alternatives"


    // $ANTLR start "rule__ConstraintType__Alternatives"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:246:1: rule__ConstraintType__Alternatives : ( ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'avg' ) ) );
    public final void rule__ConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:250:1: ( ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'avg' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:251:1: ( ( 'min' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:251:1: ( ( 'min' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:252:1: ( 'min' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getMinimumEnumLiteralDeclaration_0()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:253:1: ( 'min' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:253:3: 'min'
                    {
                    match(input,15,FOLLOW_15_in_rule__ConstraintType__Alternatives479); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getMinimumEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:258:6: ( ( 'max' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:258:6: ( ( 'max' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:259:1: ( 'max' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getMaximumEnumLiteralDeclaration_1()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:260:1: ( 'max' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:260:3: 'max'
                    {
                    match(input,16,FOLLOW_16_in_rule__ConstraintType__Alternatives500); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getMaximumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:265:6: ( ( 'avg' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:265:6: ( ( 'avg' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:266:1: ( 'avg' )
                    {
                     before(grammarAccess.getConstraintTypeAccess().getAverageEnumLiteralDeclaration_2()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:267:1: ( 'avg' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:267:3: 'avg'
                    {
                    match(input,17,FOLLOW_17_in_rule__ConstraintType__Alternatives521); 

                    }

                     after(grammarAccess.getConstraintTypeAccess().getAverageEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintType__Alternatives"


    // $ANTLR start "rule__ConstraintOperation__Alternatives"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:277:1: rule__ConstraintOperation__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__ConstraintOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:281:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:282:1: ( ( '<' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:282:1: ( ( '<' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:283:1: ( '<' )
                    {
                     before(grammarAccess.getConstraintOperationAccess().getLessEnumLiteralDeclaration_0()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:284:1: ( '<' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:284:3: '<'
                    {
                    match(input,18,FOLLOW_18_in_rule__ConstraintOperation__Alternatives557); 

                    }

                     after(grammarAccess.getConstraintOperationAccess().getLessEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:289:6: ( ( '<=' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:289:6: ( ( '<=' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:290:1: ( '<=' )
                    {
                     before(grammarAccess.getConstraintOperationAccess().getLessOrEqualEnumLiteralDeclaration_1()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:291:1: ( '<=' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:291:3: '<='
                    {
                    match(input,19,FOLLOW_19_in_rule__ConstraintOperation__Alternatives578); 

                    }

                     after(grammarAccess.getConstraintOperationAccess().getLessOrEqualEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:296:6: ( ( '==' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:296:6: ( ( '==' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:297:1: ( '==' )
                    {
                     before(grammarAccess.getConstraintOperationAccess().getEqualEnumLiteralDeclaration_2()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:298:1: ( '==' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:298:3: '=='
                    {
                    match(input,20,FOLLOW_20_in_rule__ConstraintOperation__Alternatives599); 

                    }

                     after(grammarAccess.getConstraintOperationAccess().getEqualEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:303:6: ( ( '>=' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:303:6: ( ( '>=' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:304:1: ( '>=' )
                    {
                     before(grammarAccess.getConstraintOperationAccess().getGreaterOrEqualEnumLiteralDeclaration_3()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:305:1: ( '>=' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:305:3: '>='
                    {
                    match(input,21,FOLLOW_21_in_rule__ConstraintOperation__Alternatives620); 

                    }

                     after(grammarAccess.getConstraintOperationAccess().getGreaterOrEqualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:310:6: ( ( '>' ) )
                    {
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:310:6: ( ( '>' ) )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:311:1: ( '>' )
                    {
                     before(grammarAccess.getConstraintOperationAccess().getGreaterEnumLiteralDeclaration_4()); 
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:312:1: ( '>' )
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:312:3: '>'
                    {
                    match(input,22,FOLLOW_22_in_rule__ConstraintOperation__Alternatives641); 

                    }

                     after(grammarAccess.getConstraintOperationAccess().getGreaterEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintOperation__Alternatives"


    // $ANTLR start "rule__PlatformProfile__Group__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:324:1: rule__PlatformProfile__Group__0 : rule__PlatformProfile__Group__0__Impl rule__PlatformProfile__Group__1 ;
    public final void rule__PlatformProfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:328:1: ( rule__PlatformProfile__Group__0__Impl rule__PlatformProfile__Group__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:329:2: rule__PlatformProfile__Group__0__Impl rule__PlatformProfile__Group__1
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__0__Impl_in_rule__PlatformProfile__Group__0674);
            rule__PlatformProfile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group__1_in_rule__PlatformProfile__Group__0677);
            rule__PlatformProfile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__0"


    // $ANTLR start "rule__PlatformProfile__Group__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:336:1: rule__PlatformProfile__Group__0__Impl : ( () ) ;
    public final void rule__PlatformProfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:340:1: ( ( () ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:341:1: ( () )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:341:1: ( () )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:342:1: ()
            {
             before(grammarAccess.getPlatformProfileAccess().getPlatformProfileAction_0()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:343:1: ()
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:345:1: 
            {
            }

             after(grammarAccess.getPlatformProfileAccess().getPlatformProfileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__0__Impl"


    // $ANTLR start "rule__PlatformProfile__Group__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:355:1: rule__PlatformProfile__Group__1 : rule__PlatformProfile__Group__1__Impl rule__PlatformProfile__Group__2 ;
    public final void rule__PlatformProfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:359:1: ( rule__PlatformProfile__Group__1__Impl rule__PlatformProfile__Group__2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:360:2: rule__PlatformProfile__Group__1__Impl rule__PlatformProfile__Group__2
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__1__Impl_in_rule__PlatformProfile__Group__1735);
            rule__PlatformProfile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group__2_in_rule__PlatformProfile__Group__1738);
            rule__PlatformProfile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__1"


    // $ANTLR start "rule__PlatformProfile__Group__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:367:1: rule__PlatformProfile__Group__1__Impl : ( 'profile' ) ;
    public final void rule__PlatformProfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:371:1: ( ( 'profile' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:372:1: ( 'profile' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:372:1: ( 'profile' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:373:1: 'profile'
            {
             before(grammarAccess.getPlatformProfileAccess().getProfileKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__PlatformProfile__Group__1__Impl766); 
             after(grammarAccess.getPlatformProfileAccess().getProfileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__1__Impl"


    // $ANTLR start "rule__PlatformProfile__Group__2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:386:1: rule__PlatformProfile__Group__2 : rule__PlatformProfile__Group__2__Impl rule__PlatformProfile__Group__3 ;
    public final void rule__PlatformProfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:390:1: ( rule__PlatformProfile__Group__2__Impl rule__PlatformProfile__Group__3 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:391:2: rule__PlatformProfile__Group__2__Impl rule__PlatformProfile__Group__3
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__2__Impl_in_rule__PlatformProfile__Group__2797);
            rule__PlatformProfile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group__3_in_rule__PlatformProfile__Group__2800);
            rule__PlatformProfile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__2"


    // $ANTLR start "rule__PlatformProfile__Group__2__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:398:1: rule__PlatformProfile__Group__2__Impl : ( ( rule__PlatformProfile__NameAssignment_2 ) ) ;
    public final void rule__PlatformProfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:402:1: ( ( ( rule__PlatformProfile__NameAssignment_2 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:403:1: ( ( rule__PlatformProfile__NameAssignment_2 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:403:1: ( ( rule__PlatformProfile__NameAssignment_2 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:404:1: ( rule__PlatformProfile__NameAssignment_2 )
            {
             before(grammarAccess.getPlatformProfileAccess().getNameAssignment_2()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:405:1: ( rule__PlatformProfile__NameAssignment_2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:405:2: rule__PlatformProfile__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PlatformProfile__NameAssignment_2_in_rule__PlatformProfile__Group__2__Impl827);
            rule__PlatformProfile__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformProfileAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__2__Impl"


    // $ANTLR start "rule__PlatformProfile__Group__3"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:415:1: rule__PlatformProfile__Group__3 : rule__PlatformProfile__Group__3__Impl rule__PlatformProfile__Group__4 ;
    public final void rule__PlatformProfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:419:1: ( rule__PlatformProfile__Group__3__Impl rule__PlatformProfile__Group__4 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:420:2: rule__PlatformProfile__Group__3__Impl rule__PlatformProfile__Group__4
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__3__Impl_in_rule__PlatformProfile__Group__3857);
            rule__PlatformProfile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group__4_in_rule__PlatformProfile__Group__3860);
            rule__PlatformProfile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__3"


    // $ANTLR start "rule__PlatformProfile__Group__3__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:427:1: rule__PlatformProfile__Group__3__Impl : ( '{' ) ;
    public final void rule__PlatformProfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:431:1: ( ( '{' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:432:1: ( '{' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:432:1: ( '{' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:433:1: '{'
            {
             before(grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__PlatformProfile__Group__3__Impl888); 
             after(grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__3__Impl"


    // $ANTLR start "rule__PlatformProfile__Group__4"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:446:1: rule__PlatformProfile__Group__4 : rule__PlatformProfile__Group__4__Impl rule__PlatformProfile__Group__5 ;
    public final void rule__PlatformProfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:450:1: ( rule__PlatformProfile__Group__4__Impl rule__PlatformProfile__Group__5 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:451:2: rule__PlatformProfile__Group__4__Impl rule__PlatformProfile__Group__5
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__4__Impl_in_rule__PlatformProfile__Group__4919);
            rule__PlatformProfile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group__5_in_rule__PlatformProfile__Group__4922);
            rule__PlatformProfile__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__4"


    // $ANTLR start "rule__PlatformProfile__Group__4__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:458:1: rule__PlatformProfile__Group__4__Impl : ( ( rule__PlatformProfile__Group_4__0 )? ) ;
    public final void rule__PlatformProfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:462:1: ( ( ( rule__PlatformProfile__Group_4__0 )? ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:463:1: ( ( rule__PlatformProfile__Group_4__0 )? )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:463:1: ( ( rule__PlatformProfile__Group_4__0 )? )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:464:1: ( rule__PlatformProfile__Group_4__0 )?
            {
             before(grammarAccess.getPlatformProfileAccess().getGroup_4()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:465:1: ( rule__PlatformProfile__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:465:2: rule__PlatformProfile__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PlatformProfile__Group_4__0_in_rule__PlatformProfile__Group__4__Impl949);
                    rule__PlatformProfile__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformProfileAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__4__Impl"


    // $ANTLR start "rule__PlatformProfile__Group__5"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:475:1: rule__PlatformProfile__Group__5 : rule__PlatformProfile__Group__5__Impl rule__PlatformProfile__Group__6 ;
    public final void rule__PlatformProfile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:479:1: ( rule__PlatformProfile__Group__5__Impl rule__PlatformProfile__Group__6 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:480:2: rule__PlatformProfile__Group__5__Impl rule__PlatformProfile__Group__6
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__5__Impl_in_rule__PlatformProfile__Group__5980);
            rule__PlatformProfile__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group__6_in_rule__PlatformProfile__Group__5983);
            rule__PlatformProfile__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__5"


    // $ANTLR start "rule__PlatformProfile__Group__5__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:487:1: rule__PlatformProfile__Group__5__Impl : ( ( rule__PlatformProfile__Group_5__0 )? ) ;
    public final void rule__PlatformProfile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:491:1: ( ( ( rule__PlatformProfile__Group_5__0 )? ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:492:1: ( ( rule__PlatformProfile__Group_5__0 )? )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:492:1: ( ( rule__PlatformProfile__Group_5__0 )? )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:493:1: ( rule__PlatformProfile__Group_5__0 )?
            {
             before(grammarAccess.getPlatformProfileAccess().getGroup_5()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:494:1: ( rule__PlatformProfile__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:494:2: rule__PlatformProfile__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PlatformProfile__Group_5__0_in_rule__PlatformProfile__Group__5__Impl1010);
                    rule__PlatformProfile__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatformProfileAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__5__Impl"


    // $ANTLR start "rule__PlatformProfile__Group__6"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:504:1: rule__PlatformProfile__Group__6 : rule__PlatformProfile__Group__6__Impl ;
    public final void rule__PlatformProfile__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:508:1: ( rule__PlatformProfile__Group__6__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:509:2: rule__PlatformProfile__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group__6__Impl_in_rule__PlatformProfile__Group__61041);
            rule__PlatformProfile__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__6"


    // $ANTLR start "rule__PlatformProfile__Group__6__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:515:1: rule__PlatformProfile__Group__6__Impl : ( '}' ) ;
    public final void rule__PlatformProfile__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:519:1: ( ( '}' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:520:1: ( '}' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:520:1: ( '}' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:521:1: '}'
            {
             before(grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_25_in_rule__PlatformProfile__Group__6__Impl1069); 
             after(grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group__6__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_4__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:548:1: rule__PlatformProfile__Group_4__0 : rule__PlatformProfile__Group_4__0__Impl rule__PlatformProfile__Group_4__1 ;
    public final void rule__PlatformProfile__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:552:1: ( rule__PlatformProfile__Group_4__0__Impl rule__PlatformProfile__Group_4__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:553:2: rule__PlatformProfile__Group_4__0__Impl rule__PlatformProfile__Group_4__1
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__0__Impl_in_rule__PlatformProfile__Group_4__01114);
            rule__PlatformProfile__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__1_in_rule__PlatformProfile__Group_4__01117);
            rule__PlatformProfile__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__0"


    // $ANTLR start "rule__PlatformProfile__Group_4__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:560:1: rule__PlatformProfile__Group_4__0__Impl : ( 'resources' ) ;
    public final void rule__PlatformProfile__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:564:1: ( ( 'resources' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:565:1: ( 'resources' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:565:1: ( 'resources' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:566:1: 'resources'
            {
             before(grammarAccess.getPlatformProfileAccess().getResourcesKeyword_4_0()); 
            match(input,26,FOLLOW_26_in_rule__PlatformProfile__Group_4__0__Impl1145); 
             after(grammarAccess.getPlatformProfileAccess().getResourcesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__0__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_4__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:579:1: rule__PlatformProfile__Group_4__1 : rule__PlatformProfile__Group_4__1__Impl rule__PlatformProfile__Group_4__2 ;
    public final void rule__PlatformProfile__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:583:1: ( rule__PlatformProfile__Group_4__1__Impl rule__PlatformProfile__Group_4__2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:584:2: rule__PlatformProfile__Group_4__1__Impl rule__PlatformProfile__Group_4__2
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__1__Impl_in_rule__PlatformProfile__Group_4__11176);
            rule__PlatformProfile__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__2_in_rule__PlatformProfile__Group_4__11179);
            rule__PlatformProfile__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__1"


    // $ANTLR start "rule__PlatformProfile__Group_4__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:591:1: rule__PlatformProfile__Group_4__1__Impl : ( '{' ) ;
    public final void rule__PlatformProfile__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:595:1: ( ( '{' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:596:1: ( '{' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:596:1: ( '{' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:597:1: '{'
            {
             before(grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_24_in_rule__PlatformProfile__Group_4__1__Impl1207); 
             after(grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__1__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_4__2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:610:1: rule__PlatformProfile__Group_4__2 : rule__PlatformProfile__Group_4__2__Impl rule__PlatformProfile__Group_4__3 ;
    public final void rule__PlatformProfile__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:614:1: ( rule__PlatformProfile__Group_4__2__Impl rule__PlatformProfile__Group_4__3 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:615:2: rule__PlatformProfile__Group_4__2__Impl rule__PlatformProfile__Group_4__3
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__2__Impl_in_rule__PlatformProfile__Group_4__21238);
            rule__PlatformProfile__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__3_in_rule__PlatformProfile__Group_4__21241);
            rule__PlatformProfile__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__2"


    // $ANTLR start "rule__PlatformProfile__Group_4__2__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:622:1: rule__PlatformProfile__Group_4__2__Impl : ( ( rule__PlatformProfile__ResourcesAssignment_4_2 ) ) ;
    public final void rule__PlatformProfile__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:626:1: ( ( ( rule__PlatformProfile__ResourcesAssignment_4_2 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:627:1: ( ( rule__PlatformProfile__ResourcesAssignment_4_2 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:627:1: ( ( rule__PlatformProfile__ResourcesAssignment_4_2 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:628:1: ( rule__PlatformProfile__ResourcesAssignment_4_2 )
            {
             before(grammarAccess.getPlatformProfileAccess().getResourcesAssignment_4_2()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:629:1: ( rule__PlatformProfile__ResourcesAssignment_4_2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:629:2: rule__PlatformProfile__ResourcesAssignment_4_2
            {
            pushFollow(FOLLOW_rule__PlatformProfile__ResourcesAssignment_4_2_in_rule__PlatformProfile__Group_4__2__Impl1268);
            rule__PlatformProfile__ResourcesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformProfileAccess().getResourcesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__2__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_4__3"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:639:1: rule__PlatformProfile__Group_4__3 : rule__PlatformProfile__Group_4__3__Impl rule__PlatformProfile__Group_4__4 ;
    public final void rule__PlatformProfile__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:643:1: ( rule__PlatformProfile__Group_4__3__Impl rule__PlatformProfile__Group_4__4 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:644:2: rule__PlatformProfile__Group_4__3__Impl rule__PlatformProfile__Group_4__4
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__3__Impl_in_rule__PlatformProfile__Group_4__31298);
            rule__PlatformProfile__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__4_in_rule__PlatformProfile__Group_4__31301);
            rule__PlatformProfile__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__3"


    // $ANTLR start "rule__PlatformProfile__Group_4__3__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:651:1: rule__PlatformProfile__Group_4__3__Impl : ( ( rule__PlatformProfile__Group_4_3__0 )* ) ;
    public final void rule__PlatformProfile__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:655:1: ( ( ( rule__PlatformProfile__Group_4_3__0 )* ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:656:1: ( ( rule__PlatformProfile__Group_4_3__0 )* )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:656:1: ( ( rule__PlatformProfile__Group_4_3__0 )* )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:657:1: ( rule__PlatformProfile__Group_4_3__0 )*
            {
             before(grammarAccess.getPlatformProfileAccess().getGroup_4_3()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:658:1: ( rule__PlatformProfile__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:658:2: rule__PlatformProfile__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_rule__PlatformProfile__Group_4_3__0_in_rule__PlatformProfile__Group_4__3__Impl1328);
            	    rule__PlatformProfile__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPlatformProfileAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__3__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_4__4"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:668:1: rule__PlatformProfile__Group_4__4 : rule__PlatformProfile__Group_4__4__Impl ;
    public final void rule__PlatformProfile__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:672:1: ( rule__PlatformProfile__Group_4__4__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:673:2: rule__PlatformProfile__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_4__4__Impl_in_rule__PlatformProfile__Group_4__41359);
            rule__PlatformProfile__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__4"


    // $ANTLR start "rule__PlatformProfile__Group_4__4__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:679:1: rule__PlatformProfile__Group_4__4__Impl : ( '}' ) ;
    public final void rule__PlatformProfile__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:683:1: ( ( '}' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:684:1: ( '}' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:684:1: ( '}' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:685:1: '}'
            {
             before(grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_25_in_rule__PlatformProfile__Group_4__4__Impl1387); 
             after(grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4__4__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_4_3__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:708:1: rule__PlatformProfile__Group_4_3__0 : rule__PlatformProfile__Group_4_3__0__Impl rule__PlatformProfile__Group_4_3__1 ;
    public final void rule__PlatformProfile__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:712:1: ( rule__PlatformProfile__Group_4_3__0__Impl rule__PlatformProfile__Group_4_3__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:713:2: rule__PlatformProfile__Group_4_3__0__Impl rule__PlatformProfile__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_4_3__0__Impl_in_rule__PlatformProfile__Group_4_3__01428);
            rule__PlatformProfile__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_4_3__1_in_rule__PlatformProfile__Group_4_3__01431);
            rule__PlatformProfile__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4_3__0"


    // $ANTLR start "rule__PlatformProfile__Group_4_3__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:720:1: rule__PlatformProfile__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__PlatformProfile__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:724:1: ( ( ',' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:725:1: ( ',' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:725:1: ( ',' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:726:1: ','
            {
             before(grammarAccess.getPlatformProfileAccess().getCommaKeyword_4_3_0()); 
            match(input,27,FOLLOW_27_in_rule__PlatformProfile__Group_4_3__0__Impl1459); 
             after(grammarAccess.getPlatformProfileAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4_3__0__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_4_3__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:739:1: rule__PlatformProfile__Group_4_3__1 : rule__PlatformProfile__Group_4_3__1__Impl ;
    public final void rule__PlatformProfile__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:743:1: ( rule__PlatformProfile__Group_4_3__1__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:744:2: rule__PlatformProfile__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_4_3__1__Impl_in_rule__PlatformProfile__Group_4_3__11490);
            rule__PlatformProfile__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4_3__1"


    // $ANTLR start "rule__PlatformProfile__Group_4_3__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:750:1: rule__PlatformProfile__Group_4_3__1__Impl : ( ( rule__PlatformProfile__ResourcesAssignment_4_3_1 ) ) ;
    public final void rule__PlatformProfile__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:754:1: ( ( ( rule__PlatformProfile__ResourcesAssignment_4_3_1 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:755:1: ( ( rule__PlatformProfile__ResourcesAssignment_4_3_1 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:755:1: ( ( rule__PlatformProfile__ResourcesAssignment_4_3_1 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:756:1: ( rule__PlatformProfile__ResourcesAssignment_4_3_1 )
            {
             before(grammarAccess.getPlatformProfileAccess().getResourcesAssignment_4_3_1()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:757:1: ( rule__PlatformProfile__ResourcesAssignment_4_3_1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:757:2: rule__PlatformProfile__ResourcesAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__PlatformProfile__ResourcesAssignment_4_3_1_in_rule__PlatformProfile__Group_4_3__1__Impl1517);
            rule__PlatformProfile__ResourcesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformProfileAccess().getResourcesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_4_3__1__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_5__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:771:1: rule__PlatformProfile__Group_5__0 : rule__PlatformProfile__Group_5__0__Impl rule__PlatformProfile__Group_5__1 ;
    public final void rule__PlatformProfile__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:775:1: ( rule__PlatformProfile__Group_5__0__Impl rule__PlatformProfile__Group_5__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:776:2: rule__PlatformProfile__Group_5__0__Impl rule__PlatformProfile__Group_5__1
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__0__Impl_in_rule__PlatformProfile__Group_5__01551);
            rule__PlatformProfile__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__1_in_rule__PlatformProfile__Group_5__01554);
            rule__PlatformProfile__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__0"


    // $ANTLR start "rule__PlatformProfile__Group_5__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:783:1: rule__PlatformProfile__Group_5__0__Impl : ( 'constraints' ) ;
    public final void rule__PlatformProfile__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:787:1: ( ( 'constraints' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:788:1: ( 'constraints' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:788:1: ( 'constraints' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:789:1: 'constraints'
            {
             before(grammarAccess.getPlatformProfileAccess().getConstraintsKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__PlatformProfile__Group_5__0__Impl1582); 
             after(grammarAccess.getPlatformProfileAccess().getConstraintsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__0__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_5__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:802:1: rule__PlatformProfile__Group_5__1 : rule__PlatformProfile__Group_5__1__Impl rule__PlatformProfile__Group_5__2 ;
    public final void rule__PlatformProfile__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:806:1: ( rule__PlatformProfile__Group_5__1__Impl rule__PlatformProfile__Group_5__2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:807:2: rule__PlatformProfile__Group_5__1__Impl rule__PlatformProfile__Group_5__2
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__1__Impl_in_rule__PlatformProfile__Group_5__11613);
            rule__PlatformProfile__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__2_in_rule__PlatformProfile__Group_5__11616);
            rule__PlatformProfile__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__1"


    // $ANTLR start "rule__PlatformProfile__Group_5__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:814:1: rule__PlatformProfile__Group_5__1__Impl : ( '{' ) ;
    public final void rule__PlatformProfile__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:818:1: ( ( '{' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:819:1: ( '{' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:819:1: ( '{' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:820:1: '{'
            {
             before(grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,24,FOLLOW_24_in_rule__PlatformProfile__Group_5__1__Impl1644); 
             after(grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__1__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_5__2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:833:1: rule__PlatformProfile__Group_5__2 : rule__PlatformProfile__Group_5__2__Impl rule__PlatformProfile__Group_5__3 ;
    public final void rule__PlatformProfile__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:837:1: ( rule__PlatformProfile__Group_5__2__Impl rule__PlatformProfile__Group_5__3 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:838:2: rule__PlatformProfile__Group_5__2__Impl rule__PlatformProfile__Group_5__3
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__2__Impl_in_rule__PlatformProfile__Group_5__21675);
            rule__PlatformProfile__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__3_in_rule__PlatformProfile__Group_5__21678);
            rule__PlatformProfile__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__2"


    // $ANTLR start "rule__PlatformProfile__Group_5__2__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:845:1: rule__PlatformProfile__Group_5__2__Impl : ( ( rule__PlatformProfile__ConstraintsAssignment_5_2 ) ) ;
    public final void rule__PlatformProfile__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:849:1: ( ( ( rule__PlatformProfile__ConstraintsAssignment_5_2 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:850:1: ( ( rule__PlatformProfile__ConstraintsAssignment_5_2 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:850:1: ( ( rule__PlatformProfile__ConstraintsAssignment_5_2 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:851:1: ( rule__PlatformProfile__ConstraintsAssignment_5_2 )
            {
             before(grammarAccess.getPlatformProfileAccess().getConstraintsAssignment_5_2()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:852:1: ( rule__PlatformProfile__ConstraintsAssignment_5_2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:852:2: rule__PlatformProfile__ConstraintsAssignment_5_2
            {
            pushFollow(FOLLOW_rule__PlatformProfile__ConstraintsAssignment_5_2_in_rule__PlatformProfile__Group_5__2__Impl1705);
            rule__PlatformProfile__ConstraintsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPlatformProfileAccess().getConstraintsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__2__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_5__3"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:862:1: rule__PlatformProfile__Group_5__3 : rule__PlatformProfile__Group_5__3__Impl rule__PlatformProfile__Group_5__4 ;
    public final void rule__PlatformProfile__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:866:1: ( rule__PlatformProfile__Group_5__3__Impl rule__PlatformProfile__Group_5__4 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:867:2: rule__PlatformProfile__Group_5__3__Impl rule__PlatformProfile__Group_5__4
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__3__Impl_in_rule__PlatformProfile__Group_5__31735);
            rule__PlatformProfile__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__4_in_rule__PlatformProfile__Group_5__31738);
            rule__PlatformProfile__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__3"


    // $ANTLR start "rule__PlatformProfile__Group_5__3__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:874:1: rule__PlatformProfile__Group_5__3__Impl : ( ( rule__PlatformProfile__Group_5_3__0 )* ) ;
    public final void rule__PlatformProfile__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:878:1: ( ( ( rule__PlatformProfile__Group_5_3__0 )* ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:879:1: ( ( rule__PlatformProfile__Group_5_3__0 )* )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:879:1: ( ( rule__PlatformProfile__Group_5_3__0 )* )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:880:1: ( rule__PlatformProfile__Group_5_3__0 )*
            {
             before(grammarAccess.getPlatformProfileAccess().getGroup_5_3()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:881:1: ( rule__PlatformProfile__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:881:2: rule__PlatformProfile__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_rule__PlatformProfile__Group_5_3__0_in_rule__PlatformProfile__Group_5__3__Impl1765);
            	    rule__PlatformProfile__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPlatformProfileAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__3__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_5__4"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:891:1: rule__PlatformProfile__Group_5__4 : rule__PlatformProfile__Group_5__4__Impl ;
    public final void rule__PlatformProfile__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:895:1: ( rule__PlatformProfile__Group_5__4__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:896:2: rule__PlatformProfile__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_5__4__Impl_in_rule__PlatformProfile__Group_5__41796);
            rule__PlatformProfile__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__4"


    // $ANTLR start "rule__PlatformProfile__Group_5__4__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:902:1: rule__PlatformProfile__Group_5__4__Impl : ( '}' ) ;
    public final void rule__PlatformProfile__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:906:1: ( ( '}' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:907:1: ( '}' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:907:1: ( '}' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:908:1: '}'
            {
             before(grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,25,FOLLOW_25_in_rule__PlatformProfile__Group_5__4__Impl1824); 
             after(grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5__4__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_5_3__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:931:1: rule__PlatformProfile__Group_5_3__0 : rule__PlatformProfile__Group_5_3__0__Impl rule__PlatformProfile__Group_5_3__1 ;
    public final void rule__PlatformProfile__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:935:1: ( rule__PlatformProfile__Group_5_3__0__Impl rule__PlatformProfile__Group_5_3__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:936:2: rule__PlatformProfile__Group_5_3__0__Impl rule__PlatformProfile__Group_5_3__1
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_5_3__0__Impl_in_rule__PlatformProfile__Group_5_3__01865);
            rule__PlatformProfile__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PlatformProfile__Group_5_3__1_in_rule__PlatformProfile__Group_5_3__01868);
            rule__PlatformProfile__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5_3__0"


    // $ANTLR start "rule__PlatformProfile__Group_5_3__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:943:1: rule__PlatformProfile__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PlatformProfile__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:947:1: ( ( ',' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:948:1: ( ',' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:948:1: ( ',' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:949:1: ','
            {
             before(grammarAccess.getPlatformProfileAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_27_in_rule__PlatformProfile__Group_5_3__0__Impl1896); 
             after(grammarAccess.getPlatformProfileAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5_3__0__Impl"


    // $ANTLR start "rule__PlatformProfile__Group_5_3__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:962:1: rule__PlatformProfile__Group_5_3__1 : rule__PlatformProfile__Group_5_3__1__Impl ;
    public final void rule__PlatformProfile__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:966:1: ( rule__PlatformProfile__Group_5_3__1__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:967:2: rule__PlatformProfile__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PlatformProfile__Group_5_3__1__Impl_in_rule__PlatformProfile__Group_5_3__11927);
            rule__PlatformProfile__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5_3__1"


    // $ANTLR start "rule__PlatformProfile__Group_5_3__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:973:1: rule__PlatformProfile__Group_5_3__1__Impl : ( ( rule__PlatformProfile__ConstraintsAssignment_5_3_1 ) ) ;
    public final void rule__PlatformProfile__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:977:1: ( ( ( rule__PlatformProfile__ConstraintsAssignment_5_3_1 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:978:1: ( ( rule__PlatformProfile__ConstraintsAssignment_5_3_1 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:978:1: ( ( rule__PlatformProfile__ConstraintsAssignment_5_3_1 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:979:1: ( rule__PlatformProfile__ConstraintsAssignment_5_3_1 )
            {
             before(grammarAccess.getPlatformProfileAccess().getConstraintsAssignment_5_3_1()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:980:1: ( rule__PlatformProfile__ConstraintsAssignment_5_3_1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:980:2: rule__PlatformProfile__ConstraintsAssignment_5_3_1
            {
            pushFollow(FOLLOW_rule__PlatformProfile__ConstraintsAssignment_5_3_1_in_rule__PlatformProfile__Group_5_3__1__Impl1954);
            rule__PlatformProfile__ConstraintsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPlatformProfileAccess().getConstraintsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__Group_5_3__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:994:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:998:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:999:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__01988);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__01991);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1006:1: rule__Resource__Group__0__Impl : ( ( rule__Resource__NameAssignment_0 ) ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1010:1: ( ( ( rule__Resource__NameAssignment_0 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1011:1: ( ( rule__Resource__NameAssignment_0 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1011:1: ( ( rule__Resource__NameAssignment_0 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1012:1: ( rule__Resource__NameAssignment_0 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1013:1: ( rule__Resource__NameAssignment_0 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1013:2: rule__Resource__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl2018);
            rule__Resource__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1023:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1027:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1028:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__12048);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__12051);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1035:1: rule__Resource__Group__1__Impl : ( ':' ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1039:1: ( ( ':' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1040:1: ( ':' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1040:1: ( ':' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1041:1: ':'
            {
             before(grammarAccess.getResourceAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Resource__Group__1__Impl2079); 
             after(grammarAccess.getResourceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1054:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1058:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1059:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__22110);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__22113);
            rule__Resource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1066:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__TypeAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1070:1: ( ( ( rule__Resource__TypeAssignment_2 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1071:1: ( ( rule__Resource__TypeAssignment_2 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1071:1: ( ( rule__Resource__TypeAssignment_2 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1072:1: ( rule__Resource__TypeAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getTypeAssignment_2()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1073:1: ( rule__Resource__TypeAssignment_2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1073:2: rule__Resource__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Resource__TypeAssignment_2_in_rule__Resource__Group__2__Impl2140);
            rule__Resource__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1083:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1087:1: ( rule__Resource__Group__3__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1088:2: rule__Resource__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__32170);
            rule__Resource__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1094:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__Group_3__0 )? ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1098:1: ( ( ( rule__Resource__Group_3__0 )? ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1099:1: ( ( rule__Resource__Group_3__0 )? )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1099:1: ( ( rule__Resource__Group_3__0 )? )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1100:1: ( rule__Resource__Group_3__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_3()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1101:1: ( rule__Resource__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1101:2: rule__Resource__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl2197);
                    rule__Resource__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group_3__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1119:1: rule__Resource__Group_3__0 : rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 ;
    public final void rule__Resource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1123:1: ( rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1124:2: rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__02236);
            rule__Resource__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__02239);
            rule__Resource__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_3__0"


    // $ANTLR start "rule__Resource__Group_3__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1131:1: rule__Resource__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Resource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1135:1: ( ( '@' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1136:1: ( '@' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1136:1: ( '@' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1137:1: '@'
            {
             before(grammarAccess.getResourceAccess().getCommercialAtKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__Resource__Group_3__0__Impl2267); 
             after(grammarAccess.getResourceAccess().getCommercialAtKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_3__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1150:1: rule__Resource__Group_3__1 : rule__Resource__Group_3__1__Impl ;
    public final void rule__Resource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1154:1: ( rule__Resource__Group_3__1__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1155:2: rule__Resource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__12298);
            rule__Resource__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_3__1"


    // $ANTLR start "rule__Resource__Group_3__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1161:1: rule__Resource__Group_3__1__Impl : ( ( rule__Resource__WeightAssignment_3_1 ) ) ;
    public final void rule__Resource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1165:1: ( ( ( rule__Resource__WeightAssignment_3_1 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1166:1: ( ( rule__Resource__WeightAssignment_3_1 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1166:1: ( ( rule__Resource__WeightAssignment_3_1 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1167:1: ( rule__Resource__WeightAssignment_3_1 )
            {
             before(grammarAccess.getResourceAccess().getWeightAssignment_3_1()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1168:1: ( rule__Resource__WeightAssignment_3_1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1168:2: rule__Resource__WeightAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Resource__WeightAssignment_3_1_in_rule__Resource__Group_3__1__Impl2325);
            rule__Resource__WeightAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getWeightAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_3__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1182:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1186:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1187:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__02359);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__02362);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1194:1: rule__Constraint__Group__0__Impl : ( ( rule__Constraint__TypeAssignment_0 ) ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1198:1: ( ( ( rule__Constraint__TypeAssignment_0 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1199:1: ( ( rule__Constraint__TypeAssignment_0 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1199:1: ( ( rule__Constraint__TypeAssignment_0 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1200:1: ( rule__Constraint__TypeAssignment_0 )
            {
             before(grammarAccess.getConstraintAccess().getTypeAssignment_0()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1201:1: ( rule__Constraint__TypeAssignment_0 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1201:2: rule__Constraint__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Constraint__TypeAssignment_0_in_rule__Constraint__Group__0__Impl2389);
            rule__Constraint__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1211:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1215:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1216:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__12419);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__12422);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1223:1: rule__Constraint__Group__1__Impl : ( '(' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1227:1: ( ( '(' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1228:1: ( '(' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1228:1: ( '(' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1229:1: '('
            {
             before(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Constraint__Group__1__Impl2450); 
             after(grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1242:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1246:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1247:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__22481);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__22484);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1254:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__ReferencesAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1258:1: ( ( ( rule__Constraint__ReferencesAssignment_2 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1259:1: ( ( rule__Constraint__ReferencesAssignment_2 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1259:1: ( ( rule__Constraint__ReferencesAssignment_2 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1260:1: ( rule__Constraint__ReferencesAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getReferencesAssignment_2()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1261:1: ( rule__Constraint__ReferencesAssignment_2 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1261:2: rule__Constraint__ReferencesAssignment_2
            {
            pushFollow(FOLLOW_rule__Constraint__ReferencesAssignment_2_in_rule__Constraint__Group__2__Impl2511);
            rule__Constraint__ReferencesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getReferencesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1271:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1275:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1276:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__32541);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__32544);
            rule__Constraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1283:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__IsDerivationAssignment_3 )? ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1287:1: ( ( ( rule__Constraint__IsDerivationAssignment_3 )? ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1288:1: ( ( rule__Constraint__IsDerivationAssignment_3 )? )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1288:1: ( ( rule__Constraint__IsDerivationAssignment_3 )? )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1289:1: ( rule__Constraint__IsDerivationAssignment_3 )?
            {
             before(grammarAccess.getConstraintAccess().getIsDerivationAssignment_3()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1290:1: ( rule__Constraint__IsDerivationAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1290:2: rule__Constraint__IsDerivationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constraint__IsDerivationAssignment_3_in_rule__Constraint__Group__3__Impl2571);
                    rule__Constraint__IsDerivationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getIsDerivationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1300:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1304:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1305:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__42602);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__42605);
            rule__Constraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1312:1: rule__Constraint__Group__4__Impl : ( ')' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1316:1: ( ( ')' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1317:1: ( ')' )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1317:1: ( ')' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1318:1: ')'
            {
             before(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_4()); 
            match(input,32,FOLLOW_32_in_rule__Constraint__Group__4__Impl2633); 
             after(grammarAccess.getConstraintAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1331:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1335:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1336:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__52664);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__52667);
            rule__Constraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1343:1: rule__Constraint__Group__5__Impl : ( ( rule__Constraint__OperationAssignment_5 ) ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1347:1: ( ( ( rule__Constraint__OperationAssignment_5 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1348:1: ( ( rule__Constraint__OperationAssignment_5 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1348:1: ( ( rule__Constraint__OperationAssignment_5 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1349:1: ( rule__Constraint__OperationAssignment_5 )
            {
             before(grammarAccess.getConstraintAccess().getOperationAssignment_5()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1350:1: ( rule__Constraint__OperationAssignment_5 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1350:2: rule__Constraint__OperationAssignment_5
            {
            pushFollow(FOLLOW_rule__Constraint__OperationAssignment_5_in_rule__Constraint__Group__5__Impl2694);
            rule__Constraint__OperationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getOperationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__6"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1360:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1364:1: ( rule__Constraint__Group__6__Impl )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1365:2: rule__Constraint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__62724);
            rule__Constraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6"


    // $ANTLR start "rule__Constraint__Group__6__Impl"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1371:1: rule__Constraint__Group__6__Impl : ( ( rule__Constraint__BoundAssignment_6 ) ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1375:1: ( ( ( rule__Constraint__BoundAssignment_6 ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1376:1: ( ( rule__Constraint__BoundAssignment_6 ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1376:1: ( ( rule__Constraint__BoundAssignment_6 ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1377:1: ( rule__Constraint__BoundAssignment_6 )
            {
             before(grammarAccess.getConstraintAccess().getBoundAssignment_6()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1378:1: ( rule__Constraint__BoundAssignment_6 )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1378:2: rule__Constraint__BoundAssignment_6
            {
            pushFollow(FOLLOW_rule__Constraint__BoundAssignment_6_in_rule__Constraint__Group__6__Impl2751);
            rule__Constraint__BoundAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getBoundAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6__Impl"


    // $ANTLR start "rule__PlatformProfile__NameAssignment_2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1403:1: rule__PlatformProfile__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PlatformProfile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1407:1: ( ( RULE_ID ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1408:1: ( RULE_ID )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1408:1: ( RULE_ID )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1409:1: RULE_ID
            {
             before(grammarAccess.getPlatformProfileAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PlatformProfile__NameAssignment_22800); 
             after(grammarAccess.getPlatformProfileAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__NameAssignment_2"


    // $ANTLR start "rule__PlatformProfile__ResourcesAssignment_4_2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1418:1: rule__PlatformProfile__ResourcesAssignment_4_2 : ( ruleResource ) ;
    public final void rule__PlatformProfile__ResourcesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1422:1: ( ( ruleResource ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1423:1: ( ruleResource )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1423:1: ( ruleResource )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1424:1: ruleResource
            {
             before(grammarAccess.getPlatformProfileAccess().getResourcesResourceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__PlatformProfile__ResourcesAssignment_4_22831);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getPlatformProfileAccess().getResourcesResourceParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__ResourcesAssignment_4_2"


    // $ANTLR start "rule__PlatformProfile__ResourcesAssignment_4_3_1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1433:1: rule__PlatformProfile__ResourcesAssignment_4_3_1 : ( ruleResource ) ;
    public final void rule__PlatformProfile__ResourcesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1437:1: ( ( ruleResource ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1438:1: ( ruleResource )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1438:1: ( ruleResource )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1439:1: ruleResource
            {
             before(grammarAccess.getPlatformProfileAccess().getResourcesResourceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__PlatformProfile__ResourcesAssignment_4_3_12862);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getPlatformProfileAccess().getResourcesResourceParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__ResourcesAssignment_4_3_1"


    // $ANTLR start "rule__PlatformProfile__ConstraintsAssignment_5_2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1448:1: rule__PlatformProfile__ConstraintsAssignment_5_2 : ( ruleConstraint ) ;
    public final void rule__PlatformProfile__ConstraintsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1452:1: ( ( ruleConstraint ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1453:1: ( ruleConstraint )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1453:1: ( ruleConstraint )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1454:1: ruleConstraint
            {
             before(grammarAccess.getPlatformProfileAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__PlatformProfile__ConstraintsAssignment_5_22893);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getPlatformProfileAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__ConstraintsAssignment_5_2"


    // $ANTLR start "rule__PlatformProfile__ConstraintsAssignment_5_3_1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1463:1: rule__PlatformProfile__ConstraintsAssignment_5_3_1 : ( ruleConstraint ) ;
    public final void rule__PlatformProfile__ConstraintsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1467:1: ( ( ruleConstraint ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1468:1: ( ruleConstraint )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1468:1: ( ruleConstraint )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1469:1: ruleConstraint
            {
             before(grammarAccess.getPlatformProfileAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_ruleConstraint_in_rule__PlatformProfile__ConstraintsAssignment_5_3_12924);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getPlatformProfileAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlatformProfile__ConstraintsAssignment_5_3_1"


    // $ANTLR start "rule__Resource__NameAssignment_0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1478:1: rule__Resource__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1482:1: ( ( RULE_ID ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1483:1: ( RULE_ID )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1483:1: ( RULE_ID )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1484:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_02955); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_0"


    // $ANTLR start "rule__Resource__TypeAssignment_2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1493:1: rule__Resource__TypeAssignment_2 : ( ruleResourceType ) ;
    public final void rule__Resource__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1497:1: ( ( ruleResourceType ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1498:1: ( ruleResourceType )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1498:1: ( ruleResourceType )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1499:1: ruleResourceType
            {
             before(grammarAccess.getResourceAccess().getTypeResourceTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleResourceType_in_rule__Resource__TypeAssignment_22986);
            ruleResourceType();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getTypeResourceTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__TypeAssignment_2"


    // $ANTLR start "rule__Resource__WeightAssignment_3_1"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1508:1: rule__Resource__WeightAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Resource__WeightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1512:1: ( ( RULE_INT ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1513:1: ( RULE_INT )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1513:1: ( RULE_INT )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1514:1: RULE_INT
            {
             before(grammarAccess.getResourceAccess().getWeightINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Resource__WeightAssignment_3_13017); 
             after(grammarAccess.getResourceAccess().getWeightINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__WeightAssignment_3_1"


    // $ANTLR start "rule__Constraint__TypeAssignment_0"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1523:1: rule__Constraint__TypeAssignment_0 : ( ruleConstraintType ) ;
    public final void rule__Constraint__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1527:1: ( ( ruleConstraintType ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1528:1: ( ruleConstraintType )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1528:1: ( ruleConstraintType )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1529:1: ruleConstraintType
            {
             before(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_03048);
            ruleConstraintType();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__TypeAssignment_0"


    // $ANTLR start "rule__Constraint__ReferencesAssignment_2"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1538:1: rule__Constraint__ReferencesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__ReferencesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1542:1: ( ( ( RULE_ID ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1543:1: ( ( RULE_ID ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1543:1: ( ( RULE_ID ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1544:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getReferencesResourceCrossReference_2_0()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1545:1: ( RULE_ID )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1546:1: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getReferencesResourceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constraint__ReferencesAssignment_23083); 
             after(grammarAccess.getConstraintAccess().getReferencesResourceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getReferencesResourceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ReferencesAssignment_2"


    // $ANTLR start "rule__Constraint__IsDerivationAssignment_3"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1557:1: rule__Constraint__IsDerivationAssignment_3 : ( ( '\\'' ) ) ;
    public final void rule__Constraint__IsDerivationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1561:1: ( ( ( '\\'' ) ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1562:1: ( ( '\\'' ) )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1562:1: ( ( '\\'' ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1563:1: ( '\\'' )
            {
             before(grammarAccess.getConstraintAccess().getIsDerivationApostropheKeyword_3_0()); 
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1564:1: ( '\\'' )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1565:1: '\\''
            {
             before(grammarAccess.getConstraintAccess().getIsDerivationApostropheKeyword_3_0()); 
            match(input,33,FOLLOW_33_in_rule__Constraint__IsDerivationAssignment_33123); 
             after(grammarAccess.getConstraintAccess().getIsDerivationApostropheKeyword_3_0()); 

            }

             after(grammarAccess.getConstraintAccess().getIsDerivationApostropheKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__IsDerivationAssignment_3"


    // $ANTLR start "rule__Constraint__OperationAssignment_5"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1580:1: rule__Constraint__OperationAssignment_5 : ( ruleConstraintOperation ) ;
    public final void rule__Constraint__OperationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1584:1: ( ( ruleConstraintOperation ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1585:1: ( ruleConstraintOperation )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1585:1: ( ruleConstraintOperation )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1586:1: ruleConstraintOperation
            {
             before(grammarAccess.getConstraintAccess().getOperationConstraintOperationEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConstraintOperation_in_rule__Constraint__OperationAssignment_53162);
            ruleConstraintOperation();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getOperationConstraintOperationEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__OperationAssignment_5"


    // $ANTLR start "rule__Constraint__BoundAssignment_6"
    // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1595:1: rule__Constraint__BoundAssignment_6 : ( RULE_INT ) ;
    public final void rule__Constraint__BoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1599:1: ( ( RULE_INT ) )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1600:1: ( RULE_INT )
            {
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1600:1: ( RULE_INT )
            // ../hr.fer.rasip.remes.profile.ui/src-gen/hr/fer/rasip/remes/profile/ui/contentassist/antlr/internal/InternalProfile.g:1601:1: RULE_INT
            {
             before(grammarAccess.getConstraintAccess().getBoundINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Constraint__BoundAssignment_63193); 
             after(grammarAccess.getConstraintAccess().getBoundINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__BoundAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePlatformProfile_in_entryRulePlatformProfile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatformProfile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__0_in_rulePlatformProfile94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0_in_ruleConstraint214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceType__Alternatives_in_ruleResourceType251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintType__Alternatives_in_ruleConstraintType287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintOperation__Alternatives_in_ruleConstraintOperation323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ResourceType__Alternatives359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ResourceType__Alternatives380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ResourceType__Alternatives401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ResourceType__Alternatives422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ResourceType__Alternatives443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ConstraintType__Alternatives479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ConstraintType__Alternatives500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ConstraintType__Alternatives521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConstraintOperation__Alternatives557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConstraintOperation__Alternatives578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ConstraintOperation__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConstraintOperation__Alternatives620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ConstraintOperation__Alternatives641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__0__Impl_in_rule__PlatformProfile__Group__0674 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__1_in_rule__PlatformProfile__Group__0677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__1__Impl_in_rule__PlatformProfile__Group__1735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__2_in_rule__PlatformProfile__Group__1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PlatformProfile__Group__1__Impl766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__2__Impl_in_rule__PlatformProfile__Group__2797 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__3_in_rule__PlatformProfile__Group__2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__NameAssignment_2_in_rule__PlatformProfile__Group__2__Impl827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__3__Impl_in_rule__PlatformProfile__Group__3857 = new BitSet(new long[]{0x0000000016000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__4_in_rule__PlatformProfile__Group__3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlatformProfile__Group__3__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__4__Impl_in_rule__PlatformProfile__Group__4919 = new BitSet(new long[]{0x0000000016000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__5_in_rule__PlatformProfile__Group__4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__0_in_rule__PlatformProfile__Group__4__Impl949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__5__Impl_in_rule__PlatformProfile__Group__5980 = new BitSet(new long[]{0x0000000016000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__6_in_rule__PlatformProfile__Group__5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__0_in_rule__PlatformProfile__Group__5__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group__6__Impl_in_rule__PlatformProfile__Group__61041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlatformProfile__Group__6__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__0__Impl_in_rule__PlatformProfile__Group_4__01114 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__1_in_rule__PlatformProfile__Group_4__01117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PlatformProfile__Group_4__0__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__1__Impl_in_rule__PlatformProfile__Group_4__11176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__2_in_rule__PlatformProfile__Group_4__11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlatformProfile__Group_4__1__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__2__Impl_in_rule__PlatformProfile__Group_4__21238 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__3_in_rule__PlatformProfile__Group_4__21241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__ResourcesAssignment_4_2_in_rule__PlatformProfile__Group_4__2__Impl1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__3__Impl_in_rule__PlatformProfile__Group_4__31298 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__4_in_rule__PlatformProfile__Group_4__31301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4_3__0_in_rule__PlatformProfile__Group_4__3__Impl1328 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4__4__Impl_in_rule__PlatformProfile__Group_4__41359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlatformProfile__Group_4__4__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4_3__0__Impl_in_rule__PlatformProfile__Group_4_3__01428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4_3__1_in_rule__PlatformProfile__Group_4_3__01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PlatformProfile__Group_4_3__0__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_4_3__1__Impl_in_rule__PlatformProfile__Group_4_3__11490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__ResourcesAssignment_4_3_1_in_rule__PlatformProfile__Group_4_3__1__Impl1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__0__Impl_in_rule__PlatformProfile__Group_5__01551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__1_in_rule__PlatformProfile__Group_5__01554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PlatformProfile__Group_5__0__Impl1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__1__Impl_in_rule__PlatformProfile__Group_5__11613 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__2_in_rule__PlatformProfile__Group_5__11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PlatformProfile__Group_5__1__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__2__Impl_in_rule__PlatformProfile__Group_5__21675 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__3_in_rule__PlatformProfile__Group_5__21678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__ConstraintsAssignment_5_2_in_rule__PlatformProfile__Group_5__2__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__3__Impl_in_rule__PlatformProfile__Group_5__31735 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__4_in_rule__PlatformProfile__Group_5__31738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5_3__0_in_rule__PlatformProfile__Group_5__3__Impl1765 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5__4__Impl_in_rule__PlatformProfile__Group_5__41796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PlatformProfile__Group_5__4__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5_3__0__Impl_in_rule__PlatformProfile__Group_5_3__01865 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5_3__1_in_rule__PlatformProfile__Group_5_3__01868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PlatformProfile__Group_5_3__0__Impl1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__Group_5_3__1__Impl_in_rule__PlatformProfile__Group_5_3__11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlatformProfile__ConstraintsAssignment_5_3_1_in_rule__PlatformProfile__Group_5_3__1__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__01988 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__12048 = new BitSet(new long[]{0x0000000000007C00L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Resource__Group__1__Impl2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__22110 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__22113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__TypeAssignment_2_in_rule__Resource__Group__2__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__32170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__02236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__02239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Resource__Group_3__0__Impl2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__12298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__WeightAssignment_3_1_in_rule__Resource__Group_3__1__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__0__Impl_in_rule__Constraint__Group__02359 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1_in_rule__Constraint__Group__02362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__TypeAssignment_0_in_rule__Constraint__Group__0__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__1__Impl_in_rule__Constraint__Group__12419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2_in_rule__Constraint__Group__12422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Constraint__Group__1__Impl2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__2__Impl_in_rule__Constraint__Group__22481 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3_in_rule__Constraint__Group__22484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__ReferencesAssignment_2_in_rule__Constraint__Group__2__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__3__Impl_in_rule__Constraint__Group__32541 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4_in_rule__Constraint__Group__32544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__IsDerivationAssignment_3_in_rule__Constraint__Group__3__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__4__Impl_in_rule__Constraint__Group__42602 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5_in_rule__Constraint__Group__42605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Constraint__Group__4__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__5__Impl_in_rule__Constraint__Group__52664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6_in_rule__Constraint__Group__52667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__OperationAssignment_5_in_rule__Constraint__Group__5__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__Group__6__Impl_in_rule__Constraint__Group__62724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constraint__BoundAssignment_6_in_rule__Constraint__Group__6__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PlatformProfile__NameAssignment_22800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__PlatformProfile__ResourcesAssignment_4_22831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__PlatformProfile__ResourcesAssignment_4_3_12862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__PlatformProfile__ConstraintsAssignment_5_22893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_rule__PlatformProfile__ConstraintsAssignment_5_3_12924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_02955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceType_in_rule__Resource__TypeAssignment_22986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Resource__WeightAssignment_3_13017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintType_in_rule__Constraint__TypeAssignment_03048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constraint__ReferencesAssignment_23083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Constraint__IsDerivationAssignment_33123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintOperation_in_rule__Constraint__OperationAssignment_53162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Constraint__BoundAssignment_63193 = new BitSet(new long[]{0x0000000000000002L});

}