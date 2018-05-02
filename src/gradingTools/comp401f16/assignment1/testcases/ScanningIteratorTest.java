package gradingTools.comp401f16.assignment1.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.trace.Tracer;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.shared.testcases.MethodExecutionTest;
@IsExtra(true)
@MaxValue(25)
public class ScanningIteratorTest extends ScanStringTest{
	Iterator<String> iterator;
	@Override
	protected String[] getClassNames() {
		return new String[] {MATCH_ANY + "ScanningIterator" + MATCH_ANY};
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
		Tracer.info(this,
				"Comparing actial return value: " + 
						Arrays.toString((Object[]) getReturnValue()) +
				" with expected return value: " + 
						Arrays.toString((Object[]) getExpectedReturnValue()));
	}
	@Override
	protected Object getExpectedReturnValue() {
		return tokenLines()[getLineIndex()];
	}

	protected void doExtraStep() {
		
	}
	public boolean doTest() throws Throwable {
		
		Class aClass = getTargetClass();
		if (aClass == null) {
			assertNoClass();
		}
		if (!Iterator.class.isAssignableFrom(aClass)) {
			assertWrongInterface(aClass, Iterator.class);
		}
		iterator = (Iterator)
				BasicProjectIntrospection.createInstance(Iterator.class, getArgs());
//		iterator = (Iterator)
//				BasicProjectIntrospection.createInstance(aClass, getArgs());
		List<String> aTokens = new ArrayList();
		Tracer.info(this,"Putting iterator return values in array");
		while (iterator.hasNext()) {
			doExtraStep();
			Tracer.info(this,"Calling next() on iterator");
			String aNext = iterator.next();
			Tracer.info(this,"Put next value " + aNext + " in array");
			aTokens.add(aNext);
		}
		
		setReturnValue(aTokens.toArray());
		processReturnValue();
		return true;
		
	}
	protected boolean returnValueIsExpected() {
		return Arrays.equals((Object[]) getExpectedReturnValue(), (Object[]) getReturnValue());
	}

}
