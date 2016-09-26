package gradingTools.comp401f16.assignment4.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestLocatable;
import gradingTools.comp401f16.assignment.testInterfaces.TestRotatingLine;

public abstract class RotatingLineTest extends LocatableTest{

	@Override
	protected Class locatableClass() {
		return TestRotatingLine.class;
	}
	protected TestRotatingLine getRotatingLine() {
		return (TestRotatingLine) locatable;
	}
	protected abstract boolean doTest(TestRotatingLine aLocatable);

	protected boolean doTest(TestLocatable aLocatable) {
		return doTest((TestRotatingLine) aLocatable);
	}

}
