package gradingTools.comp401f16.assignment5.testcases.scale.arthur;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class BridgeSceneArthurScaleRightLegTestCase extends BridgeSceneArthurScaleTestCase {
	protected double studentWidthMultilier = 2 ;
	
	@Override
	protected Double inputStudentWidthMultiplier() {
		return studentWidthMultilier;
	}

	@Override
	protected void setLeafProxy() {
		leafProxy = avatar().getLegs().getRightLine();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}

}
