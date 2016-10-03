package gradingTools.comp401f16.assignment4.testcases.commands.extra;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class RotateRightArmBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "RotateRightArm";
	@Override
	protected String[] getClassNames(){
		return new String[] {"RotateRightArm"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
