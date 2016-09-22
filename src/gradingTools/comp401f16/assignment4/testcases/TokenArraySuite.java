package gradingTools.comp401f16.assignment4.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;

@MaxValue(40)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	WordArrayTest.class,
	NumberArrayTest.class,
	QuoteArrayTest.class,
	PassArrayTest.class,
	FailArrayTest.class,
	ApproachArrayTest.class,
	RepeatArrayTest.class,
	SayArrayTest.class
})
public class TokenArraySuite {

}
