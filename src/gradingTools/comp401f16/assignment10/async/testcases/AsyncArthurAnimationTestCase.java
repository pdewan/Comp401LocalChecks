package gradingTools.comp401f16.assignment10.async.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import grader.basics.testcase.PassFailJUnitTestCase;
import util.misc.ThreadSupport;
import util.models.PropertyListenerRegisterer;
import util.trace.Tracer;
// extending OneLevelList so we can inherit from it in subclasses
public class AsyncArthurAnimationTestCase extends OneLevelListMovesTestCase implements PropertyChangeListener {
	protected List<Thread> currentNotifyingThreads = new ArrayList();
	protected Set<Thread> previousNotifyingThreads = new HashSet();
	protected Map <Thread, Integer> threadToSleeps = new HashMap<>();
	protected Map <Thread, Long> lastEventTimes = new HashMap();
	protected Thread parentThread;
	protected Thread childThread;
	protected boolean threadCreated;
	protected int numEventsReceived;
	protected long lastEventTime;
	protected boolean foundDelay;
	protected long MIN_EVENT_DELAY = 10;
	protected static long MAX_DELAY_TO_CREATE_CHILD_THREAD = 5000;
	public static long MAX_TIME_FOR_ANIMATION = 10000;
	protected boolean freezeNotifications = false;
	protected boolean threadsInitialized = false;
	protected boolean waiting = false;
	public AsyncArthurAnimationTestCase() {
		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
	}	
	protected long maxDelayToCreateChildThread() {
		return MAX_DELAY_TO_CREATE_CHILD_THREAD;
	}
	protected long maxTimeForAnimatingThread() {
		return MAX_TIME_FOR_ANIMATION;
	}
	protected void createBridgeScene() {
		bridgeScene = (TestBridgeScene) getObjectFromFactory(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		if (bridgeScene == null) {
//			testing = false;
			assertTrue("Could not create bridge scene", false);
		}
	}
	public boolean isThreadsInitialized() {
		return threadsInitialized;
	}
	public void setThreadsInitialized(boolean threadsInitialized) {
		this.threadsInitialized = threadsInitialized;
	}
	/*
	 * This should be renamed to initThreads
	 */
	protected void initData() {
		Tracer.info(this,"Initializing thread data");
		currentNotifyingThreads.clear();
//		previousNotifyingThreads = new HashSet (Thread.getAllStackTraces().keySet());
		parentThread = Thread.currentThread();
		previousNotifyingThreads.clear();
		previousNotifyingThreads.add(parentThread);
		threadToSleeps.clear();
		lastEventTimes.clear();
		currentNotifyingThreads.add(parentThread); // why add parentTHread
		childThread = null;
		threadCreated = false;
		lastEventTime = 0;
		foundDelay = false;
		setThreadsInitialized(true);
	}
	protected boolean isPreviousThread() {
		return previousNotifyingThreads.contains(Thread.currentThread());
	}
	protected /*synchronized*/ void stopThread(Thread aThread) {
		if (aThread == null) {
			return;
		}
//		Tracer.info(this, "joining thread:" + aThread);
//		System.out.println("joining thread:" + aThread);

//		ThreadSupport.sleep(MAX_TIME_FOR_ANIMATION);
		try {
//			aThread.join(MAX_TIME_FOR_ANIMATION);
			long aTimeOut = maxTimeForAnimatingThread();

			Tracer.info(this, "joining thread:" + aThread + " with timeout " + aTimeOut);
//			System.out.println("joining thread:" + aThread + " with timeout " + aTimeOut);
			aThread.join(aTimeOut);
			if (aThread.isAlive()) {
				String aMessage = "Thread " + aThread + " did not terminate within ms " + aTimeOut + " which can cause subsequent tests to fail ";
				Tracer.info(this, aMessage);
				System.err.println(aMessage);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tracer.info(this, "joined thread:" + aThread);
//		System.out.println("joined thread:" + aThread);


//		testing = false;
//		Tracer.info(this,"Stopping thread:" + aThread);
//		aThread.interrupt();
//		aThread.suspend();
//		aThread.stop();
	}
	@Override
	protected Class proxyClass() {
		return TestCommandInterpreter.class;
	}	
	protected TestCommandInterpreter commandInterpreter() {
		return (TestCommandInterpreter) rootProxy;
	}
	@Override
	protected Object create() {
		return createUsingFactoryClassAndMethodTags();
	}
	protected /*synchronized*/ void maybeKillThreads() {
		stopThread(childThread);
//		testing = false;
	}
	protected void doAsynchronousArthur() {
		commandInterpreter().asynchronousArthur();
	}
	protected void executeOperations(Object aProxy) throws Exception {
		recordPreviousThreads();
		Tracer.info(this,"Animating arthur");
		doAsynchronousArthur();
		recordCurrentThreads();
		assertNewThreadCreated();
	}
	protected synchronized void waitForThreadsToStart( ){
		try {
			long aDelay = maxDelayToCreateChildThread();
			Tracer.info(this,"Waiting for a child thread to be created within time (ms):" + aDelay + " at time:" +  System.currentTimeMillis());
			waiting = true;
			if (waiting) {
			wait(aDelay); // why not sleep, because when delay is found a notification is sent?
			}
			waiting = false;
			Tracer.info(this,"Finished waiting for child threads to be created/to notify within time (ms):" + aDelay + " at time " +  System.currentTimeMillis());
//			stopThread(childThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected /*synchronized*/ void waitForThreads( ){
		waitForThreadsToStart();
//		try {
//			long aDelay = maxDelayToCreateChildThread();
//			Tracer.info(this,"Waiting for child threads to be created within time (ms):" + aDelay);
//			wait(aDelay);
////			stopThread(childThread);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	protected static final double THREAD_CREDIT = 0.7;
	protected double threadCredit() {
		return THREAD_CREDIT;
	}
	// why maybe, the delay is definitely checked
	protected void maybeCheckDelay() {
		if (!foundDelay) {
//			testing = false;
//			assertTrue("No delayed events (missing sleep call?):", false);
			assertTrue("Property change events announced during the animation do not have a single delay of at least:" + minEventDelay() + " is your amimation loop missing a sleep call?", false);
		}
	}
	protected boolean checkOutput(Object aProxy) {
		fractionComplete = 0;
		if (!threadCreated) {
//			testing = false;
			assertTrue("Child thread not found:", false);
		}
		fractionComplete += threadCredit();
//		if (!foundDelay) {
//			assertTrue("No delayed events (missing sleep call?):", false);
//		}
		maybeCheckDelay();
		return true;
	}
	protected TestAvatar avatar() {
		return bridgeScene.getArthur();
	}
	protected void setDependentObjects() {
		super.setDependentObjects();		
	}
	public static void addPropertyChangeListener(TestAvatar anAvatar, PropertyChangeListener aListener) {
		anAvatar.getArms().getLeftLine().addPropertyChangeListener(aListener);
		anAvatar.getArms().getRightLine().addPropertyChangeListener(aListener);
		anAvatar.getLegs().getLeftLine().addPropertyChangeListener(aListener);
		anAvatar.getLegs().getRightLine().addPropertyChangeListener(aListener);
		anAvatar.getHead().addPropertyChangeListener(aListener);
	}
	public void addPropertyChangeListeners() {
		addPropertyChangeListener(avatar(), this);
	}
	@Override
	protected boolean doTest() throws Throwable {
//		initData();
		setThreadsInitialized(false);
		create();
		setDependentObjects();
		addPropertyChangeListeners();
		initData(); // ignore events sent by addPropertyChangeListeners
//		addPropertyChangeListener(avatar(), this);
		waiting = true;
		executeOperations(rootProxy);
		waitForThreads(); // we are now joining
		maybeKillThreads();
//		testing = false;
		checkOutput(rootProxy);
		return true;
	}
	protected void delayFound() {
		notify(); // so that checking thread can unblock from wait call
	}
	protected long minEventDelay() {
		return MIN_EVENT_DELAY;
	}	
	protected void maybeAddThread() {
		Thread aChildThread = Thread.currentThread();
		if (!currentNotifyingThreads.contains(aChildThread)) {			
			Tracer.info(this,"New notifying child thread:" + aChildThread);
			if (previousThreads.contains(aChildThread)) {
				Tracer.info(PassFailJUnitTestCase.class,"Is previously created thread");
			}
			currentNotifyingThreads.add(aChildThread);
			threadToSleeps.put(aChildThread, 1);
			lastEventTimes.put(aChildThread, (long) 0);
			threadCreated = true;
			if (childThread == null) { // addition 6/22/24
			childThread = aChildThread;
			}
		}
		Long aLastEventTime = lastEventTimes.get(aChildThread) ;
		long aCurrentEventTime = System.currentTimeMillis();
		if (aLastEventTime != 0) {
//			Tracer.info(this,"current event time " + aChildThread + " " + aCurrentEventTime);
			boolean aFoundDelay = aCurrentEventTime - aLastEventTime > minEventDelay();
			if (aFoundDelay) {
				Integer aNumSleeps = threadToSleeps.get(aChildThread);
				if (aNumSleeps == null) {
					aNumSleeps = 0;
				}
				aNumSleeps++;
				threadToSleeps.put(aChildThread, aNumSleeps );
//				Tracer.info(this,"num sleeps by thread: " + aChildThread + "  " + aNumSleeps);
				foundDelay = true;
				delayFound();
			}
			 
		}
//		Tracer.info(this,"Storing acurrentEventTime for " + aChildThread);
		lastEventTimes.put(aChildThread, aCurrentEventTime);
	}
	// commenting out this out
//	public static void waitForAnimation() {
//		Tracer.info(AsyncArthurAnimationTestCase.class,"Waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		ThreadSupport.sleep(SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		Tracer.info(AsyncArthurAnimationTestCase.class,"Finished waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//	}
//	protected synchronized void waitForThreadsToExecute( ){
//		try {
////			long aDelay = maxTimeForAnimatingThread();
//			long aDelay = maxDelayToCreateChildThread();
//
//			
//			Tracer.info(this,"Waiting for child thread to start amimation in(ms):" + aDelay);
//			wait(aDelay);
//			Tracer.info(this,"Finished waiting for child thread to start amimation in(ms):" + aDelay);
////			stopThread(childThread);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		if (!isThreadsInitialized()) {
			return;
		}
		if (!testing)
			return;
		if (isPreviousThread()) {
			Tracer.info(this,"Previous thread nofified, returning at time:" +System.currentTimeMillis());
			return;
		}
		maybeAddThread();
		if (waiting) {

		Tracer.info(this, "Notifying waiting testing thread");
		notify();
		waiting = false;
		}
//		if (foundDelay) {
//			delayFound();
//		}		
	}
	
// inherited from Method execution charged to this test case
//	protected Set<Thread> previousThreads = new HashSet();
//	protected Set<Thread> currentThreads = new HashSet();
//	protected List<Thread> newThreads = new ArrayList();
//	protected void recordPreviousThreads() {
//		previousThreads = new HashSet(Thread.getAllStackTraces().keySet());
//		Tracer.info (this, "Previous threads:" + previousThreads);		
//	}
//	protected void recordCurrentThreads() {
//		currentThreads = new HashSet(Thread.getAllStackTraces().keySet());
//		Tracer.info (this, "Current threads:" + currentThreads);
//
//		newThreads = new ArrayList(currentThreads);
//		newThreads.removeAll(previousThreads);
////		Tracer.info (this, "New threads:" + newThreads);		
//	}
//	protected void assertNewThreadCreated() {
//		assertTrue("No thread created by previous operation:", newThreads.size() > 0);
//		Tracer.info (this, "New threads:" + newThreads);
//	}
}
