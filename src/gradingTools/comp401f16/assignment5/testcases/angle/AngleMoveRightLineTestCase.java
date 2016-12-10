package gradingTools.comp401f16.assignment5.testcases.angle;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class AngleMoveRightLineTestCase extends AngleMoveLeftLineTestCase {
	protected int studentXDelta = 12;
	protected int studentYDelta = 13;
//	
//	protected Integer inputStudentXDelta() {
//		return studentXDelta;
//	}
//	protected Integer inputStudentYDelta() {
//		return studentYDelta;
//	}
//	
//
//	@Override
//	protected void setLeafProxy() {
//		leafProxy = angle().getRightLine();
//	}
//	@Override
//	protected boolean doTest() throws Throwable {
//		return super.doTest();
//	}
	protected Object computeLeafProxy() {
		return  angle().getLeftLine();
	}
}
