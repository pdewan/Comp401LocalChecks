package gradingTools.comp401f16.assignment7.testcases.factory;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class StringTableFactoryMethodTest extends  FactoryMethodTest{
	
	public StringTableFactoryMethodTest() {
		factoryMethodTags = new String[] {"avatarTableFactoryMethod"};
	}
	@Override
	protected Class proxyClass() {
		return TestStringTable.class;
	}
	
	protected TestStringTable table() {
		return (TestStringTable) rootProxy;
	}
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
}
