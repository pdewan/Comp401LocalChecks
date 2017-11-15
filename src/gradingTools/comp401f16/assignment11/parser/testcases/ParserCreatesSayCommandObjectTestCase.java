package gradingTools.comp401f16.assignment11.parser.testcases;

import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.SayCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.RepeatCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.commandInterpreterA11.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
@MaxValue(5)
public class ParserCreatesSayCommandObjectTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return SayCommandObjectTestCase.findSayCommandClass();
	}
	protected void setCommand() {
		setCommand("approach arthur } ");
		setCommand("say \"quest?\" ");
		setCommand("say \"grail\" ");
		

	}
	protected void doStepAfterGettingCommandObject() {
		setCommand ("passed ");
	}
	
	

}
