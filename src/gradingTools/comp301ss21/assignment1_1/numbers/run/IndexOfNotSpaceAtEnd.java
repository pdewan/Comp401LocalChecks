package gradingTools.comp301ss21.assignment1_1.numbers.run;

import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp301ss21.assignment1_1.numbers.source.NoIllegalCall;
import gradingTools.comp401f16.assignment1.testcases.IndexOfTest;
import gradingTools.comp401f16.assignment1.testcases.IndexOfTestCharacterNotFound;
import gradingTools.comp401f16.assignment1.testcases.IndexOfTestFirstSpace;
import gradingTools.comp401f16.assignment1.testcases.IndexOfTestNonSpaceAtEnd;
import util.annotations.MaxValue;
@MaxValue(3)
public class IndexOfNotSpaceAtEnd extends IndexOfTestNonSpaceAtEnd {
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	@Override
	protected String[] getClassNames(){
		return new String[] {"ScanningIterator", SS21Assignment1_1Suite.A1_PART1_MAIN_CLASS_NAME};
	}
}
