package gradingTools.comp401f16.assignment1.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.Explanation;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({

   TerminatesWithStartingPeriodOutputTest.class,
   TerminatesWithStartingPeriodSumTest.class,
   TerminatesWithStartingPeriodProductTest.class,
   
})
@MaxValue(5)
@Explanation("Terminating period forms complete line")
public class TerminatesWithStartingPeriodSuite {


}

