package gradingTools.comp301ss21.assignment1_1.tokens.run;

import gradingTools.comp301ss21.assignment1_1.SS21Assignment1_1Suite;
import gradingTools.comp401f16.assignment2.testcases.MultipleNumberOutputTest;
import util.annotations.MaxValue;
@MaxValue(10)
public class MultipleNumberTokens extends MultipleNumberOutputTest {
	public MultipleNumberTokens() {
		inputWithEndingSpace = true;
	}
	protected String[] getClassNames(){
		return new String[] { SS21Assignment1_1Suite.A1_PART2_MAIN_CLASS_NAME};
	}
}
