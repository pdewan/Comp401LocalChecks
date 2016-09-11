package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- Looks for second space in a word
 * Student version- Looks for second space in a word
 * 
 * @author Semion
 *
 */
public class IndexOfTestSecondSpace extends IndexOfTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"They got tired eventually", ' ', 5};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 8;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"After that one", ' ', 6} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 10;
	}
}
