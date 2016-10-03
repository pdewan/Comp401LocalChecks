package gradingTools.comp401f16.assignment4.testcases.array;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.execution.GradingMode;
import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public abstract class TokenArrayTest extends ScannerBeanTest {
public static final String TOKENS = "Tokens";
	protected Object[] tokensOutput;
	protected String[] tokensInput ;
	protected InputBeanTest inputBeanTest ;
	protected boolean correctComponents = true;
	boolean outputCorrectSize;
	protected boolean secondOutputCorrectSize;
	
	public TokenArrayTest() {
//		inputBeanTest = new WordBeanTest();
		inputBeanTest = createInputBeanTest();
		inputBeanTest.setInvokeSetters(false);
		if (GradingMode.getGraderRun()) {
			tokensInput = studentTokensInput();
		} else {
			tokensInput = graderTokensInput();
		}
	}
	protected abstract InputBeanTest createInputBeanTest() ;
	protected abstract String[] studentTokensInput() ;
	protected String[] graderTokensInput() {
		return studentTokensInput();
	}
	
//	protected String[][] multiLineTokenLines() {
//		return MultipleWordOutputTest.STUDENT_TOKEN_LINES;
//	}
	@Override
	protected boolean isInteractive() {
		return false;
	}
	protected String correctSizeMessage() {
		return outputCorrectSize?"":
			"Size of array not correct";
	}
	protected String corredtSecondSizeMessage() {
		return secondOutputCorrectSize?"":
			"Tokens from different scanned strings combined";
	}
	protected double correctSizeCredit() {
		return outputCorrectSize?
		 0.3:0.0;
	}
	protected double correctSecondSizeCredit() {
		return secondOutputCorrectSize?
		 0.2:0.0;
	}
	protected double correctComponentsCredit() {
		return correctComponents?
		 0.5:0.0;
	}
	protected String correctComponentsMessage() {
			return correctComponents?"":
				"Incorrect beans in array";
	}
	@Override
	public String completeMessage() {
		String aMessage = correctSizeMessage() +
				corredtSecondSizeMessage() +
				correctComponentsMessage();
		return aMessage;
	}
	public double completeScore() {
		return correctSizeCredit() +
				correctSecondSizeCredit() +
				correctComponentsCredit();
	}
	protected void processCompleteOutput() {
		double aCredit = completeScore();
		String aMessage = completeMessage();
		if (!aMessage.isEmpty()) {
			Assert.assertTrue(aMessage + NotesAndScore.PERCENTAGE_MARKER + aCredit,
					false);
		}
	}
	protected String[] singleTokenLine() {
//		if (tokensInput == null) {
//			tokensInput = multiLineTokenLines()
//					[getLineIndex()];
//		}
		return tokensInput;
	}
	@Override
	protected String[][] studentTokenLines() {
		return new String[][] {
				singleTokenLine()};
	}
	@Override
	protected String[] getOutputPropertyNames() {
		return new String[]{TOKENS};
	}
	protected void extractTokens() {
		tokensOutput = (Object[])outputPropertyValues.get(TOKENS);
	}
	protected void extractOutputCorrectSize() {
		outputCorrectSize = tokensInput.length == tokensOutput.length;
	}
	
	protected void extractSecondOutputCorrectSize() {
		secondOutputCorrectSize = tokensInput.length == tokensOutput.length;
	}
	
	protected Map<String, Object> componentInputValues = new HashMap();
	protected void extractComponentBeanStatus() throws Throwable {
		for (int i = 0; i < tokensInput.length; i++){
			String aToken = tokensInput[i];
			componentInputValues.put(WordBeanTest.INPUT, aToken);
			inputBeanTest.setInputPropertyValues(componentInputValues);
			Map<String, Object> aComponentResult = 
					inputBeanTest.executeBean(tokensOutput[i]);
			if (correctComponents) {
				correctComponents = inputBeanTest.completeCredit() == 1.0?
						true:false;
			}
		}
	}
//	protected boolean doTest() throws Throwable {
//		inputWithEndingSpace = true;
//		executeBean();
//		
//		if (processSuccessfulOutputErrrorStatus()) {
//			processGetsAndSetsAfterSucessfulOutput();
//			return true;
//		}
//		inputWithEndingSpace = false;
//		executeBean();
//		if (processSuccessfulOutputErrrorStatus()) {
//			processGetsAndSetsAfterSucessfulOutput();
//			return true;
//		}
//		processUnsuccessfulOutputErrrorStatus();
//		return true;
//	
//}
	protected boolean doTest() throws Throwable {
		inputWithEndingSpace = true;
		boolean failedWithSpace = false;
		try {
		executeBean();
		} catch (Throwable e) {
			failedWithSpace = true;
//			executeBean();
		}
		extractTokens();
		if (tokensOutput == null || failedWithSpace) {
			inputWithEndingSpace = false;
			executeBean();
			extractTokens();
		}
		extractOutputCorrectSize();
		extractComponentBeanStatus();

		// see the size does not change a second time
		executeBean(lastTargetObject);
		extractTokens();
		extractSecondOutputCorrectSize();
		processCompleteOutput();
		return true;
	}
	
	
}
