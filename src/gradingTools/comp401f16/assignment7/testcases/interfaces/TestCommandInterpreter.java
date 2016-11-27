package gradingTools.comp401f16.assignment7.testcases.interfaces;

import util.annotations.Tags;
import util.models.PropertyListenerRegisterer;

@Tags({"CommandInterpreter"})
public interface TestCommandInterpreter extends PropertyListenerRegisterer{
	public String getCommand();
	public void setCommand(String aCommand);
	@Tags({"asynchronousArthur"})
	public void asynchronousArthur();
	
	@Tags({"asynchronousGalahad"})
	public void asynchronousGalahad();
	
	@Tags({"asynchronousLancelot"})
	public void asynchronousLancelot();
	
	@Tags({"asynchronousRobin"})
	public void asynchronousRobin();
	
	@Tags({"waitingArthur"})
	public void waitingArthur();
	
	@Tags({"waitingGalahad"})
	public void waitingGalahad();
	
	@Tags({"waitingLancelot"})
	public void waitingLancelot();
	
	@Tags({"waitingRobin"})
	public void waitingRobin();
	
	@Tags({"startAnimation"})
	public void startAnimation();

	@Tags({"lockstepArthur"})
	public void lockstepArthur();
	
	@Tags({"lockstepGalahad"})
	public void lockstepGalahad();
	
	@Tags({"lockstepLancelot"})
	public void lockstepLancelot();
	
	@Tags({"lockstepRobin"})
	public void lockstepRobin();
	
	@Tags({"lockstepGuard"})
	public void lockstepGuard();

}
