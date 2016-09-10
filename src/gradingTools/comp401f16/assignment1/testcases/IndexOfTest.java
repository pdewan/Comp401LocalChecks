package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;

/**
 * Grader version- looks for non-space character, starts at 0
 * Student version- looks for non-space character, starts at character
 * 
 * @author Dr. Dewan, Semion
 *
 */
public class IndexOfTest extends MethodExecutionTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[] {"2 nice zebras", 'z', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 7;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"move 43 43 4 ", '3', 6} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 6;
	}
	
	protected Object[] getTargetObjects() {
		return getTargetClasses();
	}

	@Override
	protected String[] getClassNames(){
		return new String[] {"ScanningIterator", "main.Assignment1"};
	}
	protected String getMethodName() {
		return "indexOf";
	}
	protected boolean processInteractiveMethodExecutionResults() {
		return true;
	}


}
