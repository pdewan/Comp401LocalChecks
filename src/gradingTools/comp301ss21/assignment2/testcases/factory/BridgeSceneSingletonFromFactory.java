package gradingTools.comp301ss21.assignment2.testcases.factory;

import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(2)
public class BridgeSceneSingletonFromFactory  extends BridgeSceneFactoryMethodTest{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};

	
	public BridgeSceneSingletonFromFactory() {

		
	}
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
//	@Override
//	protected Class precedingTest() {
//		return BridgeSceneFactoryMethodDefined.class;
//	}
}
