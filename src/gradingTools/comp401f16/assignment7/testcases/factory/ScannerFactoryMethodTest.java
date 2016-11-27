package gradingTools.comp401f16.assignment7.testcases.factory;

import bus.uigen.test.TestTransient;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment7.testcases.TestScanner;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.ProxyTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;

public class ScannerFactoryMethodTest extends  FactoryMethodTest{
	public static final String[] FACTORY_METHOD_TAGS = new String[] {"scannerFactoryMethod"};
	public ScannerFactoryMethodTest() {
		factoryMethodTags = FACTORY_METHOD_TAGS;
	}
	protected boolean tryConstructor() {
		return false;
	}
	@Override
	protected Class proxyClass() {
		return TestScanner.class;
	}
	
	protected TestScanner scanner() {
		return (TestScanner) rootProxy;
	}
	
	
	protected boolean doTest() throws Throwable {
		 return doFactoryMethodTest();
		
	}
	
}
