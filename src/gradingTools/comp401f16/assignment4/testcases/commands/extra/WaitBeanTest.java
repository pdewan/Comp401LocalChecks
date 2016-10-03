package gradingTools.comp401f16.assignment4.testcases.commands.extra;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class WaitBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "wait";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Wait"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
