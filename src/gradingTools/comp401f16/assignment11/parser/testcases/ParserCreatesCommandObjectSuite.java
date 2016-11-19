package gradingTools.comp401f16.assignment11.parser.testcases;

import gradingTools.comp401f16.assignment7.testcases.MoveCommandTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
@RunWith(Suite.class)
@MaxValue(35)
@Suite.SuiteClasses({
	

	ParserCreatesApproachCommandObjectTestCase.class,
	ParserCreatesPassCommandObjectTestCase.class,
	ParserCreatesFailCommandObjectTestCase.class,
	ParserCreatesMoveCommandObjectTestCase.class,
	ParserCreatesSayCommandObjectTestCase.class,
	ParserCreatesRepeatCommandObjectTestCase.class,
	ParserCreatesCommandListTestCase.class
	
	
	
})
public class ParserCreatesCommandObjectSuite {
	
	
}
