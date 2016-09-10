package gradingTools.comp401f16.assignment1.testcases;

import util.annotations.Explanation;

/**
 * Same as the other scan string test, but uses line index 1
 * @author Semion
 *
 */
@Explanation("Scan String Test")
public class ScanStringTest2 extends MultipleTokensOutputTest {
	protected int getLineIndex() {
		return 1;
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
//	@Override
//	protected String getClassName() {
//		return "main.Assignment1";
//	}
	@Override
	protected String[] getClassNames(){
		return new String[] {
				Assignment1Suite.MAIN_CLASS_NAME, 
				toRegex("Assignment"),
				"ScanningIterator",
				toRegex("ScanningIterator"),
				"ScannerBean",
				toRegex("Bean")};
	}
	@Override
	protected Object[] getTargetObjects() {
		return getTargetClasses();
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

