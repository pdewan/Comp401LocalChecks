package gradingTools.comp401f16.assignment4.testcases;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.NumberBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class NumberArrayTest extends TokenArrayTest {
protected String[] studentTokensInput() {
	return new String[] {"0234", "3023", "111"};
}
protected String[] graderTokensInput() {
	return studentTokensInput();
}
@Override
protected InputBeanTest createInputBeanTest() {
	return new NumberBeanTest();
}
	
	
}
