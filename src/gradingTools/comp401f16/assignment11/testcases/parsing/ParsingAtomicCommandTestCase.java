package gradingTools.comp401f16.assignment11.testcases.parsing;

import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
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
@MaxValue(45)
public class ParsingAtomicCommandTestCase extends CommandInterpreterApproachedArthurSayTestCase {
	protected final double APPROACH_CREDIT = 0.6;// 4 times, 	0.2 pts
	protected final double FAILED_CREDIT = 0.2; // 9 times, 		0.45 pts
	protected final double PASSED__CREDIT = 0.2; // once 		0.15
	
//	TestParser parser;
//	
//	protected void setParserFromFactoryMethod() {
//		Object retVal = 
//		getOrCreateObject(factoryClassTags,
//				ParserFactoryMethodTest.FACTORY_METHOD_TAGS, TestParser.class);
//		assertTrue(factoryMessage, factoryMessage.isEmpty());
//		parser = (TestParser)
//				retVal;
//	}
	
	public ParsingAtomicCommandTestCase() {
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
		return createUsingFactoryMethod();
	}
	@Override 
	protected void setDependentObjects() {
		setBridgeSceneFromFactoryMethod();
//		setParserFromFactoryMethod();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}
	protected double eachApproachCredit() {
		return APPROACH_CREDIT;
	}
	@Override
	protected double passedCredit() {
		return PASSED_CREDIT;
	}
	@Override
	protected double failedCredit() {
		return FAILED_CREDIT;
	}
	
	@Override
	protected void doPassed() {
		setCommand("pass" + " ");
	}
	@Override
	protected void doFailed() {
		setCommand("fail" + " ");
	}


	@Override
	protected void executeOperations(Object aLocatable) {
		approach(firstAvatarName());				
		passed();
		approach (secondAvatarName());	
		failed();		
	}
	protected void approach (String anAvatar) {
		System.out.println(anAvatar + " Approaches");
		commandInterpreter().setCommand("approach" + " "+ anAvatar + " ");

		assertTrue(correctApproachErrorMessage(), 
				bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += eachApproachCredit();
		printFractionComplete();
//		Object aCommandObject = parser.getCommandObject();

	}
}
