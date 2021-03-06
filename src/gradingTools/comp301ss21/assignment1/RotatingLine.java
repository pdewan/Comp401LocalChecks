package gradingTools.comp301ss21.assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineRotateDefined;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLine180Degree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineAngleEditableProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineAngleProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineNinetyDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineRadiusEditableProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineRadiusProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineXEditableProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineXProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineYEditableProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineYProperty;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineZeroDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.DetachedRotatingLineFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.DetachedRotatingLineMinusFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.LineMoveDefined;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.MovingRotatingLineFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.MovingRotatingLineMinusFortyFiveDegree;
import gradingTools.comp401f16.assignment4.testcases.rotate.fixed.FixedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.moving.MovingRotatingLineSuite;
import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneComponentMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneComponentScaleSuite;
import gradingTools.shared.testcases.shapes.rotate.detached.DetachedRotatingLineFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.detached.DetachedRotatingLineMinusFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.moving.MovingRotatingLineFortyFiveDegreeTest;
import gradingTools.shared.testcases.shapes.rotate.moving.MovingRotatingLineMinusFortyFiveDegreeTest;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//	TaggedRotatingLine.class,
	TaggedRotatingLine.class,
	LineXProperty.class,
	LineXEditableProperty.class,
	LineYProperty.class,
	LineYEditableProperty.class,
	LineRadiusProperty.class,
	LineRadiusEditableProperty.class,
	LineAngleProperty.class,
	LineAngleEditableProperty.class,
	LineMoveDefined.class,
	LineRotateDefined.class,
	RotatingLineZeroDegree.class,
	RotatingLineFortyFiveDegree.class,
	RotatingLineNinetyDegree.class,
	RotatingLine180Degree.class,
	MovingRotatingLineFortyFiveDegree.class,	
	MovingRotatingLineMinusFortyFiveDegree.class,	
	DetachedRotatingLineFortyFiveDegree.class,	
	DetachedRotatingLineMinusFortyFiveDegree.class,	

//	TagChecks.class,
//	SourceChecks.class,
//	RuntimeChecks.class
	
//	GreetingCheckstyle.class
})
@MaxValue(40)
public class RotatingLine {

}
