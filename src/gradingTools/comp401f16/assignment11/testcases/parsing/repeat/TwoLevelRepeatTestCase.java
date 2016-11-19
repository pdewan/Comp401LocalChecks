package gradingTools.comp401f16.assignment11.testcases.parsing.repeat;

import util.annotations.MaxValue;

@MaxValue(15)
public class TwoLevelRepeatTestCase extends OneLevelRepeatTestCase {
	protected final int NUM_REPEATS_2 = 2;
	protected int numDeltas() {
		return 1;
	}
	protected Integer inputStudentXDelta() {
		return super.inputStudentXDelta()*NUM_REPEATS_2;
	}
	protected Integer inputStudentYDelta() {
		return super.inputStudentYDelta()*NUM_REPEATS_2;
	}
	protected String createCommand() {
		String aCommand1 = super.createCommand();
		String aCommand = 
				"repeat" + " " +
				NUM_REPEATS_2 + " " +
				aCommand1;
		return aCommand;
	}
}
