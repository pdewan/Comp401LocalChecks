package gradingTools.comp401f16.assignment5.testcases.angle;

import org.junit.Test;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public abstract class AngleMoveTestCase extends MovableTest {
	
	protected TestAngle angle() {
		return (TestAngle) rootProxy;
	}
	@Override
	protected Class proxyClass() {
		return TestAngle.class;
	}
	protected TestAngle initializeMovable() {
		return angle();
	}

	

}
