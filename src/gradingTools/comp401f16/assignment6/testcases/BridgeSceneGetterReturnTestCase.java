package gradingTools.comp401f16.assignment6.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;

public abstract class BridgeSceneGetterReturnTestCase extends GetterExecutionTest {

	
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	protected Object create() {
		return createOrGetLastRootProxy();
	}


}
