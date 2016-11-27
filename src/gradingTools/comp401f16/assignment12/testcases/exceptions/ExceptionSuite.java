package gradingTools.comp401f16.assignment12.testcases.exceptions;

import grader.basics.junit.BasicJUnitUtils;
import grader.basics.junit.GradableJUnitSuite;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.CommandInterpreterSuiteA12;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.CommandObjectSuiteA12;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.RotateLeftArmCommandObjectTestCase;
import gradingTools.comp401f16.assignment12.testcases.exceptions.ScanningExceptionTestCase;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.LockstepAvatarsAnimationTestCase;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	ScanningExceptionTestCase.class,
	ParsingExceptionTestCase.class

	
})
public class ExceptionSuite {
	
	
	
}
