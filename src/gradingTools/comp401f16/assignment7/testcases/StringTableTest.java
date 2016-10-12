package gradingTools.comp401f16.assignment7.testcases;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class StringTableTest extends  ProxyTest{
	protected static final int NUM_UNTESTED = 5;
	protected static final double FIRST_GET_CREDIT = 0.2;
	protected static final double SECOND_GET_CREDIT = 0.2; // 9 times, 		0.45 pts
	protected static final double THIRD_GET_CREDIT = 0.2; // once 		0.15
	protected static final  double FOURTH_GET_CREDIT = 0.4; //once, 		0.1
	@Override
	protected Class proxyClass() {
		return TestStringTable.class;
	}
	
	protected TestStringTable table() {
		return (TestStringTable) rootProxy;
	}
	
	protected void addUntested() {
		for (int i = 0; i < NUM_UNTESTED; i++) {
			table().put("" + i, i);
		}
	}
	
	
	
	protected void testPutGet(String aKey, Object aValue) {
		table().put(aKey, aValue);
		Object anActualValue = table().get(aKey);
		assertNotExpectd(anActualValue, aValue);
		
		
	}
	

	@Override
	protected void executeOperations(Object aProxy) {
		testPutGet("one", 1);
		fractionComplete += FIRST_GET_CREDIT;
		testPutGet("two", 2);
		fractionComplete += SECOND_GET_CREDIT;
		testPutGet("one", 2);
		fractionComplete += SECOND_GET_CREDIT;
		testPutGet("two", 1);
		fractionComplete += THIRD_GET_CREDIT;
		addUntested();
		testPutGet("two", 10);
		fractionComplete += FOURTH_GET_CREDIT;
		
	}

	@Override
	protected void setActual(Object aProxy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean checkOutput(Object aLocatable) {
		return false;
	}
	protected boolean doTest() throws Throwable {
		create();
		executeOperations(rootProxy);		
		return true;
		
	}

}
