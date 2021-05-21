package gradingTools.comp401f16.assignment.testInterfaces;

import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import tags301.Comp301Tags;
import util.annotations.Tags;

//@Tags({"Angle"})
@Tags({Comp301Tags.ANGLE})
public interface TestAngle extends TestMovable{
	public TestLine getLeftLine();
	public TestLine getRightLine();
	

}
