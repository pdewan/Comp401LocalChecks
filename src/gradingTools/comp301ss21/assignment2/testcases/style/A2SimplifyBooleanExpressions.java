package gradingTools.comp301ss21.assignment2.testcases.style;

import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanExpressionTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.MaxValue;

@MaxValue(5)
public class A2SimplifyBooleanExpressions extends SimplifyBooleanExpressionTestCase {
static final Class[] PRECEDING_TESTS = {
		BridgeSceneDynamics.class,
};
@Override
protected Class[] precedingTests() {
	return PRECEDING_TESTS;
}
}
