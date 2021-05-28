package gradingTools.comp301ss21.assignment1.testcases.line.fixed;

public class RotatingLineZeroDegree extends gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineZeroDegreeTest {
	public static final Class[] PRECEDING_LINE_TESTS = {
			LineXProperty.class,
			LineXEditableProperty.class,
			LineYProperty.class,
			LineYEditableProperty.class,
			LineRadiusProperty.class,
			LineRadiusEditableProperty.class,
			LineAngleProperty.class,
			LineAngleEditableProperty.class,
	};
	@Override
//	protected Class precedingTest() {
//		return LineRotateDefined.class;
//	}
	protected Class[] precedingTests() {
		return PRECEDING_LINE_TESTS;
	}
}
