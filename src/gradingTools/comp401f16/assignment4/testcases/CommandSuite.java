package gradingTools.comp401f16.assignment4.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.MaxValue;
@MaxValue(15)
@RunWith(Suite.class)
@Suite.SuiteClasses({
	SayBeanTest.class,
	RepeatBeanTest.class,
	ApproachBeanTest.class,
	PassBeanTest.class,
	FailBeanTest.class
})
public class CommandSuite {
	
	
	
}
