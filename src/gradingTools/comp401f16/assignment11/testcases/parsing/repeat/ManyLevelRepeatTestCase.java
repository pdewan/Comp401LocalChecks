package gradingTools.comp401f16.assignment11.testcases.parsing.repeat;

import util.annotations.MaxValue;

@MaxValue(10)
public class ManyLevelRepeatTestCase extends TwoLevelRepeatTestCase {
	
	protected String createCommand() {
		String aCommand1 = super.createCommand();
		String aCommand = 
				"repeat" + " " + 1 + " " +
				"repeat" + " " + 1 + " " +
				"repeat" + " " + 1 + " " +
				aCommand1;
		return aCommand;
	}
}
