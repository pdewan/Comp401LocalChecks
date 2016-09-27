package gradingTools.comp401f16.assignment4.testcases;

import org.junit.Assert;

import util.assertions.Asserter;
import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment.testInterfaces.TestLocatable;
import gradingTools.comp401f16.assignment.testInterfaces.TestRotatingLine;

public class RotatingFixedLineRotateTest extends RotatingLineTest{
	protected static Integer inputStudentX = 0;
	protected Integer inputStudentY = 0;
	protected int delta = 6;
	protected double intermediateAngle;
	protected double inputStudentAngle = Math.PI/4;;
	boolean clockwise;
	
	@Override
	protected void setInput(TestLocatable aLocatable) {
		super.setInput(aLocatable);
		getRotatingLine().rotate(delta);
		intermediateAngle = getRotatingLine().getAngle();
		clockwise = intermediateAngle < inputAngle();
		getRotatingLine().rotate(delta);
		
	}	
	@Override
	protected void setActual(TestLocatable aLocatable) {
		actualAngle =  getRotatingLine().getAngle();
		
	}
	@Override
	protected Double expectedAngle() {
		Double anOutputDelta = Math.abs(intermediateAngle - inputAngle());
		if (clockwise) {
			return inputAngle() - 2*anOutputDelta;
		}
		return inputAngle() + 2*anOutputDelta;
		
	}
	
	protected boolean checkOutput(TestLocatable aLocatable) {
		super.checkOutput(aLocatable);
		Assert.assertTrue("initial angle" + inputAngle() + " same as final angle " +
					NotesAndScore.PERCENTAGE_MARKER + fractionComplete, 
					Math.abs (inputAngle() - actualAngle) < FRACTION_TOLERANCE);
		
		
		return true;
	}
	@Override
	protected Integer expectedX() {
		return inputX();
	}
	@Override
	protected Integer expectedY() {
		return inputY();
	}
	
	@Override
	protected Integer inputStudentX() {
		return inputStudentX;
	}
	@Override
	protected Integer inputStudentY() {
		return inputStudentY;
	}
	@Override
	protected Double inputStudentAngle() {
		return inputStudentAngle;
	}
	
	@Override
	protected Integer expectedHeight() {
		return (int) Math.round(inputRadius()*Math.sin(inputAngle()));
	}
	protected Integer expectedWidth() {
		return (int) Math.round(inputRadius()*Math.cos(inputAngle()));
	}

	
	

}
