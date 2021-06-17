package gradingTools.comp301ss21.assignment4.exceptions;

import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.shared.testcases.TaggedTypeTest;
import util.annotations.MaxValue;
@MaxValue(0)

public class TaggedRestrictedLine extends TaggedTypeTest{
	@Override
	protected String tag() {
		// TODO Auto-generated method stub
		return tags301.Comp301Tags.RESTRICTED_LINE;
	}

	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {
		return super.test(project, autoGrade);
	}
}
