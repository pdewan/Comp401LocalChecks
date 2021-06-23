package gradingTools.comp301ss21.assignment1_1.numbers.run;

import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp301ss21.assignment1_1.numbers.source.ScanningIteratorCallsIndexOf;
import gradingTools.comp301ss21.assignment1_1.numbers.source.ScanningIteratorCallsIndexOfNot;
import gradingTools.comp301ss21.assignment1_1.numbers.source.ScanningIteratorISAJavaIterator;
import gradingTools.comp301ss21.assignment1_1.scannerBean.TaggedScannerBean;
import gradingTools.comp401f16.assignment1.testcases.ScanningIteratorTest;
import util.annotations.MaxValue;
@MaxValue(25)
public class ScanningIterator extends ScanningIteratorTest{
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			ScanningIteratorCallsIndexOf.class,
			ScanningIteratorCallsIndexOfNot.class,
			ScanningIteratorISAJavaIterator.class,
			NoIllegalImport.class,

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
