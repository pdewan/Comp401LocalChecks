package gradingTools.comp401f16.assignment9.testcases;

import grader.basics.execution.AMainInNewThread;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment6.testcases.iniital.InitialBridgeSceneSuite;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
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
import gradingTools.comp401f16.assignment9.testcases.factory.ExtraCreditFactoryMethodSuiteA9;
import gradingTools.comp401f16.assignment9.testcases.factory.FactoryMethodSuiteA9;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.ExistingPaintListenerTestCase;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.NewPaintListenerTestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.misc.ThreadSupport;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	FactoryMethodSuiteA9.class,
	ExtraCreditFactoryMethodSuiteA9.class,
	NewPaintListenerTestCase.class,
	ExistingPaintListenerTestCase.class
	
	
})
public class Assignment9Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment9";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
		try {

		invokeMain();
		BasicJUnitUtils.interactiveTest(Assignment9Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static boolean mainInvoked = false;
	protected static String[] emptyStringargs = new String[]{};
	
	public static void invokeMain() {
		if (mainInvoked) {
			return;
		}
		Thread aThread = new Thread (new AMainInNewThread(
				Assignment9Suite.MAIN_CLASS_NAME, emptyStringargs, ""));
		aThread.start();
		mainInvoked = true;
		ThreadSupport.sleep(10000);
	}
	
	
}
