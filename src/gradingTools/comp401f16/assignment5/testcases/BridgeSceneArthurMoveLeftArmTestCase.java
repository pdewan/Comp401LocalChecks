package gradingTools.comp401f16.assignment5.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class BridgeSceneArthurMoveLeftArmTestCase extends BridgeSceneMoveArthurTestCase {
	protected int studentXDelta = 12;
	protected int studentYDelta = 13;
	
	protected Integer inputStudentXDelta() {
		return studentXDelta;
	}
	protected Integer inputStudentYDelta() {
		return studentYDelta;
	}
	

	@Override
	protected void setLeafLocatable() {
		leafLocatable = arthur().getArms().getLeftLine();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}

}
