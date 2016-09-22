package gradingTools.comp401f16.assignment4.testcases;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.QuoteBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class RepeatArrayTest extends TokenArrayTest {
protected String[] studentTokensInput() {
	return new String[] {"repeat", "REpeat", "REPEAT"};
}
protected String[] graderTokensInput() {
	return studentTokensInput();
}
@Override
protected InputBeanTest createInputBeanTest() {
	return new RepeatBeanTest();
}
	
	
}
