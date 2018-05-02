package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.trace.Tracer;
import bus.uigen.visitors.CreateChildrenAdapterVisitor;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterArthurMoveLeftArmTestCase;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.shapes.MovableTest;
import gradingTools.shared.testcases.shapes.interfaces.TestMovable;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(10)
@IsExtra(true)
public class SleepCommandTestCase extends CommandInterpreterArthurMoveLeftArmTestCase {
	
	protected static final long SLEEP_TIME = 100;
	public static long presleepTime() {
		long aPresleepTime = System.currentTimeMillis();
	    Tracer.info(SleepCommandTestCase.class,"Pre sleep time:" + aPresleepTime);
	    Tracer.info(SleepCommandTestCase.class,"Sleeping for (ms):" + SLEEP_TIME);
	    return aPresleepTime;
		
	}
	public static boolean checkSleep(long aPresleepTime, long aSleepTime ) {
		long aPostsleepTime = System.currentTimeMillis();
		 Tracer.info(SleepCommandTestCase.class,"Post sleep time:" + aPostsleepTime);
		 return
				 (aPostsleepTime - aPresleepTime) >= SLEEP_TIME - 5; // in case there is an error in sleep
	}
	
	
	protected String createCommand() {
		return createCommandName() + " " + SLEEP_TIME + " ";
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
	
	protected String createCommandName() {
		return "sleep";
	}
	protected void executeSleep() throws Exception {
		commandInterpreter().setCommand(createCommand());
	}
	protected boolean checkSleep() throws Exception {
		long aPresleepTime = presleepTime();
		executeSleep();

	
		 assertTrue ("Did not sleep for minimum time:" , 
				 checkSleep(aPresleepTime, SLEEP_TIME));
		 return true;
	}
	public boolean doTest() throws Throwable {
		
		create();
		checkSleep();
		return true;
		
	}
	
	

}
