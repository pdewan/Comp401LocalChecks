package gradingTools.comp301ss21.assignment1.testcases.line.moving;

import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.shared.testcases.shapes.rotate.moving.MovingRotatingLineFortyFiveDegreeTest;

public class MovingRotatingLineFortyFiveDegree extends MovingRotatingLineFortyFiveDegreeTest {

	@Override
	protected Class precedingTest() {
		return LineMoveDefined.class;
	}
}
