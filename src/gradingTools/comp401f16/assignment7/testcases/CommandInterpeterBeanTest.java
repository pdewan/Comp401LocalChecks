package gradingTools.comp401f16.assignment7.testcases;

import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment1.testcases.ScanStringTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import util.annotations.MaxValue;
@MaxValue(25)
public class CommandInterpeterBeanTest extends ScanStringTest{
	public static final String COMMAND = "Command";
	@Override
	protected String[] getClassNames(){
		return new String[] {"CommandInterpreter", "Command Interpreter"};
	}

	@Override
	public Class[] getConstructorArgTypes() {
		return new Class[]{};
	}
	@Override
	protected Object[] getConstructorArgs() {
		return BasicProjectExecution.emptyArgs;
	}
	
	@Override
	public Map<String, Object> getInputPropertyValues() {
		Map<String, Object> anInput = new HashMap<String, Object>();
		anInput.put(COMMAND, getArgs()[0]);
		return anInput;
	}

	protected String incorrectOutputMessage() {
		return "incorrect output";
	}
//	@Override
//	protected boolean doTest() throws Throwable {
//		inputWithEndingSpace = true;
//		executeBean();
//		
//		if (processSuccessfulOutputErrrorStatus()) {
//			processGetsAndSetsAfterSucessfulOutput();
//			return true;
//		}
//		inputWithEndingSpace = false;
//		executeBean();
//		if(outputPropertyValues.get(BasicProjectExecution.MISSING_PROPERTY)!=null) {
//			Assert.assertTrue("ScannedString property not found" + NotesAndScore.PERCENTAGE_MARKER + 0,
//					false);
//		}
//		if (processSuccessfulOutputErrrorStatus()) {
//			processGetsAndSetsAfterSucessfulOutput();
//			return true;
//		}
//		processUnsuccessfulOutputErrrorStatus();
//		return true;
//	
//}
//	protected boolean doTest() throws Throwable {
//		inputWithEndingSpace = true;
//		boolean failedWithSpace = false;
//		try {
//		executeBean();
//		} catch (Throwable e) {
//			failedWithSpace = true;
////			executeBean();
//		}
//		if (tokensOutput == null || failedWithSpace) {
//			inputWithEndingSpace = false;
//			executeBean();
//			extractTokens();
//		}
//		extractOutputCorrectSize();
//		extractComponentBeanStatus();
//
//		// see the size does not change a second time
//		executeBean(lastTargetObject);
//		extractTokens();
//		extractSecondOutputCorrectSize();
//		processCompleteOutput();
//		return true;
//	}
	
}
