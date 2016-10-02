package gradingTools.comp401f16.assignment6.testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;

@MaxValue(20)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	GorgeReturnedTestCase.class,
	KnightAreaReturnedTestCase.class,
	GuardAreaReturnedTestCase.class,
	OccupiedReturnedTestCase.class
})
public class BridgeSceneComponentSuite {

}
