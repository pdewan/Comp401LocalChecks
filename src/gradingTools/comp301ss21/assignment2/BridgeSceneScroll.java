package gradingTools.comp301ss21.assignment2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment2.testcases.scroll.BridgeSceneScrollMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneApproachMethodDefined;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneArthurScrollLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneArthurScrollRightLegTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneGalahadScrollLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneLancelotScrollLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneRobinScrollLeftArmTestCase;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneScrollMethodDefined.class,
	BridgeSceneArthurScrollLeftArmTestCase.class,
	BridgeSceneGalahadScrollLeftArmTestCase.class,
	BridgeSceneLancelotScrollLeftArmTestCase.class,
	BridgeSceneRobinScrollLeftArmTestCase.class,
	BridgeSceneArthurScrollRightLegTestCase.class,

})
@MaxValue(12)
@IsExtra(true)
public class BridgeSceneScroll {

	

}
