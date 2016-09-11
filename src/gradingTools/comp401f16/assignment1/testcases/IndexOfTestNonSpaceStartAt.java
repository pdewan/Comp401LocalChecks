package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- looks for a non-space character and starts looking at it
 * Student version- looks for a non-space character and starts looking at it
 * 
 * @author Semion
 *
 */
public class IndexOfTestNonSpaceStartAt extends IndexOfTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"run run run", 'r', 8};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 8;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"The h is here", 'h', 9} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 9;
	}
	
}
