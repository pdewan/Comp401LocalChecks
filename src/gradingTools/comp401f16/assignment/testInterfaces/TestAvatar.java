package gradingTools.comp401f16.assignment.testInterfaces;

import util.annotations.Tags;

@Tags({"Avatar"})
public interface TestAvatar {
    public TestStringShape getStringShape();
	
	public TestImageShape getHead();
	
	public TestAngle getArms();
	
	public TestAngle getLegs();
	
}
