package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import grader.basics.junit.BasicJUnitUtils;
import grader.basics.junit.GradableJUnitSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SleepCommandTestCase.class,
	ThreadCommandTestCase.class,
	DefineCallCommandTestCase.class,
	RotateLeftArmCommandTestCase.class,
	RotateRightArmCommandTestCase.class,
	ProceedAllCommandTestCase.class
	
	
})
@IsExtra(true)
public class CommandInterpreterSuiteA12 {
	public static final String MAIN_CLASS_NAME = "main.Assignment11";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
	try {
		
		GradableJUnitSuite aTopSuite = BasicJUnitUtils.interactiveTest(CommandInterpreterSuiteA12.class);
		
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
