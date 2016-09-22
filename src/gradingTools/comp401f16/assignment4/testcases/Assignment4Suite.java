package gradingTools.comp401f16.assignment4.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CommandSuite.class,
	TokenArraySuite.class
})
public class Assignment4Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment4";
	
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment4Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
