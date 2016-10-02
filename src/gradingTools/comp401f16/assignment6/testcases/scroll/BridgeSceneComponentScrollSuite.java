package gradingTools.comp401f16.assignment6.testcases.scroll;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;

@MaxValue(10)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneArthurScrollLeftArmTestCase.class,
	BridgeSceneGalahadScrollLeftArmTestCase.class,
	BridgeSceneLancelotScrollLeftArmTestCase.class,
	BridgeSceneRobinScrollLeftArmTestCase.class,
	BridgeSceneArthurScrollRightLegTestCase.class,



})
@IsExtra(true)
public class BridgeSceneComponentScrollSuite {

}
