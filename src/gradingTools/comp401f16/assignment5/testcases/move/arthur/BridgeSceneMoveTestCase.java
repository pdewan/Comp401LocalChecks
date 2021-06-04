package gradingTools.comp401f16.assignment5.testcases.move.arthur;

import org.junit.Test;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.ScalableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public abstract class BridgeSceneMoveTestCase extends MovableTest {
	protected TestBridgeScene bridgeScene;
	protected final String[] bridgeSceneClassTags = {"BridgeScene"};
	protected final String[] bridgeSceneFactoryMethodTags = {"bridgeSceneFactoryMethod"};
	protected TestBridgeScene bridgeScene() {
//		return (TestBridgeScene) rootProxy;
		if (bridgeScene == null)
			bridgeScene = (TestBridgeScene) rootProxy;
		return bridgeScene;
	}
	@Override
	protected Object create() {
		Object retVal = super.create();
		bridgeScene = (TestBridgeScene) rootProxy;
		return retVal;
	}
	protected TestBridgeScene getBridgeSceneFromFactory() {
		Object retVal = 
		getObjectFromFactory(factoryClassTags,
				bridgeSceneFactoryMethodTags, TestBridgeScene.class);
		assertTrue(factoryMessage, factoryMessage.isEmpty());
		return (TestBridgeScene)
				retVal;
//		return bridgeScene;
	}
	protected void setBridgeSceneFromFactoryMethod() {
//		Object retVal = 
//		getObjectFromFactory(factoryClassTags,
//				bridgeSceneFactoryMethodTags, TestBridgeScene.class);
//		assertTrue(factoryMessage, factoryMessage.isEmpty());
//		bridgeScene = (TestBridgeScene)
//				retVal;
		bridgeScene = getBridgeSceneFromFactory();
		setLeafProxy();
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	
}
