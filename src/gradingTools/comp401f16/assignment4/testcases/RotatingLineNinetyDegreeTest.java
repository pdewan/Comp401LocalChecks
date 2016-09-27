package gradingTools.comp401f16.assignment4.testcases;


public class RotatingLineNinetyDegreeTest extends RotatingLineRotationTest{

	
	@Override
	protected Double inputStudentAngle() {
		return Math.PI/2;
	}
	@Override
	protected Integer expectedStudentHeight() {
		return (int) Math.round(expectedRadius());
	}
	@Override
	protected Integer expectedStudentWidth() {
		return 0;
	}
	

}
