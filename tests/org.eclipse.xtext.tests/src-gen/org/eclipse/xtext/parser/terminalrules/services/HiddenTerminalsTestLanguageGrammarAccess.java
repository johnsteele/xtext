/*
* generated by Xtext
*/
package org.eclipse.xtext.parser.terminalrules.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class HiddenTerminalsTestLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWithoutHiddensParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWithHiddensParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cOverridingHiddensParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cInheritingHiddensParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDatatypeHiddensParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//Model:
		//	WithoutHiddens | WithHiddens | OverridingHiddens | InheritingHiddens | DatatypeHiddens;
		public ParserRule getRule() { return rule; }

		//WithoutHiddens | WithHiddens | OverridingHiddens | InheritingHiddens | DatatypeHiddens
		public Alternatives getAlternatives() { return cAlternatives; }

		//WithoutHiddens
		public RuleCall getWithoutHiddensParserRuleCall_0() { return cWithoutHiddensParserRuleCall_0; }

		//WithHiddens
		public RuleCall getWithHiddensParserRuleCall_1() { return cWithHiddensParserRuleCall_1; }

		//OverridingHiddens
		public RuleCall getOverridingHiddensParserRuleCall_2() { return cOverridingHiddensParserRuleCall_2; }

		//InheritingHiddens
		public RuleCall getInheritingHiddensParserRuleCall_3() { return cInheritingHiddensParserRuleCall_3; }

		//DatatypeHiddens
		public RuleCall getDatatypeHiddensParserRuleCall_4() { return cDatatypeHiddensParserRuleCall_4; }
	}

	public class WithoutHiddensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WithoutHiddens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithoutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpacesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpacesWSTerminalRuleCall_1_0 = (RuleCall)cSpacesAssignment_1.eContents().get(0);
		private final Keyword cHiddensKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSpacesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSpacesWSTerminalRuleCall_3_0 = (RuleCall)cSpacesAssignment_3.eContents().get(0);
		private final Assignment cValidAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Keyword cValidSemicolonKeyword_4_0 = (Keyword)cValidAssignment_4.eContents().get(0);
		
		//WithoutHiddens:
		//	"without" spaces+=WS "hiddens" spaces+=WS? valid?=";";
		public ParserRule getRule() { return rule; }

		//"without" spaces+=WS "hiddens" spaces+=WS? valid?=";"
		public Group getGroup() { return cGroup; }

		//"without"
		public Keyword getWithoutKeyword_0() { return cWithoutKeyword_0; }

		//spaces+=WS
		public Assignment getSpacesAssignment_1() { return cSpacesAssignment_1; }

		//WS
		public RuleCall getSpacesWSTerminalRuleCall_1_0() { return cSpacesWSTerminalRuleCall_1_0; }

		//"hiddens"
		public Keyword getHiddensKeyword_2() { return cHiddensKeyword_2; }

		//spaces+=WS?
		public Assignment getSpacesAssignment_3() { return cSpacesAssignment_3; }

		//WS
		public RuleCall getSpacesWSTerminalRuleCall_3_0() { return cSpacesWSTerminalRuleCall_3_0; }

		//valid?=";"
		public Assignment getValidAssignment_4() { return cValidAssignment_4; }

		//";"
		public Keyword getValidSemicolonKeyword_4_0() { return cValidSemicolonKeyword_4_0; }
	}

	public class WithHiddensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WithHiddens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWithKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cHiddensKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValidAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cValidSemicolonKeyword_2_0 = (Keyword)cValidAssignment_2.eContents().get(0);
		
		//WithHiddens hidden(WS, ML_COMMENT, SL_COMMENT):
		//	"with" "hiddens" valid?=";";
		public ParserRule getRule() { return rule; }

		//"with" "hiddens" valid?=";"
		public Group getGroup() { return cGroup; }

		//"with"
		public Keyword getWithKeyword_0() { return cWithKeyword_0; }

		//"hiddens"
		public Keyword getHiddensKeyword_1() { return cHiddensKeyword_1; }

		//valid?=";"
		public Assignment getValidAssignment_2() { return cValidAssignment_2; }

		//";"
		public Keyword getValidSemicolonKeyword_2_0() { return cValidSemicolonKeyword_2_0; }
	}

	public class OverridingHiddensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OverridingHiddens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOverridingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cHiddensKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCalledAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCalledOverridingHiddensCallParserRuleCall_3_0 = (RuleCall)cCalledAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cValidAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cValidSemicolonKeyword_5_0 = (Keyword)cValidAssignment_5.eContents().get(0);
		
		//OverridingHiddens hidden(WS, ML_COMMENT, SL_COMMENT):
		//	"overriding" "hiddens" "(" called=OverridingHiddensCall ")" valid?=";";
		public ParserRule getRule() { return rule; }

		//"overriding" "hiddens" "(" called=OverridingHiddensCall ")" valid?=";"
		public Group getGroup() { return cGroup; }

		//"overriding"
		public Keyword getOverridingKeyword_0() { return cOverridingKeyword_0; }

		//"hiddens"
		public Keyword getHiddensKeyword_1() { return cHiddensKeyword_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//called=OverridingHiddensCall
		public Assignment getCalledAssignment_3() { return cCalledAssignment_3; }

		//OverridingHiddensCall
		public RuleCall getCalledOverridingHiddensCallParserRuleCall_3_0() { return cCalledOverridingHiddensCallParserRuleCall_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//valid?=";"
		public Assignment getValidAssignment_5() { return cValidAssignment_5; }

		//";"
		public Keyword getValidSemicolonKeyword_5_0() { return cValidSemicolonKeyword_5_0; }
	}

	public class OverridingHiddensCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OverridingHiddensCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCallKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpacesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpacesWSTerminalRuleCall_1_0 = (RuleCall)cSpacesAssignment_1.eContents().get(0);
		private final Assignment cValidAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cValidSemicolonKeyword_2_0 = (Keyword)cValidAssignment_2.eContents().get(0);
		
		//OverridingHiddensCall hidden():
		//	"call" spaces+=WS? valid?=";";
		public ParserRule getRule() { return rule; }

		//"call" spaces+=WS? valid?=";"
		public Group getGroup() { return cGroup; }

		//"call"
		public Keyword getCallKeyword_0() { return cCallKeyword_0; }

		//spaces+=WS?
		public Assignment getSpacesAssignment_1() { return cSpacesAssignment_1; }

		//WS
		public RuleCall getSpacesWSTerminalRuleCall_1_0() { return cSpacesWSTerminalRuleCall_1_0; }

		//valid?=";"
		public Assignment getValidAssignment_2() { return cValidAssignment_2; }

		//";"
		public Keyword getValidSemicolonKeyword_2_0() { return cValidSemicolonKeyword_2_0; }
	}

	public class InheritingHiddensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InheritingHiddens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInheritingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cHiddensKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cCalledAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cCalledInheritingHiddensCallParserRuleCall_3_0_0 = (RuleCall)cCalledAssignment_3_0.eContents().get(0);
		private final Assignment cHidingCalledAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cHidingCalledHidingHiddensParserRuleCall_3_1_0 = (RuleCall)cHidingCalledAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cValidAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cValidSemicolonKeyword_5_0 = (Keyword)cValidAssignment_5.eContents().get(0);
		
		//InheritingHiddens hidden(WS, ML_COMMENT, SL_COMMENT):
		//	"inheriting" "hiddens" "(" (called=InheritingHiddensCall | hidingCalled=HidingHiddens) ")" valid?=";";
		public ParserRule getRule() { return rule; }

		//"inheriting" "hiddens" "(" (called=InheritingHiddensCall | hidingCalled=HidingHiddens) ")" valid?=";"
		public Group getGroup() { return cGroup; }

		//"inheriting"
		public Keyword getInheritingKeyword_0() { return cInheritingKeyword_0; }

		//"hiddens"
		public Keyword getHiddensKeyword_1() { return cHiddensKeyword_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//called=InheritingHiddensCall | hidingCalled=HidingHiddens
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//called=InheritingHiddensCall
		public Assignment getCalledAssignment_3_0() { return cCalledAssignment_3_0; }

		//InheritingHiddensCall
		public RuleCall getCalledInheritingHiddensCallParserRuleCall_3_0_0() { return cCalledInheritingHiddensCallParserRuleCall_3_0_0; }

		//hidingCalled=HidingHiddens
		public Assignment getHidingCalledAssignment_3_1() { return cHidingCalledAssignment_3_1; }

		//HidingHiddens
		public RuleCall getHidingCalledHidingHiddensParserRuleCall_3_1_0() { return cHidingCalledHidingHiddensParserRuleCall_3_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//valid?=";"
		public Assignment getValidAssignment_5() { return cValidAssignment_5; }

		//";"
		public Keyword getValidSemicolonKeyword_5_0() { return cValidSemicolonKeyword_5_0; }
	}

	public class DatatypeHiddensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DatatypeHiddens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValidAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValidDatatypeRuleParserRuleCall_1_0 = (RuleCall)cValidAssignment_1.eContents().get(0);
		
		//DatatypeHiddens:
		//	"datatype" valid?=DatatypeRule;
		public ParserRule getRule() { return rule; }

		//"datatype" valid?=DatatypeRule
		public Group getGroup() { return cGroup; }

		//"datatype"
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }

		//valid?=DatatypeRule
		public Assignment getValidAssignment_1() { return cValidAssignment_1; }

		//DatatypeRule
		public RuleCall getValidDatatypeRuleParserRuleCall_1_0() { return cValidDatatypeRuleParserRuleCall_1_0; }
	}

	public class DatatypeRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DatatypeRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DatatypeRule returns ecore::EString hidden(WS):
		//	"rule" ";";
		public ParserRule getRule() { return rule; }

		//"rule" ";"
		public Group getGroup() { return cGroup; }

		//"rule"
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class HidingHiddensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "HidingHiddens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHidingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpaceWSTerminalRuleCall_1_0 = (RuleCall)cSpaceAssignment_1.eContents().get(0);
		private final Assignment cCalledAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCalledInheritingHiddensCallParserRuleCall_2_0 = (RuleCall)cCalledAssignment_2.eContents().get(0);
		
		//HidingHiddens hidden():
		//	"hiding" space=WS called=InheritingHiddensCall;
		public ParserRule getRule() { return rule; }

		//"hiding" space=WS called=InheritingHiddensCall
		public Group getGroup() { return cGroup; }

		//"hiding"
		public Keyword getHidingKeyword_0() { return cHidingKeyword_0; }

		//space=WS
		public Assignment getSpaceAssignment_1() { return cSpaceAssignment_1; }

		//WS
		public RuleCall getSpaceWSTerminalRuleCall_1_0() { return cSpaceWSTerminalRuleCall_1_0; }

		//called=InheritingHiddensCall
		public Assignment getCalledAssignment_2() { return cCalledAssignment_2; }

		//InheritingHiddensCall
		public RuleCall getCalledInheritingHiddensCallParserRuleCall_2_0() { return cCalledInheritingHiddensCallParserRuleCall_2_0; }
	}

	public class InheritingHiddensCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "InheritingHiddensCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCallKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValidAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cValidSemicolonKeyword_1_0 = (Keyword)cValidAssignment_1.eContents().get(0);
		
		//InheritingHiddensCall:
		//	"call" valid?=";";
		public ParserRule getRule() { return rule; }

		//"call" valid?=";"
		public Group getGroup() { return cGroup; }

		//"call"
		public Keyword getCallKeyword_0() { return cCallKeyword_0; }

		//valid?=";"
		public Assignment getValidAssignment_1() { return cValidAssignment_1; }

		//";"
		public Keyword getValidSemicolonKeyword_1_0() { return cValidSemicolonKeyword_1_0; }
	}
	
	
	private ModelElements pModel;
	private WithoutHiddensElements pWithoutHiddens;
	private WithHiddensElements pWithHiddens;
	private OverridingHiddensElements pOverridingHiddens;
	private OverridingHiddensCallElements pOverridingHiddensCall;
	private InheritingHiddensElements pInheritingHiddens;
	private DatatypeHiddensElements pDatatypeHiddens;
	private DatatypeRuleElements pDatatypeRule;
	private HidingHiddensElements pHidingHiddens;
	private InheritingHiddensCallElements pInheritingHiddensCall;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tWS;
	private TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public HiddenTerminalsTestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Model:
	//	WithoutHiddens | WithHiddens | OverridingHiddens | InheritingHiddens | DatatypeHiddens;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//WithoutHiddens:
	//	"without" spaces+=WS "hiddens" spaces+=WS? valid?=";";
	public WithoutHiddensElements getWithoutHiddensAccess() {
		return (pWithoutHiddens != null) ? pWithoutHiddens : (pWithoutHiddens = new WithoutHiddensElements());
	}
	
	public ParserRule getWithoutHiddensRule() {
		return getWithoutHiddensAccess().getRule();
	}

	//WithHiddens hidden(WS, ML_COMMENT, SL_COMMENT):
	//	"with" "hiddens" valid?=";";
	public WithHiddensElements getWithHiddensAccess() {
		return (pWithHiddens != null) ? pWithHiddens : (pWithHiddens = new WithHiddensElements());
	}
	
	public ParserRule getWithHiddensRule() {
		return getWithHiddensAccess().getRule();
	}

	//OverridingHiddens hidden(WS, ML_COMMENT, SL_COMMENT):
	//	"overriding" "hiddens" "(" called=OverridingHiddensCall ")" valid?=";";
	public OverridingHiddensElements getOverridingHiddensAccess() {
		return (pOverridingHiddens != null) ? pOverridingHiddens : (pOverridingHiddens = new OverridingHiddensElements());
	}
	
	public ParserRule getOverridingHiddensRule() {
		return getOverridingHiddensAccess().getRule();
	}

	//OverridingHiddensCall hidden():
	//	"call" spaces+=WS? valid?=";";
	public OverridingHiddensCallElements getOverridingHiddensCallAccess() {
		return (pOverridingHiddensCall != null) ? pOverridingHiddensCall : (pOverridingHiddensCall = new OverridingHiddensCallElements());
	}
	
	public ParserRule getOverridingHiddensCallRule() {
		return getOverridingHiddensCallAccess().getRule();
	}

	//InheritingHiddens hidden(WS, ML_COMMENT, SL_COMMENT):
	//	"inheriting" "hiddens" "(" (called=InheritingHiddensCall | hidingCalled=HidingHiddens) ")" valid?=";";
	public InheritingHiddensElements getInheritingHiddensAccess() {
		return (pInheritingHiddens != null) ? pInheritingHiddens : (pInheritingHiddens = new InheritingHiddensElements());
	}
	
	public ParserRule getInheritingHiddensRule() {
		return getInheritingHiddensAccess().getRule();
	}

	//DatatypeHiddens:
	//	"datatype" valid?=DatatypeRule;
	public DatatypeHiddensElements getDatatypeHiddensAccess() {
		return (pDatatypeHiddens != null) ? pDatatypeHiddens : (pDatatypeHiddens = new DatatypeHiddensElements());
	}
	
	public ParserRule getDatatypeHiddensRule() {
		return getDatatypeHiddensAccess().getRule();
	}

	//DatatypeRule returns ecore::EString hidden(WS):
	//	"rule" ";";
	public DatatypeRuleElements getDatatypeRuleAccess() {
		return (pDatatypeRule != null) ? pDatatypeRule : (pDatatypeRule = new DatatypeRuleElements());
	}
	
	public ParserRule getDatatypeRuleRule() {
		return getDatatypeRuleAccess().getRule();
	}

	//HidingHiddens hidden():
	//	"hiding" space=WS called=InheritingHiddensCall;
	public HidingHiddensElements getHidingHiddensAccess() {
		return (pHidingHiddens != null) ? pHidingHiddens : (pHidingHiddens = new HidingHiddensElements());
	}
	
	public ParserRule getHidingHiddensRule() {
		return getHidingHiddensAccess().getRule();
	}

	//InheritingHiddensCall:
	//	"call" valid?=";";
	public InheritingHiddensCallElements getInheritingHiddensCallAccess() {
		return (pInheritingHiddensCall != null) ? pInheritingHiddensCall : (pInheritingHiddensCall = new InheritingHiddensCallElements());
	}
	
	public ParserRule getInheritingHiddensCallRule() {
		return getInheritingHiddensCallAccess().getRule();
	}

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return (tANY_OTHER != null) ? tANY_OTHER : (tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER"));
	} 
}
