package gradingTools.comp401f16.assignment7.testcases.factory;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class BridgeSceneFactoryMethodTest extends  FactoryMethodTest{
	
	public BridgeSceneFactoryMethodTest() {
		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	
	protected TestBridgeScene bridgeScene() {
		return (TestBridgeScene) rootProxy;
	}
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
}
