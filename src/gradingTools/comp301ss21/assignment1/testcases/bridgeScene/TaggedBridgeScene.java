package gradingTools.comp301ss21.assignment1.testcases.bridgeScene;

import grader.basics.junit.JUnitTestsEnvironment;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.BasicProjectIntrospection;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment0.SS21Assignment0Suite;
import gradingTools.comp301ss21.assignment1.testcases.avatar.TaggedAvatar;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.shared.testcases.TaggedTypeTest;
import util.annotations.MaxValue;
@MaxValue(2)
public class TaggedBridgeScene extends TaggedTypeTest {

	@Override
	protected String tag() {
		return tags301.Comp301Tags.BRIDGE_SCENE;
	}
	protected Class precedingTest() {
		return TaggedAvatar.class;
	}

	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {
		return super.test(project, autoGrade);
	}
//	public Class bridgeScene;
//
//	public Class getObjectClass() {
//		return bridgeScene;
//	}
	
	
//	@Override
//	public TestCaseResult test(Project project, boolean autoGrade)
//			throws NotAutomatableException, NotGradableException {	
//		 
//		 try {
//			 bridgeScene = BasicProjectIntrospection.findClassByTags(tags301.Comp301Tags.BRIDGE_SCENE);
//			
//		    if (bridgeScene == null) {	
//		    	return fail ("No class in project matching tag:" + tags301.Comp301Tags.BRIDGE_SCENE);
//		    }	
//		    
//			return pass();		
//		 } 		 catch (Exception e) {
//			 return fail (e.getMessage());
//		 } catch (Throwable e) {
//			 	return fail(e.getMessage());
//		}
//	}

}
