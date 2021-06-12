package gradingTools.comp301ss21.assignment3.testcases.style;

import gradingTools.basics.sharedTestCase.checkstyle.MnemonicNameRatioTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NamingConventionsTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp301ss21.assignment3.controller.ArthurBridgeSceneController;
import gradingTools.comp301ss21.assignment3.table.AvatarTableSemantics;
import gradingTools.comp301ss21.assignment3.table.TableSemantics;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.MaxValue;

@MaxValue(10)
public class A3MnemonicNames extends MnemonicNameRatioTestCase {
	static final Class[] PRECEDING_TESTS = {
			ArthurBridgeSceneController.class, 
			TableSemantics.class,
			AvatarTableSemantics.class,
	};
@Override
protected Class[] precedingTests() {
	return PRECEDING_TESTS;
}
}
