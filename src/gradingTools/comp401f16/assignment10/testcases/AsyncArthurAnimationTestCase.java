package gradingTools.comp401f16.assignment10.testcases;

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
	protected long MIN_EVENT_DELAY = 20;
	protected long MAX_DELAY = 3000;
	protected TestBridgeScene bridgeScene;

	public AsyncArthurAnimationTestCase() {
		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
	}
	
	protected void createBridgeScene() {
		bridgeScene = (TestBridgeScene) getOrCreateObject(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
	}
	
	protected void initData() {
		parentThread = Thread.currentThread();
		threadCreated = false;
		lastEventTime = 0;
		foundDelay = false;
	}
	protected synchronized void stopThread(Thread aThread) {
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
			System.out.println("Waiting for child thread");
			wait(MAX_DELAY);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected static final double THREAD_CREDIT = 0.7;
	protected boolean checkOutput(Object aProxy) {
		fractionComplete = 0;
		if (!threadCreated) {
			assertTrue("Child thread not found:", false);
		}
		fractionComplete += THREAD_CREDIT;
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
	@Override
	protected boolean doTest() throws Throwable {
		initData();
		create();
		setDependentObjects();
		addPropertyChangeListener(avatar(), this);
		executeOperations(rootProxy);
		waitForChildThread();
		checkOutput(rootProxy);
		return true;
	}
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		
		childThread = Thread.currentThread();
		threadCreated = childThread != parentThread;
		if (foundDelay) {
			return;
		}
		if (lastEventTime != 0) {
		foundDelay = System.currentTimeMillis() - lastEventTime > MIN_EVENT_DELAY;
		if (foundDelay) {
			System.out.println ("Found delay between events");
			notify();
			return;
		}
		}
		lastEventTime = System.currentTimeMillis();
		 
		
	}

}
