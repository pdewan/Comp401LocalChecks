package gradingTools.comp401f16.assignment4.testcases;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class ApproachBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "AppRoach";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Approach"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
