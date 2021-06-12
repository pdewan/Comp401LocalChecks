package gradingTools.comp301ss21.assignment3.inheriting_view;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class A3MainCallsInheritingPainterFactoryMethod extends CheckstyleMethodCalledTestCase {

	public A3MainCallsInheritingPainterFactoryMethod() {
		super("main.Assignment3", "@Comp301Tags.FACTORY_CLASS!@inheritingBridgeScenePainterFactoryMethod:->@Comp301Tags\\.INHERITING_BRIDGE_SCENE_PAINTER"); 
				
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return InheritingPainterFactoryMethodDefined.class;
	}

}
