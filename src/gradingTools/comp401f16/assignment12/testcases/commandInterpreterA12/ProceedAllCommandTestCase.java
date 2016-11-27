package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;

public class ProceedAllCommandTestCase extends WaitingAvatarsAnimationTestCase {
	protected void doProceedAll() {
		System.out.println ("Executing proceedAll on command interpreter");
		setCommand("proceedAll ");
	}
}
