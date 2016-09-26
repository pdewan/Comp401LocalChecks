package gradingTools.comp401f16.assignment4.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.execution.GradingMode;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestLine;
import gradingTools.comp401f16.assignment.testInterfaces.TestLocatable;
import gradingTools.comp401f16.assignment.testInterfaces.TestPolarLine;
import gradingTools.comp401f16.assignment.testInterfaces.TestRotatingLine;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.OutputAndErrorCheckingTestCase;

public abstract class LocatableTest extends MethodExecutionTest{
	protected TestLocatable locatable;
	public static final double FRACTION_TOLERANCE = 0.1;
	public static final double INT_TOLERANCE = 1;
	
	protected abstract Class locatableClass();
	protected int actualX, actualY, actualWidth, actualHeight;
	protected double actualRadius, actualAngle;
	
	protected TestLocatable createLocatable(){
		locatable = (TestLocatable) BasicProjectIntrospection.createInstance(locatableClass(), getArgs());
		return locatable;
	}
	
	protected TestLocatable createOrGetLastLocatable(){
		locatable = (TestLocatable) BasicProjectIntrospection.createOrGetLastInstance(locatableClass(), getArgs());
		return locatable;
	}
	

	protected void assertAngle(double aComputed, double aCorrect) {
		Assert.assertTrue("computedAngle " + aComputed + " != correctAngle " + aCorrect + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, Math.abs(aComputed - aCorrect) <= FRACTION_TOLERANCE);

	}
	protected void assertRadius(double aComputed, double aCorrect) {
		Assert.assertTrue("computedRadius " + aComputed + " != correctRadius " + aCorrect + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, Math.abs(aComputed - aCorrect) <= FRACTION_TOLERANCE);

	}
	protected void assertHeight(int aComputed, int aCorrect) {
		Assert.assertTrue("computedHeight " + aComputed + " != correctHeight " + aCorrect + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, Math.abs(aComputed - aCorrect) < INT_TOLERANCE);

	}
	protected void assertWidth(int aComputed, int aCorrect) {
		Assert.assertTrue("computedWidth " + aComputed + " != correctWidth " + aCorrect + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, Math.abs(aComputed - aCorrect) < INT_TOLERANCE);

	}
	
	protected void assertX(int aComputed, int aCorrect) {
		Assert.assertTrue("computedX " + aComputed + " != correctX " + aCorrect + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, Math.abs(aComputed - aCorrect) < INT_TOLERANCE);

	}
	protected void assertY(int aComputed, int aCorrect) {
		Assert.assertTrue("computedY " + aComputed + " != correctY " + aCorrect + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, Math.abs(aComputed - aCorrect) < INT_TOLERANCE);

	}
	
	protected void testAngleRadius(TestPolarLine aPolarLine, Double aCorrectRadius, Double aCorrectAngle) {
		double aComputedRadius =  aPolarLine.getRadius();
		double aComputedAngle = aPolarLine.getAngle();
		if (aCorrectRadius != null) {
			assertRadius(aComputedRadius, aCorrectRadius);
		}
		if (aCorrectAngle != null) {
			assertAngle(aComputedAngle, aCorrectAngle);
		}
	}
	protected void testWidthHeight(TestLine aLine, Integer aCorrectWidth, Integer aCorrectHeight) {
		int aComputedWidth=  aLine.getWidth();
		int aComputedHeight = aLine.getHeight();
		if (aCorrectWidth != null) {
			assertWidth(aComputedWidth, aCorrectWidth);
		}
		if (aCorrectHeight != null) {
			assertHeight(aComputedHeight, aCorrectHeight);
		}
	}
	protected void testLocation(TestLine aLine, Integer aCorrectX, Integer aCorrectY) {
		int aComputedX=  aLine.getX();
		int aComputedY = aLine.getY();
		if (aCorrectX != null) {
			assertX(aComputedX, aCorrectX);
		}
		if (aCorrectY != null) {
			assertHeight(aComputedY, aCorrectY);
		}
	}    
	
	
	
//	protected void traceProcessReturnValue() {
//		System.out.println(
//				"Comparing actial return value: " + 
//						Arrays.toString((Object[]) getReturnValue()) +
//				" with expected return value: " + 
//						Arrays.toString((Object[]) getExpectedReturnValue()));
//	}
//	@Override
//	protected Object getExpectedReturnValue() {
//		return null;
////		return tokenLines()[getLineIndex()];
//	}

