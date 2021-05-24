package gradingTools.comp301ss21.assignment1.testcases.bridgeScene;

import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveLeftLineTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneGalahadMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneGuardMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneLancelotMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneRobinMoveLeftArmTestCase;

public class BridgeSceneGuardLeftArmMovesWithAvatar extends BridgeSceneGuardMoveLeftArmTestCase {

	@Override
	protected Class precedingTest() {
		return BridgeSceneGuardProperty.class;
	}
}
