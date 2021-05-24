package gradingTools.comp301ss21.assignment1.testcases.bridgeScene.scale;

import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneArthurProperty;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleLeftArmTestCase;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
@IsExtra(true)
@MaxValue(10)
public class BridgeSceneArthurHeadScales extends BridgeSceneArthurScaleHeadTestCase {
	@Override
	protected Class precedingTest() {
		return BridgeSceneArthurProperty.class;
	}
}
