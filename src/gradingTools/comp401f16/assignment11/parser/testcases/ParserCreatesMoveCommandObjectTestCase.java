package gradingTools.comp401f16.assignment11.parser.testcases;

import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParsingAtomicCommandTestCase;

public class ParserCreatesMoveCommandObjectTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return PassCommandObjectTestCase.findPassCommandClass();
	}
	protected void setCommand() {
		setCommand("approach Arthur ");
		setCommand("pass ");

	}
	
	

}
