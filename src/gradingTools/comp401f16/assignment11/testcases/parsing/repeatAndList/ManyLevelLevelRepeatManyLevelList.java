package gradingTools.comp401f16.assignment11.testcases.parsing.repeatAndList;

import gradingTools.comp401f16.assignment11.testcases.parsing.list.ManyLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.TwoLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.ManyLevelRepeatTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.OneLevelRepeatTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.TwoLevelRepeatTestCase;

public class ManyLevelLevelRepeatManyLevelList extends ManyLevelRepeatTestCase {
	protected int numDeltas() {
		return ManyLevelListMovesTestCase.NUM_NEW_DELTAS +
				TwoLevelListMovesTestCase.NUM_NEW_DELTAS + 
				OneLevelListMovesTestCase.NUM_DELTAS;
	}
	protected String createOneLevelRepeatCommand() {
		return  createManyLevelCommandList();
	}
}
