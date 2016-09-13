package gradingTools.comp401f16.assignment3.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	MultipleWordTokenOutputTest.class	   
})
public class Assignment3Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment3";
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment3Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
