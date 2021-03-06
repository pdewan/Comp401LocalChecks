package gradingTools.comp401f16.assignment1.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.Explanation;
import util.annotations.IsExtra;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({

   InvalidCharacterOutputTest.class,
   InvalidCharacterSumTest.class,
   InvalidCharacterProductTest.class,
   
})
@MaxValue(10)
@IsExtra(true)
@Explanation("Handles Invalid Characters")
public class InvalidCharacterSuite {


}

