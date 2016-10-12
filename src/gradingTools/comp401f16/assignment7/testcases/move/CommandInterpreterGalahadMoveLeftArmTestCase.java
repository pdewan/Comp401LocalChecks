package gradingTools.comp401f16.assignment7.testcases.move;

import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneGalahadMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(30)
public class CommandInterpreterGalahadMoveLeftArmTestCase 
	extends BridgeSceneGalahadMoveLeftArmTestCase {
//	TestBridgeScene bridgeScene;
//	protected final String[] bridgeSceneClassTags = {"BridgeScene"};
//	protected final String[] bridgeSceneFactoryMethodTags = {"bridgeSceneFactoryMethod"};
	
	public CommandInterpreterGalahadMoveLeftArmTestCase() {
		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
	    avatarName = "Galahad";
	    
	}
	
	@Override
	protected Class proxyClass() {
		return TestCommandInterpreter.class;
	}
	
	protected TestCommandInterpreter commandInterpreter() {
		return (TestCommandInterpreter) rootProxy;
	}
	@Override
	protected Object create() {
		return createUsingFactoryMethod();
	}
	@Override 
	protected void setDependentObjects() {
		setBridgeSceneFromFactoryMethod();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}
	protected String createCommand() {
		String anXDelta = toTokens(inputXDelta());
		String aYDelta = toTokens(inputYDelta());
		return "move " + avatarName() + anXDelta + aYDelta + " ";
	}
	protected String toTokens(int anInt) {
		return anInt >= 0? " " + anInt: " " + (-anInt);
		
	}
	protected void doMove() {
		
		String aCommand = createCommand();
		commandInterpreter().setCommand(aCommand);
//    	movable().move(inputXDelta(), inputYDelta());
    }

}
