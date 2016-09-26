package gradingTools.comp401f16.assignment.testInterfaces;

import util.annotations.Tags;

public interface TestPolarLine extends TestLocatable {
	public void setRadius(double r);
	
	public void setAngle(double theta);
	
	public double getRadius();
	public double getAngle();
	
	
}
