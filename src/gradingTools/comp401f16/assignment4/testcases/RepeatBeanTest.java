package gradingTools.comp401f16.assignment4.testcases;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class RepeatBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "pass";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Pass"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
