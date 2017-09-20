package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.trace.Tracer;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
@IsExtra(true)
@MaxValue(5)
public class ProceedAllCommandTestCase extends WaitingAvatarsAnimationTestCase {
	protected void doProceedAll() {
		Tracer.info(this,"Executing proceedAll on command interpreter");
		setCommand("proceedAll ");
	}
}
