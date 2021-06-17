package gradingTools.comp301ss21.assignment4.assertions;

import gradingTools.comp401f16.assignment10.testcases.AssertingBridgeSceneDynamicTestCase;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(50)
public class AssertingBridgeSceneDynamics 
	extends AssertingBridgeSceneDynamicTestCase {
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	
	
}
