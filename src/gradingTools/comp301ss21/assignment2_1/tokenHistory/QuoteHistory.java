package gradingTools.comp301ss21.assignment2_1.tokenHistory;

import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp401f16.assignment6.testcases.history.QuoteHistoryTest;
import gradingTools.comp401f16.assignment6.testcases.history.WordHistoryTest;

public class QuoteHistory extends QuoteHistoryTest {
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
//			NoIllegalCall.class,
			NoIllegalImport.class,

			
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
}
