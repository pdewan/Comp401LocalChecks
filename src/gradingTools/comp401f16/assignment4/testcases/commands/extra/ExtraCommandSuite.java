package gradingTools.comp401f16.assignment4.testcases.commands.extra;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
@MaxValue(10)
@IsExtra(true)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CallBeanTest.class,
	DefineBeanTest.class,
	ProceedAllBeanTest.class,
	RedoBeanTest.class,
	RotateLeftArmBeanTest.class,
	RotateRightArmBeanTest.class,
	SleepBeanTest.class,
	ThreadBeanTest.class,
	UndoBeanTest.class,
	WaitBeanTest.class


})
public class ExtraCommandSuite {
	
	
	
}
