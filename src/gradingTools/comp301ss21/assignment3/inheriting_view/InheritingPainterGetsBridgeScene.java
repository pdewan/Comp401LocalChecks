package gradingTools.comp301ss21.assignment3.inheriting_view;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassInstantiatedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import tags301.Comp301Tags;

public class InheritingPainterGetsBridgeScene extends CheckstyleMethodCalledTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public InheritingPainterGetsBridgeScene() {
//		Comp301Tags.INHERITING_BRIDGE_SCENE_PAINTER;
		super("Comp301Tags\\.INHERITING_BRIDGE_SCENE_PAINTER", "@Comp301Tags.FACTORY_CLASS!@bridgeSceneFactoryMethod:->@Comp301Tags.BRIDGE_SCENE");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return TaggedLocatable.class;
	}

}
