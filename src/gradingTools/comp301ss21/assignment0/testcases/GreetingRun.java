package gradingTools.comp301ss21.assignment0.testcases;

import java.util.Arrays;
import java.util.regex.Pattern;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.execution.NotRunnableException;
import grader.basics.execution.RunningProject;
import grader.basics.junit.JUnitTestsEnvironment;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.shared.testcases.SubstringSequenceChecker;
import gradingTools.shared.testcases.greeting.AGreetingChecker;
import gradingTools.shared.testcases.greeting.GreetingMainProvided;
import gradingTools.shared.testcases.utils.LinesMatchKind;
import gradingTools.shared.testcases.utils.LinesMatcher;
import gradingTools.utils.RunningProjectUtils;
import util.annotations.MaxValue;
@MaxValue(6)
public class GreetingRun extends PassFailJUnitTestCase {
	public static final int TIME_OUT_SECS = 1; // secs
	protected SubstringSequenceChecker checker = new AGreetingChecker();	

	public GreetingRun() {
	}

	protected RunningProject createRunningProject (Project aProject) {
		TaggedGreetingMainProvided aHelloWorkdClassProvided = (TaggedGreetingMainProvided) JUnitTestsEnvironment.getAndPossiblyRunGradableJUnitTest(TaggedGreetingMainProvided.class);
		Class aHelloClass = aHelloWorkdClassProvided.getGreetingMain();
		if (aHelloClass == null) {
			System.err.println("Cannot run test, no main class");
			return null;
		}
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().setEntryPoint(aHelloClass.getName());
		RunningProject aRunningProject = RunningProjectUtils.runProject(aProject, TIME_OUT_SECS);
		return aRunningProject;
	}
	

	@Override
	public TestCaseResult test(Project project, boolean autoGrade) throws NotAutomatableException,
			NotGradableException {
		try {
//			setEntryPoint(project);
//    		GreetingMainProvided aHelloWorkdClassProvided = (GreetingMainProvided) JUnitTestsEnvironment.getAndPossiblyRunGradableJUnitTest(GreetingMainProvided.class);
//    		Class aHelloClass = aHelloWorkdClassProvided.getGreetingMain();
//			BasicExecutionSpecificationSelector.getBasicExecutionSpecification().setEntryPoint(aHelloClass.getName());
//			RunningProject aRunningProject = RunningProjectUtils.runProject(project, TIME_OUT_SECS);
			RunningProject aRunningProject = createRunningProject(project);
			if (aRunningProject == null) {
				return fail ("Could not create project. See console messages.");
			}

			String anOutput = aRunningProject.await();
			LinesMatcher aLinesMatcher = aRunningProject.getLinesMatcher();
			boolean aRetval = checker.check(aLinesMatcher, LinesMatchKind.ONE_TIME_LINE, Pattern.DOTALL);
			

			String anExpectedLines = Arrays.toString(checker.getSubstrings());

			if (!aRetval) {
				return fail("Output  did not match:" + anExpectedLines);

			}
			return pass();
			

		} catch (NotRunnableException e) {
			throw new NotGradableException();
		}
	}

}
