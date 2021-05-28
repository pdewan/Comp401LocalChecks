package gradingTools.comp301ss21.assignment1.testcases.bridgeScene;

import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import gradingTools.basics.sharedTestCase.checkstyle.CheckStylePropertyDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleClassInstantiatedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import util.annotations.MaxValue;

@MaxValue(2)
public class BridgeSceneInstantiatesAvatar extends CheckstyleClassInstantiatedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public BridgeSceneInstantiatesAvatar() {
		super("Comp301Tags\\.BRIDGE_SCENE", "Comp301Tags\\.AVATAR");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return BridgeSceneArthurProperty.class;
	}
	public TestCaseResult test(Project project, boolean autoGrade) throws NotAutomatableException, NotGradableException {
		 TestCaseResult aResult = super.test(project, autoGrade);
	     return aResult;	        
	 }

}
