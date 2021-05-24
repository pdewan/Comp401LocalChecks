package gradingTools.comp301ss21.assignment1.testcases.bridgeScene.scale;

import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneArthurProperty;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleLeftArmTestCase;
import util.annotations.IsExtra;
@IsExtra(true)
public class BridgeSceneArthurLeftArmScales extends BridgeSceneArthurScaleLeftArmTestCase {
	@Override
	protected Class precedingTest() {
		return BridgeSceneArthurProperty.class;
	}
}
