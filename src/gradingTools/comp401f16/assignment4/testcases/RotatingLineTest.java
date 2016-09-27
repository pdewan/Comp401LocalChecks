package gradingTools.comp401f16.assignment4.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestLocatable;
import gradingTools.comp401f16.assignment.testInterfaces.TestRotatingLine;

public abstract class RotatingLineTest extends LocatableTest{

	@Override
	protected Class locatableClass() {
		return TestRotatingLine.class;
	}
	protected TestRotatingLine getRotatingLine() {
		return (TestRotatingLine) locatable;
	}
	@Override
	protected void setInput(TestLocatable aLocatable) {
		aLocatable.setX(inputX());
		aLocatable.setY(inputY());
		
	}	
	@Override
	protected void setActual(TestLocatable aLocatable) {
		actualX =  aLocatable.getX();
		actualY = aLocatable.getY();
		actualHeight = getRotatingLine().getHeight();
		actualWidth = getRotatingLine().getWidth();
	}
	protected boolean checkOutput(TestLocatable aLocatable) {
		assertWrongX();
		assertWrongY();
		return true;
	}
	
	
	

	
}
