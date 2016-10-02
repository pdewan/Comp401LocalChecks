package gradingTools.comp401f16.assignment5.testcases.scale.arthur;

import gradingTools.comp401f16.assignment5.testcases.scale.others.BridgeSceneGalahadScaleLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.others.BridgeSceneLancelotScaleLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.others.BridgeSceneRobinScaleLeftArmTestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;

@MaxValue(10)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneArthurScaleLeftArmTestCase.class,
	BridgeSceneLancelotScaleLeftArmTestCase.class,
	BridgeSceneGalahadScaleLeftArmTestCase.class,
	BridgeSceneRobinScaleLeftArmTestCase.class,
	BridgeSceneArthurScaleRightLegTestCase.class,
	
})
@IsExtra(true)
public class BridgeSceneComponentScaleSuite {

}
