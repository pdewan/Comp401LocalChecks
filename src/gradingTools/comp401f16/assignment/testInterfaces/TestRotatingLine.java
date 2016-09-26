package gradingTools.comp401f16.assignment.testInterfaces;

import util.annotations.Tags;

@Tags({"RotatingLine"})
public interface TestRotatingLine {
	public void setRadius(double r);
	
	public void setAngle(double theta);
	@Tags({"rotate"})
	public void rotate(int degrees);
	
}
