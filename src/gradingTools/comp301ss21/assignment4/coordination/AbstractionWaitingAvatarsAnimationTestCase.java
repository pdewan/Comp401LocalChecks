package gradingTools.comp301ss21.assignment4.coordination;

import gradingTools.comp301ss21.assignment4.async.AbstractionAsyncArthurAnimationTestCase;
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
import gradingTools.shared.testcases.concurrency.propertyChanges.ConcurrentEventUtility;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.Set;

import util.annotations.MaxValue;
import util.misc.ThreadSupport;
import util.models.PropertyListenerRegisterer;
import util.trace.Tracer;
@MaxValue(20)
public class AbstractionWaitingAvatarsAnimationTestCase extends AbstractionAsyncArthurAnimationTestCase {
	public static final int NUM_CHILD_THREADS = 4; // including parent thread
	public static final double PROCEED_CREDIT = 0.5;
	BroadcastingClearanceManager broadcastingClearanceManager;
	public AbstractionWaitingAvatarsAnimationTestCase() {
		Tracer.info(this,"Wating Avatars case created:" + this);
	}
	protected void createClearanceManager() {
		broadcastingClearanceManager = (BroadcastingClearanceManager) getObjectFromFactory(
				factoryClassTags(), 
				BroadcastingClearanceManagerFactoryMethodTest.FACTORY_METHOD_TAGS, 
				BroadcastingClearanceManager.class);
		if (broadcastingClearanceManager == null) {
			assertTrue("Could not create clearance manager", false);
		}
	}
	@Override
	protected Object create() {
		broadcastingClearanceManager = null; // why do this?
		return super.create();
	}
	protected void setDependentObjects() {
		super.setDependentObjects();
		createClearanceManager();		
	}
	public void addPropertyChangeListeners() {
		addPropertyChangeListener(bridgeScene.getArthur(), concurrentPropertyChangeSupport);
		addPropertyChangeListener(bridgeScene.getLancelot(), concurrentPropertyChangeSupport);
		addPropertyChangeListener(bridgeScene.getGalahad(), concurrentPropertyChangeSupport);
		addPropertyChangeListener(bridgeScene.getRobin(), concurrentPropertyChangeSupport);
	}	
	protected void doProceedAll() throws Exception {
		Tracer.info(this,"Executing proceedAll on broadcasting clearance manager at time:" + System.currentTimeMillis());
		broadcastingClearanceManager.proceedAll();
	}
	protected void doWaitingArthur() {
		commandInterpreter().waitingArthur();
	}
	protected void doWaitingLancelot() {
		commandInterpreter().waitingLancelot();
	}
	protected void doWaitingGalahad() {
		commandInterpreter().waitingGalahad();
	}
	protected void doWaitingRobin() {
		commandInterpreter().waitingRobin();
	}	
	protected synchronized void executeOperations(Object aProxy) throws Exception {
			Set<Thread> aCurrentThreads = ConcurrentEventUtility.getCurrentThreads();
			fractionComplete = 0;
			Tracer.info(this,"Animating waiting Arthur at time:" + System.currentTimeMillis());
			doWaitingArthur();
			Tracer.info(this,"Animating waiting Lancelot"+ System.currentTimeMillis());
			doWaitingLancelot();
			Tracer.info(this,"Animating waiting Galahad"+ System.currentTimeMillis());
			doWaitingGalahad();
			Tracer.info(this,"Animating waiting Robin"+ System.currentTimeMillis());
			doWaitingRobin();
			waitForChildrenThreadsToBeCreated(NUM_CHILD_THREADS);
			assertNewThreadsCreated(aCurrentThreads, NUM_CHILD_THREADS);
			Thread[] aNotifyingThreads = concurrentPropertyChangeSupport.getNotifyingNewThreads();
			if (aNotifyingThreads.length > 0) {				
				assertTrue("Threads " + Arrays.toString(aNotifyingThreads) + "  notified before proceedAll was executed", false);				
			}
			doProceedAll();
		}
	protected long selectorBasedWaitDelay() {		
		return  maxTimeForAnimatingThread();
	}
	protected int minThreads() {
		return NUM_CHILD_THREADS;
	}	
	protected synchronized void maybeKillThreads() {
//		for (Thread aThread:currentNotifyingThreads) {
//			stopThread(aThread);
//		}
	}
	@Override
	protected synchronized boolean checkConcurrentPropertyChanges() {
		Thread[] aNotifyingThreads = concurrentPropertyChangeSupport.getNotifyingThreads();
		int aNumThreads = aNotifyingThreads.length;
		Tracer.info(this,"Number of notifying threads after proceedAll " + 
		aNumThreads);
		if (aNumThreads == 0 ) {
			assertTrue("No thread notified after proceedAll", false);	
		} else if (aNotifyingThreads.length < NUM_CHILD_THREADS) {
			assertTrue("Threads notified after proceedAll;" + aNumThreads + " " +
					aNotifyingThreads.length + " expected threads:" + NUM_CHILD_THREADS, false);
		}
		checkSelectorSuccessful();
		return true;
	}
	// overriding parent class method
//	protected void delayFound() {
//	}
//	@Override
//	public synchronized void propertyChange(PropertyChangeEvent evt) {
//		if (!testing) {
////			Tracer.info(this,"Not testing:" + this);
//			return;
//		}
//		if (isPreviousThread()) {
//			Tracer.info(this,"Previous thread, ignoring notification:"+ Thread.currentThread());
//			return;
//		}
//		maybeAddThread();
//		
//		Thread aChildThread = Thread.currentThread();
//		if (currentNotifyingThreads.size() == NUM_CHILD_THREADS) {
//			notify();
//		}
////		if (currentThreads.contains(aChildThread)) {
////			return;
////		}
////		System.out.println("New child thread:" + aChildThread);
////		currentThreads.add(aChildThread);		
//	}
//	public static void waitForAnimation() {
//		Tracer.info(this,"Waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		ThreadSupport.sleep(SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		Tracer.info(this,"Finished waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//
//	}
//	protected boolean doTest() throws Throwable {
//		boolean retVal =  super.doTest();
//		waitForAnimation();
//		return retVal;
//	}
 }
