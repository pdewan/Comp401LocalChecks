package gradingTools.comp301ss21.assignment1.testcases.line.moving;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.LineRotateDefined;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import util.annotations.MaxValue;
public class LineMoveDefined extends CheckstyleMethodDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public LineMoveDefined() {
		super("Comp301Tags\\.ROTATING_LINE", "move:int;int->void");
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return LineRotateDefined.class;
	}

}
