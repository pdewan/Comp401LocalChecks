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

import util.models.PropertyListenerRegisterer;

public class SyncArthurAnimationTestCase extends AsyncArthurAnimationTestCase {
	
	protected Thread child2Thread;
	protected boolean thread2Created;
	protected boolean child1AfterChild2;
	protected static Long child2StartTime;
	protected static int DELAY_AFTER_CHILD2_CREATED = 1000;
	protected void initData() {		
		super.initData();
		child2Thread = null;
		thread2Created = false;
		child1AfterChild2 = false;
		child2StartTime = null;
	}
//	protected long maxDelay() {
//		return MAX_DELAY;
//	}
	protected synchronized void waitForChildThread( ){
		super.waitForChildThread();
		stopThread(child2Thread);
	}
	
	protected double threadCredit() {
		return 0;
	}
	protected boolean checkChildrenOrder() {
		if (child1AfterChild2) {
			assertTrue("Child 1 and Child 2 are not synchronized ", false);
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
		checkChildrenOrder();
		
		return true;
	}
	protected void delayFound() {
		System.out.println("delay found");

//		notify();
	}
	protected void executeOperations(Object aProxy) {
		super.executeOperations(aProxy);
		super.executeOperations(aProxy);
	}
	protected void child2ExecutedForMinimumTime() {
		System.out.println("Notifying child2 executed for minimun time");

		notify();
	}
	
	protected void child1AfterChild2() {
		child1AfterChild2 = true;
		System.out.println ("notifying child 1 after child 2");
		notify();
	}
	
	
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		super.propertyChange(evt);
		Thread aChildThread = Thread.currentThread();
		if (aChildThread != parentThread && childThread != aChildThread && child2Thread == null) {
			thread2Created = true;
			child2Thread = aChildThread;
			child2StartTime = System.currentTimeMillis();
			System.out.println ("child 2:" + child2Thread);

		}
		
		long aCurrentTime = System.currentTimeMillis();
		if (child2StartTime != null) {
			if (aChildThread == childThread) { 
				child1AfterChild2();
			}
		
			if (aCurrentTime - child2StartTime > DELAY_AFTER_CHILD2_CREATED) {
				child2ExecutedForMinimumTime();
			}
		}
		
		
		
	}

}
