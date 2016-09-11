package gradingTools.comp401f16.assignment1.testcases;

import org.junit.Test;

import gradingTools.shared.testcases.MethodExecutionTest;
import util.annotations.IsExtra;

/**
 * Grader version- looks for non-'l' character, but starts at such a character
 * Student version- looks for non-'q' character, but starts at such a character
 * 
 * @author Semion
 *
 */

@IsExtra(true)
public class IndexOfNotNonSpaceStartAt extends IndexOfNotTest {
	
	@Override
	public Object[] getGraderArgs() {
		return new Object[]{"Said, while you're there, get some bread", 'l', 8};
	}
	
	@Override
	protected Object getGraderExpectedReturnValue() {
		return 8;
	}
	
	@Override
	public Object[] getStudentArgs() {
		return new Object[] {"That's not a q", 'q', 3} ;
	}
	
	@Override
	protected Object getStudentExpectedReturnValue() {
		return 3;
	}
}
