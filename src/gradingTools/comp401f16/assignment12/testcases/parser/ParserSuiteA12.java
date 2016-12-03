package gradingTools.comp401f16.assignment12.testcases.parser;

import gradingTools.comp401f16.assignment7.testcases.MoveCommandTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ParserCreatesDefineCallCommandObjectTestCase.class,
	ParserCreatesThreadCommandObjectTestCase.class,
	ParserCreatesSleepCommandObjectTestCase.class,
	ParserCreatesRotateLeftArmCommandObjectTestCase.class,
	ParserCreatesRotateRightArmCommandObjectTestCase.class,
	ParserCreatesProceedAllCommandObjectTestCase.class	
})
@IsExtra(true)
public class ParserSuiteA12 {
	
	
}
