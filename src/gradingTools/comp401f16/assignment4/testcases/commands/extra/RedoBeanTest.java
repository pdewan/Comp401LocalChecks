package gradingTools.comp401f16.assignment4.testcases.commands.extra;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class RedoBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "RedO";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Define"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
