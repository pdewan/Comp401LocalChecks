package gradingTools.comp401f17.assignment12.testcases;

import grader.basics.junit.BasicJUnitUtils;
import grader.basics.junit.GradableJUnitSuite;
import gradingTools.comp401f16.assignment12.testcases.BroadcastingClearanceManagerFactoryMethodTest;
import gradingTools.comp401f16.assignment12.testcases.SwingTextFieldFactoryTestCase;
import gradingTools.comp401f16.assignment12.testcases.UndoRedoTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.CommandInterpreterSuiteA12;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.CommandObjectSuiteA12;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.RotateLeftArmCommandObjectTestCase;
import gradingTools.comp401f16.assignment12.testcases.exceptions.ExceptionSuite;
import gradingTools.comp401f16.assignment12.testcases.exceptions.ScanningExceptionTestCase;
import gradingTools.comp401f16.assignment12.testcases.parser.ParserSuiteA12;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.LockstepAvatarsAnimationTestCase;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BroadcastingClearanceManagerFactoryMethodTest.class,
	WaitingAvatarsAnimationTestCase.class,
	LockstepAvatarsAnimationTestCase.class,
	CommandObjectSuiteA12.class,
	CommandInterpreterSuiteA12.class,
	ParserSuiteA12.class,
	ExceptionSuite.class,
	UndoRedoTestCase.class,
	SwingTextFieldFactoryTestCase.class
////	ParsingAtomicCommandTestCase.class,
////	ParsingCommandListSuite.class,
////	ParsingRepeatSuite.class,
////	ParsingRepeatAndCommandListSuite.class,
//	CommandInterpreterSuiteA11.class,
//	CommandObjectSuiteA11.class,
////	AtomicCommandObjectSuiteA11.class,
////	CompositeCommandObjectSuite.class,
//	SyncAnimationSuite.class,
////	ParserFactoryMethodTest.class,
//	ParserSuite.class
////	ParserCreatesCommandObjectSuite.class

	
})
public class Assignment12Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment12";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
	try {
		
		GradableJUnitSuite aTopSuite = BasicJUnitUtils.interactiveTest(Assignment12Suite.class);
		
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
