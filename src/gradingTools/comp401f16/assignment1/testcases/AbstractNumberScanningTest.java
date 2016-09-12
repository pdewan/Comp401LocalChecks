package gradingTools.comp401f16.assignment1.testcases;

import java.util.ArrayList;
import java.util.List;

import grader.basics.execution.GradingMode;
import grader.basics.execution.NotRunnableException;
import grader.basics.junit.BasicJUnitUtils;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.NotGradableException;
import gradingTools.shared.testcases.OutputAndErrorCheckingTestCase;

import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractNumberScanningTest extends
		OutputAndErrorCheckingTestCase {
	protected boolean inputWithEndingSpace = false;
	
	@Override
	protected String getInput() {
		if (inputWithEndingSpace)
			return inputWithEndingSpace();
		else
			return inputWithNoEndingSpace();
	}

	protected String inputWithEndingSpace() {
		return toSpacedInput(inputWithNoEndingSpace());
	};

	@Override
	protected boolean hasError(String anError) {
		return false;
	}

	// public static String toRegex(String aString) {
	// return MATCH_ANY + aString + MATCH_ANY;
	// }
	// protected String correctOutputButErrorsMessage() {
	// return "Correct output but errors";
	// }
	// protected double correctOutputButErrorsCredit() {
	// return 0.5;
	// }
	// protected String incorrectOutputMessage() {
	// return "Incorrect output";
	// }
	// protected String noMainMessage() {
	// return "No main";
	// }
	// protected double incorrectOutputCredit() {
	// return 0.0;
	// }
	// protected double noMainCredit() {
	// return 0.0;
	// }
	// protected boolean hasError(String anError) {
	// return false;
	// }
	// protected boolean hasError(String anError) {
	// return !anError.isEmpty() &&
	// !anError.contains ("No line found"); // we will penalize for no
	// terminating . separately
	// }
//	@Override
//	protected String getClassName() {
//		return Assignment1Suite.MAIN_CLASS_NAME;
//	}

	public void testOld() {
		try {
			OutputErrorStatus retVal = test(getClassName(),
					inputWithEndingSpace(), getExpectedOutputs());

			if (retVal == OutputErrorStatus.CORRECT_OUTPUT_NO_ERRORS)
				return;
			if (retVal == OutputErrorStatus.CORRECT_OUTPUT_ERRORS) {
				// String aMessage = correctOutputButErrorsMessage() +
				// NotesAndScore.PERECTAGE_CHARACTER +
				// + correctOutputButErrorsCredit();
				// Assert.assertTrue(
				// aMessage, false);
				// This results in character becoming an int if marker is a
				// character!
				Assert.assertTrue(correctOutputButErrorsMessage()
						+ NotesAndScore.PERCENTAGE_MARKER
						+ correctOutputButErrorsCredit(), false);
				return;
			}
			retVal = test(Assignment1Suite.MAIN_CLASS_NAME,
					inputWithNoEndingSpace(), getExpectedOutputs());
			if (retVal == OutputErrorStatus.CORRECT_OUTPUT_NO_ERRORS)
				return;
			if (retVal == OutputErrorStatus.CORRECT_OUTPUT_ERRORS) {

				Assert.assertTrue(correctOutputButErrorsMessage()
						+ NotesAndScore.PERCENTAGE_MARKER
						+ correctOutputButErrorsCredit(), false);
				return;
			}

			if (retVal == OutputErrorStatus.NO_OUTPUT) {
				Assert.assertTrue(noMethodMessage()
						+ NotesAndScore.PERCENTAGE_MARKER + noMethodCredit(),

				false);
			}

			Assert.assertTrue(
					incorrectOutputMessage() + NotesAndScore.PERCENTAGE_MARKER
							+ incorrectOutputCredit(),

					false);

		} catch (Throwable e) {
			BasicJUnitUtils.assertTrue(e, 0);
		}
	}

//	protected boolean processSuccessfulOutputErrrorStatus() {
//		OutputErrorStatus retVal = getOutputErrorStatus();
//
//		if (retVal == OutputErrorStatus.CORRECT_OUTPUT_NO_ERRORS)
//			return true;
//		if (retVal == OutputErrorStatus.CORRECT_OUTPUT_ERRORS) {
//			// String aMessage = correctOutputButErrorsMessage() +
//			// NotesAndScore.PERECTAGE_CHARACTER +
//			// + correctOutputButErrorsCredit();
//			// Assert.assertTrue(
//			// aMessage, false);
//			// This results in character becoming an int if marker is a
//			// character!
//			Assert.assertTrue(correctOutputButErrorsMessage()
//					+ NotesAndScore.PERCENTAGE_MARKER
//					+ correctOutputButErrorsCredit(), false);
//			return true; // will never be executed
//		}
//		return false;
//	}
//
//	protected boolean processUnsuccessfulOutputErrrorStatus() {
//		OutputErrorStatus retVal = getOutputErrorStatus();
//
//		if (retVal == OutputErrorStatus.NO_OUTPUT) {
//			Assert.assertTrue(noMethodMessage() + NotesAndScore.PERCENTAGE_MARKER
//					+ noMethodCredit(),
//
//			false);
//		}
//
//		Assert.assertTrue(incorrectOutputMessage()
//				+ NotesAndScore.PERCENTAGE_MARKER + incorrectOutputCredit(),
//
//		false);
//		return true;
//	}

//	@Test
//	public void test() {
//		try {
//			inputWithEndingSpace = true;
//			super.test();
//			if (processSuccessfulOutputErrrorStatus()) {
//				return;
//			}
//			inputWithEndingSpace = false;
//			super.test();
//			if (processSuccessfulOutputErrrorStatus()) {
//				return;
//			}
//			processUnsuccessfulOutputErrrorStatus();
//		} catch (Throwable e) {
//			BasicJUnitUtils.assertTrue(e, 0);
//		}
//
//	}
	
	protected boolean invokeInteractiveMethod() throws Throwable  {
		return super.doTest();
	}
	// do nothing as doTest() does the needful
	protected void processOutputErrorStatus() {
		
	}

	protected boolean doTest() throws Throwable {
			inputWithEndingSpace = true;
			boolean superRetVal = invokeInteractiveMethod();
			if (processSuccessfulOutputErrrorStatus()) {
				return true;
			}
			inputWithEndingSpace = false;
			superRetVal = invokeInteractiveMethod();
			if (processSuccessfulOutputErrrorStatus()) {
				return true;
			}
			processUnsuccessfulOutputErrrorStatus();
			return true;
		
	}

	protected static StringBuilder stringBuilder = new StringBuilder();

	public static String toSpacedInput(String anInput) {
		stringBuilder.setLength(0);
		String[] lines = anInput.split("\n");
		for (String line : lines)
			stringBuilder.append(line + " \n");

		return stringBuilder.toString();
	}

	// protected String[][] tokenLines = {{"22", "44", "66"}, {"11" , "33",
	// "55"}};
	protected String postTokenString(String[][] aTokenLines, String[] aLine,
			int aLineNumber, int aTokenNumber) {
		if (GradingMode.getGraderRun())
			return postTokenGraderString(aTokenLines, aLine, aLineNumber, aTokenNumber);
		else
			return postTokenStudentString(null, aLine, aLineNumber, aTokenNumber);
	}
	
	protected String postTokenStudentString(String[][] aTokenLines, String[] aLine,
			int aLineNumber, int aTokenNumber) {
		if (aTokenNumber < aLine.length - 1) {
			return " ";
		}
		return "";
	}
	protected String postTokenGraderString(String[][] aTokenLines, String[] aLine,
			int aLineNumber, int aTokenNumber) {
		return postTokenStudentString(aTokenLines, aLine, aLineNumber, aTokenNumber);
	}

	protected  String[][] tokenLines() {
		if(GradingMode.getGraderRun())  {
			return graderTokenLines();
			
		} else {
			return studentTokenLines();
		}
	}
	protected String[][] graderTokenLines() {
		return studentTokenLines();
	};
	protected abstract String[][] studentTokenLines();
	
	protected String inputWithNoEndingSpace() {
		String[][] aTokenLines = tokenLines();
		stringBuilder.setLength(0);
		for (int aLineNumber = 0; aLineNumber < aTokenLines.length; aLineNumber++) {
			String[] aLine = aTokenLines[aLineNumber];
			for (int aTokenNumber = 0; aTokenNumber < aLine.length; aTokenNumber++) {
				stringBuilder.append(aLine[aTokenNumber]);
				stringBuilder.append(postTokenString(aTokenLines, aLine,
						aLineNumber, aTokenNumber));
				//
				// if (aTokenNumber < aLine.length - 1) {
				// stringBuilder.append(postTokenString(aTokenLines, aLine,
				// aLineNumber, aTokenNumber));
				// }
			}
			stringBuilder.append("\n");
		}
		stringBuilder.append(".\n");
		return stringBuilder.toString();
	}

	protected static String[] emptyStringArray = {};
	protected List<String> tokens = new ArrayList();

	protected String[] expectedSumProductOutputs() {
		String[] aSumOut = expectedSumOutputs();
		String[] aProductOut = expectedProductOutputs();
		return new String[] { aSumOut[0], aProductOut[0] };

	}

	// protected String[] expectedProductOutput() {
	// int aProduct = 1;
	// String[] aTokens = allTokens();
	// for (String aToken: aTokens) {
	// try {
	// int aNum = Integer.parseInt(aToken.trim());
	// aProduct *= aNum;
	//
	//
	// } catch (Exception e) {
	//
	// }
	// }
	// return new String[] {toRegex("" + aProduct)};
	// }
	protected String[] expectedSumOutputs() {
		String[][] aTokenLines = tokenLines();
		tokens.clear();
		for (String[] aLine : aTokenLines) {
			int aSum = 0;
			for (String aToken : aLine) {
				try {
					int aNum = Integer.parseInt(aToken.trim());
					aSum += aNum;

				} catch (Exception e) {

				}

			}
			tokens.add(toRegex("" + aSum));

		}
		return tokens.toArray(emptyStringArray);

	}

	protected String[] expectedProductOutputs() {
		String[][] aTokenLines = tokenLines();
		tokens.clear();
		for (String[] aLine : aTokenLines) {
			int aProduct = 1;
			for (String aToken : aLine) {
				try {
					int aNum = Integer.parseInt(aToken.trim());
					aProduct *= aNum;

				} catch (Exception e) {

				}

			}
			tokens.add(toRegex("" + aProduct));

		}
		return tokens.toArray(emptyStringArray);

	}

	// protected String[] expectedSumOutput() {
	// int aSum = 0;
	// String[] aTokens = allTokens();
	// for (String aToken: aTokens) {
	// try {
	// int aNum = Integer.parseInt(aToken.trim());
	// aSum += aNum;
	//
	//
	// } catch (Exception e) {
	//
	// }
	// }
	// return new String[] {toRegex("" + aSum)};
	//
	// }
	// protected abstract String[] expectedOutputs() ;
//	protected String toOutputString(String aToken) {
//		return aToken;
//	}
//	protected String[] postTokenOutputLines(String aToken) {
//		return emptyStringArray;
//	}

	protected String[] expectedTokenOutputs() {
		String[] anAllTokens = allTokens();
		tokens.clear();
		for (int aTokenNumber = 0; aTokenNumber < anAllTokens.length; aTokenNumber++) {
			tokens.add(toRegex(toOutputString(anAllTokens[aTokenNumber])));
			String[] aPostLines = postTokenOutputLines(anAllTokens[aTokenNumber]);
			for (String aPostLine:aPostLines) {
				tokens.add(toRegex(aPostLine));
			}
		}
		return tokens.toArray(emptyStringArray);
	}

	protected String[] allTokens() {
		String[][] aTokenLines= tokenLines();
//		if(Assignment1Suite.getGraderRun())  {
//			aTokenLines = graderTokenLines();
//	
//		} else {
//			aTokenLines = tokenLines();
//		}
			
		
		tokens.clear();
		for (String[] aLine : aTokenLines) {
			for (String aToken : aLine) {
				tokens.add(aToken);

			}
		}
		return tokens.toArray(emptyStringArray);

	}

	public static boolean test(AbstractNumberScanningTest aTestCase,
			String aTestOutput) {
		String anInputWithNoSpace = aTestCase.inputWithNoEndingSpace();
		String anInputWithSpace = aTestCase.inputWithEndingSpace();
		String[] anExpectedOutputs = aTestCase.getExpectedOutputs();
		String[] anExpectedTokens = aTestCase.expectedTokenOutputs();
		String[] anExpectedSumProduct = aTestCase.expectedSumProductOutputs();
		String[] anExpectedSum = aTestCase.expectedSumOutputs();
		String[] anExpectedProduct = aTestCase.expectedProductOutputs();
		boolean aCorectOutput = aTestCase.isValidOutput(aTestOutput,
				anExpectedTokens);
		boolean aCorrectSumProduct = aTestCase.isValidOutput(aTestOutput,
				anExpectedSumProduct);
		boolean aCorrectSum = aTestCase.isValidOutput(aTestOutput,
				anExpectedSum);
		boolean aCorrectProduct = aTestCase.isValidOutput(aTestOutput,
				anExpectedProduct);
		return aCorectOutput;
	}
	// public static String foo() {
	// return "foo";
	// }
	// public static void main (String[] args) {
	// Assert.assertTrue(foo() + NotesAndScore.PERECTAGE_CHARACTER + 0.5,
	// false);
	// System.out.println (foo()+ NotesAndScore.PERECTAGE_CHARACTER + 0.5);
	// System.out.println (NotesAndScore.PERECTAGE_CHARACTER + 0.5);
	// }
}
