package gradingTools.comp401f16.assignment6.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;

public class GuardAreaReturnedTestCase extends BridgeSceneGetterReturnTestCase {

	@Override
	protected String propertyName() {
		return "GuardArea";
	}

	@Override
	protected Class expectedClass() {
		return Object.class;
	}
	


}
