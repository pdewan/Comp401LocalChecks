package gradingTools.comp401f16.assignment11.parser.testcases;

import util.annotations.MaxValue;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.ApproachCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.commandInterpreterA11.ParsingAtomicCommandTestCase;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
@MaxValue(5)
public class ParserCreatesApproachCommandObjectTestCase 
	extends ParsingAtomicCommandTestCase{
	protected TestParser parser;
	
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
