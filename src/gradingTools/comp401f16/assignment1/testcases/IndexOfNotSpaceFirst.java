package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for first non-space character
 * Student version- looks for first non-space character
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotSpaceFirst extends IndexOfNotTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"        The programmer never came back", ' ', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 8;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"   One two go", ' ', 0} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 3;
	}
}
