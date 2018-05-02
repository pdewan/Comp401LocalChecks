package gradingTools.comp401f16.assignment12.testcases.parser;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.parser.testcases.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.commandInterpreterA11.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.DefineCallCommandTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.ThreadCommandTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.DefineCallCommandObjectTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandObjects.ThreadCommandObjectTestCase;
@MaxValue(10)
@IsExtra(true)
public class ParserCreatesThreadCommandObjectTestCase 
	extends ParserCreatesDefineCallCommandObjectTestCase{
	TestParser parser;
//	DefineCallCommandTestCase defineCallCommandTestCase = new DefineCallCommandTestCase();
	
//	protected void setParserFromFactoryMethod() {
//		Object retVal = 
//		getOrCreateObject(factoryClassTags,
//				ParserFactoryMethodTest.FACTORY_METHOD_TAGS, TestParser.class);
//		assertTrue(factoryMessage, factoryMessage.isEmpty());
//		parser = (TestParser)
//				retVal;
//	}
//	@Override 
//	protected void setDependentObjects() {
//		super.setDependentObjects();
//		setParserFromFactoryMethod();
//	}
//	protected void doStepAfterGettingCommandObject() {
//		
//	}
//	protected boolean checkCommandClass (Class aClass) {
//		if (aClass == null) {
//			assertTrue("Could not find command class", false);			
//		}
//		System.out.println ("Getting parser command object");
//		Object anObject = parser.getCommandObject();
//		doStepAfterGettingCommandObject();
//		if (anObject == null) {
//			assertTrue("Null command object", false);
//		}
//		assertTrue ( anObject + " not instance of " + aClass, aClass.isInstance(anObject));
//		return true;
//	}
//	protected Class commandObjectClass() {
//		return DefineCallCommandObjectTestCase.findDefineCommandClass();
//	}
	protected Class threadCommandObjectClass() {
		return ThreadCommandObjectTestCase.findThreadCommandClass();
	}
//	protected void setCommand() {
//		setCommand(defineCallCommandTestCase.createDefineCommand());
//
//	}
	protected void setThreadCommand() {
		setCommand(ThreadCommandTestCase.createThreadCommand());

	}
	protected boolean doTest() throws Throwable {
		create();
		
		setDependentObjects();
		setCommand();
		checkCommandClass(commandObjectClass());
		setThreadCommand();
		checkCommandClass(threadCommandObjectClass());
		return true;
		
		
		
		
	}
	

}
