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
@Explanation("Missing Quote Output")
@MaxValue(5)
public class MissingQuoteOutputTest extends MultipleTokensOutputTest {
	public static final String QUOTE_PREFIX = toRegex("uot");
	protected String[][] tokenLines = {
				{"\"Quest?\"", "\"Grail...\"", "\"Color?"}, 
				{"\"Blue?\"" , "\"Sea !!!!! Gull\"", "\"E u r o p e an\"", "\"  A mer i can  "}};
	
	@Override
	protected String[][] studentTokenLines() {
		// TODO Auto-generated method stub
		return tokenLines;
	}
	
	protected String getClassName() {
		return Assignment2Suite.MAIN_CLASS_NAME;
	}
	protected String toOutputString (String aToken) {
		int anEndIndex = (aToken.charAt(aToken.length() -1) == '\"')?
				aToken.length() -1:
				+ aToken.length();
		return QUOTE_PREFIX + aToken.substring(1, anEndIndex);
	}
    


}

