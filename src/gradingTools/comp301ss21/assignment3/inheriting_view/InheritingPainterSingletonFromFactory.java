package gradingTools.comp301ss21.assignment3.inheriting_view;

import java.beans.PropertyChangeListener;

import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(2)
public class InheritingPainterSingletonFromFactory  extends BridgeSceneMoveTestCase{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};

	public static final String[] FACTORY_METHOD_TAGS = new String[] {"inheritingBridgeScenePainterFactoryMethod"};
	public InheritingPainterSingletonFromFactory() {
//		factoryMethodTags = new String[] {"consoleSceneViewFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;

	}
	
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	@Override
	protected Class proxyClass() {
		return Object.class;
	}
	
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
}
