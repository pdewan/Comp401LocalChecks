package gradingTools.comp401f16.assignment9.testcases.factory;

import java.beans.PropertyChangeListener;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestDelegatingBridgeSceneView;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class DelegatingBridgeSceneViewFactoryMethodTest extends  FactoryMethodTest{
	public static final String[] FACTORY_METHOD_TAGS = 
			new String[] {"delegatingBridgeSceneViewFactoryMethod"};

	public DelegatingBridgeSceneViewFactoryMethodTest() {
//		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;
	}
	protected boolean tryConstructor() {
		return false;
	}
	@Override
	protected Class proxyClass() {
		return TestDelegatingBridgeSceneView.class;
	}
	
	protected Object delegatingBridgeSceneView() {
		return rootProxy;
	}
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
}
