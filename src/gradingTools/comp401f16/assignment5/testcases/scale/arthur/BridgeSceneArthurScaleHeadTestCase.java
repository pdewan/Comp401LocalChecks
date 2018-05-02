package gradingTools.comp401f16.assignment5.testcases.scale.arthur;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@IsExtra(true)
@MaxValue(5)
public class BridgeSceneArthurScaleHeadTestCase extends BridgeSceneArthurScaleTestCase {
	protected double studentWidthMultilier = 2 ;
	
	@Override
	protected Double inputStudentWidthMultiplier() {
		return studentWidthMultilier;
	}

	@Override
	protected void setLeafProxy() {
		leafProxy = avatar().getHead();
	}
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}

}
