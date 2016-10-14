package gradingTools.comp401f16.assignment6.testcases.history;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;

@IsExtra(true)
@MaxValue(15)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	WordHistoryTest.class,
	NumberHistoryTest.class,
	QuoteHistoryTest.class,
	PassHistoryTest.class,
	FailHistoryTest.class,
	ApproachHistoryTest.class,
	RepeatHistoryTest.class,
	SayHistoryTest.class
})
public class TokenHistorySuite {

}
