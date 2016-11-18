package gradingTools.comp401f16.assignment7.testcases.say;

import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveArthurTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(20)
public class CommandInterpreterApproachedArthurSayTestCase extends BridgeSceneDynamicTestCase {
//	TestBridgeScene bridgeScene;
//	protected final String[] bridgeSceneClassTags = {"BridgeScene"};
//	protected final String[] bridgeSceneFactoryMethodTags = {"bridgeSceneFactoryMethod"};
	
//	@Override
//	protected TestAvatar initializeMovable() {
//		return avatar();
//	}
	
	public CommandInterpreterApproachedArthurSayTestCase() {
		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
	}
	
//	@Override
//	protected Class proxyClass() {
//		return TestCommandInterpreter.class;
//	}
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
		setBridgeSceneFromFactoryMethod();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}
	protected void executeOperations(Object aRootProxy) {
		approach(firstAvatar());
		say (guard(), firstSay);
		say (firstAvatar(), secondSay);
		say (guard(), thirdSay);
		say (firstAvatar(), fourthSay);
//		commandInterpreter().setCommand();
		
	}
	protected String getCommandName() {
		return "say";
	}
	protected void say (String aSaying) {
		commandInterpreter().setCommand(getCommandName() + " " + "\"" + aSaying + "\"" + " ");
	}
	protected double eachApproachCredit() {
		return 0.0;
	}
	protected double eachSayCredit() {
		return 0.25;
	}
	

}
