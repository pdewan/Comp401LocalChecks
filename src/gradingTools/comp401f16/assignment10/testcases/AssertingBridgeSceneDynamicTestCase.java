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
	
	protected double passedCredit() {
		return 0;
	}
	
	protected double failedCredit() {
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
	protected boolean preFailedBeforeApproach;
	protected boolean prePassedBeforeApproach;
	protected boolean preSayBeforeApproach;
	
	protected boolean preApproachAfterApproach;
	protected boolean preSayAfterApproach;
	protected boolean prePassedAfterApproach;
	protected boolean preFailedAfterApproach;
	
	protected boolean preApproachAfterSay1;
	protected boolean preSayAfterSay1;
	protected boolean prePassedAfterSay1;
	protected boolean preFailedAfterSay1;
	
	protected boolean preApproachAfterSay2;
	protected boolean preSayAfterSay2;
	protected boolean prePassedAfterSay2;
	protected boolean preFailedAfterSay2;
	
	protected boolean preApproachAfterPassed;
	protected boolean preSayAfterPassed;
	protected boolean prePassedAfterPassed;
	protected boolean preFailedAfterPassed;
	
	protected boolean preApproachAfterFailed;
	protected boolean preSayAfterFailed;
	protected boolean prePassedAfterFailed;
	protected boolean preFailedAfterFailed;
	List<PropertyChangeEvent> eventsAfterApproach = new ArrayList();
	List<PropertyChangeEvent> eventsAfterSay1 = new ArrayList();
	List<PropertyChangeEvent> eventsAfterSay2 = new ArrayList();
	List<PropertyChangeEvent> eventsAfterFailed = new ArrayList();
	List<PropertyChangeEvent> eventsAfterPassed = new ArrayList();
	List<PropertyChangeEvent> currentEvents;
	
//	protected static final double APPROACH_TRUE_BEFORE_APPROACH_CREDIT = 0.1;
//	protected static final double SAY_FALSE_BEFORE_APPROACH_CREDIT = 0.1;	
//	protected static final double PASSED_FALSE_BEFORE_APPROACH_CREDIT = 0.1;
//	protected static final double FAILED_FALSE_BEFORE_APPROACH_CREDIT = 0.1;
//
//	protected static final double APPROACH_FALSE_AFTER_APPROACH_CREDIT = 0.2;
//	protected static final double SAY_TRUE_AFTER_APPROACH_CREDIT = 0.2;
//	protected static final double PASSED_TRUE_AFTER_APPROACH_CREDIT = 0.1;
//	protected static final double FAILED_TRUE_AFTER_APPROACH_CREDIT = 0.1;
	
	
	
	protected void printFractionComplete() {
//		System.out.println ("Fraction complete:" + fractionComplete);
	}

	@Override
	protected void executeOperations(Object aLocatable) {
		preApproachBeforeApproach = bridgeScene.preApproach();
		preFailedBeforeApproach = bridgeScene.preFailed();
		prePassedBeforeApproach = bridgeScene.prePassed();
		preSayBeforeApproach = bridgeScene.preSay();
		Tracer.info(this,"preApproach Before Approach:" + preApproachBeforeApproach );
		Tracer.info(this,"preSay Before Approach:" + preSayBeforeApproach );
		Tracer.info(this,"preFailed Before Approach:" + preFailedBeforeApproach );
		Tracer.info(this,"prePassed Before Approach:" + prePassedBeforeApproach );
		
		currentEvents = eventsAfterApproach;
		currentEvents.clear();
		approach(firstAvatar());
		preApproachAfterApproach = bridgeScene.preApproach();
		preFailedAfterApproach = bridgeScene.preFailed();
		prePassedAfterApproach = bridgeScene.prePassed();
		preSayAfterApproach = bridgeScene.preSay();	
		Tracer.info(this,"preApproach After Approach:" + preApproachAfterApproach );
		Tracer.info(this,"preSay After Approach:" + preSayAfterApproach );
		Tracer.info(this,"preFailed After Approach:" + preFailedAfterApproach );
		Tracer.info(this,"prePassed After Approach:" + prePassedAfterApproach );
		System.out.println ("Events after appproach:\n" + toString(currentEvents));
		
		currentEvents = eventsAfterSay1;
		currentEvents.clear();
		say (guard(), firstSay);		
		preApproachAfterSay1 = bridgeScene.preApproach();
		preFailedAfterSay1 = bridgeScene.preFailed();
		prePassedAfterSay1 = bridgeScene.prePassed();
		preSayAfterSay1 = bridgeScene.preSay();
		Tracer.info(this,"preApproach After Say1:" + preApproachAfterSay1 );
		Tracer.info(this,"preSay After Say1:" + preSayAfterSay1 );
		Tracer.info(this,"preFailed After Say1:" + preFailedAfterSay1 );
		Tracer.info(this,"prePassed After Say1:" + prePassedAfterSay1 );
		System.out.println ("Events after Say1:\n" + toString(currentEvents));

		
		

		currentEvents = eventsAfterSay2;
		currentEvents.clear();
		say (firstAvatar(), secondSay);
		preApproachAfterSay2 = bridgeScene.preApproach();
		preFailedAfterSay2 = bridgeScene.preFailed();
		prePassedAfterSay2 = bridgeScene.prePassed();
		preSayAfterSay2 = bridgeScene.preSay();	
		Tracer.info(this,"preSay After Say2 (Knight Say):" + preApproachAfterSay2 );
		Tracer.info(this,"preSay After Say2  (Knight Say):" + preSayAfterSay2 );
		Tracer.info(this,"preFailed After Say2  (Knight Say):" + preFailedAfterSay2 );
		Tracer.info(this,"prePassed After Say2  (Knight Say):" + prePassedAfterSay2 );	
		System.out.println ("Events after Say2  (Knight Say):\n" + toString(currentEvents));

		
		currentEvents = eventsAfterPassed;
		currentEvents.clear();
		passed();
		preApproachAfterPassed = bridgeScene.preApproach();
		preFailedAfterPassed = bridgeScene.preFailed();
		prePassedAfterPassed = bridgeScene.prePassed();
		preSayAfterPassed = bridgeScene.preSay();
		Tracer.info(this,"preSay Passed:" + preApproachAfterSay2 );
		Tracer.info(this,"preSay Passed:" + preSayAfterSay2 );
		Tracer.info(this,"preFailed After Passed):" + preFailedAfterSay2 );
		Tracer.info(this,"prePassed After Passed:" + prePassedAfterSay2 );			
		System.out.println ("Events after Passed):\n" + toString(currentEvents));

		approach (secondAvatar());	
		currentEvents = eventsAfterFailed;
		currentEvents.clear();
		failed();
		preApproachAfterFailed = bridgeScene.preApproach();
		preFailedAfterFailed = bridgeScene.preFailed();
		prePassedAfterFailed = bridgeScene.prePassed();
		preSayAfterFailed = bridgeScene.preSay();
		Tracer.info(this,"preApproach After Failed:" + preApproachAfterFailed );
		Tracer.info(this,"preSay After Failed:" + preSayAfterFailed );
		Tracer.info(this,"preFailed After Failed:" + preFailedAfterFailed );
		Tracer.info(this,"prePassed After Failed:" + prePassedAfterFailed );
		System.out.println ("Events after Failed:\n" + toString(currentEvents));

		
		

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
    	System.out.println ("Checking events after approach");
    	if (find(eventsAfterApproach, "this", "approach", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "say", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "passed", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "failed", true)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_SAY1_EVENTS = 2;

    protected void checkEventsAfterSay1() {
    	System.out.println ("Checking events after Guard Say");
    	
    	if (find(eventsAfterApproach, "this", "passed", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "failed", false)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_SAY2_EVENTS = 2;

    protected void checkEventsAfterSay2() {
    	System.out.println ("Checking events after Avatar Say");
    	
    	if (find(eventsAfterApproach, "this", "passed", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterApproach, "this", "failed", true)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_PASSED_EVENTS = 4;

    protected void checkEventsAfterFailed() {
    	System.out.println ("Checking events after failed");
    	if (find(eventsAfterFailed, "this", "approach", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterFailed, "this", "say", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterFailed, "this", "passed", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterFailed, "this", "failed", false)) {
    		numCorrectPreconditions++;
    	}
    }
    protected final static int NUM_FAILED_EVENTS = 4;

    protected void checkEventsAfterPassed() {
    	System.out.println ("Checking events after passed");
    	if (find(eventsAfterPassed, "this", "approach", true)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterPassed, "this", "say", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterPassed, "this", "passed", false)) {
    		numCorrectPreconditions++;
    	}
    	if (find(eventsAfterPassed, "this", "failed", false)) {
    		numCorrectPreconditions++;
    	}
    }
	protected static final int  NUM_PRE_APPROACH_CHECKS = 5;

	protected void checkPreApproach() {
		if (!preApproachBeforeApproach) {
			Tracer.info(this,"preApproach before Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (preApproachAfterApproach) {
			Tracer.info(this,"preApproach after Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (preApproachAfterSay1 || preApproachAfterSay2 ) {
			Tracer.info(this,"preApproach after Say1 and Say2 should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!preApproachAfterFailed) {
			Tracer.info(this,"preApproach after Failed should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preApproachAfterPassed) {
			Tracer.info(this,"preApproach after Passed should be true");
		} else {
			numCorrectPreconditions++;
		}		
	}
	protected static final int  NUM_PRE_SAY_CHECKS = 5;

	protected void checkPreSay() {
		if (preSayBeforeApproach) {
			Tracer.info(this,"preSay before Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!preSayAfterApproach) {
			Tracer.info(this,"preSay after Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preSayAfterSay1 || !preSayAfterSay2 ) {
			Tracer.info(this,"preSay after Guard and Avatar Say should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (preSayAfterFailed) {
			Tracer.info(this,"preSay after Failed should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (preSayAfterPassed) {
			Tracer.info(this,"preSay after Passed should be false");
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
	protected static final int  NUM_PRE_PASSED_CHECKS = 6;

	protected void checkPrePassed() {
		if (prePassedBeforeApproach) {
			Tracer.info(this,"prePassed before Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!prePassedAfterApproach) {
			Tracer.info(this,"prePassed after Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (prePassedAfterSay1) {
			Tracer.info(this,"prePassed after Say1 (Guard Say) should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!prePassedAfterSay2) {
			Tracer.info(this,"prePassed After Say2  (Knight Say) should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (prePassedAfterFailed) {
			Tracer.info(this,"prePassed after Failed should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (prePassedAfterPassed) {
			Tracer.info(this,"prePassed after Passed should be false");
		} else {
			numCorrectPreconditions++;
		}		
	}
	protected static final int  NUM_PRE_FAILED_CHECKS = 6;
	protected void checkPreFailed() {
		if (preFailedBeforeApproach) {
			Tracer.info(this,"preFailed before Approach should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (!preFailedAfterApproach) {
			Tracer.info(this,"preFailed after Approach should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preFailedAfterSay1) {
			Tracer.info(this,"preFailed after Say1 (Guard Say) should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (!preFailedAfterSay2) {
			Tracer.info(this,"preFailed after Say2 should be true");
		} else {
			numCorrectPreconditions++;
		}
		if (preFailedAfterFailed) {
			Tracer.info(this,"preFailed after Failed should be false");
		} else {
			numCorrectPreconditions++;
		}
		if (preFailedAfterPassed) {
			Tracer.info(this,"preFailed after Passed should be false");
		} else {
			numCorrectPreconditions++;
		}		
	}
	protected static final int NUM_CHECKS = 
			NUM_APPROACH_EVENTS +
			NUM_FAILED_EVENTS +
			NUM_PASSED_EVENTS +
			NUM_SAY1_EVENTS +
			NUM_SAY2_EVENTS +
			NUM_PRE_APPROACH_CHECKS +
			NUM_PRE_SAY_CHECKS +
			NUM_PRE_PASSED_CHECKS +
			NUM_PRE_FAILED_CHECKS;
			

	@Override
	protected boolean checkOutput(Object aLocatable) {
		numCorrectPreconditions = 0;
		numCorrectPreEvents = 0;
		checkPreApproach();
		checkPreSay();
		checkPrePassed();
		checkPreFailed();
		checkEventsAfterApproach();
		checkEventsAfterSay1();
		checkEventsAfterSay2();
		checkEventsAfterPassed();
		checkEventsAfterFailed();
		fractionComplete = ((double) numCorrectPreconditions) /NUM_CHECKS;
		if (fractionComplete != 1) {
			assertTrue(NUM_CHECKS - numCorrectPreconditions + " checks out of " + NUM_CHECKS + " failed. See console output", false); 
		}

		return true;
	}
	
	
}
