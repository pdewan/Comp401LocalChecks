package gradingTools.comp401f16.assignment4.testcases.array;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanPropertyTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.QuoteBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class QuoteArrayTest extends TokenArrayTest {
public static final String TOKENS = "Tokens";
protected String[] studentTokensInput() {
	return new String[] {"\"Sea Gull \"", "\" A m e r i c a n \"", "\" E uropean \""};
}
protected String[] graderTokensInput() {
	return studentTokensInput();
}
@Override
protected InputBeanTest createInputBeanTest() {
	return new QuoteBeanTest();
}
protected boolean doTest() throws Throwable {
	return super.doTest();
}
protected String toInputPropertyValue(String anInputToken) {
	return anInputToken.substring(1, anInputToken.length() -1);
}
	
}
