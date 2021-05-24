package gradingTools.comp301ss21.assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment1.testcases.angle.AngleLeftLineProperty;
import gradingTools.comp301ss21.assignment1.testcases.angle.AngleMoveDefined;
import gradingTools.comp301ss21.assignment1.testcases.angle.AngleRightLineProperty;
import gradingTools.comp301ss21.assignment1.testcases.angle.TaggedAngle;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineRotateDefined;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLine180Degree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineNinetyDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineZeroDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.LineMoveDefined;
import gradingTools.comp301ss21.assignment1.testcases.style.A1InterfaceAsType;
import gradingTools.comp301ss21.assignment1.testcases.style.A1NamedConstants;
import gradingTools.comp401f16.assignment4.testcases.rotate.fixed.FixedRotatingLineSuite;
import gradingTools.comp401f16.assignment4.testcases.rotate.moving.MovingRotatingLineSuite;
import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneComponentMoveSuite;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneComponentScaleSuite;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//	A1Properties.class,
//	A1Methods.class,
//	A1Tags.class,
	A1NamedConstants.class,
	A1InterfaceAsType.class

})
public class A1Style {

}
