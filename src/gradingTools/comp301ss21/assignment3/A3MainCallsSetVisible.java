package gradingTools.comp301ss21.assignment3;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class A3MainCallsSetVisible extends CheckstyleMethodCalledTestCase {

	public A3MainCallsSetVisible() {
		super("main.Assignment3", "(.*)!setVisible:boolean->void"); 
				
		// TODO Auto-generated constructor stub
	}
	

}
