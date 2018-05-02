package gradingTools.comp401f16.assignment7.testcases;

import util.annotations.MaxValue;
import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment7.testcases.factory.StringTableFactoryMethodTest;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;
@MaxValue(25)
public class StringTableTest extends  StringTableFactoryMethodTest{
	protected static final int NUM_UNTESTED = 5;
	protected static final double FIRST_GET_CREDIT = 0.2;
	protected static final double SECOND_GET_CREDIT = 0.1; 
	protected static final double THIRD_GET_CREDIT = 0.1; 
	protected static final  double FOURTH_GET_CREDIT = 0.1; 
	protected static final  double LAST_GET_CREDIT = 0.5; 

//	public StringTableTest() {
//		factoryMethodTags = new String[] {"avatarTableFactoryMethod"};
//	}
//	@Override
//	protected Class proxyClass() {
//		return TestStringTable.class;
//	}
//	
//	
//	protected String[] factoryMethodTags() {
//		return factoryMethodTags;
//	}
//	protected TestStringTable table() {
//		return (TestStringTable) rootProxy;
//	}
	
	protected void addUntested() {
		for (int i = 0; i < NUM_UNTESTED; i++) {
			table().put("" + i, i);
		}
	}
	
	
	
	protected void testPutGet(String aKey, Object aValue) {
		table().put(aKey, aValue);
		Object anActualValue = table().get(aKey);
		assertNotExpected(anActualValue, aValue);		
	}
	

	@Override
	protected void executeOperations(Object aProxy) {
		fractionComplete = 0;
		testPutGet("one", 1);
		fractionComplete += FIRST_GET_CREDIT;
		testPutGet("two", 2);
		fractionComplete += SECOND_GET_CREDIT;
		testPutGet("one", 2);
		fractionComplete += THIRD_GET_CREDIT;
		testPutGet("two", 1);
		fractionComplete += FOURTH_GET_CREDIT;
		addUntested();
		testPutGet("two", 10);
		fractionComplete += LAST_GET_CREDIT;
		
	}

	@Override
	protected void setActual(Object aProxy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean checkOutput(Object aLocatable) {
		return false;
	}
	@Override
	protected Object create() {
		return createUsingFactoryMethod();
	}
	public boolean doTest() throws Throwable {
		create();
		executeOperations(rootProxy);		
		return true;
		
	}

}
