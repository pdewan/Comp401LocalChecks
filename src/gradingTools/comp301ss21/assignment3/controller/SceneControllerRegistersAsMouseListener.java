package gradingTools.comp301ss21.assignment3.controller;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassInstantiatedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import util.annotations.MaxValue;
@MaxValue(2)
public class SceneControllerRegistersAsMouseListener extends CheckstyleMethodCalledTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public SceneControllerRegistersAsMouseListener() {
		super("@Comp301Tags.BRIDGE_SCENE_CONTROLLER", "(.*)!addMouseListener:java.awt.event.MouseListener->void");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return TaggedLocatable.class;
	}

}
