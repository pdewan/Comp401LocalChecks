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

import util.misc.ThreadSupport;
import util.models.PropertyListenerRegisterer;
// extending OneLevelList so we can inherit from it in subclasses
public class AsyncArthurAnimationTestCase extends OneLevelListMovesTestCase implements PropertyChangeListener {
	
	protected List<Thread> currentThreads = new ArrayList();
	protected Set<Thread> previousThreads;
	protected Map <Thread, Integer> threadToSleeps = new HashMap<>();
	protected Map <Thread, Long> lastEventTimes = new HashMap();
	protected Thread parentThread;
	protected Thread childThread;
	protected boolean threadCreated;
	protected int numEventsReceived;
	protected long lastEventTime;
	protected boolean foundDelay;
	protected long MIN_EVENT_DELAY = 10;
	protected static long MAX_DELAY_TO_CREATE_CHILD_THREAD = 1000;
	public static long MAX_TIME_FOR_ANIMATION = 5000;
//	protected boolean testing = false;
//	protected TestBridgeScene bridgeScene;

	
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
		bridgeScene = (TestBridgeScene) getOrCreateObject(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		if (bridgeScene == null) {
//			testing = false;
			assertTrue("Could not create bridge scene", false);
		}
	}
	
	protected void initData() {
//		testing = true;
		currentThreads.clear();
		previousThreads = Thread.getAllStackTraces().keySet();
		parentThread = Thread.currentThread();
		threadToSleeps.clear();
		lastEventTimes.clear();
		currentThreads.add(parentThread);
		childThread = null;
		threadCreated = false;
		lastEventTime = 0;
		foundDelay = false;
	}
	protected boolean isPreviousThread() {
		return previousThreads.contains(Thread.currentThread());
	}
	protected synchronized void stopThread(Thread aThread) {
		if (aThread == null) {
			return;
		}
//		testing = false;
//		System.out.println ("Stopping thread:" + aThread);
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
		return createUsingFactoryMethod();
	}
	protected synchronized void maybeKillThreads() {
		stopThread(childThread);
//		testing = false;
	}
	protected void executeOperations(Object aProxy) throws Exception {
		System.out.println ("Animating arthur");
		commandInterpreter().asynchronousArthur();
//		waitForStartedChildThreads();
//		stopThread(childThread);

	}
	protected synchronized void waitForThreadsToStart( ){
		try {
			long aDelay = maxDelayToCreateChildThread();
			System.out.println("Waiting for child threads to be created within time (ms):" + aDelay);
			wait(aDelay);
//			stopThread(childThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected synchronized void waitForThreads( ){
		waitForThreadsToStart();
//		try {
//			long aDelay = maxDelayToCreateChildThread();
//			System.out.println("Waiting for child threads to be created within time (ms):" + aDelay);
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
	protected void maybeCheckDelay() {
		if (!foundDelay) {
//			testing = false;
			assertTrue("No delayed events (missing sleep call?):", false);
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
//		createBridgeScene();
		
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
		initData();
		create();
		setDependentObjects();
		addPropertyChangeListeners();
//		addPropertyChangeListener(avatar(), this);
		executeOperations(rootProxy);
		waitForThreads();
		maybeKillThreads();
//		testing = false;

		checkOutput(rootProxy);
		return true;
	}
	protected void delayFound() {
		notify();
	}
	protected long minEventDelay() {
		return MIN_EVENT_DELAY;
	}
	
	protected void maybeAddThread() {
		Thread aChildThread = Thread.currentThread();
		if (!currentThreads.contains(aChildThread)) {			
			System.out.println("New child thread:" + aChildThread);
			currentThreads.add(aChildThread);
			threadToSleeps.put(aChildThread, 1);
			lastEventTimes.put(aChildThread, (long) 0);
			threadCreated = true;
			childThread = aChildThread;
		}
		Long aLastEventTime = lastEventTimes.get(aChildThread) ;
		long aCurrentEventTime = System.currentTimeMillis();
		if (aLastEventTime != 0) {
//			System.out.println ("current event time " + aChildThread + " " + aCurrentEventTime);

			boolean aFoundDelay = aCurrentEventTime - aLastEventTime > minEventDelay();
			if (aFoundDelay) {
				Integer aNumSleeps = threadToSleeps.get(aChildThread);
				if (aNumSleeps == null) {
					aNumSleeps = 0;
				}
				aNumSleeps++;
				threadToSleeps.put(aChildThread, aNumSleeps );
				System.out.println ("num sleeps by thread: " + aChildThread + "  " + aNumSleeps);

				foundDelay = true;
				delayFound();
			}
			 
		}
//		System.out.println ("Storing acurrentEventTime for " + aChildThread);
		lastEventTimes.put(aChildThread, aCurrentEventTime);

	}
	public static void waitForAnimation() {
		System.out.println ("Waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
		ThreadSupport.sleep(SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
		System.out.println ("Finished waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);

	}
	protected synchronized void waitForThreadsToExecute( ){
		try {
			long aDelay = maxTimeForAnimatingThread();
			System.out.println("Waiting for child thread to finish amimation in(ms):" + aDelay);
			wait(aDelay);
//			stopThread(childThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		if (!testing)
			return;
		if (isPreviousThread()) {
			return;
		}

		maybeAddThread();
//		if (foundDelay) {
//			delayFound();
//		}
		
//		Thread aChildThread = Thread.currentThread();
//		if (aChildThread != parentThread && childThread == null) {
//			threadCreated = true;
//			childThread = aChildThread;
//			currentThreads.add(aChildThread);
//			System.out.println ("child 1:" + childThread);
//		}
////		threadCreated = childThread != parentThread;
//		if (foundDelay) {
//			return;
//		}
//		if (lastEventTime != 0) {
//		foundDelay = System.currentTimeMillis() - lastEventTime > MIN_EVENT_DELAY;
//		if (foundDelay) {
//			System.out.println ("Found delay between events");
////			notify();
//			delayFound();
//			return;
//		}
//		}
//		lastEventTime = System.currentTimeMillis();
		 
		
	}

}
