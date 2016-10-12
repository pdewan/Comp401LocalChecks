package gradingTools.comp401f16.assignment5.testcases;

import grader.basics.execution.GradingMode;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneComponentMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneComponentScaleSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AngleMoveSuite.class,
	BridgeSceneComponentMoveSuite.class,
	BridgeSceneComponentScaleSuite.class,
	BridgeSceneArthurScaleHeadTestCase.class

})
public class Assignment5Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment5";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
		try {

//	    GradingMode.setGraderRun(true);
		BasicJUnitUtils.interactiveTest(Assignment5Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
