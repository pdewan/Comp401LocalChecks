package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Assert;
import org.junit.Test;

import util.annotations.Explanation;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.execution.NotRunnableException;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.NotesAndScore;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.CurrentProjectHolder;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.shared.testcases.OutputAndErrorCheckingTestCase;

//@Explanation("Invalid Character Tokens")
@IsExtra(true)
@MaxValue(10)
public class TerminatesWithPeriodLineOutputTest extends TerminatesWithStartingPeriodOutputTest {
	
	@Override	
	 protected String inputWithEndingSpace() {
		 String aSuperVal = super.inputWithEndingSpace();
		 String retVal = aSuperVal.replace(". ", ".");
		 return retVal;
	 }
    
   
    
	
}

