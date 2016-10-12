package gradingTools.comp401f16.assignment7.testcases.factory;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;
import gradingTools.shared.testcases.shapes.LocatableTest;
import gradingTools.shared.testcases.shapes.MovableTest;

public class CommandInterpreterFactoryMethodTest extends  BridgeSceneMoveTestCase{
	
	public CommandInterpreterFactoryMethodTest() {
		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
	}
	@Override
	protected Class proxyClass() {
		return TestCommandInterpreter.class;
	}
	
	protected TestCommandInterpreter commandInterpreter() {
		return (TestCommandInterpreter) rootProxy;
	}
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
	
}
