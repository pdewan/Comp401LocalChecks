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
	
	@Tags({"waitingArthur"})
	public void animateArthurWithWait();
	
	@Tags({"waitingGalahad"})
	public void animateGalahadWithWait();
	
	@Tags({"waitingLancelot"})
	public void animateLancelotWithWait();
	
	@Tags({"waitingRobin"})
	public void animateRobinWithWait();
	
	@Tags({"startAnimation"})
	public void startAnimation();

	@Tags({"lockstepArthur"})
	public void animateArthurWithLockstep();
	
	@Tags({"lockstepGalahad"})
	public void animateGalahadWithLockstep();
	
	@Tags({"lockstepLancelot"})
	public void animateLancelotWithLockstep();
	
	@Tags({"lockstepRobin"})
	public void animateRobinWithLockstep();
	
	@Tags({"lockstepGuard"})
	public void clapGuardLockstep();

}
