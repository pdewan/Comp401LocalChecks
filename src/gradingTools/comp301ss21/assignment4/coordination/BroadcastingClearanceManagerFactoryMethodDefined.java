package gradingTools.comp301ss21.assignment4.coordination;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewSingletonFromFactory;
import gradingTools.comp301ss21.assignment3.A3TaggedFactory;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(2)
public class BroadcastingClearanceManagerFactoryMethodDefined extends CheckstyleMethodDefinedTestCase {
//	protected final Class[] PRECEDING_TESTS = {
//			TaggedBridgeSceneController.class,
//			
//	};
//	@Override
//	protected Class[] precedingTests() {
//			return PRECEDING_TESTS;
//	}
	
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public BroadcastingClearanceManagerFactoryMethodDefined() {
		super("Comp301Tags\\.FACTORY_CLASS", "@broadcastingClearanceManagerFactoryMethod:->BroadcastingClearanceManager");
		// TODO Auto-generated constructor stub
	}
	

}
