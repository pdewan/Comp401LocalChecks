package gradingTools.comp401f16.assignment6.testcases.iniital;

import org.junit.Assert;

import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;

public class KnightTurnReturnedTestCase extends BridgeSceneGetterReturnTestCase {

	@Override
	protected String propertyName() {
		return "KnightTurn";
	}
	
	@Override
	protected Class expectedClass() {
		return Boolean.TYPE;
	}
	protected void assertWrongObject() {
		Assert.assertTrue(incorrectClassMessage() + NotesAndScore.PERCENTAGE_MARKER + noExceptionCredit(), false);
	}
	@Override
	protected boolean checkOutput(Object actualReturnValue) {
		
		if ((Boolean) actualReturnValue != false) {
			Assert.assertTrue("Initial scene should be occupied" + 
					NotesAndScore.PERCENTAGE_MARKER + noExceptionCredit(), false);
		}		
		
		return true;
	}

}
