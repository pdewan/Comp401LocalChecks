package gradingTools.comp401f16.assignment5.testcases.move.arthur;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class BridgeSceneArthurMoveHeadTestCase extends BridgeSceneMoveArthurTestCase {
	protected int studentXDelta = 12;
	protected int studentYDelta = 13;
	
	protected Integer inputStudentXDelta() {
		return studentXDelta;
	}
	protected Integer inputStudentYDelta() {
		return studentYDelta;
	}
	protected Object computeLeafProxy() {
		return avatar().getHead();
	}

//	@Override
//	protected void setLeafProxy() {
////		leafProxy = avatar().getHead();
//		leafProxy = computeLeafProxy();
//
//	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}

}
