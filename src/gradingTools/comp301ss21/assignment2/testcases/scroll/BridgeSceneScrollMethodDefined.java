package gradingTools.comp301ss21.assignment2.testcases.scroll;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
//@MaxValue(2)
//@IsExtra(true)
public class BridgeSceneScrollMethodDefined extends CheckstyleMethodDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public BridgeSceneScrollMethodDefined() {
		super("Comp301Tags\\.BRIDGE_SCENE", "@scroll:int;int->void//EC");
		// TODO Auto-generated constructor stub
	}
	

}
