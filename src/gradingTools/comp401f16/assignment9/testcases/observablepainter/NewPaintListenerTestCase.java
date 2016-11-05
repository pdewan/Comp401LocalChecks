package gradingTools.comp401f16.assignment9.testcases.observablepainter;

import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;

import util.annotations.MaxValue;
import util.misc.ThreadSupport;
import grader.basics.execution.AMainInNewThread;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.execution.GradingMode;
import grader.basics.execution.ResultingOutErr;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveArthurTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.Assignment9Suite;
import gradingTools.comp401f16.assignment9.testcases.factory.DelegatingBridgeSceneViewFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.factory.ObservableBridgeScenePainterFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestDelegatingBridgeSceneView;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestObservableBridgeScenePainter;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestPaintListener;
import gradingTools.shared.testcases.shapes.LocatableTest;
@MaxValue(10)
public class NewPaintListenerTestCase 
	extends ConsoleSceneViewOutputTestCase 
	implements TestPaintListener, Runnable{
	public static final int ESTMATE_TIME_FOR_ANIMATION = 4000;
	public static final int MIN_APPROACH_EVENTS = 1;
	public static final int MIN_FAILED_EVENTS = 1;
	public static final double LISTENER_CREDIT =0.3;
	public static final double APPROACH_EVENTS_CREDIT = 0.5;
	public static final double FAILED_EVENTS_CREDIT = 0.2;
	protected boolean failedCalled = false;
	protected int numEventsFiredByApproach;
	protected int numEventsFiredByFailed;
	
	protected TestBridgeScene bridgeScene;
	protected TestObservableBridgeScenePainter observableBridgeScenePainter;
	protected Object delegatingBridgeSceneView;
	protected void initState() {
		fractionComplete = 0;
		failedCalled = false;
		numEventsFiredByApproach = 0;
		numEventsFiredByFailed = 0;
	}
	@Override
	protected Object create() {
		
		bridgeScene = (TestBridgeScene) getOrCreateObject(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		observableBridgeScenePainter = (TestObservableBridgeScenePainter) getOrCreateObject(
				factoryClassTags(), 
				ObservableBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestObservableBridgeScenePainter.class);
		delegatingBridgeSceneView =  getOrCreateObject(
				factoryClassTags(), 
				DelegatingBridgeSceneViewFactoryMethodTest.FACTORY_METHOD_TAGS, 
				Object.class);
		
		return bridgeScene;
	}
	
	
   
    
	protected void approach (TestAvatar anAvatar) {
		System.out.println(toString(anAvatar) + " Approaches");
		BasicProjectExecution.redirectOutput();
		bridgeScene().approach(anAvatar);
		output= BasicProjectExecution.restoreAndGetOut();
		approachPropertyChanges = parsePropertyChanges(output);
		
//		boolean aRetval = Arrays.stream(output.split("\n"))
//                .parallel().unordered()
//                .map((line) -> line.matches("java\\.beans\\.PropertyChangeEvent\\[propertyName=.*; oldValue=.*; newValue=.*; propagationId=.*; source=.*\\]"))
//                .allMatch((b)->b==true);

				

		
//		printFractionComplete();
	}

	protected void failed() {
		System.out.println("Interacting Knight Failed");
		failedCalled = true;
		bridgeScene().failed();
	}	
		
	protected void registerPaintListener() {
		try {
		System.out.println ("Adding paint listener to observable bridge scene painter ");
		Class aRealInterface = BasicProjectIntrospection.findInterface(TestPaintListener.class);

		Object aReverseProxy = BasicProjectIntrospection.createReverseProxy(TestPaintListener.class, aRealInterface, this);
		TestPaintListener aForwardProxy = (TestPaintListener)
				BasicProjectIntrospection.createProxy(TestPaintListener.class, aReverseProxy);
		observableBridgeScenePainter.addPaintListener(aForwardProxy);
		} catch (Error e) {
			assertTrue("Could not register paint listener", false);
		}
		fractionComplete += LISTENER_CREDIT;
		
	}
	protected void checkResults() {
		System.out.println ("Checking results");
		if (numEventsFiredByFailed < MIN_APPROACH_EVENTS  ) {
			assertTrue("At least "  + MIN_APPROACH_EVENTS + " paint event not fired by approach", false	);
		}
		fractionComplete += APPROACH_EVENTS_CREDIT;

		if (numEventsFiredByFailed < MIN_FAILED_EVENTS  ) {
//			assertTrue("No paint events fired by failed", false	);
			assertTrue("At least "  + MIN_FAILED_EVENTS + " paint event not fired by failed", false	);


		}
		fractionComplete += FAILED_EVENTS_CREDIT;
	}
	protected static String[] emptyStringargs = new String[]{};

	protected void executeMethods() {
		BasicProjectExecution.callMainOnce(
				Assignment9Suite.MAIN_CLASS_NAME, emptyStringargs, "");
		ThreadSupport.sleep(ESTMATE_TIME_FOR_ANIMATION);
		run();
//		if (GradingMode.getGraderRun()) {
//			executeMethodInSameThread();
//		} else {
//			executeMethodsInSeparateThread();
//		}
		
	}
//	protected void executeMethodInSameThread() {
//		run();
//	}
//	protected void executeMethodsInSeparateThread(){
//		Thread aThread = new Thread(this);
//		aThread.start();
//
////		ThreadSupport.sleep(4000);
//		
//	}
	protected boolean doTest() throws Throwable {
		initState();		
		rootProxy = create();

		registerPaintListener();

//		Assignment9Suite.invokeMain();
//		Thread aThread = new Thread(this);
//		aThread.start();
//
//		ThreadSupport.sleep(4000);
		executeMethods();
		checkResults();

//		if (numEventsFiredByFailed == 0  ) {
//			assertTrue("No paint events fired by approach", false	);
//		}
//		fractionComplete += APPROACH_EVENTS_CREDIT;
//
//		if (numEventsFiredByFailed == 0 ) {
//			assertTrue("No paint events fired by failed", false	);
//
//		}
//		fractionComplete += FAILED_EVENTS_CREDIT;

		return true;
		
		
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paint(Graphics2D g) {
		System.out.println ("RECEIVED PAINT EVENT, TEST SUCCESSFUL");
		if (failedCalled)
			numEventsFiredByFailed++;
		else
			numEventsFiredByApproach++;
	}
	@Override
	public void run() {
		approach(firstAvatar());
//		ThreadSupport.sleep(2000);
//		if ((numEventsFiredByFailed == 0  ) {
//			assertTrue("No paint events fired by approach", false	);
//		}
//		fractionComplete += APPROACH_EVENTS_CREDIT;
		failed();
//		ThreadSupport.sleep(2000);
//		if (numEventsFiredByFailed == 0 ) {
//			assertTrue("No paint events fired by failed", false	);
//
//		}
//		fractionComplete += FAILED_EVENTS_CREDIT;

	}
	
}
