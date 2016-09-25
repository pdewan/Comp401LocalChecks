package gradingTools.comp401f16.assignment2.testcases;

import java.util.ArrayList;
import java.util.List;

import util.annotations.Explanation;
import util.annotations.MaxValue;
import grader.basics.execution.NotRunnableException;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.comp401f16.assignment1.testcases.AbstractNumberScanningTest;
import gradingTools.comp401f16.assignment1.testcases.Assignment1Suite;
import gradingTools.comp401f16.assignment1.testcases.MultipleTokensOutputTest;
@Explanation("Multiple Quotes Output")
@MaxValue(20)
public class MultipleQuoteOutputTest extends MultipleTokensOutputTest {
	public static final String QUOTE_PREFIX = toRegex("uot");
	protected String[] getClassNames(){
		return Assignment2Suite.MAIN_CLASS_NAME;
	}
	protected String[][] tokenLines = {
				{"\"Quest?\"", "\"Grail...\"", "\"Color?\""}, 
				{"\"Blue?\"" , "\"Sea !!!!! Gull\"", "\"E u r o p e an\"", "\"  A mer i can  \""}};
	
	protected String[][] graderTokenLines = {
		{"\"   weird spacing    \"", "\"23more_numbers234\"", "\"12334\"", "\" AND SYMBOLS #@!\"", "\" 1 ! - end\""}};
	
	@Override
	protected String[][] studentTokenLines() {
		return tokenLines;
	}
	
	@Override
	protected String[][] graderTokenLines() {
		return graderTokenLines;
	}

	protected String getClassName() {
		return Assignment2Suite.MAIN_CLASS_NAME[0];
	}
	protected String withoutQuotes(String aToken) {
		return aToken.substring(1, aToken.length() -1);
	}
	protected String toOutputString (String aToken) {
		return QUOTE_PREFIX + withoutQuotes(aToken);
	}
    


}

