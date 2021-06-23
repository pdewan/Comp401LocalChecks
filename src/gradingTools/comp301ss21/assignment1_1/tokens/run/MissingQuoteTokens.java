package gradingTools.comp301ss21.assignment1_1.tokens.run;

import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp401f16.assignment2.testcases.MissingQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleNumberOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleQuoteOutputTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import util.annotations.MaxValue;
@MaxValue(5)
public class MissingQuoteTokens extends MissingQuoteOutputTest {
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			NoIllegalImport.class,
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	
	public MissingQuoteTokens() {
		inputWithEndingSpace = true;
	}
	protected String[] getClassNames(){
		return new String[] { SS21Assignment1_1Suite.A1_PART2_MAIN_CLASS_NAME};
	}
}
