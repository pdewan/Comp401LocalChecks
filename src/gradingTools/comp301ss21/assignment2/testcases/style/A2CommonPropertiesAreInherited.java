package gradingTools.comp301ss21.assignment2.testcases.style;

import gradingTools.basics.sharedTestCase.checkstyle.CommonPropertiesAreInheritedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.EncapsulationTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanExpressionTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanReturnTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.IsExtra;
import util.annotations.MaxValue;

@MaxValue(7)
@IsExtra(true)
public class A2CommonPropertiesAreInherited extends CommonPropertiesAreInheritedTestCase {
static final Class[] PRECEDING_TESTS = {
		BridgeSceneDynamics.class,
};
@Override
protected Class[] precedingTests() {
	return PRECEDING_TESTS;
}
}
