package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-space character starting in second space
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotSpaceSecond extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"    456   10", ' ', 7};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 10;
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
