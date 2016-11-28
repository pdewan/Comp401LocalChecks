package gradingTools.comp401f16.assignment12.waitnotify.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment12.testcases.BroadcastingClearanceManagerFactoryMethodTest;
import gradingTools.comp401f16.assignment12.testcases.interfaces.BroadcastingClearanceManager;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.misc.ThreadSupport;
import util.models.PropertyListenerRegisterer;
@MaxValue(20)
@IsExtra(true)
public class LockstepAvatarsAnimationTestCase extends AsyncArthurAnimationTestCase {
	public static final int NUM_CHILD_THREADS = 2; 
	public static final int MAX_ANIMATION_TIME = 2000;
	public static final int NUM_LOCK_STEPS = 1; // should always be 1
	public static final int MAXIMUM_SLEEPS = 3;
	protected String failureMessage = "";
	protected boolean resultCorrect = true;
	protected boolean lockstepThreadStarted = false;
	Thread guardThread;
	protected long minEventDelay() {
		return 200;
	}
	public LockstepAvatarsAnimationTestCase() {
		
	}
	protected void initData() {		
		super.initData();
		resultCorrect = false;
		failureMessage = "No delayed event";
		lockstepThreadStarted = false;
		
	}
	protected void setDependentObjects() {
		super.setDependentObjects();
	}
	protected synchronized void waitForLockstepAnimation( ){
		try {
			System.out.println("Waiting for lock steps within time (ms):" + MAX_ANIMATION_TIME);
			wait(MAX_ANIMATION_TIME);
//			stopThread(childThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addPropertyChangeListeners() {
		addPropertyChangeListener(bridgeScene.getArthur(), this);
		addPropertyChangeListener(bridgeScene.getLancelot(), this);
//		addPropertyChangeListener(bridgeScene.getGalahad(), this);
//		addPropertyChangeListener(bridgeScene.getRobin(), this);
		addPropertyChangeListener(bridgeScene.getGuard(), this);
	}
	
	
	protected void checkNumThreads() {
		System.out.println ("num coordinated threads found:" + threadToSleeps.size());
		if (threadToSleeps.size() < NUM_CHILD_THREADS) {
			 resultCorrect = false;
			 failureMessage = "Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS;
			 notify();
			 assertTrue ("Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS, false);
		} else {
			failureMessage = "";
			resultCorrect = true;
		}
	}
	protected int findMaximumSleeps() {
		int result = 0;
		for (Thread aThread:threadToSleeps.keySet()) {
			 Integer aNumSleeps = threadToSleeps.get(aThread);
			 result = Math.max(result, aNumSleeps );
			 System.out.println ("Number of sleeps by thread : " + aThread + " " + aNumSleeps);
			 
		}
		System.out.println("Maximum sleeps:" + result);
		return result;
	}
	protected synchronized void checkNumThreadsWithNumSleeps(int aLimit) {
		for (Thread aThread:threadToSleeps.keySet()) {
			 Integer aNumSleeps = threadToSleeps.get(aThread);
			 System.out.println ("Number of sleeps by thread : " + aThread + " " + aNumSleeps);
			 if (Math.abs(aLimit - aNumSleeps) > 2) {
				 failureMessage = "Number of sleeps by thread:" + 
						 aThread + " " + aNumSleeps + " instead of " + aLimit;
				 resultCorrect = false;
				 notify();
				 break;
//				 assertTrue("Number of sleeps by thread:" + 
//						 aThread + " " + aNumSleeps + " instead of " + aLimit, false);
			 }
		}
//		System.out.println ("Num threads that slept:" + threadToSleeps.size());
//		if (threadToSleeps.size() < NUM_CHILD_THREADS) {
//			failureMessage = "Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS;
//			 resultCorrect = false;
////			assertTrue ("Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS, false);
//		} else {
//			resultCorrect = true;
//		}
		
	}
//	protected synchronized void waitForThreads( ){
//		waitForLockstepAnimation();
////		try {
////			long aDelay = maxDelayToCreateChildThread();
////			System.out.println("Waiting for child threads to be created within time (ms):" + aDelay);
////			wait(aDelay);
//////			stopThread(childThread);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}
	protected void doLockSteps (int aNumSteps) {
		for (int i = 0; i  < aNumSteps; i++) {
			recordPreviousThreads();
			freezeNotifications = true;
			System.out.println ("Executing animating lockstep Guard ");
			;
			commandInterpreter().lockstepGuard();
			recordCurrentThreads();
			assertNewThreadCreated();
			guardThread = newThreads.get(0);
			previousNotifyingThreads.add(guardThread);
			freezeNotifications = false;
//			waitForLockstepAnimation();
		}		
	}
	protected void executeOperations(Object aProxy) {
			fractionComplete = 0;
			recordPreviousThreads();
			System.out.println ("Animating lockstep Arthur");
			commandInterpreter().lockstepArthur();
			recordCurrentThreads();
			assertNewThreadCreated();
			recordPreviousThreads();
			System.out.println ("Animating lockstep Lancelot");
			commandInterpreter().lockstepLancelot();
			recordCurrentThreads();
			assertNewThreadCreated();
//			System.out.println ("Animating lockstep Galahad");
//			commandInterpreter().lockstepGalahad();
//			System.out.println ("Animating lockstep Robin");
//			commandInterpreter().lockstepRobin();
//			waitForThreadsToStart();
			doLockSteps(NUM_LOCK_STEPS);
//			checkOutput(rootPro)
			
//			threadToSleeps.clear();
//			System.out.println ("Executing animating lockstep Guard ");

//			commandInterpreter().lockstepGuard();
//			waitForThreadsToSleep();
//			System.out.println ("Executing animating lockstep Guard ");
//
//			commandInterpreter().lockstepGuard();
//			System.out.println ("Checking sleeps");

//			checkNumThreadsWithNumSleeps(NUM_LOCK_STEPS);

			
			
//			waitForThreads();
			
		}
	protected synchronized void waitForThreads( ){
		waitForLockstepAnimation();
//		waitForThreadsToStart();
//		stopThread(child2Thread);
	}
	protected synchronized void maybeKillThreads() {
		for (Thread aThread:currentNotifyingThreads) {
			stopThread(aThread);
		}
//		testing = false;
	}
	protected synchronized boolean checkOutput(Object aProxy) {
		checkNumThreads();
		if (threadToSleeps.size() < NUM_CHILD_THREADS) {
			failureMessage = "Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS;
			 resultCorrect = false;
			assertTrue ("Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS, false);
		} else {
			resultCorrect = true;
		}
//		checkNumThreads();
//		int aMax = findMaximumSleeps();
//		checkNumThreadsWithNumSleeps(aMax);
		return true;
	}
	protected void delayFound() {
//		checkNumThreads();
		int aMax = findMaximumSleeps();
		checkNumThreadsWithNumSleeps(aMax);
		if (aMax >= MAXIMUM_SLEEPS)
			notify();
	}
//	protected void maybeAddThread() {
//		Thread aChildThread = Thread.currentThread();
//		if (!currentThreads.contains(aChildThread)) {			
//			System.out.println("New child thread:" + aChildThread);
//			currentThreads.add(aChildThread);
//		}
//	}
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
//		System.out.println ("Locketep Thread:" + Thread.currentThread());
		if (!testing)
			return;
		if (freezeNotifications) // do not want guard notifications
			return;

//		System.out.println ("after testing");
		if (isPreviousThread()) {
			return;
		}
		
//		System.out.println ("Lockstep Thread:" + Thread.currentThread() + " " + this);

//		System.out.println ("not previous  thread");

//		super.propertyChange(evt);
		maybeAddThread();
		
	}
	protected boolean doTest() throws Throwable {
		try {
//		assertTrue("testing", false);
		boolean retVal =  super.doTest();
//		WaitingAvatarsAnimationTestCase.waitForAnimation();
		assertTrue(failureMessage,resultCorrect);
		return retVal;
		} finally {
			WaitingAvatarsAnimationTestCase.waitForAnimation();
		}
	}
 }
