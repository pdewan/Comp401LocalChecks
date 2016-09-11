package gradingTools.comp401f16.assignment1.testcases;

import grader.basics.execution.GradingMode;
import grader.basics.junit.BasicJUnitUtils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SingleTokenSuite.class,
	MultipleTokenSuite.class,
	InvalidCharacterSuite.class,
	VariableSpaceSuite.class,
	TerminatesWithPeriodLineSuite.class,
	TerminatesWithStartingPeriodSuite.class,
	IndexOfTestSuite.class,
	ScanStringTestSuite.class,
	ScanningIteratorSuite.class,
	IndexOfNotTestSuite.class
})
public class Assignment1Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment1";
		public static void main (String[] args) {
		try {
			GradingMode.setGraderRun(false);
		BasicJUnitUtils.interactiveTest(Assignment1Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
