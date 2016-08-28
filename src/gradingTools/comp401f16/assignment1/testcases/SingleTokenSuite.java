package gradingTools.comp401f16.assignment1.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.Explanation;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({

   SingleTokenOutputTest.class,
   SingleTokenSumTest.class,
   SingleTokenProductTest.class,
   
})
@MaxValue(10)
@Explanation("Can process a single token")
public class SingleTokenSuite {


}

