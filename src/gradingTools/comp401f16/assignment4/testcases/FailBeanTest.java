package gradingTools.comp401f16.assignment4.testcases;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class FailBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "FAIL";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Fail"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
