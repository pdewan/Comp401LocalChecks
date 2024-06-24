package gradingTools.comp301ss21.assignment4.async;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import tags301.Comp301Tags;
import util.annotations.Explanation;
@Explanation("Start an animation of arthur and check that a new thread announces prerty changes in response")
public class AbstractionAsyncArthurAnimation extends AbstractionAsyncArthurAnimationTestCase{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}
	public AbstractionAsyncArthurAnimation() {
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
