package gradingTools.comp301ss21.assignment4.sync;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncGalahadAnimationTestCase;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncLancelotAnimationTestCase;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncLancelotAnimationTestCase;
import tags301.Comp301Tags;

public class SyncLancelotAnimation extends SyncLancelotAnimationTestCase{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	public SyncLancelotAnimation() {
		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};

	}
//	public AsyncLancelotAnimation() {
//		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
//
//	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	@Override
	protected void doAsynchronousLancelot() {
		bridgeScene.asynchronousLancelot();
//		doAsynchronousArthur();
	}
}
