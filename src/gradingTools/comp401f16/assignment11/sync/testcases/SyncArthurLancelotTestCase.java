package gradingTools.comp401f16.assignment11.sync.testcases;

import util.trace.Tracer;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;

public class SyncArthurLancelotTestCase extends SyncArthurAnimationTestCase{
	protected void executeOperations(Object aProxy) {
		recordPreviousThreads();
		Tracer.info(this,"Animating arthur");
		commandInterpreter().asynchronousArthur();
		recordCurrentThreads();
		assertNewThreadCreated();
		recordPreviousThreads();
		Tracer.info(this,"Animating lancelot");
		commandInterpreter().asynchronousLancelot();
		recordCurrentThreads();
		assertNewThreadCreated();
	}
	protected void maybeCheckDelay() {
//		if (!foundDelay) {
//			assertTrue("No delayed events (missing sleep call?):", false);
//		}
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
