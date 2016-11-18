package gradingTools.comp401f16.assignment11.sync.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
@RunWith(Suite.class)
@MaxValue(50)
@Suite.SuiteClasses({
	SyncArthurAnimationTestCase.class,
	SyncLancelotAnimationTestCase.class,
	SyncGalahadAnimationTestCase.class,
	SyncRobinAnimationTestCase.class,
	SyncArthurLancelotTestCase.class
	
})
public class SyncAnimationSuite {
	
	
}
