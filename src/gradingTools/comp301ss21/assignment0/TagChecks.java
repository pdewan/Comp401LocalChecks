package gradingTools.comp301ss21.assignment0;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment0.testcases.TaggedGreetingMainProvided;
import util.annotations.Explanation;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaggedGreetingMainProvided.class,
//	GreetingCheckstyle.class
})
@Explanation("Checks tag constraints")
public class TagChecks {

	
}
