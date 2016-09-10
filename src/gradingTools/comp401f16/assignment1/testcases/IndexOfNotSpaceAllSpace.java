package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-space character in a string that is all spaces
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotSpaceAllSpace extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"           ", ' ', 0};
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
		return "indexOfNot";
	}
	protected boolean processInteractiveMethodExecutionResults() {
		return true;
	}


}
