package gradingTools.comp301ss21.assignment3.controller;

import gradingTools.comp301ss21.assignment3.delegating_view.TaggedDelegatingView;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.ArthurBridgeSceneControllerTestCase;
import tags301.Comp301Tags;
import util.annotations.Explanation;
import util.annotations.MaxValue;
@MaxValue(10)
@Explanation("The test notes the position of the X coordinate of the left arm, calls move(), then simulates a key click, and checks if the x coordinate is restored")
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
