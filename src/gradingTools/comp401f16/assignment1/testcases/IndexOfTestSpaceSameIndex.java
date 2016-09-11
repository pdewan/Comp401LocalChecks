package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- Looks for a space in same index that there is one
 * 
 * @author Semion
 *
 */
public class IndexOfTestSpaceSameIndex extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"0 2 4 6", ' ', 5};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 5;
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
