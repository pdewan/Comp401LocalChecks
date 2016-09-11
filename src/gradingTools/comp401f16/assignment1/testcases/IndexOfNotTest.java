package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * 
 * Parent class for indexOfNot tests. Main difference from IndexOf is different getMethodName()
 * 
 * Grader version- looks for non-z character, not starting at the start
 * Student version- look for non-r character, not starting at the start
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotTest extends IndexOfTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"The buzzzz of bees", 'z', 6};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 10;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"Aaarrrrgh, matey", 'r', 3} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 7;
	}
	@Override
	protected String getMethodName() {
		return "indexOfNot";
	}

}
