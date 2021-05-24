package gradingTools.comp301ss21.assignment1.testcases.bridgeScene;

import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveLeftLineTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;

public class BridgeSceneArthurLeftArmMovesWithAvatar extends BridgeSceneArthurMoveLeftArmTestCase {

	@Override
	protected Class precedingTest() {
		return BridgeSceneArthurProperty.class;
	}
}
