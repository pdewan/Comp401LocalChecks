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
public abstract class InputBeanTest extends BeanExecutionTest{
	public static final String INPUT = "Input";
	
	abstract protected String studentInput() ;
	protected String graderInput() {
		return studentInput();
	}
	@Override
	protected Object[] getStudentConstructorArgs() {
		return new Object[] {studentInput()};
	}
	@Override
	protected Object[] getGraderConstructorArgs() {
		return new Object[] {graderInput()};
	}
	
	@Override
	public Map<String, Object> getStudentInputPropertyValues() {
		Map<String, Object> anInput = new HashMap<String, Object>();
		anInput.put(INPUT, studentInput());
		return anInput;
	}
	@Override
	public Map<String, Object> getGraderInputPropertyValues() {
		Map<String, Object> anInput = new HashMap<String, Object>();
		anInput.put(INPUT, graderInput());
		return anInput;
	}

	@Override
	protected boolean doTest() throws Throwable {
		testBean();
		return true;
	}
	
}
