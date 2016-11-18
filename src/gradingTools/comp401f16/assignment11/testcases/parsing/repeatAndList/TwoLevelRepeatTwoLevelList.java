package gradingTools.comp401f16.assignment11.testcases.parsing.repeatAndList;

import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.TwoLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.OneLevelRepeatTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.TwoLevelRepeatTestCase;

public class TwoLevelRepeatTwoLevelList extends TwoLevelRepeatTestCase {
	protected int numDeltas() {
		return TwoLevelListMovesTestCase.NUM_NEW_DELTAS + OneLevelListMovesTestCase.NUM_DELTAS;
	}
	protected String createOneLevelRepeatCommand() {
		return  createTwoLevelCommandList();
	}
}
