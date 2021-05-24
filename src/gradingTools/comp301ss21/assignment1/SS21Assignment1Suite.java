package gradingTools.comp301ss21.assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp301ss21.assignment0.testcases.GreetingMainCallsPrint;
import gradingTools.comp301ss21.assignment0.testcases.GreetingMainDefined;
import gradingTools.comp301ss21.assignment0.testcases.GreetingRun;
import gradingTools.comp301ss21.assignment0.testcases.TaggedGreetingMainProvided;
import gradingTools.comp301ss21.assignment1.testcases.angle.AngleLeftLineProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineZeroDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.comp401f16.assignment4.testcases.rotate.fixed.FixedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.moving.MovingRotatingLineSuite;
import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneComponentMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneComponentScaleSuite;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineZeroDegreeTest;
@RunWith(Suite.class)
@Suite.SuiteClasses({
//	TaggedRotatingLine.class,
//	RotatingLineZeroDegree.class,
//	FixedRotatingLineSuite.class,
//	A1Tags.class,
//	A1Properties.class,
//	A1Methods.class,
//	AngleLeftLineProperty.class,
	A1Source.class,
	A1Style.class,

	RotatingLine.class,
//	MovingRotatingLine.class,
	Angle.class,
//	AngleLeftLineProperty.class,
//	AngleMoveSuite.class,
	BridgeScene.class,
	BridgeSceneScale.class,
//	BridgeSceneComponentMoveSuite.class,
//	BridgeSceneComponentScaleSuite.class,
//	BridgeSceneArthurScaleHeadTestCase.class
//	TagChecks.class,
//	SourceChecks.class,
//	RuntimeChecks.class
	
//	GreetingCheckstyle.class
})
public class SS21Assignment1Suite {
//	public static final String GREETING_MAIN_TAG = "GreetingMain";
		public static void main (String[] args) {
		try {
			
			BasicJUnitUtils.interactiveTest(SS21Assignment1Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static {
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setCheckStyleConfiguration("unc_checks_301_A1.xml");
	}
	
}
