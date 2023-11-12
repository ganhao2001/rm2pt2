package org.rm2pt.sample.basicclass.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.rm2pt.sample.basicclass.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Class'", "'{'", "'members'", "','", "'}'", "'Student'", "'students'", "'('", "')'", "'teachers'", "'Teacher'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Class";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClass"
    // InternalDsl.g:64:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleClass= ruleClass EOF )
            // InternalDsl.g:65:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalDsl.g:71:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_members_6_0 = null;

        EObject lv_members_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDsl.g:78:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDsl.g:78:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDsl.g:79:3: () otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDsl.g:79:3: ()
            // InternalDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.basicclass.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:113:3: (otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:114:4: otherlv_4= 'members' otherlv_5= '{' ( (lv_members_6_0= rulePerson ) ) (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getMembersKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDsl.g:122:4: ( (lv_members_6_0= rulePerson ) )
                    // InternalDsl.g:123:5: (lv_members_6_0= rulePerson )
                    {
                    // InternalDsl.g:123:5: (lv_members_6_0= rulePerson )
                    // InternalDsl.g:124:6: lv_members_6_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getMembersPersonParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_members_6_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_6_0,
                    							"org.rm2pt.sample.basicclass.Dsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:141:4: (otherlv_7= ',' ( (lv_members_8_0= rulePerson ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDsl.g:142:5: otherlv_7= ',' ( (lv_members_8_0= rulePerson ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getClassAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:146:5: ( (lv_members_8_0= rulePerson ) )
                    	    // InternalDsl.g:147:6: (lv_members_8_0= rulePerson )
                    	    {
                    	    // InternalDsl.g:147:6: (lv_members_8_0= rulePerson )
                    	    // InternalDsl.g:148:7: lv_members_8_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getMembersPersonParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_members_8_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_8_0,
                    	    								"org.rm2pt.sample.basicclass.Dsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRulePerson"
    // InternalDsl.g:179:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalDsl.g:179:47: (iv_rulePerson= rulePerson EOF )
            // InternalDsl.g:180:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDsl.g:186:1: rulePerson returns [EObject current=null] : (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        EObject this_Student_0 = null;

        EObject this_Teacher_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:192:2: ( (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher ) )
            // InternalDsl.g:193:2: (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher )
            {
            // InternalDsl.g:193:2: (this_Student_0= ruleStudent | this_Teacher_1= ruleTeacher )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:194:3: this_Student_0= ruleStudent
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getStudentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Student_0=ruleStudent();

                    state._fsp--;


                    			current = this_Student_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:203:3: this_Teacher_1= ruleTeacher
                    {

                    			newCompositeNode(grammarAccess.getPersonAccess().getTeacherParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teacher_1=ruleTeacher();

                    state._fsp--;


                    			current = this_Teacher_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:215:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:215:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:216:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:222:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:228:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:229:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:229:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:230:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:238:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStudent"
    // InternalDsl.g:249:1: entryRuleStudent returns [EObject current=null] : iv_ruleStudent= ruleStudent EOF ;
    public final EObject entryRuleStudent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStudent = null;


        try {
            // InternalDsl.g:249:48: (iv_ruleStudent= ruleStudent EOF )
            // InternalDsl.g:250:2: iv_ruleStudent= ruleStudent EOF
            {
             newCompositeNode(grammarAccess.getStudentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStudent=ruleStudent();

            state._fsp--;

             current =iv_ruleStudent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStudent"


    // $ANTLR start "ruleStudent"
    // InternalDsl.g:256:1: ruleStudent returns [EObject current=null] : ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleStudent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:262:2: ( ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalDsl.g:263:2: ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalDsl.g:263:2: ( () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalDsl.g:264:3: () otherlv_1= 'Student' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalDsl.g:264:3: ()
            // InternalDsl.g:265:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStudentAccess().getStudentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStudentAccess().getStudentKeyword_1());
            		
            // InternalDsl.g:275:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:276:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:276:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:277:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStudentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.basicclass.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:298:3: (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:299:4: otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getStudentAccess().getStudentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:307:4: ( ( ruleEString ) )
                    // InternalDsl.g:308:5: ( ruleEString )
                    {
                    // InternalDsl.g:308:5: ( ruleEString )
                    // InternalDsl.g:309:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStudentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStudentAccess().getStudentsPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:323:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:324:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:328:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:329:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:329:6: ( ruleEString )
                    	    // InternalDsl.g:330:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStudentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStudentAccess().getStudentsPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:350:3: (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:351:4: otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getTeachersKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getStudentAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:359:4: ( ( ruleEString ) )
                    // InternalDsl.g:360:5: ( ruleEString )
                    {
                    // InternalDsl.g:360:5: ( ruleEString )
                    // InternalDsl.g:361:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStudentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStudentAccess().getTeachersPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:375:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:376:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStudentAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:380:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:381:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:381:6: ( ruleEString )
                    	    // InternalDsl.g:382:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStudentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStudentAccess().getTeachersPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getStudentAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStudent"


    // $ANTLR start "entryRuleTeacher"
    // InternalDsl.g:410:1: entryRuleTeacher returns [EObject current=null] : iv_ruleTeacher= ruleTeacher EOF ;
    public final EObject entryRuleTeacher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeacher = null;


        try {
            // InternalDsl.g:410:48: (iv_ruleTeacher= ruleTeacher EOF )
            // InternalDsl.g:411:2: iv_ruleTeacher= ruleTeacher EOF
            {
             newCompositeNode(grammarAccess.getTeacherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeacher=ruleTeacher();

            state._fsp--;

             current =iv_ruleTeacher; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTeacher"


    // $ANTLR start "ruleTeacher"
    // InternalDsl.g:417:1: ruleTeacher returns [EObject current=null] : ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleTeacher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:423:2: ( ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalDsl.g:424:2: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalDsl.g:424:2: ( () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalDsl.g:425:3: () otherlv_1= 'Teacher' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalDsl.g:425:3: ()
            // InternalDsl.g:426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTeacherAccess().getTeacherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTeacherAccess().getTeacherKeyword_1());
            		
            // InternalDsl.g:436:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDsl.g:437:4: (lv_name_2_0= ruleEString )
            {
            // InternalDsl.g:437:4: (lv_name_2_0= ruleEString )
            // InternalDsl.g:438:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeacherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.rm2pt.sample.basicclass.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:459:3: (otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:460:4: otherlv_4= 'students' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getTeacherAccess().getStudentsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalDsl.g:468:4: ( ( ruleEString ) )
                    // InternalDsl.g:469:5: ( ruleEString )
                    {
                    // InternalDsl.g:469:5: ( ruleEString )
                    // InternalDsl.g:470:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTeacherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTeacherAccess().getStudentsPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:484:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDsl.g:485:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDsl.g:489:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:490:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:490:6: ( ruleEString )
                    	    // InternalDsl.g:491:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTeacherRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTeacherAccess().getStudentsPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDsl.g:511:3: (otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:512:4: otherlv_10= 'teachers' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getTeacherAccess().getTeachersKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalDsl.g:520:4: ( ( ruleEString ) )
                    // InternalDsl.g:521:5: ( ruleEString )
                    {
                    // InternalDsl.g:521:5: ( ruleEString )
                    // InternalDsl.g:522:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTeacherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTeacherAccess().getTeachersPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:536:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDsl.g:537:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getTeacherAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDsl.g:541:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:542:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:542:6: ( ruleEString )
                    	    // InternalDsl.g:543:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTeacherRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTeacherAccess().getTeachersPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTeacher"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});

}