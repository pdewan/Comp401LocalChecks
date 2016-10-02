package gradingTools.comp401f16.assignment6.testcases;

import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.shared.testcases.BeanExecutionTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import util.annotations.MaxValue;
@MaxValue(5)
public abstract class GetterExecutionTest extends BeanExecutionTest{
	protected Object actualReturnValue;
	protected abstract String propertyName();
	protected abstract Class expectedClass();
	@Override
	protected String[] getOutputPropertyNames() {
		return new String[]{propertyName()};
	}
	protected double noExceptionCredit() {
		return 0.3;
	}
	protected double correctClassCredit() {
		return 0.7;
	}
	protected String incorrectClassMessage() {
		return "Object " + actualReturnValue + " not instance of " + 
	  BasicProjectIntrospection.getTags(expectedClass());
	}
	protected void assertWrongObject() {
		Assert.assertTrue(incorrectClassMessage() + NotesAndScore.PERCENTAGE_MARKER + noExceptionCredit(), false);
	}
	@Override
	protected boolean checkOutput(Object actualReturnValue) {
		if (actualReturnValue == null) {
			assertWrongObject();
		}		
		if (!expectedClass().isInstance(actualReturnValue))
			assertWrongObject();
		
		return true;
	}
	public boolean doTest() throws Throwable {
		executeBean();
		actualReturnValue = outputPropertyValues.get(propertyName());
		return checkOutput(actualReturnValue);
	}
	
}
