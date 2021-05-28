package gradingTools.comp301ss21.assignment1.testcases.line.fixed;

import gradingTools.basics.sharedTestCase.checkstyle.CheckStyleEditablePropertyDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckStylePropertyDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import util.annotations.MaxValue;
@MaxValue(0)
public class LineAngleEditableProperty extends CheckStyleEditablePropertyDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public LineAngleEditableProperty() {
		super("Comp301Tags\\.ROTATING_LINE", "Angle","double");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return TaggedRotatingLine.class;
	}

}
