package gradingTools.comp301ss21.assignment0.testcases;

import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.basics.sharedTestCase.checkstyle.MnemonicNamesRatioCheck;

public class A0MnemonicNames extends MnemonicNamesRatioCheck {
	public TestCaseResult test(Project aProject, boolean autoGrade) throws NotAutomatableException, NotGradableException {
        return super.test(aProject, autoGrade);

        
    }

}
