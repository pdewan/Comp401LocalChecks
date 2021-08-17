package gradingTools.comp301ss21.assignment4.async;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.concurrency.propertyChanges.BasicConcurrentPropertyChangeSupport;
import gradingTools.shared.testcases.concurrency.propertyChanges.ConcurrentEventUtility;
import gradingTools.shared.testcases.concurrency.propertyChanges.ConcurrentPropertyChange;
import gradingTools.shared.testcases.concurrency.propertyChanges.ConcurrentPropertyChangeMatchesSelector;
import gradingTools.shared.testcases.concurrency.propertyChanges.ConcurrentPropertyChangeSupport;
import gradingTools.shared.testcases.concurrency.propertyChanges.ConcurrentPropertyChangeThreadMatchesSelector;
import gradingTools.shared.testcases.concurrency.propertyChanges.Selector;

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
public class AbstractionAsyncArthurAnimationTestCase extends OneLevelListMovesTestCase {
	protected ConcurrentPropertyChangeSupport concurrentPropertyChangeSupport = new BasicConcurrentPropertyChangeSupport();
	protected long MIN_EVENT_DELAY = 10;
	protected static long MAX_DELAY_TO_CREATE_CHILD_THREAD = 1000;
	public static long MAX_TIME_FOR_ANIMATION = 5000;
	public AbstractionAsyncArthurAnimationTestCase() {
		factoryMethodTags = new String[] { "commandInterpreterFactoryMethod" };
	}
	protected long maxDelayToCreateChildThread() {
		return MAX_DELAY_TO_CREATE_CHILD_THREAD;
	}
	protected long maxTimeForAnimatingThread() {
		return MAX_TIME_FOR_ANIMATION;
	}
	protected void createBridgeScene() {
		bridgeScene = (TestBridgeScene) getObjectFromFactory(factoryClassTags(),
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, TestBridgeScene.class);
		if (bridgeScene == null) {
			assertTrue("Could not create bridge scene", false);
		}
	}
	protected synchronized void stopThread(Thread aThread) {
		if (aThread == null) {
			return;
		}
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
	protected void doAsynchronousArthur() {
		commandInterpreter().asynchronousArthur();
	}
	protected void assertNewThreadsCreated(Set<Thread> aCurrentThreads, int aNumNewThreads) {
		Set<Thread> aNewThreads = ConcurrentEventUtility.newThreads(aCurrentThreads);
		if (aNewThreads.size() < aNumNewThreads) {
			assertTrue("Only " + aNewThreads.size() + "  new threads created. Expecting " + aNumNewThreads
					+ " new threads", false);
		}
	}
	public void waitForChildrenThreadsToBeCreated(int aNumThreads) {
		long aDelay = maxDelayToCreateChildThread() * aNumThreads;
		Tracer.info(this, "waiting for children to be created:" + aDelay);
		ThreadSupport.sleep(aDelay);
	}
	protected int minEvents() {
		return 2;
	}
	protected int minThreads() {
		return 1;
	}
	protected Selector<ConcurrentPropertyChangeSupport> waitSelector() {
		return new ConcurrentPropertyChangeThreadMatchesSelector(null, minThreads(), minEvents(), null,
				minEventDelay());
	}
	protected void assertNewThreadCreated() {
		Thread[] aNotifyingNewThreads = concurrentPropertyChangeSupport.getNotifyingNewThreads();
		assertTrue("No thread created by previous operation:", aNotifyingNewThreads.length > 0);
		Tracer.info(this, "New threads:" + aNotifyingNewThreads);
	}
	protected void checkSelectorSuccessful() {
		if (!concurrentPropertyChangeSupport.isWaitSelectorSuccessful()) {
			Tracer.info(this, "received property changes");
			ConcurrentEventUtility.trace(concurrentPropertyChanges);
			assertTrue("Did not receive " + minEvents() + " events with min delay " + minEventDelay()
					+ " from min threads" + minThreads(), false);
		}
	}
	protected void maybeSetWaitSelector() {
		concurrentPropertyChangeSupport.addtWaitSelector(waitSelector());
	}
	protected void maybeSetMinimumEventDelay() {
		concurrentPropertyChangeSupport.setMinimumEventDelayPerThread(minEventDelay());
	}
	protected void executeOperations(Object aProxy) throws Exception {
		Tracer.info(this, "Animating arthur");
		doAsynchronousArthur();
	}
	protected long selectorBasedWaitDelay() {
		return maxDelayToCreateChildThread();
	}
	protected synchronized void maybeKillThreads() {
//		stopThread(childThread);
	}
	protected synchronized void waitForThreads() {
		try {
			long aDelay = selectorBasedWaitDelay();
			Tracer.info(this, "Waiting for child threads to be created/to notify within time (ms):" + aDelay
					+ " at time:" + System.currentTimeMillis());
			concurrentPropertyChangeSupport.selectorBasedWait(aDelay);
			Tracer.info(this, "Finished waiting for child threads to be created/to notify within time (ms):" + aDelay
					+ " at time " + System.currentTimeMillis());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	protected static final double THREAD_CREDIT = 0.7;
	protected double threadCredit() {
		return THREAD_CREDIT;
	}
	protected void setConcurrentPropertyChanges() {
		concurrentPropertyChanges = concurrentPropertyChangeSupport.getConcurrentPropertyChanges();
	}
	protected ConcurrentPropertyChange[] concurrentPropertyChanges;
	protected boolean checkConcurrentPropertyChanges() {
		fractionComplete = 0;
		assertNewThreadCreated();
		fractionComplete += threadCredit();
		checkSelectorSuccessful();
		return true;
	}

	protected boolean checkOutput(Object aProxy) {
		setConcurrentPropertyChanges();
		return checkConcurrentPropertyChanges();
	}
	protected TestAvatar avatar() {
		return bridgeScene.getArthur();
	}
	protected void setDependentObjects() {
		super.setDependentObjects();
	}
	public void addPropertyChangeListener(TestAvatar anAvatar, PropertyChangeListener aListener) {
		anAvatar.getArms().getLeftLine().addPropertyChangeListener(aListener);
		anAvatar.getArms().getRightLine().addPropertyChangeListener(aListener);
		anAvatar.getLegs().getLeftLine().addPropertyChangeListener(aListener);
		anAvatar.getLegs().getRightLine().addPropertyChangeListener(aListener);
		anAvatar.getHead().addPropertyChangeListener(aListener);
	}
	public void addPropertyChangeListeners() {
		addPropertyChangeListener(avatar(), concurrentPropertyChangeSupport);
	}
	@Override
	protected boolean doTest() throws Throwable {
		create();
		setDependentObjects();
		addPropertyChangeListeners();
		maybeSetMinimumEventDelay();
		maybeSetWaitSelector();
		executeOperations(rootProxy);
		waitForThreads();
		maybeKillThreads();
		checkOutput(rootProxy);
		return true;
	}
	protected long minEventDelay() {
		return MIN_EVENT_DELAY;
	}
//	protected List<Thread> currentNotifyingThreads = new ArrayList();
//	protected Set<Thread> previousNotifyingThreads = new HashSet();
//	protected Map <Thread, Integer> threadToSleeps = new HashMap<>();
//	protected Map <Thread, Long> lastEventTimes = new HashMap();
//	protected Thread parentThread;
//	protected Thread childThread;
//	protected boolean threadCreated;
//	protected int numEventsReceived;
//	protected long lastEventTime;
//	protected boolean foundDelay;
//	protected long MIN_EVENT_DELAY = 10;
//	protected static long MAX_DELAY_TO_CREATE_CHILD_THREAD = 1000;
//	public static long MAX_TIME_FOR_ANIMATION = 5000;
//	protected boolean freezeNotifications = false;
//	protected boolean threadsInitialized = false;
//	
//	protected void delayFound() {
//		notify(); // so that checking thread can unblock from wait call
//	}
//	protected void maybeAddThread() {
//		Thread aChildThread = Thread.currentThread();
//		if (!currentNotifyingThreads.contains(aChildThread)) {			
//			Tracer.info(this,"New notifying child thread:" + aChildThread);
//			if (previousThreads.contains(aChildThread)) {
//				Tracer.info(PassFailJUnitTestCase.class,"Is previously created thread");
//			}
//			currentNotifyingThreads.add(aChildThread);
//			threadToSleeps.put(aChildThread, 1);
//			lastEventTimes.put(aChildThread, (long) 0);
//			threadCreated = true;
//			childThread = aChildThread;
//		}
//		Long aLastEventTime = lastEventTimes.get(aChildThread) ;
//		long aCurrentEventTime = System.currentTimeMillis();
//		if (aLastEventTime != 0) {
//			Tracer.info(this,"current event time " + aChildThread + " " + aCurrentEventTime);
//
//			boolean aFoundDelay = aCurrentEventTime - aLastEventTime > minEventDelay();
//			if (aFoundDelay) {
//				Integer aNumSleeps = threadToSleeps.get(aChildThread);
//				if (aNumSleeps == null) {
//					aNumSleeps = 0;
//				}
//				aNumSleeps++;
//				threadToSleeps.put(aChildThread, aNumSleeps );
//				Tracer.info(this,"num sleeps by thread: " + aChildThread + "  " + aNumSleeps);
//
//				foundDelay = true;
//				delayFound();
//			}
//			 
//		}
//		Tracer.info(this,"Storing acurrentEventTime for " + aChildThread);
//		lastEventTimes.put(aChildThread, aCurrentEventTime);
//	}
//	public static void waitForAnimation() {
//		Tracer.info(AbstractionAsyncArthurAnimationTestCase.class,"Waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		ThreadSupport.sleep(SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//		Tracer.info(AbstractionAsyncArthurAnimationTestCase.class,"Finished waiting for animations to finish(ms):" + SyncArthurAnimationTestCase.MAX_TIME_FOR_ANIMATION);
//	}
//	protected synchronized void waitForThreadsToExecute( ){
//		try {
//			long aDelay = maxTimeForAnimatingThread();
//			Tracer.info(this,"Waiting for child thread to finish amimation in(ms):" + aDelay);
//			wait(aDelay);
//			Tracer.info(this,"Finished waiting for child thread to finish amimation in(ms):" + aDelay);
//
////			stopThread(childThread);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Override
//	public synchronized void propertyChange(PropertyChangeEvent evt) {
//		if (!isThreadsInitialized()) {
//			return;
//		}
//		if (!testing)
//			return;
//		if (isPreviousThread()) {
//			Tracer.info(this,"Previous thread nofified, returning at time:" +System.currentTimeMillis());
//			return;
//		}
//		maybeAddThread();		
//	}
//	public boolean isThreadsInitialized() {
//		return threadsInitialized;
//	}
//
//	public void setThreadsInitialized(boolean threadsInitialized) {
//		this.threadsInitialized = threadsInitialized;
//	}
	/*
	 * This should be renamed to initThreads
	 */
//	protected void initData() {
//		Tracer.info(this,"Initializing thread data");
//		currentNotifyingThreads.clear();
//		parentThread = Thread.currentThread();
//		previousNotifyingThreads.clear();
//		previousNotifyingThreads.add(parentThread);
//		threadToSleeps.clear();
//		lastEventTimes.clear();
//		currentNotifyingThreads.add(parentThread);
//		childThread = null;
//		threadCreated = false;
//		lastEventTime = 0;
//		foundDelay = false;
//		setThreadsInitialized(true);
//
//	}
//
//	protected boolean isPreviousThread() {
//		return previousNotifyingThreads.contains(Thread.currentThread());
//	}

}
