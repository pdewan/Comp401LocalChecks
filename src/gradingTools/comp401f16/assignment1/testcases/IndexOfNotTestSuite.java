package gradingTools.comp401f16.assignment1.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.Explanation;
import util.annotations.IsExtra;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({

	IndexOfNotNonSpaceAtEnd.class,
	IndexOfNotNonSpaceFirst.class,
	IndexOfNotNonSpaceStartAt.class,
	IndexOfNotSpaceAllSpace.class,
	IndexOfNotSpaceFirst.class,
	IndexOfNotSpaceSecond.class,
	IndexOfNotTest.class,
   
})
@MaxValue(5)
@Explanation("IndexOfNot functions correctly")
@IsExtra(true)
public class IndexOfNotTestSuite {


}

