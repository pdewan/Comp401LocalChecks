package gradingTools.comp301ss21.assignment3.controller;

import gradingTools.comp301ss21.assignment3.delegating_view.TaggedDelegatingView;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.ArthurBridgeSceneControllerTestCase;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(10)
public class ArthurBridgeSceneController extends ArthurBridgeSceneControllerTestCase {
	protected String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	@Override
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	protected final Class[] PRECEDING_TESTS = {
			SceneControllerAccessesArthur.class,
			
	};
	@Override
	protected Class[] precedingTests() {
			return PRECEDING_TESTS;
	}
}
