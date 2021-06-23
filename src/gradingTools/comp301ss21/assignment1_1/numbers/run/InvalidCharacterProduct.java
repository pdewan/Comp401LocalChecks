package gradingTools.comp301ss21.assignment1_1.numbers.run;

import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp401f16.assignment1.testcases.InvalidCharacterOutputTest;
import gradingTools.comp401f16.assignment1.testcases.InvalidCharacterProductTest;
import gradingTools.comp401f16.assignment1.testcases.InvalidCharacterSumTest;
import util.annotations.MaxValue;
@MaxValue(3)
public class InvalidCharacterProduct extends InvalidCharacterProductTest {
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			NoIllegalImport.class,

			
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	public InvalidCharacterProduct() {
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
