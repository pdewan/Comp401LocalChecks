package gradingTools.comp401f16.assignment4.testcases;


public class RotatingLineZeroDegreeTest extends RotatingFixedLineSetTest{
	protected static final Double inputStudentRadius = 5.0;

	@Override
	protected Double inputStudentRadius() {
		return inputStudentRadius;
	}
	@Override
	protected Double inputStudentAngle() {
		return 0.0;
	}
	

}
