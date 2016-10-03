package gradingTools.comp401f16.assignment4.testcases.commands;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class SayBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "SaY";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Say"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
