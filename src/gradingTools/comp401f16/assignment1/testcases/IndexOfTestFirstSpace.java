package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- looks for first space in string
 * Student version- looks for first space in string
 * 
 * @author Semion
 *
 */
public class IndexOfTestFirstSpace extends IndexOfTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"One said to the other", ' ', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 3;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"First space at 5", ' ', 0} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 5;
	}
	
}
