package hr.fer.rasip.remes.profile.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hr.fer.rasip.remes.profile.services.ProfileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProfileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'profile'", "'{'", "'resources'", "','", "'}'", "'constraints'", "':'", "'@'", "'('", "'\\''", "')'", "'cpu'", "'memory'", "'bandwidth'", "'power'", "'port'", "'min'", "'max'", "'avg'", "'<'", "'<='", "'=='", "'>='", "'>'"
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
    public String getGrammarFileName() { return "../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g"; }



     	private ProfileGrammarAccess grammarAccess;
     	
        public InternalProfileParser(TokenStream input, ProfileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PlatformProfile";	
       	}
       	
       	@Override
       	protected ProfileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePlatformProfile"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:68:1: entryRulePlatformProfile returns [EObject current=null] : iv_rulePlatformProfile= rulePlatformProfile EOF ;
    public final EObject entryRulePlatformProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatformProfile = null;


        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:69:2: (iv_rulePlatformProfile= rulePlatformProfile EOF )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:70:2: iv_rulePlatformProfile= rulePlatformProfile EOF
            {
             newCompositeNode(grammarAccess.getPlatformProfileRule()); 
            pushFollow(FOLLOW_rulePlatformProfile_in_entryRulePlatformProfile75);
            iv_rulePlatformProfile=rulePlatformProfile();

            state._fsp--;

             current =iv_rulePlatformProfile; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatformProfile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlatformProfile"


    // $ANTLR start "rulePlatformProfile"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:77:1: rulePlatformProfile returns [EObject current=null] : ( () otherlv_1= 'profile' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '{' ( (lv_resources_6_0= ruleResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject rulePlatformProfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_resources_6_0 = null;

        EObject lv_resources_8_0 = null;

        EObject lv_constraints_12_0 = null;

        EObject lv_constraints_14_0 = null;


         enterRule(); 
            
        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:80:28: ( ( () otherlv_1= 'profile' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '{' ( (lv_resources_6_0= ruleResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:81:1: ( () otherlv_1= 'profile' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '{' ( (lv_resources_6_0= ruleResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:81:1: ( () otherlv_1= 'profile' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '{' ( (lv_resources_6_0= ruleResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:81:2: () otherlv_1= 'profile' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'resources' otherlv_5= '{' ( (lv_resources_6_0= ruleResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )* otherlv_9= '}' )? (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:81:2: ()
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPlatformProfileAccess().getPlatformProfileAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,10,FOLLOW_10_in_rulePlatformProfile131); 

                	newLeafNode(otherlv_1, grammarAccess.getPlatformProfileAccess().getProfileKeyword_1());
                
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:91:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:92:1: (lv_name_2_0= RULE_ID )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:92:1: (lv_name_2_0= RULE_ID )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:93:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlatformProfile148); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPlatformProfileAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlatformProfileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_rulePlatformProfile165); 

                	newLeafNode(otherlv_3, grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_3());
                
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:113:1: (otherlv_4= 'resources' otherlv_5= '{' ( (lv_resources_6_0= ruleResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:113:3: otherlv_4= 'resources' otherlv_5= '{' ( (lv_resources_6_0= ruleResource ) ) (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_rulePlatformProfile178); 

                        	newLeafNode(otherlv_4, grammarAccess.getPlatformProfileAccess().getResourcesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,11,FOLLOW_11_in_rulePlatformProfile190); 

                        	newLeafNode(otherlv_5, grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:121:1: ( (lv_resources_6_0= ruleResource ) )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:122:1: (lv_resources_6_0= ruleResource )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:122:1: (lv_resources_6_0= ruleResource )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:123:3: lv_resources_6_0= ruleResource
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlatformProfileAccess().getResourcesResourceParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleResource_in_rulePlatformProfile211);
                    lv_resources_6_0=ruleResource();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlatformProfileRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_6_0, 
                            		"Resource");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:139:2: (otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:139:4: otherlv_7= ',' ( (lv_resources_8_0= ruleResource ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_rulePlatformProfile224); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPlatformProfileAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:143:1: ( (lv_resources_8_0= ruleResource ) )
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:144:1: (lv_resources_8_0= ruleResource )
                    	    {
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:144:1: (lv_resources_8_0= ruleResource )
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:145:3: lv_resources_8_0= ruleResource
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPlatformProfileAccess().getResourcesResourceParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResource_in_rulePlatformProfile245);
                    	    lv_resources_8_0=ruleResource();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPlatformProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resources",
                    	            		lv_resources_8_0, 
                    	            		"Resource");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_rulePlatformProfile259); 

                        	newLeafNode(otherlv_9, grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:165:3: (otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:165:5: otherlv_10= 'constraints' otherlv_11= '{' ( (lv_constraints_12_0= ruleConstraint ) ) (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_rulePlatformProfile274); 

                        	newLeafNode(otherlv_10, grammarAccess.getPlatformProfileAccess().getConstraintsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,11,FOLLOW_11_in_rulePlatformProfile286); 

                        	newLeafNode(otherlv_11, grammarAccess.getPlatformProfileAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:173:1: ( (lv_constraints_12_0= ruleConstraint ) )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:174:1: (lv_constraints_12_0= ruleConstraint )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:174:1: (lv_constraints_12_0= ruleConstraint )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:175:3: lv_constraints_12_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getPlatformProfileAccess().getConstraintsConstraintParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_rulePlatformProfile307);
                    lv_constraints_12_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPlatformProfileRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_12_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:191:2: (otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:191:4: otherlv_13= ',' ( (lv_constraints_14_0= ruleConstraint ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_13_in_rulePlatformProfile320); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getPlatformProfileAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:195:1: ( (lv_constraints_14_0= ruleConstraint ) )
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:196:1: (lv_constraints_14_0= ruleConstraint )
                    	    {
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:196:1: (lv_constraints_14_0= ruleConstraint )
                    	    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:197:3: lv_constraints_14_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPlatformProfileAccess().getConstraintsConstraintParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_rulePlatformProfile341);
                    	    lv_constraints_14_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPlatformProfileRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_14_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_14_in_rulePlatformProfile355); 

                        	newLeafNode(otherlv_15, grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_rulePlatformProfile369); 

                	newLeafNode(otherlv_16, grammarAccess.getPlatformProfileAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlatformProfile"


    // $ANTLR start "entryRuleResource"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:229:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:230:2: (iv_ruleResource= ruleResource EOF )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:231:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource405);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource415); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:238:1: ruleResource returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleResourceType ) ) (otherlv_3= '@' ( (lv_weight_4_0= RULE_INT ) ) )? ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_weight_4_0=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:241:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleResourceType ) ) (otherlv_3= '@' ( (lv_weight_4_0= RULE_INT ) ) )? ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:242:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleResourceType ) ) (otherlv_3= '@' ( (lv_weight_4_0= RULE_INT ) ) )? )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:242:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleResourceType ) ) (otherlv_3= '@' ( (lv_weight_4_0= RULE_INT ) ) )? )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:242:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleResourceType ) ) (otherlv_3= '@' ( (lv_weight_4_0= RULE_INT ) ) )?
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:242:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:243:1: (lv_name_0_0= RULE_ID )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:243:1: (lv_name_0_0= RULE_ID )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:244:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource457); 

            			newLeafNode(lv_name_0_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleResource474); 

                	newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getColonKeyword_1());
                
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:264:1: ( (lv_type_2_0= ruleResourceType ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:265:1: (lv_type_2_0= ruleResourceType )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:265:1: (lv_type_2_0= ruleResourceType )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:266:3: lv_type_2_0= ruleResourceType
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getTypeResourceTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceType_in_ruleResource495);
            lv_type_2_0=ruleResourceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"ResourceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:282:2: (otherlv_3= '@' ( (lv_weight_4_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:282:4: otherlv_3= '@' ( (lv_weight_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleResource508); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getCommercialAtKeyword_3_0());
                        
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:286:1: ( (lv_weight_4_0= RULE_INT ) )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:287:1: (lv_weight_4_0= RULE_INT )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:287:1: (lv_weight_4_0= RULE_INT )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:288:3: lv_weight_4_0= RULE_INT
                    {
                    lv_weight_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource525); 

                    			newLeafNode(lv_weight_4_0, grammarAccess.getResourceAccess().getWeightINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"weight",
                            		lv_weight_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleConstraint"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:312:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:313:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:314:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint568);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:321:1: ruleConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_isDerivation_3_0= '\\'' ) )? otherlv_4= ')' ( (lv_operation_5_0= ruleConstraintOperation ) ) ( (lv_bound_6_0= RULE_INT ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isDerivation_3_0=null;
        Token otherlv_4=null;
        Token lv_bound_6_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_operation_5_0 = null;


         enterRule(); 
            
        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:324:28: ( ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_isDerivation_3_0= '\\'' ) )? otherlv_4= ')' ( (lv_operation_5_0= ruleConstraintOperation ) ) ( (lv_bound_6_0= RULE_INT ) ) ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:325:1: ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_isDerivation_3_0= '\\'' ) )? otherlv_4= ')' ( (lv_operation_5_0= ruleConstraintOperation ) ) ( (lv_bound_6_0= RULE_INT ) ) )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:325:1: ( ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_isDerivation_3_0= '\\'' ) )? otherlv_4= ')' ( (lv_operation_5_0= ruleConstraintOperation ) ) ( (lv_bound_6_0= RULE_INT ) ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:325:2: ( (lv_type_0_0= ruleConstraintType ) ) otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_isDerivation_3_0= '\\'' ) )? otherlv_4= ')' ( (lv_operation_5_0= ruleConstraintOperation ) ) ( (lv_bound_6_0= RULE_INT ) )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:325:2: ( (lv_type_0_0= ruleConstraintType ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:326:1: (lv_type_0_0= ruleConstraintType )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:326:1: (lv_type_0_0= ruleConstraintType )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:327:3: lv_type_0_0= ruleConstraintType
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeConstraintTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintType_in_ruleConstraint624);
            lv_type_0_0=ruleConstraintType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ConstraintType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleConstraint636); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1());
                
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:347:1: ( (otherlv_2= RULE_ID ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:348:1: (otherlv_2= RULE_ID )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:348:1: (otherlv_2= RULE_ID )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:349:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraint656); 

            		newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getReferencesResourceCrossReference_2_0()); 
            	

            }


            }

            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:360:2: ( (lv_isDerivation_3_0= '\\'' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:361:1: (lv_isDerivation_3_0= '\\'' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:361:1: (lv_isDerivation_3_0= '\\'' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:362:3: lv_isDerivation_3_0= '\\''
                    {
                    lv_isDerivation_3_0=(Token)match(input,19,FOLLOW_19_in_ruleConstraint674); 

                            newLeafNode(lv_isDerivation_3_0, grammarAccess.getConstraintAccess().getIsDerivationApostropheKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		setWithLastConsumed(current, "isDerivation", true, "\'");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleConstraint700); 

                	newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_4());
                
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:379:1: ( (lv_operation_5_0= ruleConstraintOperation ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:380:1: (lv_operation_5_0= ruleConstraintOperation )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:380:1: (lv_operation_5_0= ruleConstraintOperation )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:381:3: lv_operation_5_0= ruleConstraintOperation
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getOperationConstraintOperationEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintOperation_in_ruleConstraint721);
            lv_operation_5_0=ruleConstraintOperation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"operation",
                    		lv_operation_5_0, 
                    		"ConstraintOperation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:397:2: ( (lv_bound_6_0= RULE_INT ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:398:1: (lv_bound_6_0= RULE_INT )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:398:1: (lv_bound_6_0= RULE_INT )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:399:3: lv_bound_6_0= RULE_INT
            {
            lv_bound_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstraint738); 

            			newLeafNode(lv_bound_6_0, grammarAccess.getConstraintAccess().getBoundINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bound",
                    		lv_bound_6_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "ruleResourceType"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:423:1: ruleResourceType returns [Enumerator current=null] : ( (enumLiteral_0= 'cpu' ) | (enumLiteral_1= 'memory' ) | (enumLiteral_2= 'bandwidth' ) | (enumLiteral_3= 'power' ) | (enumLiteral_4= 'port' ) ) ;
    public final Enumerator ruleResourceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:425:28: ( ( (enumLiteral_0= 'cpu' ) | (enumLiteral_1= 'memory' ) | (enumLiteral_2= 'bandwidth' ) | (enumLiteral_3= 'power' ) | (enumLiteral_4= 'port' ) ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:426:1: ( (enumLiteral_0= 'cpu' ) | (enumLiteral_1= 'memory' ) | (enumLiteral_2= 'bandwidth' ) | (enumLiteral_3= 'power' ) | (enumLiteral_4= 'port' ) )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:426:1: ( (enumLiteral_0= 'cpu' ) | (enumLiteral_1= 'memory' ) | (enumLiteral_2= 'bandwidth' ) | (enumLiteral_3= 'power' ) | (enumLiteral_4= 'port' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case 25:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:426:2: (enumLiteral_0= 'cpu' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:426:2: (enumLiteral_0= 'cpu' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:426:4: enumLiteral_0= 'cpu'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleResourceType793); 

                            current = grammarAccess.getResourceTypeAccess().getCpuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getResourceTypeAccess().getCpuEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:432:6: (enumLiteral_1= 'memory' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:432:6: (enumLiteral_1= 'memory' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:432:8: enumLiteral_1= 'memory'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleResourceType810); 

                            current = grammarAccess.getResourceTypeAccess().getMemoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getResourceTypeAccess().getMemoryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:438:6: (enumLiteral_2= 'bandwidth' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:438:6: (enumLiteral_2= 'bandwidth' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:438:8: enumLiteral_2= 'bandwidth'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_23_in_ruleResourceType827); 

                            current = grammarAccess.getResourceTypeAccess().getBandwidthEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getResourceTypeAccess().getBandwidthEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:444:6: (enumLiteral_3= 'power' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:444:6: (enumLiteral_3= 'power' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:444:8: enumLiteral_3= 'power'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleResourceType844); 

                            current = grammarAccess.getResourceTypeAccess().getPowerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getResourceTypeAccess().getPowerEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:450:6: (enumLiteral_4= 'port' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:450:6: (enumLiteral_4= 'port' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:450:8: enumLiteral_4= 'port'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_25_in_ruleResourceType861); 

                            current = grammarAccess.getResourceTypeAccess().getPortEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getResourceTypeAccess().getPortEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceType"


    // $ANTLR start "ruleConstraintType"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:460:1: ruleConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'avg' ) ) ;
    public final Enumerator ruleConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:462:28: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'avg' ) ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:463:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'avg' ) )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:463:1: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'max' ) | (enumLiteral_2= 'avg' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
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
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:463:2: (enumLiteral_0= 'min' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:463:2: (enumLiteral_0= 'min' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:463:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleConstraintType906); 

                            current = grammarAccess.getConstraintTypeAccess().getMinimumEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConstraintTypeAccess().getMinimumEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:469:6: (enumLiteral_1= 'max' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:469:6: (enumLiteral_1= 'max' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:469:8: enumLiteral_1= 'max'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleConstraintType923); 

                            current = grammarAccess.getConstraintTypeAccess().getMaximumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConstraintTypeAccess().getMaximumEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:475:6: (enumLiteral_2= 'avg' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:475:6: (enumLiteral_2= 'avg' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:475:8: enumLiteral_2= 'avg'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_28_in_ruleConstraintType940); 

                            current = grammarAccess.getConstraintTypeAccess().getAverageEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConstraintTypeAccess().getAverageEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintType"


    // $ANTLR start "ruleConstraintOperation"
    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:485:1: ruleConstraintOperation returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) ;
    public final Enumerator ruleConstraintOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:487:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) ) )
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:488:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            {
            // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:488:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '>' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 33:
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
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:488:2: (enumLiteral_0= '<' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:488:2: (enumLiteral_0= '<' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:488:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleConstraintOperation985); 

                            current = grammarAccess.getConstraintOperationAccess().getLessEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConstraintOperationAccess().getLessEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:494:6: (enumLiteral_1= '<=' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:494:6: (enumLiteral_1= '<=' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:494:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_30_in_ruleConstraintOperation1002); 

                            current = grammarAccess.getConstraintOperationAccess().getLessOrEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConstraintOperationAccess().getLessOrEqualEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:500:6: (enumLiteral_2= '==' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:500:6: (enumLiteral_2= '==' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:500:8: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_31_in_ruleConstraintOperation1019); 

                            current = grammarAccess.getConstraintOperationAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getConstraintOperationAccess().getEqualEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:506:6: (enumLiteral_3= '>=' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:506:6: (enumLiteral_3= '>=' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:506:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_32_in_ruleConstraintOperation1036); 

                            current = grammarAccess.getConstraintOperationAccess().getGreaterOrEqualEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getConstraintOperationAccess().getGreaterOrEqualEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:512:6: (enumLiteral_4= '>' )
                    {
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:512:6: (enumLiteral_4= '>' )
                    // ../hr.fer.rasip.remes.profile/src-gen/hr/fer/rasip/remes/profile/parser/antlr/internal/InternalProfile.g:512:8: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_33_in_ruleConstraintOperation1053); 

                            current = grammarAccess.getConstraintOperationAccess().getGreaterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getConstraintOperationAccess().getGreaterEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintOperation"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePlatformProfile_in_entryRulePlatformProfile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatformProfile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rulePlatformProfile131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatformProfile148 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePlatformProfile165 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_12_in_rulePlatformProfile178 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePlatformProfile190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleResource_in_rulePlatformProfile211 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePlatformProfile224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleResource_in_rulePlatformProfile245 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_rulePlatformProfile259 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_rulePlatformProfile274 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePlatformProfile286 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleConstraint_in_rulePlatformProfile307 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePlatformProfile320 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_ruleConstraint_in_rulePlatformProfile341 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_rulePlatformProfile355 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePlatformProfile369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource457 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResource474 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleResourceType_in_ruleResource495 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleResource508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintType_in_ruleConstraint624 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstraint636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraint656 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleConstraint674 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstraint700 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_ruleConstraintOperation_in_ruleConstraint721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstraint738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleResourceType793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleResourceType810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleResourceType827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleResourceType844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleResourceType861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConstraintType906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleConstraintType923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConstraintType940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleConstraintOperation985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleConstraintOperation1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleConstraintOperation1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConstraintOperation1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleConstraintOperation1053 = new BitSet(new long[]{0x0000000000000002L});

}