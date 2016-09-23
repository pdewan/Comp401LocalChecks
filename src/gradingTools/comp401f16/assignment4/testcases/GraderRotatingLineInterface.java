package gradingTools.comp401f16.assignment4.testcases;

import util.annotations.Tags;

@Tags({"RotatingLine"})
public interface GraderRotatingLineInterface {
	public int getHeight();
	public int getWidth();
	
	public int getX();
	public void setX(int x);
	public int getY();
	public void setY(int y);
	public void setRadius(double r);
	public double getRadius();
	
	public void setAngle(double theta);
	public double getAngle();
	
	@Tags({"rotate"})
	public void rotate(int degrees);
}
