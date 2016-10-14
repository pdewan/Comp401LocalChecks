package gradingTools.comp401f16.assignment6.testcases.history;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;

public class WordHistoryTest extends TokenHistoryTest {
protected String[] studentTokensInput() {
	return new String[] {"ARthur", "GaLahad", "Lancelot"};
}
protected String[] graderTokensInput() {
	return studentTokensInput();
}
@Override
protected InputBeanTest createInputBeanTest() {
	return new WordBeanTest();
}
	
	
}
