package gradingTools.comp401f16.assignment11.commandObjects.testcases;

import gradingTools.comp401f16.assignment7.testcases.MoveCommandTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
@RunWith(Suite.class)
@MaxValue(30)
@Suite.SuiteClasses({
	
	ApproachCommandObjectTestCase.class,
	PassCommandObjectTestCase.class,
	FailCommandObjectTestCase.class,
//	CommandListCommandObjectTestCase.class,
//	RepeatCommandObjectTestCase.class
	
	
	
})
public class AtomicCommandObjectSuiteA11 {
	
	
}
