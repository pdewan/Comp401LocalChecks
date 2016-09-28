package gradingTools.comp401f16.assignment.testInterfaces;

import gradingTools.shared.testcases.shapes.interfaces.TestScalable;
import util.annotations.Tags;

@Tags({"BridgeScene"})
public interface TestBridgeScene  {
	public TestAvatar getArthur();
	public TestAvatar getLancelot();
	public TestAvatar getRobin();
	public TestAvatar getGalahad();
	public TestAvatar getGuard();
}
