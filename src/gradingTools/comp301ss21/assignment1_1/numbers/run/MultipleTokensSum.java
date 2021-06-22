package gradingTools.comp301ss21.assignment1_1.numbers.run;

import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp301ss21.assignment1_1.numbers.source.NoIllegalCall;
import gradingTools.comp401f16.assignment1.testcases.Assignment1Suite;
import gradingTools.comp401f16.assignment1.testcases.MultipleTokenSumTest;
import gradingTools.comp401f16.assignment1.testcases.MultipleTokensOutputTest;
import gradingTools.comp401f16.assignment1.testcases.SingleTokenOutputTest;
import util.annotations.MaxValue;
@MaxValue(10)
public class MultipleTokensSum extends MultipleTokenSumTest{
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	public MultipleTokensSum() {
		inputWithEndingSpace = true;
	}
	protected String mainClassName() {
		return SS21Assignment1_1Suite.A1_PART1_MAIN_CLASS_NAME;
	}
	@Override
	protected boolean doTest() throws Throwable  {
		return super.doTest();
	}
}
