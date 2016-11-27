package gradingTools.comp401f16.assignment12.testcases.parser;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.FailCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.PassCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.parser.testcases.ParserCreatesApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.commandInterpreterA11.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.ProceedAllCommandTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.ProceedAllCommandObjectTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.SleepCommandObjectTestCase;
@MaxValue(5)
@IsExtra(true)
public class ParserCreatesProceedAllCommandObjectTestCase 
	extends ParserCreatesApproachCommandObjectTestCase{
	
	protected Class commandObjectClass() {
		return ProceedAllCommandObjectTestCase.findProceedAllCommandClass();
	}
	protected void setCommand() {
		setCommand("proceedAll ");
	}

}
