package gradingTools.comp401f16.assignment10.testcases;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import util.annotations.MaxValue;
import util.trace.Tracer;
import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveArthurTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.shared.testcases.shapes.LocatableTest;
@MaxValue(72)
public class AssertingBridgeSceneDynamicTestCase 
	extends BridgeSceneDynamicTestCase implements PropertyChangeListener{
	protected double eachApproachCredit() {
		return 0;
	}
	protected double eachSayCredit() {
		return 0;
	}
	protected double lastSayCredit() {
		return 0;
	}
	
	protected double passCredit() {
		return 0;
	}
	
	protected double failCredit() {
		return 0;
	}
	@Override
	protected Object create() {
		
		bridgeScene = (TestBridgeScene) getOrCreateObject(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		rootProxy = bridgeScene;
		bridgeScene.addPropertyChangeListener(this); // will be listener of all project events!
		return bridgeScene;
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (currentEvents != null)
		currentEvents.add(evt);
	}
	protected boolean preApproachBeforeApproach;
	protected boolean preFailBeforeApproach;
	protected boolean prePassBeforeApproach;
	protected boolean preSayBeforeApproach;
	
	protected boolean preApproachAfterApproach;
	protected boolean preSayAfterApproach;
	protected boolean prePassAfterApproach;
	protected boolean preFailAfterApproach;
	
	protected boolean preApproachAfterSay1;
	protected boolean preSayAfterSay1;
	protected boolean prePassAfterSay1;
	protected boolean preFailAfterSay1;
	
	protected boolean preApproachAfterSay2;
	protected boolean preSayAfterSay2;
	protected boolean prePassAfterSay2;
	protected boolean preFailAfterSay2;
	
	protected boolean preApproachAfterPass;
	protected boolean preSayAfterPass;
	protected boolean prePassAfterPass;
	protected boolean preFailAfterPass;
	
	protected boolean preApproachAfterFail;
	protected boolean preSayAfterFail;
	protected boolean prePassAfterFail;
	protected boolean preFailAfterFail;
	List<PropertyChangeEvent> eventsAfterApproach = new ArrayList();
	List<PropertyChangeEvent> eventsAfterSay1 = new ArrayList();
	List<PropertyChangeEvent> eventsAfterSay2 = new ArrayList();
	List<PropertyChangeEvent> eventsAfterFail = new ArrayList();
	List<PropertyChangeEvent> eventsAfterPass = new ArrayList();
	List<PropertyChangeEvent> currentEvents;
	
//	protected static final double APPROACH_TRUE_BEFORE_APPROACH_CREDIT = 0.1;
//	protected static final double SAY_FALSE_BEFORE_APPROACH_CREDIT = 0.1;	
//	protected static final double Pass_FALSE_BEFORE_APPROACH_CREDIT = 0.1;
//	protected static final double Fail_FALSE_BEFORE_APPROACH_CREDIT = 0.1;
//
//	protected static final double APPROACH_FALSE_AFTER_APPROACH_CREDIT = 0.2;
//	protected static final double SAY_TRUE_AFTER_APPROACH_CREDIT = 0.2;
//	protected static final double Pass_TRUE_AFTER_APPROACH_CREDIT = 0.1;
//	protected static final double Fail_TRUE_AFTER_APPROACH_CREDIT = 0.1;
	
	
	
	protected void printFractionComplete() {
//		System.out.println ("Fraction complete:" + fractionComplete);
	}

	@Override
	protected void executeOperations(Object aLocatable) {
		preApproachBeforeApproach = bridgeScene.preApproach();
		preFailBeforeApproach = bridgeScene.preFail();
		prePassBeforeApproach = bridgeScene.prePass();
		preSayBeforeApproach = bridgeScene.preSay();
		Tracer.info(this,"preApproach Before Approach:" + preApproachBeforeApproach );
		Tracer.info(this,"preSay Before Approach:" + preSayBeforeApproach );
		Tracer.info(this,"preFail Before Approach:" + preFailBeforeApproach );
		Tracer.info(this,"prePass Before Approach:" + prePassBeforeApproach );
		
		currentEvents = eventsAfterApproach;
		currentEvents.clear();
		approach(firstAvatar());
		preApproachAfterApproach = bridgeScene.preApproach();
		preFailAfterApproach = bridgeScene.preFail();
		prePassAfterApproach = bridgeScene.prePass();
		preSayAfterApproach = bridgeScene.preSay();	
		Tracer.info(this,"preApproach After Approach:" + preApproachAfterApproach );
		Tracer.info(this,"preSay After Approach:" + preSayAfterApproach );
		Tracer.info(this,"preFail After Approach:" + preFailAfterApproach );
		Tracer.info(this,"prePass After Approach:" + prePassAfterApproach );
		Tracer.info (this, "Events after appproach:\n" + toString(currentEvents));
		
		currentEvents = eventsAfterSay1;
		currentEvents.clear();
		say (guard(), firstSay);		
		preApproachAfterSay1 = bridgeScene.preApproach();
		preFailAfterSay1 = bridgeScene.preFail();
		prePassAfterSay1 = bridgeScene.prePass();
		preSayAfterSay1 = bridgeScene.preSay();
		Tracer.info(this,"preApproach After Say1:" + preApproachAfterSay1 );
		Tracer.info(this,"preSay After Say1:" + preSayAfterSay1 );
		Tracer.info(this,"preFail After Say1:" + preFailAfterSay1 );
		Tracer.info(this,"prePass After Say1:" + prePassAfterSay1 );
		Tracer.info(this,"Events after Say1:\n" + toString(currentEvents));

		
		

		currentEvents = eventsAfterSay2;
		currentEvents.clear();
		say (firstAvatar(), secondSay);
		preApproachAfterSay2 = bridgeScene.preApproach();
		preFailAfterSay2 = bridgeScene.preFail();
		prePassAfterSay2 = bridgeScene.prePass();
		preSayAfterSay2 = bridgeScene.preSay();	
		Tracer.info(this,"preSay After Say2 (Knight Say):" + preApproachAfterSay2 );
		Tracer.info(this,"preSay After Say2  (Knight Say):" + preSayAfterSay2 );
		Tracer.info(this,"preFail After Say2  (Knight Say):" + preFailAfterSay2 );
		Tracer.info(this,"prePass After Say2  (Knight Say):" + prePassAfterSay2 );	
		Tracer.info(this,"Events after Say2  (Knight Say):\n" + toString(currentEvents));

		
		currentEvents = eventsAfterPass;
		currentEvents.clear();
		pass();
		preApproachAfterPass = bridgeScene.preApproach();
		preFailAfterPass = bridgeScene.preFail();
		prePassAfterPass = bridgeScene.prePass();
		preSayAfterPass = bridgeScene.preSay();
		Tracer.info(this,"preSay Pass:" + preApproachAfterSay2 );
		Tracer.info(this,"preSay Pass:" + preSayAfterSay2 );
		Tracer.info(this,"preFail After Pass):" + preFailAfterSay2 );
		Tracer.info(this,"prePass After Pass:" + prePassAfterSay2 );			
		Tracer.info(this,"Events after Pass:\n" + toString(currentEvents));

		approach (secondAvatar());	
		currentEvents = eventsAfterFail;
		currentEvents.clear();
		fail();
		preApproachAfterFail = bridgeScene.preApproach();
		preFailAfterFail = bridgeScene.preFail();
		prePassAfterFail = bridgeScene.prePass();
		preSayAfterFail = bridgeScene.preSay();
		Tracer.info(this,"preApproach After Fail:" + preApproachAfterFail );
		Tracer.info(this,"preSay After Fail:" + preSayAfterFail );
		Tracer.info(this,"preFail After Fail:" + preFailAfterFail );
		Tracer.info(this,"prePass After Fail:" + prePassAfterFail );
		Tracer.info(this,"Events after Fail:\n" + toString(currentEvents));

		
		

		// TODO Auto-generated method stub
		
	}
	int numCorrectPreconditions = 0;
	int numCorrectPreEvents = 0;
	
	protected boolean find (List<PropertyChangeEvent> aList, String aPropertyName, String oldValue, boolean newValue) {
		boolean aResult = false;
		for (PropertyChangeEvent anEvent:aList) {
			if (matches(anEvent, aPropertyName, oldValue, newValue)) {
				return true;
			}
		}
		Tracer.info(this,"Did not receive event with propertyName: " + aPropertyName + ", old value:" + oldValue + " and newValue:" + newValue);
		return false;
	}
    protected boolean matches (PropertyChangeEvent anEvent, String aPropertyName, String oldValue, boolean newValue) {
    	Object anActualOldValue = anEvent.getOldValue();
    	if (!(anActualOldValue instanceof String)) {
    		return false;
    	}
    	
    	
		return oldValue.equalsIgnoreCase((String) anActualOldValue) && 
				anActualOldValue.equals(oldValue) && 
				anEvent.getPropertyName().equalsIgnoreCase(aPropertyName);
	}
    protected final static int NUM_APPROACH_EVENTS = 4;
    protected void checkEventsAfterApproach() {
    	Tracer.info (this, "Checking events after approach");
    	if (find(eventsAfterApproach, "this", "approach", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "say", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "pass", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "fail", true)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_SAY1_EVENTS = 2;

    protected void checkEventsAfterSay1() {
    	Tracer.info  (this, "Checking events after Guard Say");
    	
    	if (find(eventsAfterApproach, "this", "pass", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "fail", false)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_SAY2_EVENTS = 2;

    protected void checkEventsAfterSay2() {
    	Tracer.info (this, "Checking events after Avatar Say");
    	
    	if (find(eventsAfterApproach, "this", "pass", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "fail", true)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_Pass_EVENTS = 4;

    protected void checkEventsAfterFail() {
    	Tracer.info (this, "Checking events after fail");
    	if (find(eventsAfterFail, "this", "approach", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterFail, "this", "say", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterFail, "this", "pass", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterFail, "this", "fail", false)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_Fail_EVENTS = 4;

    protected void checkEventsAfterPass() {
    	Tracer.info (this, "Checking events after pass");
    	if (find(eventsAfterPass, "this", "approach", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterPass, "this", "say", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterPass, "this", "pass", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterPass, "this", "fail", false)) {
    		numCorrectPreconditions++;
    	}
    }
	protected static final int  NUM_PRE_APPROACH_CHECKS = 5;

	protected void checkPreApproach() {
		if (!preApproachBeforeApproach) {
			Tracer.error("preApproach before Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (preApproachAfterApproach) {
			Tracer.error("preApproach after Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (preApproachAfterSay1 || preApproachAfterSay2 ) {
			Tracer.error("preApproach after Say1 and Say2 should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!preApproachAfterFail) {
			Tracer.error("preApproach after Fail should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preApproachAfterPass) {
			Tracer.error("preApproach after Pass should be true");
		} else {
			numCorrectPreconditions++;
		}		
	}
	protected static final int  NUM_PRE_SAY_CHECKS = 5;

	protected void checkPreSay() {
		if (preSayBeforeApproach) {
			Tracer.error("preSay before Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!preSayAfterApproach) {
			Tracer.error("preSay after Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preSayAfterSay1 || !preSayAfterSay2 ) {
			Tracer.error("preSay after Guard and Avatar Say should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (preSayAfterFail) {
			Tracer.error("preSay after Fail should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (preSayAfterPass) {
			Tracer.error("preSay after Pass should be false");
		} else {
			numCorrectPreconditions++;
		}		
	}
	protected String toString(List<PropertyChangeEvent> aList) {
		String result = "";
		for (PropertyChangeEvent anEvent:aList) {
			result += anEvent + "\n";
		}
		return result;
	}
	protected static final int  NUM_PRE_Pass_CHECKS = 6;

	protected void checkPrePass() {
		if (prePassBeforeApproach) {
			Tracer.error("prePass before Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!prePassAfterApproach) {
			Tracer.error("prePass after Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (prePassAfterSay1) {
			Tracer.error("prePass after Say1 (Guard Say) should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!prePassAfterSay2) {
			Tracer.error("prePass After Say2  (Knight Say) should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (prePassAfterFail) {
			Tracer.error("prePass after Fail should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (prePassAfterPass) {
			Tracer.error("prePass after Pass should be false");
		} else {
			numCorrectPreconditions++;
		}		
	}
	protected static final int  NUM_PRE_Fail_CHECKS = 6;
	protected void checkPreFail() {
		if (preFailBeforeApproach) {
			Tracer.error("preFail before Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!preFailAfterApproach) {
			Tracer.error("preFail after Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preFailAfterSay1) {
			Tracer.error("preFail after Say1 (Guard Say) should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preFailAfterSay2) {
			Tracer.error("preFail after Say2 should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (preFailAfterFail) {
			Tracer.error("preFail after Fail should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (preFailAfterPass) {
			Tracer.error("preFail after Pass should be false");
		} else {
			numCorrectPreconditions++;
		}		
	}
	protected static final int NUM_CHECKS = 
			NUM_APPROACH_EVENTS +
			NUM_Fail_EVENTS +
			NUM_Pass_EVENTS +
			NUM_SAY1_EVENTS +
			NUM_SAY2_EVENTS +
			NUM_PRE_APPROACH_CHECKS +
			NUM_PRE_SAY_CHECKS +
			NUM_PRE_Pass_CHECKS +
			NUM_PRE_Fail_CHECKS;
			

	@Override
	protected boolean checkOutput(Object aLocatable) {
		numCorrectPreconditions = 0;
		numCorrectPreEvents = 0;
		checkPreApproach();
		checkPreSay();
		checkPrePass();
		checkPreFail();
		checkEventsAfterApproach();
		checkEventsAfterSay1();
		checkEventsAfterSay2();
		checkEventsAfterPass();
		checkEventsAfterFail();
		fractionComplete = ((double) numCorrectPreconditions) /NUM_CHECKS;
		if (fractionComplete != 1) {
			assertTrue(NUM_CHECKS - numCorrectPreconditions + " checks out of " + NUM_CHECKS + " fail. See console error messages", false); 
		}

		return true;
	}
	
	
}
