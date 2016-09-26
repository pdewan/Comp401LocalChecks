package gradingTools.comp401f16.assignment4.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestLocatable;
import gradingTools.comp401f16.assignment.testInterfaces.TestRotatingLine;

public class RotatingLineRotationTest extends RotatingLineTest{
	public static Double inputStudentRadius = 5.0;
	public static Double inputStudentAngle = 0.0;
	public static Integer inputStudentX = 0;
	public static Integer inputStudentY = 0;
	public static Integer expectedStudentHeight = 0;
	public static Integer expectedStudentWidth = (int) Math.round(inputStudentRadius);

	@Override
	protected boolean doTest(TestRotatingLine aLocatable) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected Double inputStudentRadius() {
		return inputStudentRadius;
	}
	@Override
	protected Double inputStudentAngle() {
		return inputStudentAngle;
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
	protected Integer expectedStudentHeight() {
		return expectedStudentHeight;
	}
	@Override
	protected Integer expectedStudentWidth() {
		return expectedStudentWidth;
	}
	

}
