package gradingTools.comp401f17.assignment3.testcases;

import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment3.testcases.EndBeanTest;
import gradingTools.comp401f16.assignment3.testcases.MinusBeanTest;
import gradingTools.comp401f16.assignment3.testcases.MultipleGroupingTokenOutputTest;
import gradingTools.comp401f16.assignment3.testcases.MultipleNumberTokenOutputTest;
import gradingTools.comp401f16.assignment3.testcases.MultipleQuoteTokenOutputTest;
import gradingTools.comp401f16.assignment3.testcases.MultipleSignTokenOutputTest;
import gradingTools.comp401f16.assignment3.testcases.MultipleWordTokenOutputTest;
import gradingTools.comp401f16.assignment3.testcases.NumberBeanTest;
import gradingTools.comp401f16.assignment3.testcases.PlusBeanTest;
import gradingTools.comp401f16.assignment3.testcases.QuoteBeanTest;
import gradingTools.comp401f16.assignment3.testcases.StartBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

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
