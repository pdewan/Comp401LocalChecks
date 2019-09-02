package gradingTools.comp401f16.assignment2.testcases;

import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import util.annotations.MaxValue;
@MaxValue(15)
public class ScannerBeanOutputTest extends ScannerBeanPropertyTest{
//	public static final String SCANNED_STRING = "ScannedString";
//	@Override
//	protected String[] getClassNames(){
//		return new String[] {"ScannerBean", "Bean", "bean", "BeanClass", "MyScanner", "ScanningBean",
//				"Assignment2Bean"};
//	}
//	@Override
//	public Class[] getConstructorArgTypes() {
//		return new Class[]{};
//	}
//	@Override
//	protected Object[] getConstructorArgs() {
//		return BasicProjectExecution.emptyArgs;
//	}
//	
//	@Override
//	public Map<String, Object> getInputPropertyValues() {
//		Map<String, Object> anInput = new HashMap<String, Object>();
//		anInput.put(SCANNED_STRING, getArgs()[0]);
//		return anInput;
//	}
//	@Override
//	protected boolean doTest() throws Throwable {
//		 testBean();
//		 return true;
//	}
	@Override
//	protected double incorrectOutputCredit() {
//		return getsEqualSets()?
//		 super.incorrectOutputCredit() + getsEqualsSetsCredit()
//		: 
//			super.incorrectOutputCredit();
//	}
	protected double incorrectOutputCredit() {
		return 0;
	}
//	@Override
//	protected String incorrectOutputMessage() {
//		return getsEqualSets()?
//
//		 incorrectOutputMessage()
//		:
//			 getsEqualsSetsErrorMessage() + " and " + incorrectOutputMessage();
//	}
	protected String incorrectOutputMessage() {
		return "incorrect output.";
	}
	protected void invokePropertyMethods(Object anObject) throws Throwable {
		invokeSetters(anObject);
//		invokeGetters(anObject);
	}
	protected void compareOutputWithExpected() {
		// do nothing, we did not call getters
	}
	public  boolean getsReturnedSets(Map<String, Object> anInputs,
			Map<String, Object> anActualOutputs) {
		return true;
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
		if(outputPropertyValues.get(BasicProjectExecution.MISSING_PROPERTY)!=null) {
			Assert.assertTrue("ScannedString property not found" + NotesAndScore.PERCENTAGE_MARKER + 0,
					false);
		}
		if (processSuccessfulOutputErrrorStatus()) {
			processGetsAndSetsAfterSucessfulOutput();
			return true;
		}
		processUnsuccessfulOutputErrrorStatus();
		return true;
	
}
	
}
