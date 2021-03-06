package gradingTools.comp401f16.assignment8.testcases.factory;

import java.beans.PropertyChangeListener;

import util.annotations.MaxValue;
import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;
import gradingTools.shared.testcases.shapes.LocatableTest;
import gradingTools.shared.testcases.shapes.MovableTest;
@MaxValue(10)
public class ConsoleSceneViewFactoryMethodTest extends  BridgeSceneMoveTestCase{
	public static final String[] FACTORY_METHOD_TAGS = new String[] {"consoleSceneViewFactoryMethod"};
	public ConsoleSceneViewFactoryMethodTest() {
//		factoryMethodTags = new String[] {"consoleSceneViewFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;

	}
	protected boolean tryConstructor() {
		return false;
	}
//	@Override
//	protected Class proxyClass() {
//		return TestCommandInterpreter.class;
//	}
//	
	@Override
	protected Class proxyClass() {
		return PropertyChangeListener.class;
	}
	public PropertyChangeListener consoleView() {
		return (PropertyChangeListener) rootProxy;
	}
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
	
}
