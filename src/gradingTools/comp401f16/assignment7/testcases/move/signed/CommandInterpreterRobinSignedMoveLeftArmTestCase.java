package gradingTools.comp401f16.assignment7.testcases.move.signed;

import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneGalahadMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneLancelotMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneRobinMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterGalahadMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterRobinMoveLeftArmTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(15)
public class CommandInterpreterRobinSignedMoveLeftArmTestCase 
	extends CommandInterpreterRobinMoveLeftArmTestCase {

	protected String toTokens(int anInt) {
		return anInt >= 0? " + " + anInt: " - " + (-anInt);
		
	}
	@Override
	protected Integer inputStudentYDelta() {
		return -super.inputStudentYDelta();
	}
	

}
