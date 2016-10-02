package gradingTools.comp401f16.assignment5.testcases.scale.others;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleLeftArmTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class BridgeSceneRobinScaleLeftArmTestCase extends BridgeSceneArthurScaleLeftArmTestCase {
	protected TestAvatar avatar() {
		return bridgeScene().getRobin();
	}

}
