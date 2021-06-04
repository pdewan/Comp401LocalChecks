package gradingTools.comp401f16.assignment7.testcases.factory;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class BridgeSceneFactoryMethodTest extends  FactoryMethodTest{
	public static final String[] FACTORY_METHOD_TAGS = 
			new String[] {"bridgeSceneFactoryMethod"};
//	protected String[] factoryMethodTags() {
//		return FACTORY_METHOD_TAGS;
//	}
	public BridgeSceneFactoryMethodTest() {
//		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
		// this is for legacy purposes
		factoryMethodTags = FACTORY_METHOD_TAGS;
		
	}
	protected boolean tryConstructor() {
		return false;
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	
	public TestBridgeScene bridgeScene() {
		return (TestBridgeScene) rootProxy;
	}
	
	
	protected boolean doTest() throws Throwable {
//		 factoryMethodTags = factoryMethodTags();
		 return doFactoryMethodTest();
		
	}
	
}
