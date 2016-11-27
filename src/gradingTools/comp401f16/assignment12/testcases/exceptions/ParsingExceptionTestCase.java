package gradingTools.comp401f16.assignment12.testcases.exceptions;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment1.testcases.InvalidCharacterOutputTest;
import gradingTools.comp401f16.assignment11.parser.testcases.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanTest;
import gradingTools.comp401f16.assignment7.testcases.TestScanner;
import gradingTools.comp401f16.assignment7.testcases.factory.ScannerFactoryMethodTest;
@MaxValue(10)
@IsExtra(true)
public class ParsingExceptionTestCase extends ScanningExceptionTestCase {
	public static final double MIN_PARSE_THROWS = 5;
	public ParsingExceptionTestCase() {
//		factoryMethodTags = new String[] {"consoleSceneViewFactoryMethod"};
		factoryMethodTags = ParserFactoryMethodTest.FACTORY_METHOD_TAGS;

	}
	protected String exceptionClassTag() {
		return "ParsingException";
	}
	protected void checkThrowsClauses(Object aProxy) {
		Object aRealObject = BasicProjectIntrospection.getRealObject(aProxy);
		Class aRealClass = aRealObject.getClass();
		Method[] aMethods = aRealClass.getDeclaredMethods();
		int aNumMethodsWithThrows = 0;
		for (Method aMethod:aMethods) {
			if (aMethod.getName().startsWith("parse")) {
				System.out.println("Checking throws clause of " + aMethod);
			    List<Class> aClasses = Arrays.asList(aMethod.getExceptionTypes());
			    if (aClasses.contains(exceptionClass)) {
			    	aNumMethodsWithThrows++;
			    } else {
			    	System.out.println (aMethod + " does not throw " + exceptionClass);
			    }
			}			
		}
		if (aNumMethodsWithThrows < MIN_PARSE_THROWS ) {
			
		
		double aCredit = THROWS_EXCEPTION_CREDIT *
					((double) aNumMethodsWithThrows)/MIN_PARSE_THROWS;
		fractionComplete += aCredit;
		assertTrue ("At least " + MIN_PARSE_THROWS + " parse methods do not throw " + exceptionClass, false);
		}
	
	}
	protected void doErroneousOperations(Object aProxy) throws Exception {
		((TestParser) aProxy).setCommandText("move Arthur 2 3 ");
		String anOldErrors = ((TestParser) aProxy).getErrors();
		((TestParser) aProxy).setCommandText("JUmp Arthur 2 ");
		String aNewErrors = ((TestParser) aProxy).getErrors();
		assertTrue ("New errors:" + aNewErrors + " same as old errors " + 
		anOldErrors, !aNewErrors.equals(anOldErrors));
		fractionComplete += SETS_MESSAGE_CREDIT;
//		fractionComplete += THROWS_EXCEPTION_CREDIT;

		
	}
	@Override
	protected Class proxyClass() {
		return TestParser.class;
	}
	protected boolean doTest() throws Throwable {
		super.doTest();
		exceptionClass = BasicProjectIntrospection.findClassByTags(exceptionClassTag());
		checkThrowsClauses(rootProxy);
		  return true;
		
	}
}
