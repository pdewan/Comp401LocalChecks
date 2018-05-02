package gradingTools.comp401f16.assignment3.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import gradingTools.comp401f16.assignment2.testcases.MultipleQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
@Explanation("Multiple Quotes Output")
@MaxValue(10)
public class MultipleQuoteTokenOutputTest extends MultipleQuoteOutputTest {
	protected String[] getClassNames(){
		return new String[] {
				Assignment3Suite.MAIN_CLASS_NAME, 
				"ssignment"
				};
	}
	@Override
	protected String toOutputString (String aToken) {
		return withoutQuotes(aToken);
	}
	protected String[] postTokenOutputLines(String aToken) {
		return new String[] {"@"};
	}
	
	@Override
	public boolean doTest() throws Throwable {
		return super.doTest();
	}
    
//	@Override
//	protected boolean doTest() throws Throwable {
//		 testBean();
//		 return true;
//		
//	
//	}

}

