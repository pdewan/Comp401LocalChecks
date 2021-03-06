package gradingTools.comp301ss21.assignment1_1.tokenObjects.run;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment1.testcases.angle.AngleInstantiatesLine;
import gradingTools.comp301ss21.assignment1.testcases.angle.AngleLeftLineProperty;
import gradingTools.comp301ss21.assignment1.testcases.angle.AngleMoveDefined;
import gradingTools.comp301ss21.assignment1.testcases.angle.AngleRightLineProperty;
import gradingTools.comp301ss21.assignment1.testcases.angle.LeftLineMovesWithAngle;
import gradingTools.comp301ss21.assignment1.testcases.angle.RightLineMovesWithAngle;
import gradingTools.comp301ss21.assignment1.testcases.angle.TaggedAngle;
import gradingTools.comp301ss21.assignment1.testcases.avatar.AvatarScaleDefined;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLine180Degree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineNinetyDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.RotatingLineZeroDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.DetachedRotatingLineFortyFiveDegree;
import gradingTools.comp301ss21.assignment1.testcases.line.moving.DetachedRotatingLineMinusFortyFiveDegree;
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

MultipleNumberTokenObjects.class,
MultipleWordTokenObjects.class,
MultipleQuoteTokenObjects.class,
MultipleSignTokenObjects.class,
MultipleGroupingTokenObjects.class,
NumberBean.class,
WordBean.class,
QuoteBean.class,
StartBean.class,
EndBean.class,
PlusBean.class,
MinusBean.class
})
public class TokenObjectsRun {

}
