package gradingTools.comp301ss21.assignment3.delegating_view;

import gradingTools.comp301ss21.assignment3.SS21Assignment3Suite;
import gradingTools.comp401f16.assignment9.testcases.Assignment9Suite;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.NewPaintListenerTestCase;
import tags301.Comp301Tags;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
@IsExtra(true)
@MaxValue(10)
public class NewPaintListener  extends NewPaintListenerTestCase{
	protected Class[] PRECEDING_TESTS = {
			TaggedDelegatingView.class,
			TaggedObservablePainter.class,
			DelegatingViewFactoryMethodDefined.class,
			ObservablePainterFactoryMethodDefined.class,
			PaintListenerISAPropertyChangeListener.class,
			PaintListenerPaintDefined.class,
			PaintListenerRepaints.class,
			
			
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	
	protected String mainClassName() {
		return SS21Assignment3Suite.MAIN_CLASS_NAME;
	}
	protected String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	@Override
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
}
