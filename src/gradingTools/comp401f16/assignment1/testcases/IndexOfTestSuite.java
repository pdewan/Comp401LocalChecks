package gradingTools.comp401f16.assignment1.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.Explanation;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({

	IndexOfTest.class,
	IndexOfTestCharacterNotFound.class,
	IndexOfTestFirstSpace.class,
	IndexOfTestNonSpaceAtEnd.class,
	IndexOfTestNonSpaceStartAt.class,
	IndexOfTestSecondSpace.class,
	IndexOfTestSpaceSameIndex.class,
   
})
@MaxValue(18)
@Explanation("IndexOf functions correctly")
public class IndexOfTestSuite {


}

