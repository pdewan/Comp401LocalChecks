package gradingTools.comp401f16.assignment7.testcases.mixedCase;

import util.annotations.MaxValue;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveArthurTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.say.CommandInterpreterApproachedArthurSayTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(20)
public class CommandInterpreterApproachedArthurMixedSayTestCase 
	extends CommandInterpreterApproachedArthurSayTestCase {
	protected String getCommandName() {
		return "SaY";
	}
	

}
