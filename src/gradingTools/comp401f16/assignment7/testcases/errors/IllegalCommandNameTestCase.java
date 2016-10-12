package gradingTools.comp401f16.assignment7.testcases.errors;

import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterArthurMoveLeftArmTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(30)
public class IllegalCommandNameTestCase extends CommandInterpreterArthurMoveLeftArmTestCase {

//	protected String createCommandName() {
//		return "goto";
//	}
//	protected void setExpected(Object aLocatable) {
//		
//	}
	@Override
	protected Class proxyClass() {
		return TestErrorResilientCommandInterpreter.class;
	}
	protected TestErrorResilientCommandInterpreter errorReslientCommandInterpreter() {
		return (TestErrorResilientCommandInterpreter) rootProxy;
	}
//	protected  void setActual(Object aProxy) {
//		
//	}
	protected void assertNoError() {
		assertTrue("Error property empty after error:", false);

	}
	protected void assertError() {
		assertTrue("Error property  not empty after correct command:", false);

	}
	protected void setIllegalCommandAfterLegal() {
		errorReslientCommandInterpreter().setCommand("goto ");
	}
	protected boolean checkOutput(Object aLocatable) {
		super.checkOutput(aLocatable);
		fractionComplete = 0;
		String anError = errorReslientCommandInterpreter().getErrors();
		if (!anError.isEmpty()) {
			assertError();
		}
		setIllegalCommandAfterLegal();

		 anError = errorReslientCommandInterpreter().getErrors();
		if ( !anError.isEmpty()) {
			fractionComplete = 1.0;
			return true;
		}
		assertNoError();
		return false;
	}

//	protected String createCommand() {
//		String anXDelta = toTokens(inputXDelta());
//		String aYDelta = toTokens(inputYDelta());
//		return createCommandName() + " " + avatarName() + anXDelta + aYDelta + " ";
//	}
	
}
