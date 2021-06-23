package gradingTools.comp301ss21.assignment1_1.numbers.source;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import util.annotations.MaxValue;
@MaxValue(2)
public class ScanningIteratorIndexOfDefined extends CheckstyleMethodDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public ScanningIteratorIndexOfDefined() {
		super("ScanningIterator", "indexOf:String;char;int->int");
		// TODO Auto-generated constructor stub
	}
	
	Class[] PRECEDING_TESTS = {
			NoIllegalCall.class,
			NoIllegalImport.class,

	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}

}
