package gradingTools.comp401f16.assignment1.testcases;

import java.util.ArrayList;
import java.util.List;

import util.annotations.Explanation;
import grader.basics.execution.NotRunnableException;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
@Explanation("Multiple Tokens Output")
public class MultipleTokensOutputTest extends AbstractNumberScanningTest {
	protected String[][] tokenLines = {{"22", "44", "66"}, {"11" , "33", "55", "1"}};
	
	// For grading: First line should have sum 25 and product 0
	// Second line should have sum 106 and product 400
//	protected String[][] graderTokenLines = {
//			{"010", "11", "0", "4"},
//			{"2", "100", "1", "1", "2"}};
	
	// deleting second line because of piping problems
	protected String[][] graderTokenLines = {
			{"10", "11", "0", "4"}};
	protected String[] getClassNames(){
		return new String[] {
				Assignment1Suite.MAIN_CLASS_NAME, 
				"ssignment", 
				"NumberScanner",
				"numscan"
				};
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

	
	
//    
//    @Override
//    public TestCaseResult test(Project project, boolean autoGrade) throws NotAutomatableException, NotGradableException {
//        try {
//            FlexibleProgramRunner runner = new FlexibleProgramRunner(project, "22 44 66\n11 33 55");
//
//            // Check that the program
//            String output = runner.runWithSpaces();
//            if (isValidOutput(output))
//                return pass(autoGrade);
//            output = runner.runNoSpaces();
//            if (isValidOutput(output))
//                return pass(autoGrade);
//            return fail("Program should work with multiple token and multiple lines.", autoGrade);
//
//        } catch (NotRunnableException e) {
//            throw new NotGradableException();
//        }
//    }
//
//    private String[] outputParts = new String[] {"22", "44", "66", "11", "33", "55"};
//
//    private boolean isValidOutput(String output) {
//        boolean result = true;
//        for (String part : outputParts)
//            result = result && output.contains(part);
//        return result;
//    }
	
	public static void main (String[] args) {
		String aTestOutput = "The tokens are:22\n44\n66\nSum: 132\n Product: 63888\n 11\n33\n55\n1\n Sum: 100  \n Product: 19965";
		String aTest1Output = "The tokens are:22\n44\n66\n1i\n33\n55\n Sum: 231 \n Product: 1275523920";
		String aTest2Output = "The tokens are:22 44 66 11 33 55";
		
		MultipleTokensOutputTest aTestCase = new MultipleTokensOutputTest();
		test(aTestCase, aTestOutput);
		test (aTestCase, aTest1Output);
		test (aTestCase, aTest2Output);
//		String anInputWithNoSpace = aTestCase.inputWithNoEndingSpace();
//		String anInputWithSpace = aTestCase.inputWithEndingSpace();
//		String[] anExpectedOutputs = aTestCase.expectedOutputs();
//		String[] anExpectedTokens = aTestCase.expectedTokenOutputs();
//		String[] anExpectedSumProduct = aTestCase.expectedSumProductOutputs();
//		String[] anExpectedSum = aTestCase.expectedSumOutputs();
//		String[] anExpectedProduct = aTestCase.expectedProductOutputs();
//		boolean aCorectTokens = aTestCase.isValidOutput(aTestOutput, anExpectedTokens);
//		boolean aCorrectSumProduct = aTestCase.isValidOutput(aTestOutput, anExpectedSumProduct);
//		boolean aCorrectSum = aTestCase.isValidOutput(aTestOutput, anExpectedSum);
//		boolean aCorrectProduct = aTestCase.isValidOutput(aTestOutput, anExpectedProduct);
//		
//		boolean aCorectTokens1 = aTestCase.isValidOutput(aTest1Output, anExpectedTokens);
//		boolean aCorrectSumProduct1 = aTestCase.isValidOutput(aTest1Output, anExpectedSumProduct);
//		boolean aCorrectSum1 = aTestCase.isValidOutput(aTest1Output, anExpectedSum);
//		boolean aCorrectProduct1 = aTestCase.isValidOutput(aTest1Output, anExpectedProduct);
//		
//		boolean aCorectTokens2 = aTestCase.isValidOutput(aTest2Output, anExpectedTokens);
//		boolean aCorrectSumProduct2 = aTestCase.isValidOutput(aTest2Output, anExpectedSumProduct);
//		boolean aCorrectSum2 = aTestCase.isValidOutput(aTest2Output, anExpectedSum);
//		boolean aCorrectProduct2 = aTestCase.isValidOutput(aTest2Output, anExpectedProduct);


		
		
		
	}


}

