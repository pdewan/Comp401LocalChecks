package gradingTools.comp301ss21.assignment0.testcases;

import grader.basics.junit.JUnitTestsEnvironment;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.BasicProjectIntrospection;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment0.SS21Assignment0Suite;
import util.annotations.MaxValue;
@MaxValue(2)
public class TaggedGreetingMainProvided extends PassFailJUnitTestCase {
	public Class greetingMain;

	public Class getGreetingMain() {
		return greetingMain;
	}
	
	@Override
	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {	
		 
		 try {
			 greetingMain = BasicProjectIntrospection.findClassByTags(tags301.Comp301Tags.GREETING_MAIN);
			
		    if (greetingMain == null) {	
		    	return fail ("No class in project matching tag:" + tags301.Comp301Tags.GREETING_MAIN);
		    }	
		    
			return pass();		
		 } 		 catch (Exception e) {
			 return fail (e.getMessage());
		 } catch (Throwable e) {
			 	return fail(e.getMessage());
		}
	}

}
