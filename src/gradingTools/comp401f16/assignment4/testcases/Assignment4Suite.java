package gradingTools.comp401f16.assignment4.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment4.testcases.rotate.detached.DetachedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.fixed.RotatingFixedLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.moving.MovingRotatingLineSuite;
import gradingTools.shared.testcases.shapes.LocatableTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.moving.MovingRotatingLineFortyFiveDegreeTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CommandSuite.class,
	TokenArraySuite.class,
	RotatingFixedLineSuite.class,
	DetachedRotatingLineSuite.class,
	MovingRotatingLineSuite.class
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
