package gradingTools.comp401f16.assignment3.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import gradingTools.comp401f16.assignment2.testcases.MultipleQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleSignOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
@Explanation("Multiple Signs Output")
@MaxValue(5)
@IsExtra(true)
public class MultipleSignTokenOutputTest extends MultipleSignOutputTest {
	
	@Override
	protected String toOutputString (String aToken) {
		return putEscape(aToken);
	}
	protected String[] postTokenOutputLines(String aToken) {
		return new String[] {"@"};
	}
    
//	@Override
//	protected boolean doTest() throws Throwable {
//		 testBean();
//		 return true;
//		
//	
//	}

}
