/*
 * generated by Xtext 2.25.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.rm2pt.sample.basicclass.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getClassAccess().getClassAction_0(),
					$current);
			}
		)
		otherlv_1='Class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.rm2pt.sample.basicclass.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='members'
			{
				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getMembersKeyword_4_0());
			}
			otherlv_5='{'
			{
				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getMembersPersonParserRuleCall_4_2_0());
					}
					lv_members_6_0=rulePerson
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"members",
							lv_members_6_0,
							"org.rm2pt.sample.basicclass.Dsl.Person");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getClassAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClassAccess().getMembersPersonParserRuleCall_4_3_1_0());
						}
						lv_members_8_0=rulePerson
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassRule());
							}
							add(
								$current,
								"members",
								lv_members_8_0,
								"org.rm2pt.sample.basicclass.Dsl.Person");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePerson
entryRulePerson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonRule()); }
	iv_rulePerson=rulePerson
	{ $current=$iv_rulePerson.current; }
	EOF;

// Rule Person
rulePerson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPersonAccess().getStudentParserRuleCall_0());
		}
		this_Student_0=ruleStudent
		{
			$current = $this_Student_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPersonAccess().getTeacherParserRuleCall_1());
		}
		this_Teacher_1=ruleTeacher
		{
			$current = $this_Teacher_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleStudent
entryRuleStudent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStudentRule()); }
	iv_ruleStudent=ruleStudent
	{ $current=$iv_ruleStudent.current; }
	EOF;

// Rule Student
ruleStudent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStudentAccess().getStudentAction_0(),
					$current);
			}
		)
		otherlv_1='Student'
		{
			newLeafNode(otherlv_1, grammarAccess.getStudentAccess().getStudentKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStudentAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStudentRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.rm2pt.sample.basicclass.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getStudentAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='students'
			{
				newLeafNode(otherlv_4, grammarAccess.getStudentAccess().getStudentsKeyword_4_0());
			}
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getStudentAccess().getLeftParenthesisKeyword_4_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStudentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getStudentAccess().getStudentsPersonCrossReference_4_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getStudentAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStudentRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getStudentAccess().getStudentsPersonCrossReference_4_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9=')'
			{
				newLeafNode(otherlv_9, grammarAccess.getStudentAccess().getRightParenthesisKeyword_4_4());
			}
		)?
		(
			otherlv_10='teachers'
			{
				newLeafNode(otherlv_10, grammarAccess.getStudentAccess().getTeachersKeyword_5_0());
			}
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getStudentAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStudentRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getStudentAccess().getTeachersPersonCrossReference_5_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getStudentAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStudentRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getStudentAccess().getTeachersPersonCrossReference_5_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15=')'
			{
				newLeafNode(otherlv_15, grammarAccess.getStudentAccess().getRightParenthesisKeyword_5_4());
			}
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getStudentAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleTeacher
entryRuleTeacher returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTeacherRule()); }
	iv_ruleTeacher=ruleTeacher
	{ $current=$iv_ruleTeacher.current; }
	EOF;

// Rule Teacher
ruleTeacher returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTeacherAccess().getTeacherAction_0(),
					$current);
			}
		)
		otherlv_1='Teacher'
		{
			newLeafNode(otherlv_1, grammarAccess.getTeacherAccess().getTeacherKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTeacherAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTeacherRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.rm2pt.sample.basicclass.Dsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getTeacherAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='students'
			{
				newLeafNode(otherlv_4, grammarAccess.getTeacherAccess().getStudentsKeyword_4_0());
			}
			otherlv_5='('
			{
				newLeafNode(otherlv_5, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_4_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTeacherRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTeacherAccess().getStudentsPersonCrossReference_4_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_7=','
				{
					newLeafNode(otherlv_7, grammarAccess.getTeacherAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTeacherRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getTeacherAccess().getStudentsPersonCrossReference_4_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_9=')'
			{
				newLeafNode(otherlv_9, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_4_4());
			}
		)?
		(
			otherlv_10='teachers'
			{
				newLeafNode(otherlv_10, grammarAccess.getTeacherAccess().getTeachersKeyword_5_0());
			}
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getTeacherAccess().getLeftParenthesisKeyword_5_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTeacherRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTeacherAccess().getTeachersPersonCrossReference_5_2_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_13=','
				{
					newLeafNode(otherlv_13, grammarAccess.getTeacherAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTeacherRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getTeacherAccess().getTeachersPersonCrossReference_5_3_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_15=')'
			{
				newLeafNode(otherlv_15, grammarAccess.getTeacherAccess().getRightParenthesisKeyword_5_4());
			}
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getTeacherAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;