package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;


public class IndexOfTest extends MethodExecutionTest {
	
	boolean tryScannerIterator;
	
	@Override
	public Object[] getArgs() {
		return new Object[] {"move 43 43 4 ", '3', 6} ;
	}
	
	protected Object getTargetObject() {
		return getTargetClass();
	}
	
	
	protected String getClassName() {
//		if (tryScannerIterator) {
//			return "ScanningIterator";
//		}
		return "main.Assignment1";
	}
	
	protected String getMethodName() {
		return "indexOf";
	}
	
	@Override
	protected boolean doTest() throws Throwable {
		return super.doTest();
	}
	

}
