package gradingTools.comp301ss21.assignment4.coordination;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.LockstepAvatarsAnimationTestCase;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
import tags301.Comp301Tags;
import util.annotations.MaxValue;

@MaxValue(30)
public class LockstepAvatars extends LockstepAvatarsAnimationTestCase {
	String[] factoryClassTags = new String[] { Comp301Tags.FACTORY_CLASS };

	protected String[] factoryClassTags() {
		return factoryClassTags;
	}

	protected final Class[] PRECEDING_TESTS = { BroadcastingClearanceManagerSingletonFromFactory.class,

	};
	public LockstepAvatars() {
		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}

	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	protected void doLockstepGuard() {
		bridgeScene.lockstepGuard();
	}

	protected void doLockstepArthur() {
		bridgeScene.lockstepArthur();
	}
	protected void doLockstepLancelot() {
		bridgeScene.lockstepLancelot();
	}
}
