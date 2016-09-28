package gradingTools.comp401f16.assignment5.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;

@MaxValue(40)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneArthurMoveLeftArmTestCase.class,
	BridgeSceneArthurMoveRightLegTestCase.class,
	BridgeSceneArthurMoveHeadTestCase.class,
	BridgeSceneArthurMoveStringShapeTestCase.class
})
public class BridgeSceneComponentMoveSuite {

}
