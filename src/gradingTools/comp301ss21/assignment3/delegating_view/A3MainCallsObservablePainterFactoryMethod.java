package gradingTools.comp301ss21.assignment3.delegating_view;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class A3MainCallsObservablePainterFactoryMethod extends CheckstyleMethodCalledTestCase {

	public A3MainCallsObservablePainterFactoryMethod() {
		super("main.Assignment3", "@Comp301Tags.FACTORY_CLASS!@observableBridgeScenePainterFactoryMethod:->@Comp301Tags.OBSERVABLE_BRIDGE_SCENE_PAINTER"); 
				
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return DelegatingViewFactoryMethodDefined.class;
	}

}
