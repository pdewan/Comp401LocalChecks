package gradingTools.comp401f16.assignment3.testcases;

import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.shared.testcases.BeanExecutionTest;

import java.util.HashMap;
import java.util.Map;

import grader.basics.execution.BasicProjectExecution;
import util.annotations.MaxValue;
@MaxValue(5)
public class StartBeanTest extends InputBeanTest{
	public static final String INPUT = "Input";
	protected static final String STUDENT_EXAMPLE = "{";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Start"};
	}
	// not checking the first get, need a framework to do so
	
	

	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}
	
}
