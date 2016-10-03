package gradingTools.comp401f16.assignment4.testcases.commands.extra;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class RotateLeftArmBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "RotateLeftArm";
	@Override
	protected String[] getClassNames(){
		return new String[] {"RotateLeftArm"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
