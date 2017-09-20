package gradingTools.comp401f17.assignment4.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment4.testcases.array.TokenArraySuite;
import gradingTools.comp401f16.assignment4.testcases.commands.CommandSuite;
import gradingTools.comp401f16.assignment4.testcases.commands.extra.ExtraCommandSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.detached.DetachedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.fixed.FixedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.moving.MovingRotatingLineSuite;
import gradingTools.shared.testcases.shapes.LocatableTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.moving.MovingRotatingLineFortyFiveDegreeTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import trace.gradingTools.comp401.Comp401TraceUtility;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CommandSuite.class,
	ExtraCommandSuite.class,	
	TokenArraySuite.class,
	FixedRotatingLineSuite.class,
	MovingRotatingLineSuite.class
})
public class Assignment4Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment4";
	
	public static void main (String[] args) {
		try {

//		Comp401TraceUtility.setTracing();
		
		BasicJUnitUtils.interactiveTest(Assignment4Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
