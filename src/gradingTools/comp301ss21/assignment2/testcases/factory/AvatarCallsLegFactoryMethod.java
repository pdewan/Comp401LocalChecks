package gradingTools.comp301ss21.assignment2.testcases.factory;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class AvatarCallsLegFactoryMethod extends CheckstyleMethodCalledTestCase {

	public AvatarCallsLegFactoryMethod() {
		super("@Comp301Tags\\.AVATAR", "@Comp301Tags\\.FACTORY_CLASS!legsFactoryMethod:\\*->@Comp301Tags\\.ANGLE"); 
				
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return BridgeSceneFactoryMethodDefined.class;
	}

}
