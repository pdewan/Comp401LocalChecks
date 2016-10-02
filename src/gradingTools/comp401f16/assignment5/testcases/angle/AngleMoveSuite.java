package gradingTools.comp401f16.assignment5.testcases.angle;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;

@MaxValue(20)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	AngleMoveLeftLineTestCase.class,
	AngleMoveRightLineTestCase.class	
})
public class AngleMoveSuite {

}
