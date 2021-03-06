package gradingTools.comp301ss21.assignment1_1.numbers.run;

import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp401f16.assignment1.testcases.Assignment1Suite;
import gradingTools.comp401f16.assignment1.testcases.MultipleTokensOutputTest;
import gradingTools.comp401f16.assignment1.testcases.SingleTokenOutputTest;
import gradingTools.comp401f16.assignment1.testcases.TerminatesWithPeriodLineOutputTest;
import util.annotations.MaxValue;
@MaxValue(2)
public class TerminatesWithPeriodLineNumbers extends TerminatesWithPeriodLineOutputTest{
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	public TerminatesWithPeriodLineNumbers() {
		inputWithEndingSpace = true;
	}
	@Override
	protected String mainClassName() {
		return SS21Assignment1_1Suite.A1_PART1_MAIN_CLASS_NAME;
	}
	@Override
	protected boolean doTest() throws Throwable  {
		return super.doTest();
	}
}
