package gradingTools.comp401f16.assignment10.async.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
@RunWith(Suite.class)
@MaxValue(40)
@Suite.SuiteClasses({
	AsyncArthurAnimationTestCase.class,
	AsyncGalahadAnimationTestCase.class,
	AsyncLancelotAnimationTestCase.class,
	AsyncRobinAnimationTestCase.class
	
})
public class AsyncAnimationSuite {
	
	
}
