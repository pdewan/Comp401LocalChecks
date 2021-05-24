package gradingTools.comp301ss21.assignment1.testcases.line.fixed;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;

public class LineRotateDefined extends CheckstyleMethodDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public LineRotateDefined() {
		super("Comp301Tags\\.ROTATING_LINE", "rotate:int->void");
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return TaggedRotatingLine.class;
	}

}
