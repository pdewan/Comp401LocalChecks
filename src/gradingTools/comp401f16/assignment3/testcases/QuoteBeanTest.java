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
public class QuoteBeanTest extends BeanExecutionTest{
	public static final String INPUT = "Input";
	protected static final String STUDENT_EXAMPLE = " This is a quote ";
	@Override
	protected String[] getClassNames(){
		return new String[] {"Quote"};
	}
	// not checking the first get, need a framework to do so
	@Override
	protected Object[] getConstructorArgs() {
		return new Object[] {STUDENT_EXAMPLE};
	}
	
	@Override
	protected Map<String, Object> getStudentInputPropertyValues() {
		Map<String, Object> anInput = new HashMap<String, Object>();
		anInput.put(INPUT, STUDENT_EXAMPLE);
		return anInput;
	}
	
//	@Override
//	protected boolean doTest() throws Throwable {
//		 testBean();
//		 return true;
//	}
//	@Override
//	protected double incorrectOutputCredit() {
//		return getsEqualSets()?
//		 super.incorrectOutputCredit() + getsEqualsSetsCredit()
//		: 
//			super.incorrectOutputCredit();
//	}
//	@Override
//	protected String incorrectOutputMessage() {
//		return getsEqualSets()?
//
//		 incorrectOutputMessage()
//		:
//			 getsEqualsSetsErrorMessage() + " and " + incorrectOutputMessage();
//	}
	@Override
	protected boolean doTest() throws Throwable {
//		inputWithEndingSpace = true;
		testBean();
		return true;
//		
//		if (processSuccessfulOutputErrrorStatus()) {
//			processGetsAndSetsAfterSucessfulOutput();
//			return true;
//		}
//		inputWithEndingSpace = false;
//		testBean();
//		if (processSuccessfulOutputErrrorStatus()) {
//			processGetsAndSetsAfterSucessfulOutput();
//			return true;
//		}
//		processUnsuccessfulOutputErrrorStatus();
//		return true;
	
}
	
}
