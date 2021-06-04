package gradingTools.comp301ss21.assignment2.testcases.factory;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class A2MainCallsBridgeSceneFactoryMethod extends CheckstyleMethodCalledTestCase {

	public A2MainCallsBridgeSceneFactoryMethod() {
		super("main.Assignment2", "@Comp301Tags.FACTORY_CLASS!bridgeSceneFactoryMethod:->@Comp301Tags\\.BRIDGE_SCENE"); 
				
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return BridgeSceneFactoryMethodDefined.class;
	}

}
