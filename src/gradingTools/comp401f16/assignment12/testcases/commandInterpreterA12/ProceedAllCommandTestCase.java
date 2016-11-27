package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
@IsExtra(true)
@MaxValue(5)
public class ProceedAllCommandTestCase extends WaitingAvatarsAnimationTestCase {
	protected void doProceedAll() {
		System.out.println ("Executing proceedAll on command interpreter");
		setCommand("proceedAll ");
	}
}
