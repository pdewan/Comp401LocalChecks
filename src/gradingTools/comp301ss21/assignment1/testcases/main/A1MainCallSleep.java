package gradingTools.comp301ss21.assignment1.testcases.main;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class A1MainCallSleep extends CheckstyleMethodCalledTestCase {

	public A1MainCallSleep() {
		super("main.Assignment1", "(.*)!sleep:long->void");
		// TODO Auto-generated constructor stub
	}

}
