package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Assert;
import org.junit.Test;

import util.annotations.Explanation;
import util.annotations.IsExtra;
import grader.basics.execution.NotRunnableException;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.NotesAndScore;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.CurrentProjectHolder;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.shared.testcases.OutputAndErrorCheckingTestCase;

@Explanation("Terminated with Period Sum")
@IsExtra(true)
public class TerminatesWithStartingPeriodProductTest extends TerminatesWithStartingPeriodOutputTest {
	
    
    @Override
    protected String[] getExpectedOutputs() {
    	return expectedProductOutputs();
    }

    public static void main (String[] args) {
    	String aTestOutput = "The tokens are:22\n44\n66\nSum: 132\n Product: 63888\n 11\n33\n55\n1\n Sum: 100  \n Product: 19965";
		String aTest1Output = "The tokens are:22\n44\n66\n1i\n33\n55\n Sum: 231 \n Product: 1275523920";
		String aTest2Output = "The tokens are:22 44 66 11 33 55";
		
		TerminatesWithStartingPeriodProductTest aTestCase = new TerminatesWithStartingPeriodProductTest();
		test(aTestCase, aTestOutput);
		test (aTestCase, aTest1Output);
		test (aTestCase, aTest2Output);
    }
    
    
	
}

