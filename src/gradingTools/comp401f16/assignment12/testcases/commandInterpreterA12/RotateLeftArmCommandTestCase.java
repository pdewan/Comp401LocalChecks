package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.RotateLeftArmCommandObjectTestCase;
@MaxValue(10)
@IsExtra(true)
public class RotateLeftArmCommandTestCase extends RotateLeftArmCommandObjectTestCase {
	protected void callRotate() throws Exception {
		String aCommand = "rotateLeftArm arthur " + NUM_ROTATION_UNITS + " ";
		setCommand(aCommand);
	}

}
