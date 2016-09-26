package gradingTools.comp401f16.assignment5.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	
})
public class Assignment5Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment5";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment5Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
