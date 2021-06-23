package gradingTools.comp301ss21.assignment2_1.inheritance;

import gradingTools.basics.sharedTestCase.checkstyle.CheckStyleEditablePropertyDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckStylePropertyDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.ExpectedSuperTypesRatioCheck;
import util.annotations.MaxValue;
@MaxValue(20)
public class A2_1ExpectedSuperTypes extends ExpectedSuperTypesRatioCheck {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
//	public A2ExpectedSuperTypes() {
//		super("Comp301Tags\\.LOCATABLE", "X","int");
//		// TODO Auto-generated constructor stub
//	}
	protected static final Class[] PRECEDING_TESTS = {
		TaggedEnd.class,
		TaggedStart.class,
		TaggedQuote.class,
		TaggedSay.class,
		TaggedStart.class,
		TaggedWord.class,
		TaggedNumber.class
		
	};
	
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	
	public void defaultTest() {
		super.defaultTest();
	}
//	protected Class precedingTest() {
//		return TaggedLocatable.class;
//	}

}
