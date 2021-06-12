package gradingTools.comp301ss21.assignment2.testcases.observable;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassInstantiatedTestCase;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;

public class BoundedShapeInstantiatesPropertyChangeEvent extends CheckstyleClassInstantiatedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public BoundedShapeInstantiatesPropertyChangeEvent() {
		super("Comp301Tags\\.BOUNDED_SHAPE", "java.beans.PropertyChangeEvent");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return TaggedLocatable.class;
	}

}
