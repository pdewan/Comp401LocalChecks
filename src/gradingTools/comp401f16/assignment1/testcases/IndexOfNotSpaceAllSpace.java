package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-space character but does not find one after startIndex
 * Student version- looks for non-space character but does not find one
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotSpaceAllSpace extends IndexOfNotTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"Start:           ", ' ', 6};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return -1;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"       ", ' ', 0} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return -1;
	}
}
