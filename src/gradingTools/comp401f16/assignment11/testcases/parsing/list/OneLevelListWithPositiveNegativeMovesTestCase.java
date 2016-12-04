package gradingTools.comp401f16.assignment11.testcases.parsing.list;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.CommandInterpreterFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@IsExtra(true)
@MaxValue(15)
public class OneLevelListWithPositiveNegativeMovesTestCase extends OneLevelListMovesTestCase {
	protected int[] INPUT_STUDENT_X_DELTAS = {2, -33, 5, -7, 10, -4, 3, 77, 4, -1, 2, 3};
	protected int[] INPUT_STUDENT_Y_DELTAS = {-5, 10, -2, 6, 8, -6, 1, 6, -55, 3, -2, 1};
	protected static int NUM_DELTAS = 4;
	
	protected int[] inputStudentXDeltas() {
		return INPUT_STUDENT_X_DELTAS;
	}
	protected int[] inputStudentYDeltas() {
		return INPUT_STUDENT_Y_DELTAS;
	}
	protected String toTokens(int anInt) {
		return anInt >= 0? " + " + anInt: " - " + (-anInt);
		
	}
	

}
