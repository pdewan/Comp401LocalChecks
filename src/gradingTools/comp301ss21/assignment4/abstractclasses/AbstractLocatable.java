package gradingTools.comp301ss21.assignment4.abstractclasses;

import java.lang.reflect.Modifier;
import java.util.List;

import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import util.annotations.MaxValue;
@MaxValue(3)
public class AbstractLocatable extends PassFailJUnitTestCase {
	Class[] PRECEDING_TESTS = {
			TaggedLocatable.class,
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
		TaggedLocatable aTaggedLocatableTest = (TaggedLocatable) aPrecedingTests.get(0);
		Class aLocatableClass = aTaggedLocatableTest.getTaggedClass();
		if (Modifier.isAbstract(aLocatableClass.getModifiers())) {
			return pass();
		}
		return fail (aLocatableClass.getName() + " is not abstract");
	}

}
