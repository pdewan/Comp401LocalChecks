package gradingTools.comp401f16.assignment4.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.OutputAndErrorCheckingTestCase;
@IsExtra(true)
@MaxValue(25)
public class RotatingLineTest extends OutputAndErrorCheckingTestCase{
	GraderRotatingLineInterface rotatingLine;
	@Override
	protected String[] getClassNames() {
		return new String[] {"RotatingLine"};
	}

	protected void traceProcessReturnValue() {
		System.out.println(
				"Comparing actial return value: " + 
						Arrays.toString((Object[]) getReturnValue()) +
				" with expected return value: " + 
						Arrays.toString((Object[]) getExpectedReturnValue()));
	}
	@Override
	protected Object getExpectedReturnValue() {
		return null;
//		return tokenLines()[getLineIndex()];
	}

	protected void doExtraStep() {
		
	}
	protected boolean doTest() throws Throwable {
		
		Class aClass = getTargetClass();
		if (aClass == null) {
			assertNoClass();
		}
		if (!Iterator.class.isAssignableFrom(aClass)) {
			assertWrongInterface(aClass, Iterator.class);
		}
		rotatingLine = (GraderRotatingLineInterface)
				BasicProjectIntrospection.createInstance(GraderRotatingLineInterface.class, getArgs());
//		List<String> aTokens = new ArrayList();
//		while (iterator.hasNext()) {
//			doExtraStep();
//			aTokens.add(iterator.next());
//		}
		
//		setReturnValue(aTokens.toArray());
		processReturnValue();
		return true;
		
	}
	protected boolean returnValueIsExpected() {
		return Arrays.equals((Object[]) getExpectedReturnValue(), (Object[]) getReturnValue());
	}

}