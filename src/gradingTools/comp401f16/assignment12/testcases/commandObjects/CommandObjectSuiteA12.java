package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	EnvironmentFactoryMethodTest.class,
	RotateLeftArmCommandObjectTestCase.class,
	RotateRightArmCommandObjectTestCase.class,
	SleepCommandObjectTestCase.class,
	DefineCallCommandObjectTestCase.class,
	ThreadCommandObjectTestCase.class,
	ProceedAllCommandObjectTestCase.class
	
	
})
@IsExtra(true)
public class CommandObjectSuiteA12 {
	
	
}
