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
@Explanation("Multiple Words Output")
@MaxValue(10)
public class MultipleWordOutputTest extends MultipleTokensOutputTest {
	public static final String WORD_PREFIX = toRegex("ord");
	protected String[][] tokenLines = {{"move", "approach", "say"}, {"Arthur" , "Galahad", "Lancelot", "Robin"}};
	protected String[][] graderTokenLines = {
			{"DOTH", "one", "perhaps", "surmise"},
			{"that", "I", "am", "somewhat", "surprised"}};
	
	@Override
	protected String[][] studentTokenLines() {
		return tokenLines;
	}
	
	@Override
	protected String[][] graderTokenLines() {
		return graderTokenLines;
	}
	
	protected String[] getClassNames(){
		return new String[] {Assignment2Suite.MAIN_CLASS_NAME, "Assignment"};
	}
	
	protected String toOutputString (String aToken) {
		return WORD_PREFIX + aToken;
	}
    


}

