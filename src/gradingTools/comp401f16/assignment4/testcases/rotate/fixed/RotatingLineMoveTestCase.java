package gradingTools.comp401f16.assignment4.testcases.rotate.fixed;

import org.junit.Test;

import util.annotations.IsExtra;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@IsExtra(true)
public  class RotatingLineMoveTestCase extends MovableTest {
	protected int studentXDelta = 12;
	protected int studentYDelta = 13;
	
	@Override
	protected Integer inputStudentXDelta() {
		return studentXDelta;
	}
	@Override
	protected Integer inputStudentYDelta() {
		return studentYDelta;
	}	

	@Override
	protected void setLeafProxy() {
		leafProxy = rotatingLine();
	}
	@Override
	public boolean doTest() throws Throwable {
		return super.doTest();
	}
	
	protected TestRotatingLine rotatingLine() {
		return (TestRotatingLine) rootProxy;
	}
	@Override
	protected Class proxyClass() {
		return TestRotatingLine.class;
	}
	protected TestRotatingLine initializeMovable() {
		return rotatingLine();
	}

	

}
