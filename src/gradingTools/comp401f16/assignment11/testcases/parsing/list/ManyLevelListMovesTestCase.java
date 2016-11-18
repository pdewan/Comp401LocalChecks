package gradingTools.comp401f16.assignment11.testcases.parsing.list;

public class ManyLevelListMovesTestCase extends TwoLevelListMovesTestCase{
	protected static int NUM_NEW_DELTAS = 3;
	protected int numDeltas() {
		return super.numDeltas() + NUM_NEW_DELTAS;
	}
	protected String createManyLevelCommandList() {
		String aTwoLevelList = super.createCommand();
		String aCommand1 = createCommand(7);
		String aCommand2 = createCommand(8);
		String aCommand3 = createCommand(9);
		String aOneLevelList = super.createCommand();
		
		String aCommand = "{" + " " +
						aCommand1 +
						"{" + " " +
						aCommand2 +
						"{" + " " +						
						aOneLevelList +						
						"}" + " " +
						aCommand3 +
						"}" + " " +
						"}";
						
		return aCommand;
	}

	protected String createCommand() {
		return createManyLevelCommandList();

	}
}
