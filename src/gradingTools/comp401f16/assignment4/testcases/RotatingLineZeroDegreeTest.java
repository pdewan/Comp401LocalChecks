package gradingTools.comp401f16.assignment4.testcases;


public class RotatingLineZeroDegreeTest extends RotatingLineRotationTest{

	
	@Override
	protected Double inputStudentAngle() {
		return 0.0;
	}
	@Override
	protected Integer expectedStudentHeight() {
		return 0;
	}
	@Override
	protected Integer expectedStudentWidth() {
		return (int) Math.round(expectedRadius());
	}
	

}
