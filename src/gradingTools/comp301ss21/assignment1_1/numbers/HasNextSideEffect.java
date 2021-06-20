package gradingTools.comp301ss21.assignment1_1.numbers;

import gradingTools.comp401f16.assignment1.testcases.HasNextSideEffectTest;
import gradingTools.comp401f16.assignment1.testcases.ScanningIteratorTest;
import util.annotations.MaxValue;
@MaxValue(5)
public class HasNextSideEffect extends HasNextSideEffectTest{
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}

	protected boolean doTest() throws Throwable {
		inputWithEndingSpace = true;
		return super.doTest();
	}

}
