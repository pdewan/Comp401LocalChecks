package gradingTools.comp301ss21.assignment1.testcases.bridgeScene;

import gradingTools.basics.sharedTestCase.checkstyle.CheckStylePropertyDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.comp301ss21.assignment1.testcases.angle.AngleMoveDefined;

public class BridgeSceneLancelotProperty extends CheckStylePropertyDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public BridgeSceneLancelotProperty() {
		super("Comp301Tags\\.BRIDGE_SCENE", "Lancelot","Comp301Tags\\.AVATAR");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return TaggedBridgeScene.class;
	}

}
