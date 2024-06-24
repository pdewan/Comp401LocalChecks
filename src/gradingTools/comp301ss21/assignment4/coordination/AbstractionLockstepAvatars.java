package gradingTools.comp301ss21.assignment4.coordination;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.LockstepAvatarsAnimationTestCase;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
import tags301.Comp301Tags;
import util.annotations.Explanation;
import util.annotations.MaxValue;

@MaxValue(30)
@Explanation("Start the animation of af Arthur, Lancelot and guard in that order. \n After the guard is started, wait for property change events from all three avatars to be spaced appropriately in time to show that Arthur and Lancelot are moving to the beat set by the guard")
public class AbstractionLockstepAvatars extends AbstractionLockstepAvatarsAnimationTestCase {
	String[] factoryClassTags = new String[] { Comp301Tags.FACTORY_CLASS };
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	protected final Class[] PRECEDING_TESTS = { BroadcastingClearanceManagerSingletonFromFactory.class,

	};
	public AbstractionLockstepAvatars() {
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
