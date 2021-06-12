package gradingTools.comp301ss21.assignment3.table;

import gradingTools.comp401f16.assignment7.testcases.StringTableTest;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(25)
public class TableSemantics extends StringTableTest {
	protected final Class[] PRECEDING_TESTS = {
//			TaggedTable.class,
			NoIllegalGetOrPut.class,
			
	};
	@Override
	protected Class[] precedingTests() {
			return PRECEDING_TESTS;
	}
	protected String[] factoryClassTags = new String[] {Comp301Tags.FACTORY_CLASS};
	@Override
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	 protected boolean failedTestVetoes() {
	    	return true;
	    }
}
