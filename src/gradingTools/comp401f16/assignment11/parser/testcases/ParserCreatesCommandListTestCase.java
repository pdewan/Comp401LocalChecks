package gradingTools.comp401f16.assignment11.parser.testcases;

import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.CommandListCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.FailCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.commandInterpreterA11.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
@MaxValue(5)
public class ParserCreatesCommandListTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return CommandListCommandObjectTestCase.findCommandListClass();
	}
	protected void setCommand() {
		setCommand("{ approach Arthur failed } ");

	}

	

}
