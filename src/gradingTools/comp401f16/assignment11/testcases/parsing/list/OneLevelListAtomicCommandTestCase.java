package gradingTools.comp401f16.assignment11.testcases.parsing.list;

import util.annotations.MaxValue;
import util.trace.Tracer;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveArthurTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.say.CommandInterpreterApproachedArthurSayTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(15)
public class OneLevelListAtomicCommandTestCase extends CommandInterpreterApproachedArthurSayTestCase {
	protected final double APPROACH_CREDIT = 0.6;// 4 times, 	0.2 pts
	protected final double Fail_CREDIT = 0.2; // 9 times, 		0.45 pts
	protected final double Pass__CREDIT = 0.2; // once 		0.15
	
	public OneLevelListAtomicCommandTestCase() {
		factoryMethodTags = new String[] {"commandInterpreterFactoryMethod"};
	}
	protected String firstAvatarName() {
		return "lancelot";
	}
	protected String secondAvatarName() {
		return "robin";
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
		return createUsingFactoryClassAndMethodTags();
	}
	@Override 
	protected void setDependentObjects() {
		setBridgeSceneFromFactoryMethod();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}
	protected double eachApproachCredit() {
		return APPROACH_CREDIT;
	}
	@Override
	protected double passCredit() {
		return Pass_CREDIT;
	}
	@Override
	protected double failCredit() {
		return Fail_CREDIT;
	}
	
	@Override
	protected void doPass() {
		setCommand("pass" + " ");
	}
	@Override
	protected void doFail() {
		setCommand("fail" + " ");
	}


	@Override
	protected void executeOperations(Object aLocatable) {
		String aCommand = "{" + " " +
				"approach " + firstAvatarName() + " " +
				"pass" + " " +
				"approach " + secondAvatarName() + " " +
				"fail" + " " +
				"}" + " ";
//		approach(firstAvatarName());				
//		pass();
//		approach (secondAvatarName());	
//		fail();	
		checkFail();
	}
	protected void approach (String anAvatar) {
		Tracer.info(this,anAvatar + " Approaches");
		commandInterpreter().setCommand("approach" + " "+ anAvatar + " ");

		assertTrue(correctApproachErrorMessage(), 
				bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += eachApproachCredit();
		printFractionComplete();
	}
}
