package gradingTools.comp401f16.assignment7.testcases.move.signed;

import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterArthurMoveLeftArmTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(15)
public class CommandInterpreterArthurSignedMoveLeftArmTestCase 
	extends CommandInterpreterArthurMoveLeftArmTestCase {

	protected String toTokens(int anInt) {
		return anInt >= 0? " + " + anInt: " - " + (-anInt);
		
	}
	@Override
	protected Integer inputStudentYDelta() {
		return -super.inputStudentYDelta();
	}
	

}
