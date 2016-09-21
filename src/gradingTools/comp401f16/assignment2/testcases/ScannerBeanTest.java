package gradingTools.comp401f16.assignment2.testcases;

import grader.basics.execution.BasicProjectExecution;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;

import java.util.HashMap;
import java.util.Map;

import util.annotations.MaxValue;
@MaxValue(25)
public class ScannerBeanTest extends ScanStringTest{
	public static final String SCANNED_STRING = "ScannedString";
	@Override
	protected String[] getClassNames(){
		return new String[] {"ScannerBean", toRegex("Bean")};
	}
	@Override
	public Class[] getConstructorArgTypes() {
		return new Class[]{};
	}
	@Override
	protected Object[] getConstructorArgs() {
		return BasicProjectExecution.emptyArgs;
	}
	
	@Override
	public Map<String, Object> getInputPropertyValues() {
		Map<String, Object> anInput = new HashMap<String, Object>();
		anInput.put(SCANNED_STRING, getArgs()[0]);
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
		executeBean();
		
		if (processSuccessfulOutputErrrorStatus()) {
			processGetsAndSetsAfterSucessfulOutput();
			return true;
		}
		inputWithEndingSpace = false;
		executeBean();
		if (processSuccessfulOutputErrrorStatus()) {
			processGetsAndSetsAfterSucessfulOutput();
			return true;
		}
		processUnsuccessfulOutputErrrorStatus();
		return true;
	
}
	
}
