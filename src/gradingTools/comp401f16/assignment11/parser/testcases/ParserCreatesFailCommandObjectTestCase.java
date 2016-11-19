package gradingTools.comp401f16.assignment11.parser.testcases;

import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.FailCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParsingAtomicCommandTestCase;

public class ParserCreatesFailCommandObjectTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return FailCommandObjectTestCase.findFailCommandClass();
	}
	protected void setCommand() {
		setCommand("approach Arthur ");
		setCommand("fail ");

	}
	
	

}
