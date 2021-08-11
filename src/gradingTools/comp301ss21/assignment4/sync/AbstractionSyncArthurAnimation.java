package gradingTools.comp301ss21.assignment4.sync;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncArthurAnimationTestCase;
import tags301.Comp301Tags;

public class AbstractionSyncArthurAnimation extends AbstractionSyncArthurAnimationTestCase{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	public AbstractionSyncArthurAnimation() {
		factoryMethodTags = new String[] {"bridgeSceneFactoryMethod"};
	}
	
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	protected void doAsynchronousArthur() {
		bridgeScene.asynchronousArthur();
//		doAsynchronousArthur();
	}
}
