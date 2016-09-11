package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-'1' character that it should find at the end
 * Student version- looks for non-'z' character that it should find at the end
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotNonSpaceAtEnd extends IndexOfNotTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"Number 111112", '1', 7};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 12;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"zzzzzzzzzzo", 'z', 0} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 10;
	}
}
