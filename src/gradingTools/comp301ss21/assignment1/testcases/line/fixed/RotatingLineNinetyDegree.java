package gradingTools.comp301ss21.assignment1.testcases.line.fixed;

public class RotatingLineNinetyDegree extends gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineNinetyDegreeTest {

//	@Override
//	protected Class precedingTest() {
//		return LineRotateDefined.class;
//
//	}
	protected Class[] precedingTests() {
		return RotatingLineZeroDegree.PRECEDING_LINE_TESTS;
	}
}
