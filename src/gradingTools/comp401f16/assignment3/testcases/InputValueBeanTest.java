package gradingTools.comp401f16.assignment3.testcases;

import grader.basics.execution.BasicProjectExecution;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.shared.testcases.BeanExecutionTest;

import java.util.HashMap;
import java.util.Map;

import util.annotations.MaxValue;
@MaxValue(10)
public abstract class InputValueBeanTest extends InputBeanTest{
	public static final String VALUE = "Value";
	
	@Override
	protected String[] getOutputPropertyNames() {
		return new String[]{VALUE};
	}
	protected abstract Object studentValue() ;
	public Object[] getExpectedStudentOutputValues() {
		return new Object[] {studentValue()};
	}
	
}
