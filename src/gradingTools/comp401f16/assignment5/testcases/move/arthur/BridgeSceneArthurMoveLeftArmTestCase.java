package gradingTools.comp401f16.assignment5.testcases.move.arthur;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class BridgeSceneArthurMoveLeftArmTestCase extends BridgeSceneMoveArthurTestCase {
	protected Integer studentXDelta = 12;
	protected Integer studentYDelta = 13;
	
	protected Integer inputStudentXDelta() {
		return studentXDelta;
	}
	protected Integer inputStudentYDelta() {
		return studentYDelta;
	}
	
	protected Object computeLeafProxy() {
		return avatar().getArms().getLeftLine();
	}

	@Override
	protected void setLeafProxy() {
//		leafProxy = avatar().getArms().getLeftLine();
		leafProxy = computeLeafProxy();

	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}

}
