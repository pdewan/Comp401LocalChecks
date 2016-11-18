package gradingTools.comp401f16.assignment11.sync.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;

public class SyncArthurLancelotTestCase extends SyncArthurAnimationTestCase{
	protected void executeOperations(Object aProxy) {
		System.out.println ("Animating arthur");
		commandInterpreter().animateArthur();
		System.out.println ("Animating lancelot");
		commandInterpreter().animateLancelot();
	}
	protected TestAvatar avatar2() {
		return bridgeScene.getLancelot();
	}
	public void addPropertyChangeListeners() {
		super.addPropertyChangeListeners();
		addPropertyChangeListener(avatar2(), this);

	}
	protected boolean checkChildrenOrder() {
		if (!child1AfterChild2) {
			assertTrue("Child 1 and Child 2 are synchronized ", false);
		}
		return true;
	}
}
