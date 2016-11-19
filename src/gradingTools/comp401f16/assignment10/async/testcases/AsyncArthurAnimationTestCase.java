package gradingTools.comp401f16.assignment10.async.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.models.PropertyListenerRegisterer;

public class AsyncArthurAnimationTestCase extends FactoryMethodTest implements PropertyChangeListener {
	protected Thread parentThread;
	protected Thread childThread;
	protected boolean threadCreated;
	protected int numEventsReceived;
	protected long lastEventTime;
	protected boolean foundDelay;
	protected long MIN_EVENT_DELAY = 4;
	protected long MAX_DELAY = 3000;
	protected TestBridgeScene bridgeScene;

	
	public AsyncArthurAnimationTestCase() {
		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
	}
	
	protected long maxDelay() {
		return MAX_DELAY;
	}
	
	protected void createBridgeScene() {
		bridgeScene = (TestBridgeScene) getOrCreateObject(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
	}
	
	protected void initData() {
		parentThread = Thread.currentThread();
		childThread = null;
		threadCreated = false;
		lastEventTime = 0;
		foundDelay = false;
	}
	protected synchronized void stopThread(Thread aThread) {
		if (aThread == null) {
			return;
		}
		System.out.println ("Stopping thread:" + aThread);
		aThread.interrupt();
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
	protected void executeOperations(Object aProxy) {
		System.out.println ("Animating arthur");
		commandInterpreter().animateArthur();
	}
	protected synchronized void waitForChildThread( ){
		try {
			long aDelay = maxDelay();
			System.out.println("Waiting for child threads to be created within time (ms):" + aDelay);
			wait(aDelay);
			stopThread(childThread);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected static final double THREAD_CREDIT = 0.7;
	protected double threadCredit() {
		return THREAD_CREDIT;
	}
	protected boolean checkOutput(Object aProxy) {
		fractionComplete = 0;
		if (!threadCreated) {
			assertTrue("Child thread not found:", false);
		}
		fractionComplete += threadCredit();
		if (!foundDelay) {
			assertTrue("No delayed events:", false);
		}
		return true;
	}
	protected TestAvatar avatar() {
		return bridgeScene.getArthur();
	}
	protected void setDependentObjects() {
		createBridgeScene();
		
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
		waitForChildThread();
		checkOutput(rootProxy);
		return true;
	}
	protected void delayFound() {
		notify();
	}
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		
		Thread aChildThread = Thread.currentThread();
		if (aChildThread != parentThread && childThread == null) {
			threadCreated = true;
			childThread = aChildThread;
			System.out.println ("child 1:" + childThread);
		}
//		threadCreated = childThread != parentThread;
		if (foundDelay) {
			return;
		}
		if (lastEventTime != 0) {
		foundDelay = System.currentTimeMillis() - lastEventTime > MIN_EVENT_DELAY;
		if (foundDelay) {
			System.out.println ("Found delay between events");
//			notify();
			delayFound();
			return;
		}
		}
		lastEventTime = System.currentTimeMillis();
		 
		
	}

}
