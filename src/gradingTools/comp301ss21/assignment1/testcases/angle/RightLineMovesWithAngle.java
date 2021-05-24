package gradingTools.comp301ss21.assignment1.testcases.angle;

import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveLeftLineTestCase;

public class RightLineMovesWithAngle extends AngleMoveLeftLineTestCase {

	@Override
	protected Class precedingTest() {
		return AngleLeftLineProperty.class;
	}
}
