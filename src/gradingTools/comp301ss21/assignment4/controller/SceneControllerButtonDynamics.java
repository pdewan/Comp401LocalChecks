package gradingTools.comp301ss21.assignment4.controller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;

import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewSingletonFromFactory;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerSingletonFromFactory;
import gradingTools.comp301ss21.assignment4.assertions.AssertingBridgeSceneDynamics;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestBridgeSceneController;

import util.annotations.MaxValue;
import util.trace.Tracer;
@MaxValue(24)
public class SceneControllerButtonDynamics extends AssertingBridgeSceneDynamics implements PropertyChangeListener {
	
	protected final Class[] PRECEDING_TESTS = {
			BridgeSceneSingletonFromFactory.class,
			SceneControllerSingletonFromFactory.class,
			AssertingBridgeSceneDynamics.class,
	};
	@Override
	protected Class[] precedingTests() {
			return PRECEDING_TESTS;
	}
	protected TestBridgeScene getBridgeSceneFromFactory() {
		BridgeSceneSingletonFromFactory aSingleton =
				(BridgeSceneSingletonFromFactory) precedingTestInstances.get(0);
		 return aSingleton.bridgeScene();
	}
	protected TestBridgeSceneController getBridgeSceneControllerFromFactory() {
		SceneControllerSingletonFromFactory aSingleton =
				(SceneControllerSingletonFromFactory) precedingTestInstances.get(1);
		 return aSingleton.sceneController();
	}
//	protected TestBridgeScene bridgeScene;
	protected TestBridgeSceneController sceneController;
	protected void executeOperations(Object aLocatable) {
		
//		approach(firstAvatar());
		doFirstApproach();
		
		doFirstSay();
//		say (guard(), firstSay);		
		
		doSecondSay();
//		say (firstAvatar(), secondSay);
		Tracer.info(this,"Interacting Knight Pass");

		doPass();
//		passKnight();
		

//		approach (secondAvatar());	
		doSecondApproach();
		Tracer.info(this,"Interacting Knight Fail");
//		fail();
		doFail();
		
		
	}
	protected JButton approachButton, sayButton, failedButton, passedButton;
	protected boolean doTest() throws Throwable {
		bridgeScene = getBridgeSceneFromFactory();
		sceneController = getBridgeSceneControllerFromFactory();
		approachButton = sceneController.getApproach();
		sayButton = sceneController.getSay();
		failedButton = sceneController.getFailed();
		passedButton = sceneController.getPassed();
		assertTrue ("Some controller button is null ", 
				approachButton != null && 
				sayButton != null &&
				failedButton != null &&
				passedButton != null);
		bridgeScene.addPropertyChangeListener(this);
		
//		create();
//		
//		setDependentObjects();
		executeOperations(rootProxy);
		
//		setExpected(rootProxy);
//		setActual(rootProxy);
		return checkOutput(rootProxy);
		
	}
	@Override
	protected boolean checkOutput(Object aLocatable) {
		assertTrue ("Number of precondition events " + numPreconditionEvents + " <= " + MIN_PRECCONDITION_EVENTS , numPreconditionEvents > MIN_PRECCONDITION_EVENTS );
		assertTrue ("Num failed events " + numFailedEvents + " > 0" , numFailedEvents == 0);

		return true;
	}
	static final String THIS = "this";
	static final String PASSED = "passed";
	static final String FAILED = "failed";
	static final String SAY = "say";
	static final String APPROACH = "approach";

	protected void myAssertTrue(String aMessage, boolean aCheck) {
		if (!aCheck) {
			numFailedEvents++;
		} else {
			numSucceededEvents++;
		}
		super.assertTrue(aMessage, aCheck);
	}
	protected void assertButtonEnabled (String anOperationName, boolean aBooleanNewValue, JButton aButton) {
		boolean aButtonIsEnabled = aButton.isEnabled();
		
		myAssertTrue("After executing operation " + anOperationName + "new value:" + aBooleanNewValue + " in resulting poperty change notification: " + 
				 aBooleanNewValue +  " != " + aButton.getLabel()+ " enabled status of button:" + aButtonIsEnabled , aBooleanNewValue ==aButtonIsEnabled );
	}
	protected int numPreconditionEvents = 0;
	protected int numFailedEvents = 0;
	protected int numSucceededEvents = 0;
	protected static int MIN_PRECCONDITION_EVENTS = 6;
	@Override
	public void propertyChange(PropertyChangeEvent paramEvt) {
		super.propertyChange(paramEvt);
		boolean aBooleanNewValue = (boolean) paramEvt.getNewValue();
		if (paramEvt.getPropertyName() == THIS) {
			JButton propBtn = null;
			String anOperationName = paramEvt.getOldValue().toString();
			JButton aButton = null;
			numPreconditionEvents++;
			switch (anOperationName) {
			case PASSED: 
				aButton = passedButton;
				break;
			case FAILED: 
				aButton = failedButton;
//				assertButtonEnabled(anOperationName, aBooleanNewValue, failedButton);

				break;
			case SAY: 
				aButton = sayButton;
//				assertButtonEnabled(anOperationName, aBooleanNewValue, sayButton);

			break;
			case APPROACH: 
				
				aButton = approachButton; 
				
				break;
			
			default:
				assertTrue("Unexpected operation notified:" + anOperationName, false);
			}
			assertButtonEnabled(anOperationName, aBooleanNewValue, aButton);

			
		}
	}
}
