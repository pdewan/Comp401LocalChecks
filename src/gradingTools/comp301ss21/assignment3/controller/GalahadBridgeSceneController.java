package gradingTools.comp301ss21.assignment3.controller;

import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.ArthurBridgeSceneControllerTestCase;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.GalahadBridgeSceneControllerTestCase;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(10)
public class GalahadBridgeSceneController extends GalahadBridgeSceneControllerTestCase {
	protected String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	@Override
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	protected final Class[] PRECEDING_TESTS = {
			SceneControllerAccessesGalahad.class,
			
	};
	@Override
	protected Class[] precedingTests() {
			return PRECEDING_TESTS;
	}

}
