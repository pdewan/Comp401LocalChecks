package gradingTools.comp401f16.assignment11.parser.testcases;

import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.MoveCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.RepeatCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.commandInterpreterA11.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
@MaxValue(5)
public class ParserCreatesRepeatCommandObjectTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return RepeatCommandObjectTestCase.findRepeatCommandClass();
	}
	protected void setCommand() {
		setCommand("repeat 5 move arthur 2 3 } ");		

	}
	

}
