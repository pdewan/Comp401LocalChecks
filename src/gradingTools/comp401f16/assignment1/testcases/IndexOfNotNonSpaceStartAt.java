package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-'l' character, but starts at such a character
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotNonSpaceStartAt extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"Said, while you're there, get some bread", 'l', 8};
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
		return "indexOfNot";
	}
	protected boolean processInteractiveMethodExecutionResults() {
		return true;
	}


}
