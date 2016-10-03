package gradingTools.comp401f16.assignment6.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BridgeSceneComponentSuite.class,
	BridgeSceneComponentScrollSuite.class
	
})
public class Assignment6Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment6";
	public static final String[] MAIN_CLASS_NAMES = {MAIN_CLASS_NAME, "Assignment"};
	
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment6Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}