package gradingTools.comp301ss21.assignment1_1.scannerBean;

import grader.basics.junit.JUnitTestsEnvironment;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.BasicProjectIntrospection;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment0.SS21Assignment0Suite;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import gradingTools.shared.testcases.TaggedTypeTest;
import util.annotations.MaxValue;
@MaxValue(2)
public class TaggedPlus extends TaggedTypeTest {

	@Override
	protected String mainClassIdentifier() {
		return tags301.Comp301Tags.PLUS;
	}
	protected boolean checkForInterface() {
		return false;
	}
//	@Override
//	protected Class precedingTest() {
//		return TaggedRotatingLine.class;
//	}

	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {
		return super.test(project, autoGrade);
	}

//	public Class angle;
//
//	public Class getObjectClass() {
//		return angle;
//	}

//	
//	@Override
//	public TestCaseResult test(Project project, boolean autoGrade)
//			throws NotAutomatableException, NotGradableException {	
//		 
//		 try {
//			 angle = BasicProjectIntrospection.findClassByTags(tags301.Comp301Tags.ANGLE);
//			
//		    if (angle == null) {	
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
