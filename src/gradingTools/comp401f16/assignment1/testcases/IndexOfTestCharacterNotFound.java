package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- looks for character not in string
 * 
 * @author Semion
 *
 */
public class IndexOfTestCharacterNotFound extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"went for a walk", '9', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return -1;
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
