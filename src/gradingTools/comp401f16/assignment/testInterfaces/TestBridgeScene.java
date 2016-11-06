package gradingTools.comp401f16.assignment.testInterfaces;

import util.annotations.Tags;
import util.models.PropertyListenerRegisterer;

@Tags({"BridgeScene"})
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
	
	@Tags({"say"})
	public void say(String string);
	
	@Tags({"passed"})
	public void passed();
	
	@Tags({"failed"})
	public void failed();
	public boolean getOccupied();
	public boolean getKnightTurn();
	
	@Tags({"scroll"})
	public void scroll(int scrollAmount, int i);
	public boolean preFailed();
	public boolean prePassed();
	public boolean preSay();
	public boolean preApproach();
}
