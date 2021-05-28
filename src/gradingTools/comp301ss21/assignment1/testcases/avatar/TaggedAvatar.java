package gradingTools.comp301ss21.assignment1.testcases.avatar;

import grader.basics.junit.JUnitTestsEnvironment;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.BasicProjectIntrospection;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment0.SS21Assignment0Suite;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import util.annotations.MaxValue;
@MaxValue(2)
public class TaggedAvatar extends PassFailJUnitTestCase {
	public Class avatar;

	public Class getObjectClass() {
		return avatar;
	}
	protected Class precedingTest() {
		return TaggedRotatingLine.class;
	}
	
	@Override
	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {	
		 
		 try {
			 avatar = BasicProjectIntrospection.findClassByTags(tags301.Comp301Tags.AVATAR);
			
		    if (avatar == null) {	
		    	return fail ("No class in project matching tag:" + tags301.Comp301Tags.AVATAR);
		    }	
		    
			return pass();		
		 } 		 catch (Exception e) {
			 return fail (e.getMessage());
		 } catch (Throwable e) {
			 	return fail(e.getMessage());
		}
	}

}
