package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- looks for character that is not in the rest of the string
 * Student version- looks for character that is not in the rest of the string
 * 
 * @author Semion
 *
 */
public class IndexOfTestCharacterNotFound extends IndexOfTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"went for a walk", '9', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return -1;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"One two go", 'n', 4} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return -1;
	}
	
}
