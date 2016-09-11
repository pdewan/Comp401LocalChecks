package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- looks for a space in same index that there is one
 * Student version- looks for a space in same index that there is one
 * 
 * @author Semion
 *
 */
public class IndexOfTestSpaceSameIndex extends IndexOfTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"0 2 4 6", ' ', 5};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 5;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"Start in a space", ' ', 8} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 8;
	}
}
