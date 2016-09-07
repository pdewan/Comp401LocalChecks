package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;


public class IndexOfTest extends MethodExecutionTest {
	
	
	@Override
	public Object[] getArgs() {
		return new Object[] {"move 43 43 4 ", '3', 6} ;
	}
	
	@Override
	protected Object getExpectedReturnValue() {
		return 6;
	}

	
	protected Object[] getTargetObjects() {
		return getTargetClasses();
	}

	@Override
	protected String[] getClassNames(){
		return new String[] {"ScanningIterator", "main.Assignment1"};
	}
	protected String getMethodName() {
		return "indexOf";
	}
	protected boolean processInteractiveMethodExecutionResults() {
		return true;
	}


}
