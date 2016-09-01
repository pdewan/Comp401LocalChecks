package gradingTools.comp401f16.assignment2.testcases;

import java.util.ArrayList;
import java.util.List;

import util.annotations.Explanation;
import grader.basics.execution.NotRunnableException;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.comp401f16.assignment1.testcases.AbstractNumberScanningTest;
@Explanation("Multiple Tokens Output")
public class MultipleNumberOutputTest extends AbstractNumberScanningTest {
	protected String[][] tokenLines = {{"22", "44", "66"}, {"11" , "33", "55", "1"}};
	public static final String NUMBER_PREFIX = toRegex("umber");
	
	@Override
	protected String[][] tokenLines() {
		return tokenLines;
	}
	@Override
	protected String[] expectedOutputs() {
		return expectedTokenOutputs();		
	}  
	protected String toOutputString (String aToken) {
		return NUMBER_PREFIX + aToken;
	}
    


}

