package gradingTools.comp401f16.assignment1.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.Explanation;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({

   TerminatesWithPeriodLineOutputTest.class,
   TerminatesWithPeriodLineSumTest.class,
   TerminatesWithPeriodLineProductTest.class,
   
})
@MaxValue(5)
@Explanation("Handles Space After Period")
public class TerminatesWithPeriodLineSuite {


}

