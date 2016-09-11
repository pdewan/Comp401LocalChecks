package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- Looks for first space in string
 * 
 * @author Semion
 *
 */
public class IndexOfTestFirstSpace extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"One said to the other", ' ', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 3;
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
