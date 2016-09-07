package gradingTools.comp401f16.assignment2.testcases;

import grader.basics.junit.BasicJUnitUtils;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	MultipleNumberOutputTest.class,
	MultipleWordOutputTest.class,
	MultipleQuoteOutputTest.class,
	ScannerBeanTest.class,
	MultipleSignOutputTest.class,
	MissingQuoteOutputTest.class
	   
})
public class Assignment2Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment2";
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment2Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
