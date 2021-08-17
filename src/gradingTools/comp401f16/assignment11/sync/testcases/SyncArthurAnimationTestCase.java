package gradingTools.comp401f16.assignment11.sync.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import grader.basics.testcase.PassFailJUnitTestCase;
import util.models.PropertyListenerRegisterer;
import util.trace.Tracer;

public class SyncArthurAnimationTestCase extends AsyncArthurAnimationTestCase {	
	protected Thread child2Thread;
	protected boolean thread2Created;
	protected boolean child1AfterChild2;
	protected static Long child2StartTime;
	protected boolean child2ExecutedForMinimumTime;
	protected static int DELAY_AFTER_CHILD2_CREATED = 1000;
	protected void initData() {		
		super.initData();
		child2Thread = null;
		thread2Created = false;
		child1AfterChild2 = false;
		child2StartTime = null;
		child2ExecutedForMinimumTime = false;
	}
	@Override
	protected synchronized void waitForThreads( ){
		super.waitForThreads();
		waitForThreadsToExecute();
//		stopThread(child2Thread);
	}
	protected synchronized void maybeKillThreads() {
		super.maybeKillThreads();
		stopThread(child2Thread);
	}	
	protected double threadCredit() {
		return 0;
	}
	protected boolean checkChildrenOrder() {
		if (child1AfterChild2) {
			assertTrue("Child 1 " + childThread + " and Child 2 " + child2Thread + " are not synchronized as their property change events are interleaved ", false);
		}
		return true;
	}	
	protected boolean checkOutput(Object aProxy) {
		fractionComplete = 0;
		if (!threadCreated) {
			assertTrue("Child thread 1 not found:", false);
		}
		if (!thread2Created) {
			assertTrue("Child thread 2 not found:", false);
		}
		maybeCheckDelay();
//		if (!foundDelay) {
//			assertTrue("No delayed events (missing sleep call?):", false);
//		}
		checkChildrenOrder();		
		return true;
	}
	protected void delayFound() {
//		Tracer.info(this,"delay found");
//		notify();
	}
	protected void executeOperations(Object aProxy) throws Exception {
		super.executeOperations(aProxy);
		super.executeOperations(aProxy);
	}
	protected void child2ExecutedForMinimumTime() {
		if (child2ExecutedForMinimumTime) return;
		Tracer.info(this,"Notifying child2 thread executed for minimun time");
		child2ExecutedForMinimumTime = true;
		notify();
	}	
	protected void child1AfterChild2() {
		if (child1AfterChild2) return;
		child1AfterChild2 = true;
		Tracer.info (this, "Child 1 notified after child 2 notified");
		notify();
	}	
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		if (!isThreadsInitialized()) {
			return;
		}
		if (!testing)
			return;
		if (isPreviousThread()) {
			Tracer.info(this,"Previous thread notified, returning at time:" +System.currentTimeMillis());
			return;
		}
		super.propertyChange(evt);
		Thread aChildThread = Thread.currentThread();
		if (currentNotifyingThreads.size() > 2 && child2Thread == null) {
			thread2Created = true;
			child2Thread = aChildThread;
			child2StartTime = System.currentTimeMillis();
			Tracer.info (this, "child 2:" + child2Thread);
		}		
		long aCurrentTime = System.currentTimeMillis();
		if (child2StartTime != null) {
			if (aChildThread == currentNotifyingThreads.get(1)) { 
				child1AfterChild2();
			}		
			if (aCurrentTime - child2StartTime > DELAY_AFTER_CHILD2_CREATED) {
				child2ExecutedForMinimumTime();
			}
		}
	}
}
