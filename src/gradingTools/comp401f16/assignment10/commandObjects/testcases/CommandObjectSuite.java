package gradingTools.comp401f16.assignment10.commandObjects.testcases;

import gradingTools.comp401f16.assignment7.testcases.MoveCommandTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
@RunWith(Suite.class)
@MaxValue(20)
@Suite.SuiteClasses({
	MoveCommandObjectTestCase.class,
	SayCommandObjectTestCase.class,
	
	
})
public class CommandObjectSuite {
	
	
}
