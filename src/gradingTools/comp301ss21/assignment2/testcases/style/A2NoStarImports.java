package gradingTools.comp301ss21.assignment2.testcases.style;

import gradingTools.basics.sharedTestCase.checkstyle.StarImportTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NamedConstantsRatioCheck;
import util.annotations.MaxValue;

@MaxValue(2)
public class A2NoStarImports extends StarImportTestCase {

	public A2NoStarImports() {
		super("", "");
		// TODO Auto-generated constructor stub
	}
	static final Class[] PRECEDING_TESTS = {
			BridgeSceneDynamics.class,
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}

}
