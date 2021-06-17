package gradingTools.comp301ss21.assignment4.sync;

import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncGalahadAnimationTestCase;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncRobinAnimationTestCase;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncRobinAnimationTestCase;
import tags301.Comp301Tags;

public class SyncRobinAnimation extends SyncRobinAnimationTestCase{
	String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	public SyncRobinAnimation() {
		
	}
}
