package gradingTools.comp401f16.assignment5.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;

@MaxValue(15)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneArthurScaleLeftArmTestCase.class,
	BridgeSceneArthurScaleRightLegTestCase.class,
	BridgeSceneArthurScaleHeadTestCase.class
	
})
@IsExtra(true)
public class BridgeSceneComponentScaleSuite {

}
