package gradingTools.comp401f16.assignment11.testcases.parsing.list;

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
@MaxValue(15)
public class OneLevelListMovesTestCase extends BridgeSceneArthurMoveLeftArmTestCase {
	protected int[] INPUT_STUDENT_X_DELTAS = {2, 3, 5, 7, 10, 4, 3, 77, 4, 1, 2, 3};
	protected int[] INPUT_STUDENT_Y_DELTAS = {5, 10, 2, 6, 8, 6, 1, 6, 55, 3, 2, 1};
	protected static int NUM_DELTAS = 4;
	
	protected int[] inputStudentXDeltas() {
		return INPUT_STUDENT_X_DELTAS;
	}
	protected int[] inputStudentYDeltas() {
		return INPUT_STUDENT_Y_DELTAS;
	}
	protected int numDeltas() {
		return NUM_DELTAS;
	}
	protected Integer inputStudentXDelta() {
		if (studentXDelta != null) {
			return studentXDelta;		}
		int aResult = 0;
		for (int i = 0; i < numDeltas(); i++) {
			aResult += inputStudentXDeltas()[i];
		}
		studentXDelta = aResult;	 
		
		return aResult;
	}
	protected Integer inputStudentYDelta() {
		if (studentYDelta != null) {
			return studentYDelta;		}
		int aResult = 0;
		for (int i = 0; i < numDeltas(); i++) {
			aResult += inputStudentYDeltas()[i];
		}
		studentYDelta = aResult;	 
		
		return aResult;
	}
	
	
	public OneLevelListMovesTestCase() {
//		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
		factoryMethodTags = CommandInterpreterFactoryMethodTest.FACTORY_METHOD_TAGS;

		studentXDelta = null;
		studentYDelta = null;

	}
	
	@Override
	protected Class proxyClass() {
		return TestErrorResilientCommandInterpreter.class;
	}
	
	protected TestCommandInterpreter commandInterpreter() {
		return (TestCommandInterpreter) rootProxy;
	}
	protected void setCommand(String aCommand) {
		System.out.println("Executing command:" + aCommand);
		commandInterpreter().setCommand(aCommand);
	}
	@Override
	protected Object create() {
		return createUsingFactoryMethod();
	}
	@Override 
	protected void setDependentObjects() {
//		super.setDependentObjects();
		setBridgeSceneFromFactoryMethod();
	}
	@Override
	public boolean doTest() throws Throwable {
		return super.doTest();
	}
	protected String createCommand (int anIndex) {
		int anXDelta = inputStudentXDeltas()[anIndex];
		int aYDelta =inputStudentYDeltas()[anIndex];
		return createCommand(anXDelta, aYDelta);
	}
	protected String createOneLevelCommandList() {
		String aCommand1 = createCommand(0);
		String aCommand2 = createCommand(1);
		String aCommand3 = createCommand(2);
		String aCommand4 = createCommand(3);
		String aCommand = "{" + " " +
						aCommand1 +
						aCommand2 +
						aCommand3 +
						aCommand4 + 
						"}" + " ";
		return aCommand;
	}
	protected String createCommand() {
		return createOneLevelCommandList();
//		String aCommand1 = createCommand(0);
//		String aCommand2 = createCommand(1);
//		String aCommand3 = createCommand(2);
//		String aCommand4 = createCommand(3);
//		String aCommand = "{" + " " +
//						aCommand1 +
//						aCommand2 +
//						aCommand3 +
//						aCommand4 + 
//						"}" + " ";
//		return aCommand;
				
		
//		String anXDelta = toTokens(inputXDelta());
//		String aYDelta = toTokens(inputYDelta());
//		return createCommandName() + " " + avatarName() + anXDelta + aYDelta + " ";
	}
	protected String createCommand(int anXDelta, int aYDelta) {
		String anXDeltaString = toTokens(anXDelta);
		String aYDeltaString = toTokens(aYDelta);
		return createCommandName() + " " + avatarName() + anXDeltaString + aYDeltaString + " ";
	}
	protected String createCommandName() {
		return "move";
	}
	protected String toTokens(int anInt) {
		return anInt >= 0? " " + anInt: " " + (-anInt);
		
	}
	protected void doMove() throws Exception {
		
		String aCommand = createCommand();
		setCommand(aCommand);
//    	movable().move(inputXDelta(), inputYDelta());
    }

}
