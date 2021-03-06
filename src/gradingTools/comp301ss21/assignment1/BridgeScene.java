package gradingTools.comp301ss21.assignment1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment1.testcases.avatar.AvatarArmsProperty;
import gradingTools.comp301ss21.assignment1.testcases.avatar.AvatarHeadProperty;
import gradingTools.comp301ss21.assignment1.testcases.avatar.AvatarInstantiatesAngle;
import gradingTools.comp301ss21.assignment1.testcases.avatar.AvatarLegsProperty;
import gradingTools.comp301ss21.assignment1.testcases.avatar.AvatarStringShapeProperty;
import gradingTools.comp301ss21.assignment1.testcases.avatar.TaggedAvatar;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneArthurLeftArmMovesWithAvatar;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneArthurProperty;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneGalahadLeftArmMovesWithAvatar;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneGalahadProperty;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneGuardLeftArmMovesWithAvatar;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneGuardProperty;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneInstantiatesAvatar;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneLancelotLeftArmMovesWithAvatar;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneLancelotProperty;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneRobinLeftArmMovesWithAvatar;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.BridgeSceneRobinProperty;
import gradingTools.comp301ss21.assignment1.testcases.bridgeScene.TaggedBridgeScene;
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
//	TaggedRotatingLine.class,
	TaggedAvatar.class,
	AvatarHeadProperty.class,
	AvatarStringShapeProperty.class,
	AvatarArmsProperty.class,
	AvatarLegsProperty.class,
	AvatarInstantiatesAngle.class,
	TaggedBridgeScene.class,
	BridgeSceneInstantiatesAvatar.class,
	BridgeSceneArthurProperty.class,
	BridgeSceneGalahadProperty.class,
	BridgeSceneLancelotProperty.class,
	BridgeSceneRobinProperty.class,
	BridgeSceneGuardProperty.class,
	BridgeSceneArthurLeftArmMovesWithAvatar.class,
	BridgeSceneLancelotLeftArmMovesWithAvatar.class,
	BridgeSceneGalahadLeftArmMovesWithAvatar.class,
	BridgeSceneRobinLeftArmMovesWithAvatar.class,
	BridgeSceneGuardLeftArmMovesWithAvatar.class


//	TagChecks.class,
//	SourceChecks.class,
//	RuntimeChecks.class
	
//	GreetingCheckstyle.class
})
@MaxValue(51)
public class BridgeScene {

}
