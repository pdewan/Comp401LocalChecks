package gradingTools.comp401f16.assignment11.testcases.parsing.repeatAndList;

import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.OneLevelRepeatTestCase;
@MaxValue(15)
public class OneLevelRepeatOneLevelList extends OneLevelRepeatTestCase {
	protected int numDeltas() {
		return OneLevelListMovesTestCase.NUM_DELTAS;
	}
	protected String createOneLevelRepeatCommand() {
		return  createOneLevelCommandList();
	}
}
