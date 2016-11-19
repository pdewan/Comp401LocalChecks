package gradingTools.comp401f16.assignment11.testcases.parsing.list;

import util.annotations.MaxValue;

@MaxValue(15)
public class TwoLevelListMovesTestCase extends OneLevelListMovesTestCase{
protected static int NUM_NEW_DELTAS = 3;
	
	protected int numDeltas() {
		return super.numDeltas() + NUM_NEW_DELTAS;
	}
	protected String createTwoLevelCommandList() {
		String aCommand1 = createCommand(4);
		String aCommand2 = createCommand(5);
		String aCommand3 = createCommand(6);
		String aOneLevelList = super.createCommand();
		
		String aCommand = "{" + " " +
						aCommand1 +
						aCommand2 +
						aOneLevelList +
						aCommand3 + 
						"}" + " ";
		return aCommand;
	}
	protected String createCommand() {
		return createTwoLevelCommandList();
	}
}
