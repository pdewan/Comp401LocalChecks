package gradingTools.comp301ss21.assignment2.testcases.style;

import gradingTools.basics.sharedTestCase.checkstyle.MnemonicNameRatioTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NamingConventionsTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.MaxValue;

@MaxValue(10)
public class A2MnemonicNames extends MnemonicNameRatioTestCase {
static final Class[] PRECEDING_TESTS = {
		BridgeSceneDynamics.class,
};
@Override
protected Class[] precedingTests() {
	return PRECEDING_TESTS;
}
}
