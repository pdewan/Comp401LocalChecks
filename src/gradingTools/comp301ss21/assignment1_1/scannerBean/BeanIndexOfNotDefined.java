package gradingTools.comp301ss21.assignment1_1.scannerBean;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.comp301ss21.assignment1_1.numbers.source.NoIllegalCall;
import util.annotations.MaxValue;
@MaxValue(2)
public class BeanIndexOfNotDefined extends CheckstyleMethodDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public BeanIndexOfNotDefined() {
		super("@Comp301Tags.SCANNER_BEAN", "indexOfNot:String;char;int->int");
		// TODO Auto-generated constructor stub
	}
	
	Class[] PRECEDING_TESTS = {
			TaggedScannerBean.class,
			NoIllegalCall.class
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}

}
