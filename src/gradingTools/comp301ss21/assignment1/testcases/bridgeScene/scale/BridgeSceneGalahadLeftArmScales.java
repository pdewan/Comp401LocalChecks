package gradingTools.comp301ss21.assignment1.testcases.bridgeScene.scale;

import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneArthurProperty;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneGalahadProperty;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.others.BridgeSceneGalahadScaleLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.others.BridgeSceneLancelotScaleLeftArmTestCase;
import util.annotations.IsExtra;
@IsExtra(true)
public class BridgeSceneGalahadLeftArmScales extends BridgeSceneGalahadScaleLeftArmTestCase {
	@Override
	protected Class precedingTest() {
		return BridgeSceneGalahadProperty.class;
	}
}
