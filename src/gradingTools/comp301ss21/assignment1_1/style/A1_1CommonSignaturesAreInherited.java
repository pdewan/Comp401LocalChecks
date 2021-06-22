package gradingTools.comp301ss21.assignment1_1.style;

import gradingTools.basics.sharedTestCase.checkstyle.CommonPropertiesAreInheritedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CommonSignaturesAreInheritedRatioTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.EncapsulationTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanExpressionTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanReturnTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp301ss21.assignment3.controller.ArthurBridgeSceneController;
import gradingTools.comp301ss21.assignment3.table.AvatarTableSemantics;
import gradingTools.comp301ss21.assignment3.table.TableSemantics;
import gradingTools.comp301ss21.assignment4.assertions.AssertingBridgeSceneDynamics;
import gradingTools.comp301ss21.assignment4.async.AsyncArthurAnimation;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerButtonDynamics;
import gradingTools.comp301ss21.assignment4.coordination.LockstepAvatars;
import gradingTools.comp301ss21.assignment4.coordination.WaitingAvatars;
import gradingTools.comp301ss21.assignment4.exceptions.ArthurIsNotAContortionist;
import gradingTools.comp301ss21.assignment4.sync.SyncArthurAnimation;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.IsExtra;
import util.annotations.MaxValue;

@MaxValue(2)
public class A1_1CommonSignaturesAreInherited extends CommonSignaturesAreInheritedRatioTestCase {
//	static final Class[] PRECEDING_TESTS = {
//			AssertingBridgeSceneDynamics.class,
//			AsyncArthurAnimation.class, 
//			SyncArthurAnimation.class,
//			WaitingAvatars.class,
//			LockstepAvatars.class,
//			SceneControllerButtonDynamics.class,
//			ArthurIsNotAContortionist.class
//	};
@Override
protected Class[] precedingTests() {
	return A1_1CommonPropertiesAreInherited.PRECEDING_TESTS;
}
}
