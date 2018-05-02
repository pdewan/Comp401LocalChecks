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
public  class BeanParameterizedPropertyTest extends BeanExecutionTest{
	protected String propertyName = "";
	protected Object propertyValue = null;
	

	public BeanParameterizedPropertyTest(String aPropertyName, Object aPropertyValue) {
		propertyName = aPropertyName;
		propertyValue = aPropertyValue;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public Object getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(Object propertyValue) {
		this.propertyValue = propertyValue;
	}

	public static final String INPUT = "Input";
	
	
	
	@Override
	public Map<String, Object> getStudentInputPropertyValues() {
		Map<String, Object> anInput = new HashMap<String, Object>();
		anInput.put(getPropertyName(), getPropertyValue());
		return anInput;
	}
//	@Override
//	public Map<String, Object> getGraderInputPropertyValues() {
//		Map<String, Object> anInput = new HashMap<String, Object>();
//		anInput.put(getPropertyName(), graderInput());
//		return anInput;
//	}

	@Override
	protected boolean doTest() throws Throwable {
		testBean();
		return true;
	}
	
}
