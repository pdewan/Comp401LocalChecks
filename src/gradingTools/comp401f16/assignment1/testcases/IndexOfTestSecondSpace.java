package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- Looks for second space in a word
 * 
 * @author Semion
 *
 */
public class IndexOfTestSecondSpace extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"They got tired eventually", ' ', 5};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 8;
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
