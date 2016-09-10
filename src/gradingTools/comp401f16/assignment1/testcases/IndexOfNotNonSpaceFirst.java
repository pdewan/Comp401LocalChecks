package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-'P' character, starting at the start
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotNonSpaceFirst extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"PPPPProgrammer's wife asked him to go to the store", 'P', 0};
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
		return "indexOfNot";
	}
	protected boolean processInteractiveMethodExecutionResults() {
		return true;
	}


}
