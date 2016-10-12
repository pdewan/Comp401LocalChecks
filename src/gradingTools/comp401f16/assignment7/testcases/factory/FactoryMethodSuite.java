package gradingTools.comp401f16.assignment7.testcases.factory;

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
	StringTableFactoryMethodTest.class,
	CommandInterpreterFactoryMethodTest.class,
	ScannerFactoryMethodTest.class,
	BridgeSceneFactoryMethodTest.class
	
})
@MaxValue(20)
public class FactoryMethodSuite {
	
	
	
}
