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
//	@Override
//	protected void initData() {		
//		super.initData();
//		broadcastingClearanceManager = null;
//	}
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
//			commandInterpreter().waitingArthur();
			Tracer.info(this,"Animating waiting Lancelot"+ System.currentTimeMillis());
			doWaitingLancelot();
//			commandInterpreter().waitingLancelot();
			Tracer.info(this,"Animating waiting Galahad"+ System.currentTimeMillis());
			doWaitingGalahad();
//			commandInterpreter().waitingGalahad();
			Tracer.info(this,"Animating waiting Robin"+ System.currentTimeMillis());
//			commandInterpreter().waitingRobin();
			doWaitingRobin();
//			long aDelay = maxDelayToCreateChildThread() * NUM_CHILD_THREADS;
			waitForChildrenThreadsToBeCreated(NUM_CHILD_THREADS);
//			Tracer.info(this, "waiting for children to be created:" + aDelay);
//			Thread.sleep(aDelay);
//			Set<Thread> aNewThreads = ConcurrentEventUtility.newThreads(aCurrentThreads);
//			if (aNewThreads.size() != NUM_CHILD_THREADS) {
//				assertTrue("Only " + aNewThreads.size() + "  new threads not created on calling waitng animation on arthur, lancelot, galahad and robin. Expecting 4 threads", false);				
//
//			}
			assertNewThreadsCreated(aCurrentThreads, NUM_CHILD_THREADS);
			Thread[] aNotifyingThreads = concurrentPropertyChangeSupport.getNotifyingNewThreads();
			if (aNotifyingThreads.length > 0) {	
				
				assertTrue("Threads " + Arrays.toString(aNotifyingThreads) + "  notified before proceedAll was executed", false);				
			}
			doProceedAll();
//			Tracer.info(this,"Executing proceedAll on broadcasting clearance manager");
//			broadcastingClearanceManager.proceedAll();
			
//			waitForThreads();
			
		}
	protected long selectorBasedWaitDelay() {
		
		return  maxTimeForAnimatingThread();
	}
	protected int minThreads() {
		return NUM_CHILD_THREADS;
	}
	protected synchronized void waitForThreads( ){
		super.waitForThreads();
//		waitForThreadsToStart(); // this is what the superclass does
//		stopThread(child2Thread);
	}
	protected synchronized void maybeKillThreads() {
		for (Thread aThread:currentNotifyingThreads) {
			stopThread(aThread);
		}
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
	protected void delayFound() {
	}
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		if (!testing) {
//			Tracer.info(this,"Not testing:" + this);
			return;
		}
		if (isPreviousThread()) {
			Tracer.info(this,"Previous thread, ignoring notification:"+ Thread.currentThread());
			return;
		}
//		super.propertyChange(evt);
		maybeAddThread();
		
		Thread aChildThread = Thread.currentThread();
//		Tracer.info(this,"Got event from:" + aChildThread);
		if (currentNotifyingThreads.size() == NUM_CHILD_THREADS) {
			notify();
		}
//		if (currentThreads.contains(aChildThread)) {
//			return;
//		}
//		System.out.println("New child thread:" + aChildThread);
//		currentThreads.add(aChildThread);		
	}
//	public static void waitForAnimation() {
//		Tracer.info(this,"Waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		ThreadSupport.sleep(SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		Tracer.info(this,"Finished waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//
//	}
	protected boolean doTest() throws Throwable {
		boolean retVal =  super.doTest();
		waitForAnimation();
		return retVal;
	}
 }
