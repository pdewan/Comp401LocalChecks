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
	public static final String[][] STUDENT_TOKEN_LINES = {{"move", "approach", "say"}, {"Arthur" , "Galahad", "Lancelot", "Robin"}};
	public static final String[][] GRADER_TOKEN_LINES = {{"DOTH", "I", "perhaps", "surmise", "surprise"}};
	protected String[] getClassNames(){
		return new String[] {Assignment2Suite.MAIN_CLASS_NAME, "Assignment"};
	}
	@Override
	protected String[][] studentTokenLines() {
		return STUDENT_TOKEN_LINES;
	}
	
	@Override
	protected String[][] graderTokenLines() {
		return GRADER_TOKEN_LINES;
	}
	
	
	
	protected String toOutputString (String aToken) {
		return WORD_PREFIX + aToken;
	}
    


}

