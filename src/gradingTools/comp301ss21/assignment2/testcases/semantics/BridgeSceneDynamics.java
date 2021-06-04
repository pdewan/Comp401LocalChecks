package gradingTools.comp301ss21.assignment2.testcases.semantics;

import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.MaxValue;
@MaxValue(50)
public class BridgeSceneDynamics extends BridgeSceneDynamicTestCase {
protected final Class[] PRECEDING_TESTS = {
		BridgeSceneApproachMethodDefined.class,
		BridgeSceneSayMethodDefined.class,
		BridgeScenePassedMethodDefined.class,
		BridgeSceneFailedMethodDefined.class
};
protected Class[] precedingTests() {
	return PRECEDING_TESTS;
}
}
