package gradingTools.comp401f16.assignment11.parser.testcases;

import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.MoveCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.commandInterpreterA11.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
@MaxValue(5)
public class ParserCreatesMoveCommandObjectTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return MoveCommandObjectTestCase.findMoveCommandClass();
	}
	protected void setCommand() {
		setCommand("move Arthur 2 3 ");
	}
	
	
	

}
