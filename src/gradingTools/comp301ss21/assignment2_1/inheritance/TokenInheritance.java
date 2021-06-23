package gradingTools.comp301ss21.assignment2_1.inheritance;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.basics.sharedTestCase.checkstyle.HiddenFieldTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NamingConventionsTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanExpressionTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanReturnTestCase;
import gradingTools.comp301ss21.assignment1.A1Main;
import gradingTools.comp301ss21.assignment1.A1Style;
import gradingTools.comp301ss21.assignment1.Angle;
import gradingTools.comp301ss21.assignment1.BridgeScene;
import gradingTools.comp301ss21.assignment1.BridgeSceneScale;
import gradingTools.comp301ss21.assignment1.RotatingLine;
import gradingTools.comp301ss21.assignment1.SS21Assignment1Suite;
import gradingTools.comp301ss21.assignment2.testcases.console_view.ConsoleSceneView;
import gradingTools.comp301ss21.assignment2.testcases.factory.A2MainCallsBridgeSceneFactoryMethod;
import gradingTools.comp301ss21.assignment2.testcases.factory.AvatarCallsLegFactoryMethod;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneFactoryMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewFactoryMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.LegsFactoryMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.factory.TaggedFactory;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.history.ApproachHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.FailHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.NumberHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.PassHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.QuoteHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.RepeatHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.SayHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.WordHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuiteA7;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import util.annotations.MaxValue;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaggedEnd.class,
	TaggedNumber.class,
	TaggedQuote.class,
	TaggedSay.class,
	TaggedStart.class,
	TaggedToken.class,
	TaggedWord.class,
	A2_1ExpectedSuperTypes.class,
	
//	A2Style.class,
//SimplifyBooleanExpressionTestCase.class,
//SimplifyBooleanReturnTestCase.class,
//HiddenFieldTestCase.class,
//NamingConventionsTestCase.class,
//BridgeSceneDynamicTestCase.class,
//BridgeSceneComponentScrollSuite.class,
	
//ConsoleSceneView.class



})
@MaxValue(15)
public class TokenInheritance {

	

}
