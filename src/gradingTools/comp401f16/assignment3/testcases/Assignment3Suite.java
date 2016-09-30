package gradingTools.comp401f16.assignment3.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import util.annotations.IsExtra;
@RunWith(Suite.class)
@IsExtra(true)
@Suite.SuiteClasses({
	MultipleWordTokenOutputTest.class,
	MultipleNumberTokenOutputTest.class,
	MultipleQuoteTokenOutputTest.class,
	MultipleSignTokenOutputTest.class,
	MultipleGroupingTokenOutputTest.class,
	WordBeanTest.class,
	NumberBeanTest.class,
	QuoteBeanTest.class,
	StartBeanTest.class,
	EndBeanTest.class,
	PlusBeanTest.class,
	MinusBeanTest.class
})
public class Assignment3Suite {
	public static final String MAIN_CLASS_NAME = "main.Assignment3";
	public static void main (String[] args) {
		try {


		BasicJUnitUtils.interactiveTest(Assignment3Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
