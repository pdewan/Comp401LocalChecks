package gradingTools.comp401f16.assignment5.testcases.move.arthur;

import org.junit.Test;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public abstract class BridgeSceneMoveArthurTestCase extends BridgeSceneMoveTestCase {
	protected String avatarName = "arthur";	
	
	@Override
	protected TestAvatar initializeMovable() {
		return avatar();
	}
	protected String avatarName() {
		return avatarName;
	}
	protected TestAvatar avatar() {
		return bridgeScene().getArthur();
	}

}
