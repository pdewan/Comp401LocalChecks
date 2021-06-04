package gradingTools.comp301ss21.assignment2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneApproachMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneDynamics;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneFailedMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeScenePassedMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneSayMethodDefined;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneApproachMethodDefined.class,
	BridgeSceneSayMethodDefined.class,
	BridgeScenePassedMethodDefined.class,
	BridgeSceneFailedMethodDefined.class,
BridgeSceneDynamics.class,
})
public class BridgeSceneSemantics {

	

}
