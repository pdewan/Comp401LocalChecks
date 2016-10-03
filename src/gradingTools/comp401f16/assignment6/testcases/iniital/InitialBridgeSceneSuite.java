package gradingTools.comp401f16.assignment6.testcases.iniital;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;

@MaxValue(20)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	GorgeReturnedTestCase.class,
	KnightAreaReturnedTestCase.class,
	GuardAreaReturnedTestCase.class,
	OccupiedReturnedTestCase.class,
	KnightTurnReturnedTestCase.class
})
public class InitialBridgeSceneSuite {

}
