package gradingTools.comp301ss21.assignment1_1.tokenObjects.run;

import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp301ss21.assignment1_1.tokens.run.MultipleWordTokens;
import gradingTools.comp401f16.assignment2.testcases.MultipleNumberOutputTest;
import gradingTools.comp401f16.assignment3.testcases.MultipleWordTokenOutputTest;
import util.annotations.MaxValue;
@MaxValue(10)
public class MultipleWordTokenObjects extends MultipleWordTokenOutputTest {
	public MultipleWordTokenObjects() {
		inputWithEndingSpace = true;
	}
	protected String[] getClassNames(){
		return new String[] { SS21Assignment1_1Suite.A1_PART3_MAIN_CLASS_NAME};
	}
}
