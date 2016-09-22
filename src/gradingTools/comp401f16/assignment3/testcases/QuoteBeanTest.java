package gradingTools.comp401f16.assignment3.testcases;

import grader.basics.execution.BasicProjectExecution;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.shared.testcases.BeanExecutionTest;

import java.util.HashMap;
import java.util.Map;

import util.annotations.MaxValue;
@MaxValue(5)
public class QuoteBeanTest extends InputBeanTest{
	protected static final String STUDENT_EXAMPLE = " This is a quote ";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Quote"};
	}
	
@Override
protected String studentInput() {
	// TODO Auto-generated method stub
	return STUDENT_EXAMPLE;
}
	
}
