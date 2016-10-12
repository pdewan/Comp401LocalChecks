package gradingTools.comp401f16.assignment7.testcases.mixedCase;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment6.testcases.iniital.InitialBridgeSceneSuite;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.StringTableFactoryMethodTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CommandInterpreterApproachedArthurMixedSayTestCase.class,
	CommandInterpreterArthurMixedMoveLeftArmTestCase.class,
	
	
})
@MaxValue(10)
public class CommandInterpreterMixedCaseSuite {
	
	
	
}
