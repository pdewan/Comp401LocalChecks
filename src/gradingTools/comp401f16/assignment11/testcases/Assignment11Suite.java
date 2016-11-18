package gradingTools.comp401f16.assignment11.testcases;

import grader.basics.junit.BasicJUnitUtils;
import grader.basics.junit.GradableJUnitSuite;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.AtomicCommandObjectSuiteA11;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.CompositeCommandObjectSuite;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncAnimationSuite;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParsingSuiteA11;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.ParsingCommandListSuite;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.ParsingRepeatSuite;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeatAndList.ParsingRepeatAndCommandListSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ParsingAtomicCommandTestCase.class,
	ParsingCommandListSuite.class,
	ParsingRepeatSuite.class,
	ParsingRepeatAndCommandListSuite.class,
	AtomicCommandObjectSuiteA11.class,
	CompositeCommandObjectSuite.class,
	SyncAnimationSuite.class,
	ParserFactoryMethodTest.class

	
})
public class Assignment11Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment11";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
	try {
		
		GradableJUnitSuite aTopSuite = BasicJUnitUtils.interactiveTest(Assignment11Suite.class);
		
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
