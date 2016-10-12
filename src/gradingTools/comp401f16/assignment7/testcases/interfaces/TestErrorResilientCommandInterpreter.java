package gradingTools.comp401f16.assignment7.testcases.interfaces;

import util.annotations.Tags;

@Tags({"ErrorResilientCommandInterpreter"})
public interface TestErrorResilientCommandInterpreter extends TestCommandInterpreter {
	public String getErrors();

}
