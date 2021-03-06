package gradingTools.comp401f16.assignment9.testcases.observablepainter;

import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Assert;

import util.annotations.MaxValue;
import util.trace.Tracer;
import grader.basics.execution.BasicProjectExecution;
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
import gradingTools.comp401f16.assignment9.testcases.factory.DelegatingBridgeSceneViewFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.factory.ObservableBridgeScenePainterFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestDelegatingBridgeSceneView;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestObservableBridgeScenePainter;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestPaintListener;
import gradingTools.shared.testcases.shapes.LocatableTest;
@MaxValue(20)
public class ExistingPaintListenerTestCase 
	extends ConsoleSceneViewOutputTestCase 
	{
//	protected boolean failCalled = false;
//	protected int numEventsFiredByApproach;
//	protected int numEventsFiredByFail;
//	
//	protected TestBridgeScene bridgeScene;
	protected static final int MIN_PAINT_LISTENERS = 6; 
	protected TestObservableBridgeScenePainter observableBridgeScenePainter;
	protected Object delegatingBridgeSceneView;
	protected void initState() {
		fractionComplete = 0;
//		failCalled = false;
//		numEventsFiredByApproach = 0;
//		numEventsFiredByFail = 0;
	}
	@Override
	protected Object create() {
		
//		bridgeScene = (TestBridgeScene) getOrCreateObject(
//				factoryClassTags(), 
//				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
//				TestBridgeScene.class);
		observableBridgeScenePainter = (TestObservableBridgeScenePainter) getObjectFromFactory(
				factoryClassTags(), 
				ObservableBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestObservableBridgeScenePainter.class);
		delegatingBridgeSceneView =  getObjectFromFactory(
				factoryClassTags(), 
				DelegatingBridgeSceneViewFactoryMethodTest.FACTORY_METHOD_TAGS, 
				Object.class);
		
		return bridgeScene;
	}
	
	
   
    
//	protected void approach (TestAvatar anAvatar) {
//		Tracer.info(this,toString(anAvatar) + " Approaches");
//		BasicProjectExecution.redirectOutput();
//		bridgeScene().approach(anAvatar);
//		output= BasicProjectExecution.restoreAndGetOut();
//		approachPropertyChanges = parsePropertyChanges(output);
//		
////		boolean aRetval = Arrays.stream(output.split("\n"))
////                .parallel().unordered()
////                .map((line) -> line.matches("java\\.beans\\.PropertyChangeEvent\\[propertyName=.*; oldValue=.*; newValue=.*; propagationId=.*; source=.*\\]"))
////                .allMatch((b)->b==true);
//
//				
//
//		
////		printFractionComplete();
//	}
//
//	protected void fail() {
//		Tracer.info(this,"Interacting Knight Fail");
//		failCalled = true;
//		bridgeScene().fail();
//	}	
//		
//	protected void registerPaintListener() {
//		Tracer.info(this,"Adding paint listener to observable bridge scene painter ");
//		observableBridgeScenePainter.addPaintListener(this);
//		
//	}
//	
	protected List getListeners() {
		List retVal = null;
		try {
			Tracer.info(this,"Getting PaintListener property of observable painter");
			retVal = observableBridgeScenePainter.getPaintListeners();
			return retVal;
			
		} catch (Error e) {
			Tracer.info(this,"Could not find PaintListener property");
			
		}
		try {
			Tracer.info(this,"Getting List field of observable painter ");
			retVal = (List) BasicProjectIntrospection.
					getFieldValueOfType(observableBridgeScenePainter, List.class);
			return retVal;
		} catch (Error e) {
			Tracer.info(this,"Could not find field ");

		}
		return null;
			
	}
	protected void checkListeners() {
		List aListeners = getListeners();
		if (aListeners == null)  {
			assertTrue("Could not find listeners", false);
		}
		int aNumListeners = aListeners.size();
//		fractionComplete = Math.max(1.0, ((double) aNumListeners)/MIN_PAINT_LISTENERS );
		fractionComplete = (double) (aNumListeners)/MIN_PAINT_LISTENERS ;

		if (fractionComplete < 1.0) {
			String aMessage = "Num paint listeners: " + aNumListeners + " < min paint listeners:" + MIN_PAINT_LISTENERS;
			assertTrue(aMessage, false);
		}
		
	}
	protected boolean doTest() throws Throwable {
		initState();		
		rootProxy = create();
//		Object aListeners = BasicProjectIntrospection.
//				getFieldValueOfType(observableBridgeScenePainter, List.class);
//		Class aRealClass = BasicProjectIntrospection.findInterface(TestPaintListener.class);
		checkListeners();
		return true;
		
		
	}
	
	
	
}
