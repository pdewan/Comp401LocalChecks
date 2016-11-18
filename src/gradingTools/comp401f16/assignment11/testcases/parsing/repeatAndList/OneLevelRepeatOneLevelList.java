package gradingTools.comp401f16.assignment11.testcases.parsing.repeatAndList;

import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.OneLevelRepeatTestCase;

public class OneLevelRepeatOneLevelList extends OneLevelRepeatTestCase {
	protected int numDeltas() {
		return OneLevelListMovesTestCase.NUM_DELTAS;
	}
	protected String createOneLevelRepeatCommand() {
		return  createOneLevelCommandList();
	}
}
