package gradingTools.comp401f16.assignment11.parser.testcases;

import gradingTools.comp401f16.assignment10.commandObjects.testcases.SayCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.RepeatCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParsingAtomicCommandTestCase;

public class ParserCreatesSayCommandObjectTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return SayCommandObjectTestCase.findSayCommandClass();
	}
	protected void setCommand() {
		setCommand("approach arthur }");
		setCommand("say \"quest?\" ");
		setCommand("say \"grail\" ");
		

	}
	protected void doStepAfterGettingCommandObject() {
		setCommand ("passed ");
	}
	
	

}
