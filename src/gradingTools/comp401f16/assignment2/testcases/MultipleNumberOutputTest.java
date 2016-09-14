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
@Explanation("Multiple Numbers Output")
@MaxValue(10)
public class MultipleNumberOutputTest extends MultipleTokensOutputTest {
	public static final String NUMBER_PREFIX = toRegex("umber");
	
	protected String getClassName() {
		return Assignment2Suite.MAIN_CLASS_NAME;
	}
	protected String toOutputString (String aToken) {
		return NUMBER_PREFIX + aToken;
	}
    
}

