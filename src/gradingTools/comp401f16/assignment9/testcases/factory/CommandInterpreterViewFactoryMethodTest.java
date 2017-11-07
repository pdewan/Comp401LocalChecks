package gradingTools.comp401f16.assignment9.testcases.factory;

import bus.uigen.test.TestTransient;
import grader.driver.GradingManagerFactory;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestBridgeSceneController;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestCommandInterpreterController;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class CommandInterpreterViewFactoryMethodTest extends  FactoryMethodTest{
	public static final String[] FACTORY_METHOD_TAGS = 
			new String[] {"commandInterpreterViewFactoryMethod"};

	public CommandInterpreterViewFactoryMethodTest() {
//		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;
	}
	protected boolean tryConstructor() {
		return false;
	}
	@Override
	protected Class proxyClass() {
		return Object.class;
	}
	
	protected Object commandInterpreterView() {
		return (Object) rootProxy;
	}
	
	protected boolean doTest() throws Throwable {
		assertTrue("Cannot grade test in headless mode", !GradingManagerFactory.isHeadless());
		return doFactoryMethodTest();
	}
	
}
