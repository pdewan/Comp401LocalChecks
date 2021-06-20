package gradingTools.comp301ss21.assignment3.controller;

import java.beans.PropertyChangeListener;

import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestBridgeSceneController;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(2)
public class SceneControllerSingletonFromFactory  extends BridgeSceneMoveTestCase{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};

	public static final String[] FACTORY_METHOD_TAGS = new String[] {"bridgeSceneControllerFactoryMethod"};
	public SceneControllerSingletonFromFactory() {
//		factoryMethodTags = new String[] {"consoleSceneViewFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;

	}
	
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeSceneController.class;
	}
	public TestBridgeSceneController sceneController() {
		return (TestBridgeSceneController) rootProxy;
	}
	
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
}
