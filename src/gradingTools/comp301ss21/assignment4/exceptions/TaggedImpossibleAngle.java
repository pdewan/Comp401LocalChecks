package gradingTools.comp301ss21.assignment4.exceptions;

import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedBoundedShape;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import gradingTools.shared.testcases.TaggedTypeTest;
import util.annotations.MaxValue;
@MaxValue(0)
public class TaggedImpossibleAngle extends TaggedTypeTest{
//	Class[] PRECEDING_TESTS = {
//			TaggedRestrictedLine.class,
//	};
//	@Override
//	protected Class[] precedingTests() {
//		return PRECEDING_TESTS ;
//	}
	@Override
	protected String tag() {
		// TODO Auto-generated method stub
		return tags301.Comp301Tags.IMPOSSIBLE_ANGLE;
	}
	protected boolean checkForInterface() {
		return false;
	}

	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {
		return super.test(project, autoGrade);
	}
}
