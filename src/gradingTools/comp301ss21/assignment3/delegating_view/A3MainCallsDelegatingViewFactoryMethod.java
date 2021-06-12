package gradingTools.comp301ss21.assignment3.delegating_view;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import util.annotations.MaxValue;
@MaxValue(2)
public class A3MainCallsDelegatingViewFactoryMethod extends CheckstyleMethodCalledTestCase {

	public A3MainCallsDelegatingViewFactoryMethod() {
		super("main.Assignment3", "@Comp301Tags.FACTORY_CLASS!@delegatingBridgeSceneViewFactoryMethod:->@Comp301Tags.DELEGATING_BRIDGE_SCENE_VIEW"); 
				
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return ObservablePainterFactoryMethodDefined.class;
	}

}
