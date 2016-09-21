package gradingTools.comp401f16.assignment3.testcases;

import grader.basics.execution.BasicProjectExecution;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.shared.testcases.BeanExecutionTest;

import java.util.HashMap;
import java.util.Map;

import util.annotations.MaxValue;
@MaxValue(10)
public class WordBeanTest extends InputValueBeanTest{

	protected static final String STUDENT_EXAMPLE = "ARthUr";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Word"};
	}
	
	
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}

	@Override
	protected Object studentValue() {
		// TODO Auto-generated method stub
		return studentInput().toLowerCase();
	}
	
}
