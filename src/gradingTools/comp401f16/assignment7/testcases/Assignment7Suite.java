package gradingTools.comp401f16.assignment7.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment6.testcases.iniital.InitialBridgeSceneSuite;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.errors.CommandInterpreterErrorsSuite;
import gradingTools.comp401f16.assignment7.testcases.errors.IllegalCommandNameTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.StringTableFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.mixedCase.CommandInterpreterMixedCaseSuite;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterMoveSuite;
import gradingTools.comp401f16.assignment7.testcases.move.signed.CommandInterpreterArthurSignedMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.move.signed.CommandInterpreterSignedMoveSuite;
import gradingTools.comp401f16.assignment7.testcases.say.CommandInterpreterApproachedArthurSayTestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	StringTableTest.class,
	FactoryMethodSuite.class,
	CommandInterpreterMoveSuite.class,
	CommandInterpreterSignedMoveSuite.class,
	CommandInterpreterApproachedArthurSayTestCase.class,
	CommandInterpreterMixedCaseSuite.class,
	CommandInterpreterErrorsSuite.class
	
})
public class Assignment7Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment7";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment7Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
