package gradingTools.comp401f16.assignment9.testcases.factory;

import java.beans.PropertyChangeListener;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestBridgeSceneController;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestObservableBridgeScenePainter;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class ObservableBridgeScenePainterFactoryMethodTest extends  FactoryMethodTest{
	public static final String[] FACTORY_METHOD_TAGS = 
			new String[] {"observableBridgeScenePainterFactoryMethod"};

	public ObservableBridgeScenePainterFactoryMethodTest() {
//		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
		factoryMethodTags = FACTORY_METHOD_TAGS;
	}
	protected boolean tryConstructor() {
		return false;
	}
	@Override
	protected Class proxyClass() {
		return TestObservableBridgeScenePainter.class;
	}
	
	protected TestObservableBridgeScenePainter observableBriScenePainter() {
		return (TestObservableBridgeScenePainter) rootProxy;
	}
	
	
	public boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
}
