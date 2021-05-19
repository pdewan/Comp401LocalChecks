package gradingTools.comp301ss21.assignment0;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment0.testcases.A0MnemonicNames;
import gradingTools.comp301ss21.assignment0.testcases.GreetingMainCallsPrint;
import gradingTools.comp301ss21.assignment0.testcases.GreetingMainDefined;
import unc.checks.MnemonicNameCheck;
import util.annotations.Explanation;
import util.annotations.MaxValue;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	A0MnemonicNames.class,
	GreetingMainDefined.class,
	GreetingMainCallsPrint.class,
})
@Explanation("Checks source code constraints")
@MaxValue(6)
public class SourceChecks {

	
}
