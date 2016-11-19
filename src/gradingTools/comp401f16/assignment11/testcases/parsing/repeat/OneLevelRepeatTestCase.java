package gradingTools.comp401f16.assignment11.testcases.parsing.repeat;

import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.ManyLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
@MaxValue(15)
public class OneLevelRepeatTestCase extends ManyLevelListMovesTestCase {
	protected static final int NUM_REPEATS = 10;
	protected int numDeltas() {
		return 1;
	}
	protected Integer inputStudentXDelta() {
		return super.inputStudentXDelta()*NUM_REPEATS;
	}
	protected Integer inputStudentYDelta() {
		return super.inputStudentYDelta()*NUM_REPEATS;
	}
	protected String createOneLevelRepeatCommand() {
		return  createCommand(0);
	}
	protected String createCommand() {
		String aCommand1 = createOneLevelRepeatCommand();
		String aCommand = 
				"repeat" + " " +
				NUM_REPEATS + " " +
				aCommand1;
		return aCommand;
	}
}
