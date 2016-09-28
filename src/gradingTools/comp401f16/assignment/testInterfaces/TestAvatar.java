package gradingTools.comp401f16.assignment.testInterfaces;

import gradingTools.shared.testcases.shapes.interfaces.TestImageShape;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestScalable;
import gradingTools.shared.testcases.shapes.interfaces.TestStringShape;
import util.annotations.Tags;

@Tags({"Avatar"})
public interface TestAvatar  extends TestMovable, TestScalable{
    public TestStringShape getStringShape();
	
	public TestImageShape getHead();
	
	public TestAngle getArms();
	
	public TestAngle getLegs();
	
}
