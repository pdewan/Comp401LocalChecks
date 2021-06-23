package gradingTools.comp301ss21.assignment2_1.style;

import gradingTools.basics.sharedTestCase.checkstyle.CommonPropertiesAreInheritedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.EncapsulationTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanExpressionTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanReturnTestCase;
import gradingTools.comp301ss21.assignment1_1.numbers.run.IndexOf;
import gradingTools.comp301ss21.assignment1_1.numbers.run.IndexOfNotSpaceAtEnd;
import gradingTools.comp301ss21.assignment1_1.numbers.run.MultipleTokenNumbers;
import gradingTools.comp301ss21.assignment1_1.numbers.run.ScanString;
import gradingTools.comp301ss21.assignment1_1.numbers.run.ScanningIterator;
import gradingTools.comp301ss21.assignment1_1.scannerBean.ScannerBean;
import gradingTools.comp301ss21.assignment1_1.tokenObjects.run.MultipleQuoteTokenObjects;
import gradingTools.comp301ss21.assignment1_1.tokenObjects.run.WordBean;
import gradingTools.comp301ss21.assignment1_1.tokens.run.MixedTokens;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp301ss21.assignment2_1.inheritance.TaggedEnd;
import gradingTools.comp301ss21.assignment2_1.inheritance.TaggedNumber;
import gradingTools.comp301ss21.assignment2_1.inheritance.TaggedQuote;
import gradingTools.comp301ss21.assignment2_1.inheritance.TaggedSay;
import gradingTools.comp301ss21.assignment2_1.inheritance.TaggedStart;
import gradingTools.comp301ss21.assignment2_1.inheritance.TaggedToken;
import gradingTools.comp301ss21.assignment2_1.inheritance.TaggedWord;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.ApproachHistory;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.FailedHistory;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.NumberHistory;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.PassedHistory;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.QuoteHistory;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.RepeatHistory;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.SayHistory;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.WordHistory;
import gradingTools.comp301ss21.assignment3.controller.ArthurBridgeSceneController;
import gradingTools.comp301ss21.assignment3.table.AvatarTableSemantics;
import gradingTools.comp301ss21.assignment3.table.TableSemantics;
import gradingTools.comp301ss21.assignment4.assertions.AssertingBridgeSceneDynamics;
import gradingTools.comp301ss21.assignment4.async.AsyncArthurAnimation;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerButtonDynamics;
import gradingTools.comp301ss21.assignment4.coordination.LockstepAvatars;
import gradingTools.comp301ss21.assignment4.coordination.WaitingAvatars;
import gradingTools.comp301ss21.assignment4.exceptions.ArthurIsNotAContortionist;
import gradingTools.comp301ss21.assignment4.sync.SyncArthurAnimation;
import gradingTools.comp401f16.assignment1.testcases.IndexOfNotNonSpaceAtEnd;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.IsExtra;
import util.annotations.MaxValue;

@MaxValue(20)
public class A2_1CommonPropertiesAreInherited extends CommonPropertiesAreInheritedTestCase {
static final Class[] PRECEDING_TESTS = {
		WordHistory.class,
		NumberHistory.class,
		QuoteHistory.class,
		PassedHistory.class,
		FailedHistory.class,
		ApproachHistory.class,
		RepeatHistory.class,
		SayHistory.class,
		TaggedEnd.class,
		TaggedNumber.class,
		TaggedQuote.class,
		TaggedSay.class,
		TaggedStart.class,
		TaggedToken.class,
		TaggedWord.class,
		
		
//		MultipleTokenNumbers.class,		
//		MixedTokens.class,
//		IndexOf.class,
//		IndexOfNotSpaceAtEnd.class,
//		ScanningIterator.class,
//		MultipleQuoteTokenObjects.class,
//		WordBean.class,
//		ScanString.class
		
		
};
@Override
protected Class[] precedingTests() {
	return PRECEDING_TESTS;
}
}
