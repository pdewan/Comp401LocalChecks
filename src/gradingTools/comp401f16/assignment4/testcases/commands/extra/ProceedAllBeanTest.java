package gradingTools.comp401f16.assignment4.testcases.commands.extra;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class ProceedAllBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "proceEdAll";
	@Override
	protected String[] getClassNames(){
		return new String[] {"ProceedAll"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
