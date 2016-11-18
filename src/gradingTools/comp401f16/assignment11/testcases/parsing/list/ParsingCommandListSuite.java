package gradingTools.comp401f16.assignment11.testcases.parsing.list;

import grader.basics.execution.AMainInNewThread;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.execution.GradingMode;
import grader.basics.junit.BasicJUnitUtils;
import grader.basics.junit.GradableJUnitSuite;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncAnimationSuite;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.CommandObjectSuite;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.MoveCommandObjectTestCase;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.SayCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.ManyLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.TwoLevelListMovesTestCase;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment6.testcases.iniital.InitialBridgeSceneSuite;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.CommandInterpeterBeanTest;
import gradingTools.comp401f16.assignment7.testcases.errors.CommandInterpreterErrorsSuite;
import gradingTools.comp401f16.assignment7.testcases.errors.IllegalCommandNameTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuiteA7;
import gradingTools.comp401f16.assignment7.testcases.factory.StringTableFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.mixedCase.CommandInterpreterMixedCaseSuite;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterMoveSuite;
import gradingTools.comp401f16.assignment7.testcases.move.signed.CommandInterpreterArthurSignedMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.move.signed.CommandInterpreterSignedMoveSuite;
import gradingTools.comp401f16.assignment7.testcases.say.CommandInterpreterApproachedArthurSayTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.ArthurBridgeSceneControllerTestCase;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.BridgeSceneControllerSuite;
import gradingTools.comp401f16.assignment9.testcases.factory.ExtraCreditFactoryMethodSuiteA9;
import gradingTools.comp401f16.assignment9.testcases.factory.FactoryMethodSuiteA9;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.ExistingPaintListenerTestCase;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.NewPaintListenerTestCase;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.ObservablePainterSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
import util.misc.ThreadSupport;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	OneLevelListAtomicCommandTestCase.class,
	OneLevelListMovesTestCase.class,
	TwoLevelListMovesTestCase.class,
	ManyLevelListMovesTestCase.class,
	
	
	
})
@MaxValue(45)
public class ParsingCommandListSuite {
	public static final String MAIN_CLASS_NAME = "main.Assignment11";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
	try {
		
		GradableJUnitSuite aTopSuite = BasicJUnitUtils.interactiveTest(ParsingCommandListSuite.class);
		
//		aTopSuite.test(AsyncAnimationSuite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public static void invokeMain() {
//		if (mainInvoked) {
//			return;
//		}
//		if (GradingMode.getGraderRun()) {
//		Thread aThread = new Thread (new AMainInNewThread(
//				Assignment9Suite.MAIN_CLASS_NAME, emptyStringargs, ""));
//		aThread.start();
//		mainInvoked = true;
//		ThreadSupport.sleep(10000);
//	}
	
	
}
