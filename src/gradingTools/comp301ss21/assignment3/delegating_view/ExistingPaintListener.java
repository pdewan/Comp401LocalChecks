package gradingTools.comp301ss21.assignment3.delegating_view;

import gradingTools.comp401f16.assignment9.testcases.observablepainter.ExistingPaintListenerTestCase;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(20)
public class ExistingPaintListener extends ExistingPaintListenerTestCase {
	protected String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	@Override
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
}
