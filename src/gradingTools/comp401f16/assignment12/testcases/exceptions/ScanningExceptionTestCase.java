package gradingTools.comp401f16.assignment12.testcases.exceptions;

import java.io.IOException;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment1.testcases.InvalidCharacterOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanPropertyTest;
import gradingTools.comp401f16.assignment7.testcases.TestScanner;
import gradingTools.comp401f16.assignment7.testcases.factory.ScannerFactoryMethodTest;
@MaxValue(10)
@IsExtra(true)
public class ScanningExceptionTestCase extends ScannerFactoryMethodTest {
	protected static final double HAS_EXCEPTION_CREDIT = 0.2;
	protected static final double CHECKED_EXCEPTION_CREDIT = 0.1;
	protected static final double THROWS_EXCEPTION_CREDIT = 0.5;
	protected static final double SETS_MESSAGE_CREDIT = 0.2;

	protected Class exceptionClass;
	
	protected void checkCheckedException() {
		assertTrue(exceptionClass + " should be subclass of " + IOException.class,
				IOException.class.isAssignableFrom(exceptionClass));
		fractionComplete += CHECKED_EXCEPTION_CREDIT;
	}
	
	protected final String SCANNED_STRING = " @ ";
	
	protected String scannedString() {
		return SCANNED_STRING;
	}
	
	protected void doErroneousOperations(Object aProxy) throws Exception {
		((TestScanner) aProxy).setScannedString(scannedString());
	}
	protected void checkThrownExceptionClass (Exception e) {
		assertTrue("Exception " + e + " not instance of " + exceptionClass, 
				exceptionClass.isInstance(e));
		fractionComplete += THROWS_EXCEPTION_CREDIT;
	}
	protected void checkThrownExceptionMessage (Exception e) {
		assertTrue("Exception " + e + " does not have message ", 
				e.getMessage() != null && !e.getMessage().isEmpty());
		fractionComplete += SETS_MESSAGE_CREDIT;
	}
	
	protected void checkSuccessfulSet() {
		assertTrue("Scanner does not throw exceptiion when scanned string is: " + scannedString() , false);

	}
	@Override
	protected void executeOperations(Object aProxy) throws Exception {
		try {
//			IOException anException = new IOException();
//			System.out.println("Message" + anException.getMessage()) ;
			doErroneousOperations(aProxy);
			checkSuccessfulSet();
//			assertTrue("Exceptiion not thrown by scanned String: " + scannedString() , false);
		} catch (Exception e) {
//			assertTrue("Exception " + e + " not instance of " + exceptionClass, 
//					exceptionClass.isInstance(e));
//			fractionComplete += THROWS_EXCEPTION_CREDIT;
			checkThrownExceptionClass(e);
			checkThrownExceptionMessage(e);
//			e.printStackTrace();
		}
	}
	protected String exceptionClassTag() {
		return "ScanningException";
	}
	protected void checkHasExceptionClass() {
		assertTrue("Could not find ExceptionClass", exceptionClass != null);
		fractionComplete += HAS_EXCEPTION_CREDIT;
	}
	protected void addFactoryMethodCredit() {
//		fractionComplete = factoryCredit;
	}
	protected boolean doTest() throws Throwable {
		exceptionClass = BasicProjectIntrospection.findClassByTags(exceptionClassTag());
		checkHasExceptionClass();
		 checkCheckedException();
		doFactoryMethodTest();
		  executeOperations(rootProxy);
		  return true;
		
	}
}
