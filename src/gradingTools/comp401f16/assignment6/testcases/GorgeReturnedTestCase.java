package gradingTools.comp401f16.assignment6.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;

public class GorgeReturnedTestCase extends BridgeSceneGetterReturnTestCase {

	@Override
	protected String propertyName() {
		return "Gorge";
	}

	@Override
	protected Class expectedClass() {
		return Object.class;
	}
	


}
