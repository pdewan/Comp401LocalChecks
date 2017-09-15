package gradingTools.comp401f16.assignment4.testcases.array;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.execution.GradingMode;
import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanPropertyTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public abstract class TokenArrayTest extends ScannerBeanOutputTest {
public static final String TOKENS = "Tokens";
	protected Object[] tokenArrayOutput;
	protected String[] tokensInput ;
	protected InputBeanTest inputBeanTest ;
	protected boolean correctComponents = true;
	protected double componentsCredit = 0;
	protected String componentsMessage = "";
	protected boolean outputCorrectSize;
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
	
	protected void clearTokenCollectionOutputs() {
		correctComponents = true;
		componentsMessage = "";
		outputCorrectSize = true;
		secondOutputCorrectSize = true;
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
	protected String correctSecondSizeMessage() {
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
		 0.5:0.5*componentsCredit;
	}
	protected String correctComponentsMessage() {
			return correctComponents?"":
				"Incorrect bean in array:" + componentsMessage;
	}
	@Override
	public String completeMessage() {
		String aMessage = correctSizeMessage() +
				correctSecondSizeMessage() +
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
		tokenArrayOutput = (Object[])outputPropertyValues.get(TOKENS);
	}
	protected int sizeOutputCollection() {
		return tokenArrayOutput.length;
	}
	
	protected void extractOutputCorrectSize() {
		outputCorrectSize = tokensInput.length == sizeOutputCollection();
	}
	
	protected void extractSecondOutputCorrectSize() {
		secondOutputCorrectSize = tokensInput.length == sizeOutputCollection();
	}
	
	protected Map<String, Object> componentInputValues = new HashMap();
	protected String toInputPropertyValue(String anInputToken) {
		return anInputToken;
	}
	protected Object outputTokenAt(int anIndex) {
		return tokenArrayOutput[anIndex];
	}
	protected void extractComponentBeanStatus() throws Throwable {
		for (int i = 0; i < tokensInput.length; i++){
			String aToken = tokensInput[i];
			if (aToken == null) {
				componentsMessage = "Null bean";
				correctComponents = false;
				componentsCredit = 0;
			}
			componentInputValues.put(WordBeanTest.INPUT, toInputPropertyValue(aToken));
			inputBeanTest.setInputPropertyValues(componentInputValues);
			Map<String, Object> aComponentResult = 
					inputBeanTest.executeBean(outputTokenAt(i));
//			inputBeanTest.executeBean(tokenArrayOutput[i]);

			if (correctComponents) {
				componentsCredit = inputBeanTest.completeCredit();
				correctComponents = componentsCredit == 1.0?
						true:
						false;
				componentsMessage = inputBeanTest.completeMessage();
				
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
	protected boolean isNullCollectionOutput() {
		return tokenArrayOutput == null;
	}
	protected boolean doTest() throws Throwable {
		inputWithEndingSpace = true;
		boolean failedWithSpace = false;
		clearTokenCollectionOutputs();
		try {
		executeBean();
		} catch (Throwable e) {
			failedWithSpace = true;
//			executeBean();
		}
		extractTokens();
		if (isNullCollectionOutput()|| failedWithSpace) {
//		if (tokenArrayOutput == null || failedWithSpace) {
			inputWithEndingSpace = false;
			executeBean();
			extractTokens();
		}
		extractOutputCorrectSize();
		if (!outputCorrectSize) {
			processCompleteOutput();
			return false;
		}
		extractComponentBeanStatus();

		// see the size does not change a second time
		executeBean(lastTargetObject);
		extractTokens();
		extractSecondOutputCorrectSize();
		processCompleteOutput();
		return true;
	}
	
	
}
