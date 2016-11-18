package gradingTools.comp401f16.assignment11.testcases.interfaces;

import util.annotations.Tags;

@Tags({"Parser"})
public interface TestParser {
	public String getCommandText();
	public void setCommandText(String string);
	public Runnable getCommandObject();
	public String getErrors();

}
