package gradingTools.comp301ss21.assignment4.style;

import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanExpressionTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanReturnTestCase;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp301ss21.assignment3.controller.ArthurBridgeSceneController;
import gradingTools.comp301ss21.assignment3.table.AvatarTableSemantics;
import gradingTools.comp301ss21.assignment3.table.TableSemantics;
import gradingTools.comp301ss21.assignment4.assertions.AssertingBridgeSceneDynamics;
import gradingTools.comp301ss21.assignment4.async.AsyncArthurAnimation;
import gradingTools.comp301ss21.assignment4.coordination.LockstepAvatars;
import gradingTools.comp301ss21.assignment4.coordination.WaitingAvatars;
import gradingTools.comp301ss21.assignment4.sync.SyncArthurAnimation;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import util.annotations.MaxValue;

@MaxValue(1)
public class A4SimplifyBooleanReturns extends SimplifyBooleanReturnTestCase {
//	static final Class[] PRECEDING_TESTS = {
//			AssertingBridgeSceneDynamics.class,
//			AsyncArthurAnimation.class, 
//			SyncArthurAnimation.class,
//			WaitingAvatars.class,
//			LockstepAvatars.class,
//	};
@Override
protected Class[] precedingTests() {
	return A4CommonPropertiesAreInherited.PRECEDING_TESTS;
}
}
