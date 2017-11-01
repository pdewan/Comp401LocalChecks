package gradingTools.comp401f16.assignment9.testcases.observablepainter;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment6.testcases.iniital.InitialBridgeSceneSuite;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.StringTableFactoryMethodTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ExistingPaintListenerTestCase.class
//	NewPaintListenerTestCase.class,	
})
@MaxValue(30)
@IsExtra(true)
public class ObservablePainterSuite {
	
	
	
}
