package gradingTools.comp301ss21.assignment3.delegating_view;

import grader.basics.junit.JUnitTestsEnvironment;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.BasicProjectIntrospection;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment0.SS21Assignment0Suite;
import gradingTools.shared.testcases.TaggedTypeTest;
import util.annotations.MaxValue;
@MaxValue(2)
public class TaggedDelegatingView extends TaggedTypeTest {

	@Override
	protected String mainClassIdentifier() {
		// TODO Auto-generated method stub
		return tags301.Comp301Tags.OBSERVABLE_BRIDGE_SCENE_PAINTER;
	}

	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {
		return super.test(project, autoGrade);
	}
	
//	public Class rotatingLine;

//	public Class getObjectClass() {
//		return rotatingLine;
//	}
//	
//	@Override
//	public TestCaseResult test(Project project, boolean autoGrade)
//			throws NotAutomatableException, NotGradableException {	
//		 
//		 try {
//			 rotatingLine = BasicProjectIntrospection.findClassByTags(tags301.Comp301Tags.ROTATING_LINE);
//			
//		    if (rotatingLine == null) {	
//		    	return fail ("No class in project matching tag:" + tags301.Comp301Tags.ROTATING_LINE);
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
