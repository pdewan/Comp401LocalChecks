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

import util.annotations.MaxValue;
import util.misc.ThreadSupport;
import util.models.PropertyListenerRegisterer;
import util.trace.Tracer;
@MaxValue(20)
public class WaitingAvatarsAnimationTestCase extends AsyncArthurAnimationTestCase {
	public static final int NUM_CHILD_THREADS = 4; // including parent thread
	public static final double PROCEED_CREDIT = 0.5;
	BroadcastingClearanceManager broadcastingClearanceManager;
	public WaitingAvatarsAnimationTestCase() {
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
		addPropertyChangeListener(bridgeScene.getArthur(), this);
		addPropertyChangeListener(bridgeScene.getLancelot(), this);
		addPropertyChangeListener(bridgeScene.getGalahad(), this);
		addPropertyChangeListener(bridgeScene.getRobin(), this);
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
			fractionComplete = 0;
			Tracer.info(this,"Animating waiting Arthur at time:" + System.currentTimeMillis());
			doWaitingArthur();
			Tracer.info(this,"Animating waiting Lancelot"+ System.currentTimeMillis());
			doWaitingLancelot();
			Tracer.info(this,"Animating waiting Galahad"+ System.currentTimeMillis());
			doWaitingGalahad();
			Tracer.info(this,"Animating waiting Robin"+ System.currentTimeMillis());
			doWaitingRobin();			
//			waitForThreadsToStart();
			if (currentNotifyingThreads.size() > 1) {				
				assertTrue("At least one thread notified before proceedAll was executed", false);				
			}
			doProceedAll();	
			for (int aKnightNum = 0; aKnightNum < 4; aKnightNum++) {
			waitForThreadsToStart(); // waiting for each knight to start notifying
			}
			
		}	
	protected  void maybeKillThreads() {
		for (Thread aThread:currentNotifyingThreads) {
			if (aThread == parentThread) {
				continue;
			}
			stopThread(aThread);
		}
	}
	protected synchronized boolean checkOutput(Object aProxy) {
		int aNumThreads = currentNotifyingThreads.size() - 1;
		Tracer.info(this,"Number of notifying threads after proceedAll " + 
		aNumThreads);
		if (aNumThreads == 1 ) {
			assertTrue("No thread notified after proceedAll", false);	
		} else if (currentNotifyingThreads.size() < NUM_CHILD_THREADS) {
			assertTrue("Threads notified after proceedAll;" + aNumThreads + " " +
					currentNotifyingThreads.size() + " expected threads:" + NUM_CHILD_THREADS, false);

		}
		return true;
	}
	// overriding parent class method
	protected void delayFound() {
	}
	// why do we need a special property change
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
////		super.propertyChange(evt);
//		maybeAddThread();		
//		Thread aChildThread = Thread.currentThread();
////		Tracer.info(this,"Got event from:" + aChildThread);
//		if (currentNotifyingThreads.size() == NUM_CHILD_THREADS) {
//			notify();
//		}		
//	}
	protected boolean doTest() throws Throwable {
		boolean retVal =  super.doTest();
//		waitForAnimation(); // we are joinin threads, do not need this
		return retVal;
	}
 }
