package gradingTools.comp301ss21.assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLine180Degree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineNinetyDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineZeroDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.comp401f16.assignment4.testcases.rotate.fixed.FixedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.moving.MovingRotatingLineSuite;
import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneComponentMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneComponentScaleSuite;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//	TaggedRotatingLine.class,
	RotatingLineZeroDegree.class,
	RotatingLineFortyFiveDegree.class,
	RotatingLineNinetyDegree.class,
	RotatingLine180Degree.class

//	TagChecks.class,
//	SourceChecks.class,
//	RuntimeChecks.class
	
//	GreetingCheckstyle.class
})
@MaxValue(16)
public class FixedRotatingLine {

}
