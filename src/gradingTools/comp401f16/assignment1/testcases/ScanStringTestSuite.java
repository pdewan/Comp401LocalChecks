package gradingTools.comp401f16.assignment1.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.Explanation;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({

	ScanStringTest.class,
//	ScanStringTest2.class, // we do not have second line
   
})
@MaxValue(15)
@Explanation("ScanString functions correctly")
public class ScanStringTestSuite {


}

