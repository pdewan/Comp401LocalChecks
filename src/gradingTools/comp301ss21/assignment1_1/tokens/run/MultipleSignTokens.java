package gradingTools.comp301ss21.assignment1_1.tokens.run;

import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp401f16.assignment2.testcases.MultipleNumberOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleSignOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import util.annotations.MaxValue;
@MaxValue(10)
public class MultipleSignTokens extends MultipleSignOutputTest {
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			NoIllegalImport.class,
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	
	public MultipleSignTokens() {
		inputWithEndingSpace = true;
	}
	protected String[] getClassNames(){
		return new String[] { SS21Assignment1_1Suite.A1_PART2_MAIN_CLASS_NAME};
	}
}
