package gradingTools.comp301ss21.assignment1_1.scannerBean;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassInstantiatedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import util.annotations.MaxValue;
@MaxValue(2)
public class Main3CallsBeanSetter extends CheckstyleMethodCalledTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public Main3CallsBeanSetter() {
		super("main.Assignment1_1_Part3", "@Comp301Tags.SCANNER_BEAN!setScannedString:String->void");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return TaggedScannerBean.class;
	}

}
