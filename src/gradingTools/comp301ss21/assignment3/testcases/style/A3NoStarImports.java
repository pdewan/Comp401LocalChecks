package gradingTools.comp301ss21.assignment3.testcases.style;

import gradingTools.basics.sharedTestCase.checkstyle.StarImportTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp301ss21.assignment3.controller.ArthurBridgeSceneController;
import gradingTools.comp301ss21.assignment3.table.AvatarTableSemantics;
import gradingTools.comp301ss21.assignment3.table.TableSemantics;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NamedConstantsRatioCheck;
import util.annotations.MaxValue;

@MaxValue(2)
public class A3NoStarImports extends StarImportTestCase {

	public A3NoStarImports() {
		super("", "");
		// TODO Auto-generated constructor stub
	}
//	static final Class[] PRECEDING_TESTS = {
//			ArthurBridgeSceneController.class, 
//			TableSemantics.class,
//			AvatarTableSemantics.class,
//	};
//	@Override
//	protected Class[] precedingTests() {
//		return PRECEDING_TESTS;
//	}

}
