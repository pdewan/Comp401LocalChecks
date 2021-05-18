package gradingTools.comp401f16.assignment6.testcases.iniital;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.greeting.GetterExecutionTest;

public abstract class BridgeSceneGetterReturnTestCase extends GetterExecutionTest {

	
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	protected Object create() {
		return createRootProxy();
	}


}
