package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-'P' character, starting at the start
 * Student version- looks for the first non-'0' character starting at start
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotNonSpaceFirst extends IndexOfNotTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"PPPPProgrammer's wife asked him to go to the store", 'P', 0};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 5;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"0000 1", '0', 0} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 4;
	}
}
