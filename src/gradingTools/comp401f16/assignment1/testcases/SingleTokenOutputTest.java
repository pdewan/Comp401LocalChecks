package gradingTools.comp401f16.assignment1.testcases;
import java.util.List;

import util.annotations.Explanation;
@Explanation("Single Token")
public class SingleTokenOutputTest extends AbstractNumberScanningTest{
	protected String[][] tokenLines = {{"0202"}};
	protected String[][] graderTokenLines = {{"0010010"}};
	protected String[] getClassNames(){
		return new String[] {
				Assignment1Suite.MAIN_CLASS_NAME, 
				"ssignment", 
				"NumberScanner",
				"numscan"};
	}
	@Override
	protected String[][] graderTokenLines() {
		return graderTokenLines;
	}
	@Override
	protected String[][] studentTokenLines() {
		// TODO Auto-generated method stub
		return tokenLines;
	}
	@Override
	protected String[] getExpectedOutputs() {
		return expectedTokenOutputs();		
	}  
	@Override
	protected String possibleReasonsForIncorrectOutput() {
		return "printing number (e.g. 20) instead of token (e.g. 020)";
	}

}

