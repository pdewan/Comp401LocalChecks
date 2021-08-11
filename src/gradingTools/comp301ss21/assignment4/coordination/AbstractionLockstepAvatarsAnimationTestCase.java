package gradingTools.comp301ss21.assignment4.coordination;

import gradingTools.comp301ss21.assignment4.async.AbstractionAsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment12.testcases.BroadcastingClearanceManagerFactoryMethodTest;
import gradingTools.comp401f16.assignment12.testcases.interfaces.BroadcastingClearanceManager;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.concurrency.propertyChanges.ConcurrentEventUtility;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import grader.basics.testcase.PassFailJUnitTestCase;
//import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.misc.ThreadSupport;
import util.models.PropertyListenerRegisterer;
import util.trace.Tracer;
@MaxValue(20)
@IsExtra(true)
public class AbstractionLockstepAvatarsAnimationTestCase extends AbstractionAsyncArthurAnimationTestCase {
	public static final int NUM_CHILD_THREADS = 3; 
	public static final int MAX_TIME_FOR_ANIMATION = 2000;
	public static final int NUM_LOCK_STEPS = 1; // should always be 1
	public static final int MAXIMUM_SLEEPS = 3;
	protected String failureMessage = "";
	protected boolean resultCorrect = true;
	protected boolean lockstepThreadStarted = false;
	Thread guardThread, arthurThread, lancelotThread;
	protected long minEventDelay() {
		return 200;
	}
	public AbstractionLockstepAvatarsAnimationTestCase() {
		
	}

    public static  String[][] expectedSequences = {
    		{"To be filled with guard thread name", ".*", ".*", ".*", ".*"},
    		{"To be filled with arthur or lancelot guard name", ".*", ".*", ".*", ".*"},
    		{"To be filled with arthur or lancelot guard name", ".*", ".*", ".*", ".*"}
    };
    
    public  void fillExpectedSequences() {
    	expectedSequences[0][0] = guardThread.getName();
    	expectedSequences[1][0] = arthurThread.getName() + "|" + lancelotThread.getName();
    	expectedSequences[2][0] = expectedSequences[1][0];
    }
    
	@Override
	protected void initData() {		
		super.initData();
		resultCorrect = false;
		failureMessage = "No delayed event";
		lockstepThreadStarted = false;
		
	}
	protected void setDependentObjects() {
		super.setDependentObjects();
	}
	
	protected long selectorBasedWaitDelay() {
		return  maxTimeForAnimatingThread();
	}
	
