package gradingTools.comp401f16.assignment6.testcases;

import junit.framework.Assert;

import org.junit.Test;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.LocatableTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.ScalableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class CompleteBridgeSceneTestCase extends LocatableTest {
	protected boolean approachWorks;
	protected final double APPROACH_CREDIT = 0.2;
	protected final double SAY_CREDIT = 0.2;
	protected final double PASSED_CREDIT = 0.2;
	protected final double FAILED_CREDIT = 0.2;
	protected final double INITIAL_SCENE_CREDIT = 0.2;


	protected double initialSceneCredit() {
		return INITIAL_SCENE_CREDIT;
	}
	protected String initialSceneUnoccupiedrMessage() {
		return "Scene Initially Occupied";
	}
	
	protected double approachCredit() {
		return APPROACH_CREDIT;
	}
	protected String approachErrorMessage() {
		return "Approach failed";
	}
	protected double sayCredit() {
		return SAY_CREDIT;
	}
	protected String sayErrorMessage() {
		return "Say failed";
	}
	protected double passedCredit() {
		return PASSED_CREDIT;
	}
	protected String passedErrorMessage() {
		return "pass failed";
	}
	protected double failedCredit() {
		return FAILED_CREDIT;
	}
	protected String failedErrorMessage() {
		return "failed failed";
	}
	protected TestBridgeScene bridgeScene() {
		return (TestBridgeScene) rootProxy;
	}
	
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	
	protected boolean doTest() throws Throwable {
		create();
		
		setDependentObjects();
		executeOperations(rootProxy);
		setExpected(rootProxy);
		setActual(rootProxy);
		return checkOutput(rootProxy);
		
	}
	@Override
	protected void executeOperations(Object aLocatable) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void setActual(Object aLocatable) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected boolean checkOutput(Object aLocatable) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void setLeafProxy() {
		// TODO Auto-generated method stub
		
	}
	
}
