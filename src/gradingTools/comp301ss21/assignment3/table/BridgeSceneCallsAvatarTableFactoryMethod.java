package gradingTools.comp301ss21.assignment3.table;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class BridgeSceneCallsAvatarTableFactoryMethod extends CheckstyleMethodCalledTestCase {

	public BridgeSceneCallsAvatarTableFactoryMethod() {
		super("@Comp301Tags.BRIDGE_SCENE", "@Comp301Tags.FACTORY_CLASS!@avatarTableFactoryMethod:->@Comp301Tags.TABLE"); 
				
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return AvatarTableFactoryMethodDefined.class;
	}

}
