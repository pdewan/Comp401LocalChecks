package gradingTools.comp401f16.assignment9.testcases.factory;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestBridgeSceneController;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class BridgeSceneControllerFactoryMethodTest extends  FactoryMethodTest{
	public static final String[] FACTORY_METHOD_TAGS = 
			new String[] {"bridgeSceneControllerFactoryMethod"};

	public BridgeSceneControllerFactoryMethodTest() {
//		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;
	}
	protected boolean tryConstructor() {
		return false;
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeSceneController.class;
	}
	
	protected TestBridgeSceneController bridgeSceneController() {
		return (TestBridgeSceneController) rootProxy;
	}
	
	
	public boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
}
