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
@Explanation("Multiple Delmiters Output")
@MaxValue(5)
public class MultipleGroupingOutputTest extends MultipleTokensOutputTest {
	public static final String DELIM_PREFIX = toRegex("elim");
	protected String[][] tokenLines = {{"{" , "}"  ,"{"}, {"{" , "}"}};
	protected String[][] graderTokenLines = {{"{", "}", "{", "}"},{"{", "{", "}", "}", "}"}};
	
	protected String[] getClassNames(){
		return new String[] {
				Assignment2Suite.MAIN_CLASS_NAME, 
				"ssignment"
				};
	}
	@Override
	protected String[][] studentTokenLines() {
		return tokenLines;
	}
	
	@Override
	protected String[][] graderTokenLines() {
		return graderTokenLines;
	}
	
//	protected String getClassName() {
//		return Assignment2Suite.MAIN_CLASS_NAME;
//	}
	protected String putEscape(String aToken) {
		return "\\Q" + aToken + "\\E";
	}
	protected String toOutputString (String aToken) {
		return DELIM_PREFIX + putEscape(aToken);
	}
	
    


}

