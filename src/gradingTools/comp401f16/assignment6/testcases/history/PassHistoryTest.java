package gradingTools.comp401f16.assignment6.testcases.history;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.QuoteBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;
import gradingTools.comp401f16.assignment4.testcases.commands.PassBeanTest;

public class PassHistoryTest extends TokenHistoryTest {
protected String[] studentTokensInput() {
	return new String[] {"pass", "PAss", "PASS"};
}
protected String[] graderTokensInput() {
	return studentTokensInput();
}
@Override
protected InputBeanTest createInputBeanTest() {
	return new PassBeanTest();
}
	
	
}
