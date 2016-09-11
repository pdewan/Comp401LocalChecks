package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-space character starting in second space
 * Student version- looks for non-space character starting in second space
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotSpaceSecond extends IndexOfNotTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"    456   10", ' ', 7};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 10;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"   second:    done", ' ', 10} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 14;
	}
	
}
