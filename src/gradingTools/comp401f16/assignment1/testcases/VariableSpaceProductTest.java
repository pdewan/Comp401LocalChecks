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

@Explanation("Variable Space Product")
@IsExtra(true)
public class VariableSpaceProductTest extends VariableSpaceOutputTest {
	
    
    
    @Override
    protected String[] getExpectedOutputs() {
    	return expectedSumOutputs();
    }
    
    
	
}

