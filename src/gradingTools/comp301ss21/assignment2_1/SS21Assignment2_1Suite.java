package gradingTools.comp301ss21.assignment2_1;

import org.apache.commons.beanutils.BeanAccessLanguageException;
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
import gradingTools.comp301ss21.assignment1_1.numbers.run.NumbersRun;
import gradingTools.comp301ss21.assignment1_1.numbers.source.NumbersSource;
import gradingTools.comp301ss21.assignment1_1.scannerBean.ScannerBean;
import gradingTools.comp301ss21.assignment1_1.style.A1_1Style;
import gradingTools.comp301ss21.assignment1_1.tokenObjects.run.TokenObjectsRun;
import gradingTools.comp301ss21.assignment1_1.tokens.run.TokensRun;
import gradingTools.comp301ss21.assignment2_1.inheritance.A2_1ExpectedSuperTypes;
import gradingTools.comp301ss21.assignment2_1.inheritance.TokenInheritance;
import gradingTools.comp301ss21.assignment2_1.style.A2_1Style;
import gradingTools.comp301ss21.assignment2_1.tokenHistory.TokenHistory;
import gradingTools.comp401f16.assignment4.testcases.rotate.fixed.FixedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.moving.MovingRotatingLineSuite;
import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneComponentMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneComponentScaleSuite;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineZeroDegreeTest;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TokenHistory.class,
	TokenInheritance.class,
	A2_1Style.class
//	NumbersSource.class,
//	NumbersRun.class,
//	ScannerBean.class,
//	TokensRun.class,
//	TokenObjectsRun.class,
//	A1_1Style.class

})
public class SS21Assignment2_1Suite {
	public static final String A1_PART1_MAIN_CLASS_NAME = "main.Assignment1_1_Part1";
	public static final String A1_PART2_MAIN_CLASS_NAME = "main.Assignment1_1_Part2";
	public static final String A1_PART3_MAIN_CLASS_NAME = "main.Assignment1_1_Part3";

//	public static final String GREETING_MAIN_TAG = "GreetingMain";
		public static void main (String[] args) {
		try {
			
			BasicJUnitUtils.interactiveTest(SS21Assignment2_1Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static {
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setCheckStyleConfiguration("unc_checks_301_A2_1.xml");
	}
	
}
