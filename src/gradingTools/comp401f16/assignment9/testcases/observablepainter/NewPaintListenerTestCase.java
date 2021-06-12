package gradingTools.comp401f16.assignment9.testcases.observablepainter;

import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Stream;

import org.junit.Assert;

import util.annotations.MaxValue;
import util.misc.ThreadSupport;
import util.trace.Tracer;
import grader.basics.execution.AMainInNewThread;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.execution.GradingMode;
import grader.basics.execution.ResultingOutErr;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import grader.driver.GradingManagerFactory;
import grader.driver.GradingManagerType;
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
	public static final int ESTMATE_TIME_FOR_ANIMATION = 8000;
	public static final int ESTIMATE_TIME_FOR_PAINT_INVOCATION = 500;
	public static final int MIN_APPROACH_EVENTS = 1;
	public static final int MIN_Fail_EVENTS = 1;
	public static final int MIN_EVENTS = 1;
	public static final double LISTENER_CREDIT =0.2;
	public static final double APPROACH_EVENTS_CREDIT = 0.5;
	public static final double Fail_EVENTS_CREDIT = 0.2;
	protected boolean failCalled = false;
	protected boolean paintReceived = false;
	protected int numEventsFiredByApproach;
	protected int numEventsFiredByFail;
	protected int numEventsFired;
	
	protected TestBridgeScene bridgeScene;
	protected TestObservableBridgeScenePainter observableBridgeScenePainter;
	protected Object delegatingBridgeSceneView;
	protected void initState() {
		fractionComplete = 0;
		failCalled = false;
		numEventsFiredByApproach = 0;
		numEventsFiredByFail = 0;
		paintReceived = false;
	}
	protected boolean tryConstructor() {
		return false; // we do not want to search exhanistively
	}
	@Override
	protected Object create() {
		try {
		bridgeScene = (TestBridgeScene) getObjectFromFactory(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		observableBridgeScenePainter = (TestObservableBridgeScenePainter) getObjectFromFactory(
				factoryClassTags(), 
				ObservableBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestObservableBridgeScenePainter.class);
		delegatingBridgeSceneView =  getObjectFromFactory(
				factoryClassTags(), 
				DelegatingBridgeSceneViewFactoryMethodTest.FACTORY_METHOD_TAGS, 
				Object.class);
		} catch (Error e) {
			fractionComplete = 0;
			assertTrue ("One or more factory methods fail:", false);
		}
		
		return bridgeScene;
	}
	
	
   
    
	protected void approach (TestAvatar anAvatar) {
		Tracer.info("Making"  + this,toString(anAvatar) + " approach (Bridge scene should be unoccupied after your main method finishes)");
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

	protected void fail() {
		Tracer.info(this,"Calling Interacting Knight Fail");
		failCalled = true;
		bridgeScene().fail();
	}	
		
	protected void registerPaintListener() {
		try {
		Tracer.info(this,"Adding paint listener to observable bridge scene painter");
		Class aRealInterface = BasicProjectIntrospection.findInterface(TestPaintListener.class);
		if (aRealInterface == null) {
			Assert.assertTrue("Did not find unique interface matching " + 
					Arrays.toString(BasicProjectIntrospection.getTags(TestPaintListener.class) ) + ". See console.", false);
		}

		Object aReverseProxy = BasicProjectIntrospection.createReverseProxy(TestPaintListener.class, aRealInterface, this);
		TestPaintListener aForwardProxy = (TestPaintListener)
				BasicProjectIntrospection.createProxy(TestPaintListener.class, aReverseProxy);
		observableBridgeScenePainter.addPaintListener(aForwardProxy);
		} 
		catch (AssertionError e) {
			throw e;
		}
		catch (Error e) {
			assertTrue("Could not register paint listener", false);
		}
		fractionComplete += LISTENER_CREDIT;
		
	}
	protected void checkResults() {
		Tracer.info(this,"Checking results");
		if (!paintReceived) {
			assertTrue("At least "  + MIN_EVENTS + " paint events not fired in response to approach", false	);
		}
//		if (numEventsFiredByApproach < MIN_APPROACH_EVENTS  ) {
//			assertTrue("At least "  + MIN_APPROACH_EVENTS + " paint event not fired by approach", false	);
//		}
//		fractionComplete += APPROACH_EVENTS_CREDIT;
//
//		if (numEventsFiredByFail < MIN_Fail_EVENTS  ) {
////			assertTrue("No paint events fired by fail", false	);
//			assertTrue("At least "  + MIN_Fail_EVENTS + " paint event not fired by fail", false	);
//
//
//		}
		fractionComplete += Fail_EVENTS_CREDIT + APPROACH_EVENTS_CREDIT;
	}
	protected static String[] emptyStringargs = new String[]{};
	protected String mainClassName() {
		return Assignment9Suite.MAIN_CLASS_NAME;
	}
	protected void executeMethods() throws Throwable {
		Tracer.info(this, "Calling main to allow UI to be created");
//		ResultingOutErr anError = BasicProjectExecution.invokeMainOnceAsynchronously(
//				Assignment9Suite.MAIN_CLASS_NAME, emptyStringargs, "");
		String aMainClassName = mainClassName();
		ResultingOutErr anError = BasicProjectExecution.invokeMainOnceAsynchronously(
				aMainClassName, emptyStringargs, "");
		if (anError == null) {
			assertTrue("No main class:" + aMainClassName, false	);

		}
		
		Tracer.info(this, "Waiting for predefined animation to finish");
		ThreadSupport.sleep(ESTMATE_TIME_FOR_ANIMATION);
		Tracer.info(this, "Finished waiting for predefined animation to finish");
		run();
//		if (anError.getFuture() != null) {
//		anError.getFuture().cancel(true); // This does not do anything for this program
		if (anError != null && anError.getFuture() != null) {
			
				anError.getFuture().cancel(true); // This does not do anything for this program
			
		}
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
		assertTrue("Cannot grade test in headless mode", !GradingManagerFactory.isHeadless());
		String aThreadName = Thread.currentThread().toString();
		assertTrue("Cannot do test interactively when the executing thread is AWT-EventQueue", !aThreadName.contains("AWT-EventQueue"));
		
		initState();		
		rootProxy = create();

		registerPaintListener();

//		Assignment9Suite.invokeMain();
//		Thread aThread = new Thread(this);
//		aThread.start();
//
//		ThreadSupport.sleep(4000);
		executeMethods();
		ThreadSupport.sleep(ESTIMATE_TIME_FOR_PAINT_INVOCATION);
		checkResults();

//		if (numEventsFiredByFail == 0  ) {
//			assertTrue("No paint events fired by approach", false	);
//		}
//		fractionComplete += APPROACH_EVENTS_CREDIT;
//
//		if (numEventsFiredByFail == 0 ) {
//			assertTrue("No paint events fired by fail", false	);
//
//		}
//		fractionComplete += Fail_EVENTS_CREDIT;

		return true;
		
		
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void paint(Graphics2D g) {
		if (Tracer.isMaxTraceMessageGiven()) {
			return;
		}
		if (!paintReceived) {
			Tracer.info(this,"Received Paint Event, NewPaintListener Test Successful");
			paintReceived = true;
		}
		numEventsFired++;
		// actually the paint method may be called once for both approach and fail, so the
		// code below does not make sense
		if (failCalled) {
			Tracer.info(this, "Received paint event after fail call");
			numEventsFiredByFail++;
		} else {
			Tracer.info(this, "Received paint event after approach call");

			numEventsFiredByApproach++;
		}
	}
	@Override
	public void run() {
		Tracer.info(this, "Invoking methods in model to ensure paint() method is triggered ");
		Tracer.info(this, "This should be followed by a message saying: Received Paint Event");

		approach(firstAvatar());
		
// no point calling fail(), as only one paint() event will be fired
		
//		fail();


	}
	
	
}
