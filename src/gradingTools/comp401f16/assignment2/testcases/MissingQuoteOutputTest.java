package gradingTools.comp401f16.assignment2.testcases;

import java.util.ArrayList;
import java.util.List;

import util.annotations.Explanation;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.execution.NotRunnableException;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.comp401f16.assignment1.testcases.AbstractNumberScanningTest;
import gradingTools.comp401f16.assignment1.testcases.Assignment1Suite;
import gradingTools.comp401f16.assignment1.testcases.MultipleTokensOutputTest;
import gradingTools.comp401f16.assignment3.testcases.Assignment3Suite;
@Explanation("Missing Quote Output")
@MaxValue(5)
@IsExtra(true)
public class MissingQuoteOutputTest extends MultipleTokensOutputTest {
	public static final String QUOTE_PREFIX = toRegex("uot");
	protected String[][] tokenLines = {
				{"\"Quest?\"", "\"Grail...\"", "\"Color?"}, 
				{"\"Blue?\"" , "\"Sea !!!!! Gull\"", "\"E u r o p e an\"", "\"  A mer i can  "}};
	
	protected String[][] graderTokenLines = {
			{"\"an unfinished quote...\"", "\" One quote   there\"", "\"   and  \"", "\" the other so remote \"", "\"!! !# ! @  "}};

	protected String[] getClassNames(){
		return Assignment2Suite.MAIN_CLASS_NAME;
	}
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
	protected String toOutputString (String aToken) {
		int anEndIndex = (aToken.charAt(aToken.length() -1) == '\"')?
				aToken.length() -1:
				+ aToken.length();
		return QUOTE_PREFIX + aToken.substring(1, anEndIndex);
	}
    


}

