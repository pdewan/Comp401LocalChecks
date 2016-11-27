package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import util.annotations.MaxValue;
import util.models.PropertyListenerRegisterer;
@MaxValue(10)
public class ThreadCommandTestCase extends AsyncArthurAnimationTestCase  {
//	 public static final String PROCEDURE_NAME = "doAsyncMove";
	static DefineCallCommandTestCase defineCallCommandTestCase = new DefineCallCommandTestCase();

	protected String createCommand() {
		
		return createCommandName() + " move arthur 12 13 ";
//		String aCommand1 = createCommand(0);
//		String aCommand2 = createCommand(1);
//		String aCommand3 = createCommand(2);
//		String aCommand4 = createCommand(3);
//		String aCommand = "{" + " " +
//						aCommand1 +
//						aCommand2 +
//						aCommand3 +
//						aCommand4 + 
//						"}" + " ";
//		return aCommand;
				
		
//		String anXDelta = toTokens(inputXDelta());
//		String aYDelta = toTokens(inputYDelta());
//		return createCommandName() + " " + avatarName() + anXDelta + aYDelta + " ";
	}
	protected void doDefine() {
//		String aBodyCommand = super.createCommand();
//		String aDefineCommand = 
//				"define " + PROCEDURE_NAME + " " + aBodyCommand;
		setCommand(defineCallCommandTestCase.createDefineCommand());
	}
	public static String createThreadCommand() {
		return "thread " + defineCallCommandTestCase.PROCEDURE_NAME + " ";
	}
	protected void doThread() throws Exception {
		String aThreadCommand = "thread " + defineCallCommandTestCase.PROCEDURE_NAME + " ";
		setCommand(aThreadCommand);
	}
	 protected void defineThread() throws Exception {
		 doDefine();
		 doThread();
			
//			String aBodyCommand = super.createCommand();
//			String aDefineCommand = 
//					"define " + PROCEDURE_NAME + " " + aBodyCommand;
//			setCommand(aDefineCommand);
//			String aThreadCommand = "thread " + PROCEDURE_NAME + " ";
//			setCommand(aThreadCommand);
//	    	movable().move(inputXDelta(), inputYDelta());
	    }
	
	
	protected void executeOperations(Object aProxy) throws Exception {
		defineThread();
//		waitForStartedChildThreads();
//		stopThread(childThread);

	}
	protected void maybeCheckDelay() {
//		if (!foundDelay) {
//			assertTrue("No delayed events (missing sleep call?):", false);
//		}
	}


}
