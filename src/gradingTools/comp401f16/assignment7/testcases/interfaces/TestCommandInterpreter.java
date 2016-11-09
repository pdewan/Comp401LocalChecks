package gradingTools.comp401f16.assignment7.testcases.interfaces;

import util.annotations.Tags;
import util.models.PropertyListenerRegisterer;

@Tags({"CommandInterpreter"})
public interface TestCommandInterpreter extends PropertyListenerRegisterer{
	public String getCommand();
	public void setCommand(String aCommand);
	@Tags({"asynchronousArthur"})
	public void animateArthur();
	
	@Tags({"asynchronousGalahad"})
	public void animateGalahad();
	
	@Tags({"asynchronousLancelot"})
	public void animateLancelot();
	
	@Tags({"asynchronousRobin"})
	public void animateRobin();

}
