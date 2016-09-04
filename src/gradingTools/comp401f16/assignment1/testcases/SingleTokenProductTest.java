package gradingTools.comp401f16.assignment1.testcases;
import util.annotations.Explanation;
@Explanation("Single Token")
public class SingleTokenProductTest extends SingleTokenOutputTest{
	
	@Override
	protected String[] getExpectedOutputs() {
		return expectedProductOutputs();
		
	}  
	@Override
	protected String possibleReasonsForIncorrectOutput() {
		return "";
	}
}

