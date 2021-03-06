package gradingTools.comp401f16.assignment4.testcases.rotate.fixed;

import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLine180DegreeTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineNinetyDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineZeroDegreeTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	RotatingLineZeroDegreeTest.class,
	RotatingLineFortyFiveDegreeTest.class,
	RotatingLineNinetyDegreeTest.class,
	RotatingLine180DegreeTest.class

	
})
//@IsExtra(true)
@MaxValue(16)
public class FixedRotatingLineSuite {

}
