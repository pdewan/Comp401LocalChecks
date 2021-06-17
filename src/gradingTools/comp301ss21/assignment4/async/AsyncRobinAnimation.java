package gradingTools.comp301ss21.assignment4.async;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncGalahadAnimationTestCase;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncRobinAnimationTestCase;
import tags301.Comp301Tags;

public class AsyncRobinAnimation extends AsyncRobinAnimationTestCase{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	public AsyncRobinAnimation() {
		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};

	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	@Override
	protected void doAsynchronousRobin() {
		bridgeScene.asynchronousRobin();
//		doAsynchronousArthur();
	}
}
