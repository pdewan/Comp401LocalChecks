package gradingTools.comp401f16.assignment4.testcases.rotate.moving;

import gradingTools.shared.testcases.shapes.rotate.detached.DetachedRotatingLineFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLine180DegreeTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineNinetyDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.fixed.RotatingLineZeroDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.moving.MovingRotatingLineFortyFiveDegreeTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	MovingRotatingLineFortyFiveDegreeTest.class,	

	
})
@IsExtra(true)
@MaxValue(10)
public class MovingRotatingLineSuite {

}
