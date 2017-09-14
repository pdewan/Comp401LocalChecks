package gradingTools.comp401f17.assignment2.testcases;

import grader.basics.execution.GradingMode;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MissingQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MixedOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleNumberOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleSignOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanPropertyTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	MultipleNumberOutputTest.class,
	MultipleWordOutputTest.class,
	MultipleQuoteOutputTest.class,
	ScannerBeanPropertyTest.class,
	ScannerBeanOutputTest.class,
	MultipleSignOutputTest.class,
	MissingQuoteOutputTest.class,
	MixedOutputTest.class
})
public class Assignment2Suite {
	public static final String[] MAIN_CLASS_NAME = new String[] {"main.Assignment2","ssignment",
			"Main", "main", "ScanningIterator"};
	public static void main (String[] args) {
		try {
			
			BasicJUnitUtils.interactiveTest(Assignment2Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
