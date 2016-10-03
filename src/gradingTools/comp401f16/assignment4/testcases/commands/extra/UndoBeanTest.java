package gradingTools.comp401f16.assignment4.testcases.commands.extra;

import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class UndoBeanTest extends WordBeanTest{
	protected static final String STUDENT_EXAMPLE = "Undo";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Undo"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
}
