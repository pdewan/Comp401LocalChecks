package gradingTools.comp301ss21.assignment1_1.numbers;

import gradingTools.comp301ss21.assignment1_1.scannerBean.TaggedScannerBean;
import gradingTools.comp401f16.assignment1.testcases.ScanningIteratorTest;
import util.annotations.MaxValue;
@MaxValue(25)
public class ScanningIterator extends ScanningIteratorTest{
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
