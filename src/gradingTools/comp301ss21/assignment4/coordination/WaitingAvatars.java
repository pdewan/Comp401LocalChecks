package gradingTools.comp301ss21.assignment4.coordination;

import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
import tags301.Comp301Tags;
import util.annotations.MaxValue;

@MaxValue(30)
public class WaitingAvatars extends WaitingAvatarsAnimationTestCase {
	String[] factoryClassTags = new String[] { Comp301Tags.FACTORY_CLASS };

	protected String[] factoryClassTags() {
		return factoryClassTags;
	}

	protected final Class[] PRECEDING_TESTS = { BroadcastingClearanceManagerSingletonFromFactory.class,

	};

	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
}
