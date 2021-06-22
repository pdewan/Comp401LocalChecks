package gradingTools.comp301ss21.assignment1_1.scannerBean;

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
public class BeanInstantiatesQuote extends CheckstyleClassInstantiatedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public BeanInstantiatesQuote() {
		super("Comp301Tags.SCANNER_BEAN", "Comp301Tags.QUOTE");
		// TODO Auto-generated constructor stub
	};
	Class[] PRECEDING_TESTS = {
			TaggedScannerBean.class,
//			TaggedNumber.class,
	};
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	public TestCaseResult test(Project project, boolean autoGrade) throws NotAutomatableException, NotGradableException {
		 TestCaseResult aResult = super.test(project, autoGrade);
	     return aResult;	        
	 }

}
