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

	public BridgeSceneFactoryMethodTest() {
//		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;
	}
	protected boolean tryConstructor() {
		return false;
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	
	protected TestBridgeScene bridgeScene() {
		return (TestBridgeScene) rootProxy;
	}
	
	
	public boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
}
