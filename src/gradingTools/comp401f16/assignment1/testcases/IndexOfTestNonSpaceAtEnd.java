package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- looks for non-space character that's at end of string
 * Student version- looks for non-space character that's at end of string
 * 
 * @author Semion
 *
 */
public class IndexOfTestNonSpaceAtEnd extends IndexOfTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"Let's run!", '!', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 9;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"Look, five: 5", '5', 0} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 12;
	}
	
}
