package gradingTools.comp401f16.assignment11.parser.testcases;

import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.parsing.ParsingAtomicCommandTestCase;

public class ParserCreatesApproachCommandObjectTestCase 
	extends ParsingAtomicCommandTestCase{
	TestParser parser;
	
	protected void setParserFromFactoryMethod() {
		Object retVal = 
		getOrCreateObject(factoryClassTags,
				ParserFactoryMethodTest.FACTORY_METHOD_TAGS, TestParser.class);
		assertTrue(factoryMessage, factoryMessage.isEmpty());
		parser = (TestParser)
				retVal;
	}
	@Override 
	protected void setDependentObjects() {
		super.setDependentObjects();
		setParserFromFactoryMethod();
	}
	protected void doStepAfterGettingCommandObject() {
		
	}
	protected boolean checkCommandClass (Class aClass) {
		if (aClass == null) {
			assertTrue("Could not find command class", false);			
		}
		System.out.println ("Getting parser command object");
		Object anObject = parser.getCommandObject();
		doStepAfterGettingCommandObject();
		if (anObject == null) {
			assertTrue("Null command object", false);
		}
		assertTrue ( anObject + " not instance of " + aClass, aClass.isInstance(anObject));
		return true;
	}
	protected Class commandObjectClass() {
		return ApproachCommandObjectTestCase.findApproachCommandClass();
	}
	protected void setCommand() {
		setCommand("approach Arthur ");

	}
	protected boolean doTest() throws Throwable {
		create();
		
		setDependentObjects();
		setCommand();
		checkCommandClass(commandObjectClass());
		return true;
		
		
		
		
	}
	

}