	protected long maxTimeForAnimatingThread() {
		return MAX_TIME_FOR_ANIMATION;
	}
	protected int minThreads() {
		return NUM_CHILD_THREADS;
	}
//	protected long selectorBasedWaitDelay() {
//		
//		return  maxTimeForAnimatingThread();
//	}
	protected synchronized void waitForLockstepAnimation( ){
		try {
			Tracer.info(this,"Waiting for lock steps within time (ms):" + MAX_TIME_FOR_ANIMATION);
			wait(MAX_TIME_FOR_ANIMATION);
//			stopThread(childThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addPropertyChangeListeners() {
		addPropertyChangeListener(bridgeScene.getArthur(), concurrentPropertyChangeSupport);
		addPropertyChangeListener(bridgeScene.getLancelot(), concurrentPropertyChangeSupport);
//		addPropertyChangeListener(bridgeScene.getGalahad(), this);
//		addPropertyChangeListener(bridgeScene.getRobin(), this);
		addPropertyChangeListener(bridgeScene.getGuard(), concurrentPropertyChangeSupport);
	}
	
	
	protected void checkNumThreads() {
		Thread[] aNewNotifyingThreads = concurrentPropertyChangeSupport.getNotifyingNewThreads();
		int aNumThreads = aNewNotifyingThreads.length;
		Tracer.info(this,"num coordinating/coordinated threads found:" + aNumThreads);
		
		if (aNumThreads < NUM_CHILD_THREADS) {
			 resultCorrect = false;
			 failureMessage = "Number of coordinating/coordinated threads: " + aNumThreads+ " instead of " + NUM_CHILD_THREADS;

//			 failureMessage = "Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS;
//			 notify(); // why notify?
			 assertTrue (failureMessage, false);

//			 assertTrue ("Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS, false);
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
			 Tracer.info(this,"Number of waits by thread : " + aThread + " " + aNumSleeps);

//			 Tracer.info(this,"Number of sleeps by thread : " + aThread + " " + aNumSleeps);
			 
		}
//		Tracer.info(this,"Maximum sleeps:" + result);
		Tracer.info(this,"Maximum waits:" + result);

		return result;
	}
	protected synchronized void checkNumThreadsWithNumSleeps(int aLimit) {
		for (Thread aThread:threadToSleeps.keySet()) {
			 Integer aNumSleeps = threadToSleeps.get(aThread);
//			 Tracer.info(this,"Number of sleeps by thread : " + aThread + " " + aNumSleeps);
			 Tracer.info(this,"Number of waits by thread : " + aThread + " " + aNumSleeps);

			 
			 if (Math.abs(aLimit - aNumSleeps) > 2) {
//				 failureMessage = "Number of sleeps by thread:" + 
//						 aThread + " " + aNumSleeps + " instead of " + aLimit;
				 failureMessage = "Number of waits by thread:" + 
						 aThread + " " + aNumSleeps + " instead of " + aLimit;
				 resultCorrect = false;
				 notify();
				 break;
//				 assertTrue("Number of sleeps by thread:" + 
//						 aThread + " " + aNumSleeps + " instead of " + aLimit, false);
			 }
		}
//		Tracer.info(this,"Num threads that slept:" + threadToSleeps.size());
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
////			Tracer.info(this,"Waiting for child threads to be created within time (ms):" + aDelay);
////			wait(aDelay);
//////			stopThread(childThread);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	}
	
	protected void doLockstepGuard() {
		commandInterpreter().lockstepGuard();
	}

	protected void doLockstepArthur() {
		commandInterpreter().lockstepArthur();
	}
	protected void doLockstepLancelot() {
		commandInterpreter().lockstepLancelot();
	}
	public static long INITIAL_GUARD_NOTIFICATION_TIME = 500;
	// arg will always be 1, why have this arg?
	protected void doLockSteps (int aNumSteps) {
		
		for (int i = 0; i  < aNumSteps; i++) {
//			recordPreviousThreads();
			Set<Thread> aCurrentThreads = ConcurrentEventUtility.getCurrentThreads();
//			concurrentPropertyChangeSupport.setEventsFrozen(true); // not sure why this is done
//			freezeNotifications = true;
			Tracer.info(this,"Executing animating lockstep Guard ");
			doLockstepGuard();
			waitForChildrenThreadsToBeCreated(1);
			assertNewThreadsCreated(aCurrentThreads, 1);
			guardThread = ConcurrentEventUtility.getFirstNewThread(aCurrentThreads);
			
//			commandInterpreter().lockstepGuard();
//			recordCurrentThreads();
//			assertNewThreadCreated();
//			guardThread = newThreads.get(0);
//			Set<Thread> aNewThreads = ConcurrentEventUtility.newThreads(aCurrentThreads);
//			guardThread = aNewThreads.iterator().next();
//			previousNotifyingThreads.add(guardThread);
//			Tracer.info(this, "waiting for guard to send initial notifications " + INITIAL_GUARD_NOTIFICATION_TIME );
//			ThreadSupport.sleep(INITIAL_GUARD_NOTIFICATION_TIME);
//			concurrentPropertyChangeSupport.setEventsFrozen(false);

//			freezeNotifications = false;
//			waitForLockstepAnimation();
		}		
	}
	
	protected void executeOperations(Object aProxy) {
			fractionComplete = 0;
			concurrentPropertyChangeSupport.setEventsFrozen(true); // not interested in initial events
//			recordPreviousThreads();
			Set<Thread> aCurrentThreads = ConcurrentEventUtility.getCurrentThreads();
			Tracer.info(this,"Animating lockstep Arthur");
			doLockstepArthur();
//			long aDelay = maxDelayToCreateChildThread();
			waitForChildrenThreadsToBeCreated(1);
			assertNewThreadsCreated(aCurrentThreads, 1);
			arthurThread =  ConcurrentEventUtility.getFirstNewThread(aCurrentThreads);

//			commandInterpreter().lockstepArthur();
//			recordCurrentThreads();
//			assertNewThreadCreated();
//			recordPreviousThreads();
			aCurrentThreads = ConcurrentEventUtility.getCurrentThreads();

			Tracer.info(this,"Animating lockstep Lancelot");
//			commandInterpreter().lockstepLancelot();
			doLockstepLancelot();
			waitForChildrenThreadsToBeCreated(1);
			assertNewThreadsCreated(aCurrentThreads, 1);
			lancelotThread =  ConcurrentEventUtility.getFirstNewThread(aCurrentThreads);

//			Thread[] aNotifyingThreads = concurrentPropertyChangeSupport.getNotifyingNewThreads();
//			if (aNotifyingThreads.length > 0) {	
//				
//				assertTrue("Threads " + Arrays.toString(aNotifyingThreads) + "  notified before lockstep guard was created", false);				
//			}

//			recordCurrentThreads();
//			assertNewThreadCreated();
//			Tracer.info(this,"Animating lockstep Galahad");
//			commandInterpreter().lockstepGalahad();
//			Tracer.info(this,"Animating lockstep Robin");
//			commandInterpreter().lockstepRobin();
//			waitForThreadsToStart();
			concurrentPropertyChangeSupport.setEventsFrozen(false); // now guard should lead
			doLockSteps(NUM_LOCK_STEPS);

//			checkOutput(rootPro)
			
//			threadToSleeps.clear();
//			Tracer.info(this,"Executing animating lockstep Guard ");

//			commandInterpreter().lockstepGuard();
//			waitForThreadsToSleep();
//			Tracer.info(this,"Executing animating lockstep Guard ");
//
//			commandInterpreter().lockstepGuard();
//			Tracer.info(this,"Checking sleeps");

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
	
	protected boolean checkConcurrentPropertyChanges() {
		checkNumThreads();
		checkSelectorSuccessful();
		fillExpectedSequences();
		int aNumMatches = ConcurrentEventUtility.numMatches(concurrentPropertyChanges, expectedSequences);
		return aNumMatches >= minEvents();
	}
//	protected synchronized boolean checkOutput(Object aProxy) {
//		super.checkOutput(aProxy);
//		checkNumThreads();
//		if (threadToSleeps.size() < NUM_CHILD_THREADS) {
////			failureMessage = "Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS;
//			failureMessage = "Number of coordinated threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS;
//
//			resultCorrect = false;
//			assertTrue (failureMessage, false);
//
////			assertTrue ("Number of sleping threads: " + threadToSleeps.size() + " instead of " + NUM_CHILD_THREADS, false);
//		} else {
//			resultCorrect = true;
//		}
////		checkNumThreads();
////		int aMax = findMaximumSleeps();
////		checkNumThreadsWithNumSleeps(aMax);
//		return true;
//	}
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
//			Tracer.info(this,"New child thread:" + aChildThread);
//			currentThreads.add(aChildThread);
//		}
//	}
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
//		Tracer.info(this,"Locketep Thread:" + Thread.currentThread());
		if (!testing)
			return;
		if (freezeNotifications) // do not want guard notifications
			return;

//		Tracer.info(this,"after testing");
		if (isPreviousThread()) {
			return;
		}
		
//		Tracer.info(this,"Lockstep Thread:" + Thread.currentThread() + " " + this);

//		Tracer.info(this,"not previous  thread");

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
