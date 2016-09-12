package gradingTools.comp401f16.assignment3.testcases;

import grader.basics.execution.BasicProjectExecution;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;

import java.util.HashMap;
import java.util.Map;

import util.annotations.MaxValue;
@MaxValue(25)
public class WordBeanTest extends ScanStringTest{
	public static final String INPUT = "Input";
	public static final String VALUE = "Value";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Word"};
	}
	@Override
	protected Class[] getConstructorArgTypes() {
		return new Class[]{};
	}
	@Override
	protected Object[] getConstructorArgs() {
		return BasicProjectExecution.emptyArgs;
	}
	@Override
	protected String[] getOutputPropertyNames() {
		return new String[]{VALUE};
	}
	@Override
	protected Map<String, Object> getInputPropertyValues() {
		Map<String, Object> anInput = new HashMap<String, Object>();
//		anInput.put(, getArgs()[0]);
		return anInput;
	}
//	@Override
//	protected boolean doTest() throws Throwable {
//		 testBean();
//		 return true;
//	}
	@Override
	protected double incorrectOutputCredit() {
		return getsEqualSets()?
		 super.incorrectOutputCredit() + getsEqualsSetsCredit()
		: 
			super.incorrectOutputCredit();
	}
	@Override
	protected String incorrectOutputMessage() {
		return getsEqualSets()?

		 incorrectOutputMessage()
		:
			 getsEqualsSetsErrorMessage() + " and " + incorrectOutputMessage();
	}
	@Override
	protected boolean doTest() throws Throwable {
		inputWithEndingSpace = true;
		testBean();
		
		if (processSuccessfulOutputErrrorStatus()) {
			processGetsAndSetsAfterSucessfulOutput();
			return true;
		}
		inputWithEndingSpace = false;
		testBean();
		if (processSuccessfulOutputErrrorStatus()) {
			processGetsAndSetsAfterSucessfulOutput();
			return true;
		}
		processUnsuccessfulOutputErrrorStatus();
		return true;
	
}
	
}
