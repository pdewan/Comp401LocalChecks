package gradingTools.comp401f16.assignment4.testcases;

import util.assertions.Asserter;
import gradingTools.comp401f16.assignment.testInterfaces.TestLocatable;
import gradingTools.comp401f16.assignment.testInterfaces.TestRotatingLine;

public class RotatingFixedLineSetTest extends RotatingLineTest{
	protected static Integer inputStudentX = 0;
	protected Integer inputStudentY = 0;
	
	@Override
	protected void setInput(TestLocatable aLocatable) {
		super.setInput(aLocatable);
		getRotatingLine().setAngle(inputAngle());
		getRotatingLine().setRadius(inputRadius());
	}
//	@Override
//	protected void setActual(TestLocatable aLocatable) {
//		actualHeight = getRotatingLine().getHeight();
//		actualWidth = getRotatingLine().getWidth();
//		
//	}
	protected boolean checkOutput(TestLocatable aLocatable) {
		super.checkOutput(aLocatable);
		assertWrongHeight();
		assertWrongWidth();
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
	protected Integer expectedHeight() {
		return (int) Math.round(inputRadius()*Math.sin(inputAngle()));
	}
	protected Integer expectedWidth() {
		return (int) Math.round(inputRadius()*Math.cos(inputAngle()));
	}
	

	
	

}
