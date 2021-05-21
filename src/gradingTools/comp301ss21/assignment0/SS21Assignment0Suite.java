package gradingTools.comp301ss21.assignment0;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.comp301ss21.assignment0.testcases.GreetingMainCallsPrint;
import gradingTools.comp301ss21.assignment0.testcases.GreetingMainDefined;
import gradingTools.comp301ss21.assignment0.testcases.GreetingRun;
import gradingTools.comp301ss21.assignment0.testcases.TaggedGreetingMainProvided;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TagChecks.class,
	SourceChecks.class,
	RuntimeChecks.class
	
//	GreetingCheckstyle.class
})
public class SS21Assignment0Suite {
//	public static final String GREETING_MAIN_TAG = "GreetingMain";
		public static void main (String[] args) {
		try {
			
			BasicJUnitUtils.interactiveTest(SS21Assignment0Suite.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		static {
			BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
			setCheckStyleConfiguration("unc_checks_301_A0.xml");
		}
	
}
