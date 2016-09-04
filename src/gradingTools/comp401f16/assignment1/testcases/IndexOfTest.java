package gradingTools.comp401f16.assignment1.testcases;

import gradingTools.shared.testcases.MethodExecutionTest;


public class IndexOfTest extends MethodExecutionTest {
	
	@Override
	public Object[] getArgs() {
		return new Object[] {"move 43 43 4 ", '3', 6} ;
	}
	
	
	protected String getClassName() {
		return "main.Assignment1";
	}
	
	protected String getMethodName() {
		return "indexOf";
	}
	

}
