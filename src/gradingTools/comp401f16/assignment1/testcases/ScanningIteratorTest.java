package gradingTools.comp401f16.assignment1.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.shared.testcases.MethodExecutionTest;

public class ScanningIteratorTest extends ScanStringTest{
	@Override
	protected String getClassName() {
		return MATCH_ANY + "ScanningIterator" + MATCH_ANY;
	}
//	protected double wrongInterfaceCredit() {
//		return 0.1;
//	}
//	protected void assertWrongInterface(Class anActualClass, Class anInterface) {
//		Assert.assertTrue("Class " + anActualClass.getSimpleName() + 
//				" does not implement" + anInterface.getSimpleName()
//				+ NotesAndScore.PERCENTAGE_MARKER
//				+ wrongInterfaceCredit(), false);
//	}
	protected void traceProcessReturnValue() {
		System.out.println(
				"Comparing actial return value: " + 
						Arrays.toString((Object[]) getReturnValue()) +
				" with expected return value: " + 
						Arrays.toString((Object[]) getExpectedReturnValue()));
	}
	
	protected boolean doTest() throws Throwable {
		
		Class aClass = getTargetClass();
		if (aClass == null) {
			assertNoClass();
		}
		if (!Iterator.class.isAssignableFrom(aClass)) {
			assertWrongInterface(aClass, Iterator.class);
		}
		Iterator<String> anIterator = (Iterator)
				BasicProjectIntrospection.createInstance(Iterator.class, getArgs());
		List<String> aTokens = new ArrayList();
		while (anIterator.hasNext()) {
			aTokens.add(anIterator.next());
		}
		
		returnValue = aTokens.toArray();
		expectedReturnValue = tokenLines()[0];
		processReturnValue();
		return true;
		
	}
	protected boolean returnValueIsExpected() {
		return Arrays.equals((Object[]) getExpectedReturnValue(), (Object[]) getReturnValue());
	}

}
