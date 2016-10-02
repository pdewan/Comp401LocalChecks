package gradingTools.comp401f16.assignment5.testcases.move.others;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class BridgeSceneLancelotMoveLeftArmTestCase extends BridgeSceneArthurMoveLeftArmTestCase {
	protected TestAvatar avatar() {
		return bridgeScene().getLancelot();
	}

}
