package gradingTools.comp301ss21.assignment3.table;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class A3MainCallsGet extends CheckstyleMethodCalledTestCase {

	public A3MainCallsGet() {
		super("main.Assignment3", "@Comp301Tags.TABLE!get:.*->.*"); 
				
		// TODO Auto-generated constructor stub
	}
	

}
