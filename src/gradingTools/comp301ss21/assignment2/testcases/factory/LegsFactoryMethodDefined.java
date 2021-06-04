package gradingTools.comp301ss21.assignment2.testcases.factory;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import util.annotations.MaxValue;
@MaxValue(2)
public class LegsFactoryMethodDefined extends CheckstyleMethodDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public LegsFactoryMethodDefined() {
		super("Comp301Tags\\.FACTORY_CLASS", "legsFactoryMethod:\\*->@Comp301Tags\\.ANGLE");
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return TaggedFactory.class;
	}

}
