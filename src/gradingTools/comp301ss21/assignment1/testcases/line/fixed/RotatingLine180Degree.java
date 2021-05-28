package gradingTools.comp301ss21.assignment1.testcases.line.fixed;

public class RotatingLine180Degree extends gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLine180DegreeTest {

//	@Override
//	protected Class precedingTest() {
//		return LineRotateDefined.class;
//	}
	protected Class[] precedingTests() {
		return RotatingLineZeroDegree.PRECEDING_LINE_TESTS;
	}
}