	protected void doExtraStep() {
		
	}
	protected TestLocatable create() {
		return createOrGetLastLocatable();
	}
	protected abstract boolean doTest(TestLocatable aLocatable);
	protected boolean doTest() throws Throwable {
		create();
		return doTest(locatable);
		
	}
	// Student test data
	protected Double inputStudentAngle() {
		return null;
	}
	protected Double inputStudentRadius() {
		return null;
	}
	protected Double expectedStudentAngle() {
		return null;
	}
	protected Double expectedStudentRadius() {
		return null;
	}
	
	protected Integer inputStudentWidth() {
		return null;
	}
	protected Integer inputStudentHeight() {
		return null;
	}
	protected Integer expectedStudentWidth() {
		return null;
	}
	protected Integer expectedStudentHeight() {
		return null;
	}
	protected Integer inputStudentX() {
		return null;
	}
	protected Integer inputStudentY() {
		return null;
	}
	protected Integer expectedStudentX() {
		return null;
	}
	protected Integer expectedStudentY() {
		return null;
	}
	// Grader test data
	protected Double inputGraderAngle() {
		return inputStudentAngle();
	}
	protected Double inputGraderRadius() {
		return inputStudentRadius();
	}
	protected Double expectedGraderAngle() {
		return inputGraderAngle();
	}
	protected Double expectedGraderRadius() {
		return inputStudentRadius();
	}
	protected Integer inputGraderWidth() {
		return inputStudentWidth();
	}
	protected Integer inputGraderHeight() {
		return inputStudentHeight();
	}
	protected Integer expectedGraderWidth() {
		return inputStudentWidth();
	}
	protected Integer expectedGraderHeight() {
		return inputStudentHeight();
	}
	protected Integer inputGraderX() {
		return inputStudentX();
	}
	protected Integer inputGraderY() {
		return inputStudentY();
	}
	protected Integer expectedGraderX() {
		return inputStudentX();
	}
	protected Integer expectedGraderY() {
		return inputGraderY();
	}
	
	// final test data
	
	protected Double inputAngle() {
		if (GradingMode.getGraderRun())
			return inputGraderAngle();
		return inputStudentAngle();
	}
	protected Double inputRadius() {
		if (GradingMode.getGraderRun())
			return inputGraderRadius();
		return inputStudentRadius();	
	}
	protected Double expectedAngle() {
		if (GradingMode.getGraderRun())
			return expectedGraderAngle();
		return expectedStudentAngle();
	}
	protected Double expectedRadius() {
		if (GradingMode.getGraderRun())
			return expectedGraderRadius();
		return expectedStudentRadius();
	}
	protected Integer inputWidth() {
		if (GradingMode.getGraderRun())
			return inputGraderWidth();
		return inputStudentWidth();
	}
	protected Integer inputHeight() {
		if (GradingMode.getGraderRun())
			return inputGraderHeight();
		return inputStudentHeight();
	}
	protected Integer expectedWidth() {
		if (GradingMode.getGraderRun())
			return expectedGraderWidth();
		return expectedStudentWidth();
	}
	protected Integer expectedHeight() {
		if (GradingMode.getGraderRun())
			return expectedGraderHeight();
		return expectedStudentHeight();
	}
	protected Integer inputX() {
		if (GradingMode.getGraderRun())
			return inputGraderX();
		return inputStudentX();
	}
	protected Integer inputY() {
		if (GradingMode.getGraderRun())
			return inputGraderY();
		return inputStudentY();
	}
	protected Integer expectedX() {
		if (GradingMode.getGraderRun())
			return expectedGraderX();
		return expectedStudentX();
	}
	protected Integer expectedY() {
		if (GradingMode.getGraderRun())
			return expectedGraderY();
		return expectedStudentY();
	}
	
//	protected boolean returnValueIsExpected() {
//		return Arrays.equals((Object[]) getExpectedReturnValue(), (Object[]) getReturnValue());
//	}

}
