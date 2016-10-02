package gradingTools.comp401f16.assignment5.testcases.move.arthur;

import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneGalahadMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneLancelotMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneRobinMoveLeftArmTestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;

@MaxValue(40)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneArthurMoveLeftArmTestCase.class,
	BridgeSceneLancelotMoveLeftArmTestCase.class,
	BridgeSceneGalahadMoveLeftArmTestCase.class,
	BridgeSceneRobinMoveLeftArmTestCase.class,
	BridgeSceneArthurMoveRightLegTestCase.class,
	BridgeSceneArthurMoveHeadTestCase.class,
	BridgeSceneArthurMoveStringShapeTestCase.class,

})
public class BridgeSceneComponentMoveSuite {

}
