package gradingTools.comp401f16.assignment1.testcases;

import util.annotations.Explanation;

@Explanation("Scan String Test")
public class ScanStringTest extends MultipleTokensOutputTest {
	protected int getLineIndex() {
		return 0;
	}
	@Override
	protected String[][] tokenLines() {
		// TODO Auto-generated method stub
		return new String[][] {super.tokenLines()[getLineIndex()]};
	}
	public Object[] getArgs() {
		String anInput =null;
		if (inputWithEndingSpace) {
			anInput = inputWithEndingSpace();
		} else {
			anInput = inputWithNoEndingSpace();
		}
		String[] anInputLines = anInput.split("\n");
		String aScannedString = anInputLines[0];
		return new Object[] {aScannedString} ;
	}
	@Override
	protected String getClassName() {
		return "main.Assignment1";
	}
	protected Object getTargetObject() {
		return getTargetClass();
	}
	protected String getMethodName() {
		return "scanString";
	}
	protected boolean isInteractive() {
		return true;
	}
	@Override
	protected boolean invokeInteractiveMethod() throws Throwable  {
		return invokeMethod();
	}
 }
