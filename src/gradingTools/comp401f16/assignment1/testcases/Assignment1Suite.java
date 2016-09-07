package gradingTools.comp401f16.assignment1.testcases;

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
//	IndexOfTest.class,
//	ScanStringTest.class,
//	ScanningIteratorTest.class
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
