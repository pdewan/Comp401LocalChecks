package gradingTools.comp401f16.assignment5.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;

public class BridgeSceneArthurScaleHeadTestCase extends BridgeSceneArthurScaleTestCase {
	protected double studentWidthMultilier = 2 ;
	
	@Override
	protected Double inputStudentWidthMultiplier() {
		return studentWidthMultilier;
	}

	@Override
	protected void setLeafLocatable() {
		leafLocatable = arthur().getHead();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}

}
