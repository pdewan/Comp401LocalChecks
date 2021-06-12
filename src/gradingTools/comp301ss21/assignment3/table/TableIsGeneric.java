package gradingTools.comp301ss21.assignment3.table;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassInstantiatedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassIsGenericTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import util.annotations.MaxValue;
@MaxValue(10)
public class TableIsGeneric extends CheckstyleClassIsGenericTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	protected final Class[] PRECEDING_TESTS = {
//			TaggedTable.class,
			NoIllegalGetOrPut.class,
			
	};
	@Override
	protected Class[] precedingTests() {
			return PRECEDING_TESTS;
	}
	
	public TableIsGeneric() {
		super("@Comp301Tags.TABLE");
		// TODO Auto-generated constructor stub
	}
	
//	protected Class precedingTest() {
//		return TableSemantics.class;
//	}

}
