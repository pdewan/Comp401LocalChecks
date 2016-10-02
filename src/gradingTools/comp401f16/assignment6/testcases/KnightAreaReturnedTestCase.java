package gradingTools.comp401f16.assignment6.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;

public class KnightAreaReturnedTestCase extends BridgeSceneGetterReturnTestCase {

	@Override
	protected String propertyName() {
		return "KnightArea";
	}

	@Override
	protected Class expectedClass() {
		return Object.class;
	}
	


}
