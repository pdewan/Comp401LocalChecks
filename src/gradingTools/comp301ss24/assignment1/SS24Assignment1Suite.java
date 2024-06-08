package gradingTools.comp301ss24.assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp301ss21.assignment1.A1Main;
import gradingTools.comp301ss21.assignment1.A1Style;
import gradingTools.comp301ss21.assignment1.Angle;
import gradingTools.comp301ss21.assignment1.BridgeScene;
import gradingTools.comp301ss21.assignment1.BridgeSceneScale;
import gradingTools.comp301ss21.assignment1.RotatingLine;
@RunWith(Suite.class)
@Suite.SuiteClasses({
//	TaggedRotatingLine.class,
//	RotatingLineZeroDegree.class,
//	FixedRotatingLineSuite.class,
//	A1Tags.class,
//	A1Properties.class,
//	A1Methods.class,
//	AngleLeftLineProperty.class,
//	A1Source.class,
	A1Style.class,

	RotatingLine.class,
//	MovingRotatingLine.class,
	Angle.class,
//	AngleLeftLineProperty.class,
//	AngleMoveSuite.class,
	BridgeScene.class,
	A1Main.class,
	BridgeSceneScale.class,
//	BridgeSceneComponentMoveSuite.class,
//	BridgeSceneComponentScaleSuite.class,
//	BridgeSceneArthurScaleHeadTestCase.class
//	TagChecks.class,
//	SourceChecks.class,
//	RuntimeChecks.class
	
//	GreetingCheckstyle.class
})
public class SS24Assignment1Suite {
//	public static final String GREETING_MAIN_TAG = "GreetingMain";
		public static void main (String[] args) {
		try {
			
			BasicJUnitUtils.interactiveTest(SS24Assignment1Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static {
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setCheckStyleConfiguration("unc_checks_301_A1.xml");
	}
	
}
