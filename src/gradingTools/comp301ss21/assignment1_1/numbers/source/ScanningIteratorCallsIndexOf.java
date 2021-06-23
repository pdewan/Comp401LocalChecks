package gradingTools.comp301ss21.assignment1_1.numbers.source;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassInstantiatedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalCall;
import gradingTools.basics.sharedTestCase.checkstyle.NoIllegalImport;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import util.annotations.MaxValue;
@MaxValue(2)
public class ScanningIteratorCallsIndexOf extends CheckstyleMethodCalledTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public ScanningIteratorCallsIndexOf() {
		super("ScanningIterator", "next#indexOf:String;char;int->int");
		// TODO Auto-generated constructor stub
	}
	Class[] PRECEDING_TESTS = {
//			TaggedScannerBean.class,
			NoIllegalCall.class,
			NoIllegalImport.class,
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	
}
