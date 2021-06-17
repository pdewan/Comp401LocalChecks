package gradingTools.comp401f16.assignment.testInterfaces;

import tags301.Comp301Tags;
import util.annotations.Tags;
import util.models.PropertyListenerRegisterer;

//@Tags({"BridgeScene"})
@Tags(Comp301Tags.BRIDGE_SCENE)
public interface TestBridgeScene  extends PropertyListenerRegisterer{
	public TestAvatar getArthur();
	public TestAvatar getLancelot();
	public TestAvatar getRobin();
	public TestAvatar getGalahad();
	public TestAvatar getGuard();
	public Object getGorge();
	public Object getKnightArea();
	public Object getGuardArea();
	
	@Tags({"approach"})
	public void approach(TestAvatar knight);
	
	public void approach (String aKnightName);
	
	@Tags({"say"})
	public void say(String string);
	
	@Tags({"pass"})
	public void pass();
	
	@Tags({"fail"})
	public void fail();
	public boolean getOccupied();
	public boolean getKnightTurn();
	
	@Tags({"scroll"})
	public void scroll(int scrollAmount, int i);
	public boolean preFail();
	public boolean prePass();
	public boolean preSay();
	public boolean preApproach();
	
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
