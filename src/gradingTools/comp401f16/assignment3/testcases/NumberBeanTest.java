package gradingTools.comp401f16.assignment3.testcases;

import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.shared.testcases.BeanExecutionTest;
import tags301.Comp301Tags;

import java.util.HashMap;
import java.util.Map;

import grader.basics.execution.BasicProjectExecution;
import util.annotations.MaxValue;
@MaxValue(10)
public class NumberBeanTest extends InputValueBeanTest{

	protected static final String STUDENT_EXAMPLE = "0045";
	@Override
	protected String[] getClassNames(){
//		return new String[] {"Number"};
		return new String[] {Comp301Tags.NUMBER};

	}
	@Override
	protected String studentInput() {
		return STUDENT_EXAMPLE;
	}

	@Override
	protected Object studentValue() {
		return Integer.parseInt(((String) getInputPropertyValues().get(INPUT)));
	}

	
}
