package gradingTools.comp301ss21.assignment4.sync;

import java.beans.PropertyChangeEvent;
import java.util.Arrays;

import grader.basics.concurrency.propertyChanges.ConcurrentEventUtility;
import grader.basics.concurrency.propertyChanges.ConcurrentPropertyChangeSupport;
import grader.basics.concurrency.propertyChanges.ConcurrentPropertyChangeThreadMatchesSelector;
import grader.basics.concurrency.propertyChanges.Selector;
import gradingTools.comp301ss21.assignment4.async.AbstractionAsyncArthurAnimationTestCase;
import util.trace.Tracer;

public class AbstractionSyncArthurAnimationTestCase extends AbstractionAsyncArthurAnimationTestCase {
	protected long selectorBasedWaitDelay() {		
		return maxDelayToCreateChildThread() + maxTimeForAnimatingThread();
	}
	protected int minThreads() {
		return 2;
	}
	protected Selector<ConcurrentPropertyChangeSupport> waitSelector() {
		return new ConcurrentPropertyChangeThreadMatchesSelector(null, minThreads(), minEvents(), null, minEventDelay());
	}
	protected double threadCredit() {
		return 0;
	}
	protected boolean checkChildrenOrder() {
		boolean aSomeIntervealing = ConcurrentEventUtility.someInterleaving(concurrentPropertyChanges, null, null);
		if (aSomeIntervealing) {
			assertTrue("The two animating threads interleaved their execution and  not synchronized as their property change events are interleaved ", false);
		}
		return true;
	}
	protected boolean checkConcurrentPropertyChanges() {
		Thread[] aNotifyingThreads = concurrentPropertyChangeSupport.getNotifyingNewThreads();
		Tracer.info(this + "notifying new threads:" + Arrays.toString(aNotifyingThreads));
		int aNumThreads = aNotifyingThreads.length;		

//		int aNumThreads = concurrentPropertyChangeSupport.getNotifyingNewThreads().length;		
		if (aNumThreads == 0) {
			assertTrue("Two invocations of synchronized animations created no thread rather than two:", false);
		}
		if (aNumThreads == 1) {
			assertTrue("\"Two invocations of synchronized animations created one thread rather than two::", false);
		}
		checkSelectorSuccessful();		
		checkChildrenOrder();		
		return true;
	}
	protected void executeOperations(Object aProxy) throws Exception {
		super.executeOperations(aProxy);
		super.executeOperations(aProxy);
	}	
//	protected Thread child2Thread;
//	protected boolean thread2Created;
//	protected boolean child1AfterChild2;
//	protected static Long child2StartTime;
//	protected boolean child2ExecutedForMinimumTime;
//	protected static int DELAY_AFTER_CHILD2_CREATED = 1000;
	
//	protected void child2ExecutedForMinimumTime() {
//		if (child2ExecutedForMinimumTime) return;
//		Tracer.info(this,"Notifying child2 thread executed for minimum time");
//		child2ExecutedForMinimumTime = true;
//		notify();
//	}
//	
//	protected void child1AfterChild2() {
//		if (child1AfterChild2) return;
//		child1AfterChild2 = true;
//		Tracer.info (this, "Child 1 notified after child 2 notified");
//		notify();
//	}	
	
//	@Override
//	public synchronized void propertyChange(PropertyChangeEvent evt) {
//		if (!isThreadsInitialized()) {
//			return;
//		}
//		if (!testing)
//			return;
//		if (isPreviousThread()) {
//			Tracer.info(this,"Previous thread notified, returning at time:" +System.currentTimeMillis());
//			return;
//		}
//		super.propertyChange(evt);
//		Thread aChildThread = Thread.currentThread();
//		if (currentNotifyingThreads.size() > 2 && child2Thread == null) {
//			thread2Created = true;
//			child2Thread = aChildThread;
//			child2StartTime = System.currentTimeMillis();
//			Tracer.info (this, "child 2:" + child2Thread);
//
//		}		
//		long aCurrentTime = System.currentTimeMillis();
//		if (child2StartTime != null) {
//			if (aChildThread == currentNotifyingThreads.get(1)) { 
//				child1AfterChild2();
//			}
//		
//			if (aCurrentTime - child2StartTime > DELAY_AFTER_CHILD2_CREATED) {
//				child2ExecutedForMinimumTime();
//			}
//		}
//	}
//	protected boolean checkOutput(Object aProxy) {
//	
//	fractionComplete = 0;
//	if (!threadCreated) {
//		assertTrue("Child thread 1 not found:", false);
//	}
//	if (!thread2Created) {
//		assertTrue("Child thread 2 not found:", false);
//	}
//	maybeCheckDelay();
////	if (!foundDelay) {
////		assertTrue("No delayed events (missing sleep call?):", false);
////	}
//	checkChildrenOrder();
//	
//	return true;
//}
//	protected void delayFound() {
//		Tracer.info(this,"delay found");
//		notify();
//	}
//	protected synchronized void waitForThreadsToExecute( ){
//	try {
//		long aDelay = maxTimeForAnimatingThread();
//		Tracer.info(this,"Waiting for child thread to finish amimation in(ms):" + aDelay);
//		wait(aDelay);
////		stopThread(childThread);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//}
//protected synchronized void maybeKillThreads() {
//	super.maybeKillThreads();
//	stopThread(child2Thread);
//}
//	protected void initData() {		
//		super.initData();
//		child2Thread = null;
//		thread2Created = false;
//		child1AfterChild2 = false;
//		child2StartTime = null;
//		child2ExecutedForMinimumTime = false;
//	}
}
