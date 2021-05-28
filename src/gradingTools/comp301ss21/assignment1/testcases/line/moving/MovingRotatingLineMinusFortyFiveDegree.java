package gradingTools.comp301ss21.assignment1.testcases.line.moving;

import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineZeroDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.shared.testcases.shapes.rotate.moving.MovingRotatingLineMinusFortyFiveDegreeTest;

public class MovingRotatingLineMinusFortyFiveDegree extends MovingRotatingLineMinusFortyFiveDegreeTest {

//	@Override
//	protected Class precedingTest() {
//		return LineMoveDefined.class;
//	}
	protected Class[] precedingTests() {
		return RotatingLineZeroDegree.PRECEDING_LINE_TESTS;
	}
}
