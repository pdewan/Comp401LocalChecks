package gradingTools.comp301ss21.assignment4.exceptions;

import java.lang.reflect.Modifier;
import java.util.List;

import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedBoundedShape;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import util.annotations.MaxValue;
@MaxValue(5)
public class CheckedImpossibleAngle extends PassFailJUnitTestCase {
	Class[] PRECEDING_TESTS = {
			TaggedImpossibleAngle.class,
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS ;
	}
	
	@Override
	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {
		// TODO Auto-generated method stub
		List<PassFailJUnitTestCase> aPrecedingTests = getPrecedingTestInstances();
		TaggedImpossibleAngle aTaggedTest = (TaggedImpossibleAngle) aPrecedingTests.get(0);
		Class aTaggedClass = aTaggedTest.getTaggedClass();
		if (
				Exception.class.isAssignableFrom(aTaggedClass) &&
				!RuntimeException.class.isAssignableFrom(aTaggedClass) ) {
			return pass();
			
		}
		
		if (!Exception.class.isAssignableFrom(aTaggedClass)) {
			return fail(aTaggedClass + " is not an exception class");
		}
//		if (RuntimeException.class.isAssignableFrom(aTaggedClass)) {
			return fail(aTaggedClass + " is an unchecked exception class ");
//		}
		
	}

}
