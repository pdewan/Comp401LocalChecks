package gradingTools.comp301ss21.assignment2.testcases.factory;

import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(2)
public class ConsoleSceneViewSingletonFromFactory  extends ConsoleSceneViewFactoryMethodTest{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};

	
	public ConsoleSceneViewSingletonFromFactory() {

		
	}
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
}
