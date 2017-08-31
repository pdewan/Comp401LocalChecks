package gradingTools.comp401f17.assignment8.testcases;

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
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ConsoleSceneViewFactoryMethodTest.class,
	ConsoleSceneViewOutputTestCase.class
	
	
})
public class Assignment8Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment8";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment8Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
