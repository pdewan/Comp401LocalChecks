package gradingTools.comp301ss21.assignment4.coordination;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
import tags301.Comp301Tags;
import util.annotations.Explanation;
import util.annotations.MaxValue;

@MaxValue(30)
@Explanation("Start the waiting animations of 4 knights, execute proceed all, and see if we subsequently get events from all four anumations")
public class AbstractionWaitingAvatars extends AbstractionWaitingAvatarsAnimationTestCase {
	String[] factoryClassTags = new String[] { Comp301Tags.FACTORY_CLASS };
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	protected final Class[] PRECEDING_TESTS = { BroadcastingClearanceManagerSingletonFromFactory.class,
	};
	public AbstractionWaitingAvatars() {
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
	protected void doWaitingArthur() {
		bridgeScene.waitingArthur();
	}
	protected void doWaitingLancelot() {
		bridgeScene.waitingLancelot();
	}
	protected void doWaitingGalahad() {
		bridgeScene.waitingGalahad();
	}
	protected void doWaitingRobin() {
		bridgeScene.waitingRobin();
	}
}
