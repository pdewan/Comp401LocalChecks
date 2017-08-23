package gradingTools.comp401f17.assignment1.testcases;

import grader.basics.execution.GradingMode;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment1.testcases.IndexOfNotTestSuite;
import gradingTools.comp401f16.assignment1.testcases.IndexOfTestSuite;
import gradingTools.comp401f16.assignment1.testcases.InvalidCharacterSuite;
import gradingTools.comp401f16.assignment1.testcases.MultipleTokenSuite;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTestSuite;
import gradingTools.comp401f16.assignment1.testcases.ScanningIteratorSuite;
import gradingTools.comp401f16.assignment1.testcases.SingleTokenSuite;
import gradingTools.comp401f16.assignment1.testcases.TerminatesWithPeriodLineSuite;
import gradingTools.comp401f16.assignment1.testcases.TerminatesWithStartingPeriodSuite;
import gradingTools.comp401f16.assignment1.testcases.VariableSpaceSuite;

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
			
			BasicJUnitUtils.interactiveTest(Assignment1Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
