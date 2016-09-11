package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- Looks for non-space character that's at end of string
 * 
 * @author Semion
 *
 */
public class IndexOfTestNonSpaceAtEnd extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"Let's run!", '!', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 9;
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
