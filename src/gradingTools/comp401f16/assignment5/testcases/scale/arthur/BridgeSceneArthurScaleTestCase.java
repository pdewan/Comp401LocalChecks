package gradingTools.comp401f16.assignment5.testcases.scale.arthur;

import org.junit.Test;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestScalable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public abstract class BridgeSceneArthurScaleTestCase extends BridgeSceneScaleTestCase {
	
	

	@Override
	protected TestAvatar initializeScalable() {
		return avatar();
	}
	
	protected TestAvatar avatar() {
		return bridgeScene().getArthur();
	}

}
