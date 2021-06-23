package gradingTools.comp301ss21.assignment1_1.numbers.run;

import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp401f16.assignment1.testcases.Assignment1Suite;
import gradingTools.comp401f16.assignment1.testcases.IndexOfTest;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;
import util.annotations.MaxValue;
@MaxValue(15)
public class ScanString extends ScanStringTest {
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			NoIllegalImport.class,

			
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	protected String mainClassName() {
		return SS21Assignment1_1Suite.A1_PART1_MAIN_CLASS_NAME;
	}
//	@Override
	protected String[] getClassNames(){
		return new String[] {"ScanningIterator", SS21Assignment1_1Suite.A1_PART1_MAIN_CLASS_NAME};
	}
}
