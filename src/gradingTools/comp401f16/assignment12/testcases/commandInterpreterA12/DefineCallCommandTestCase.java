package gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
import gradingTools.comp401f16.assignment7.testcases.MoveCommandTest;
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

import util.models.PropertyListenerRegisterer;

public class DefineCallCommandTestCase extends OneLevelListMovesTestCase  {
	
	 public static final String PROCEDURE_NAME = "doMove";
     protected void doMove() {
		
		String aBodyCommand = super.createCommand();
		String aDefineCommand = 
				"define " + PROCEDURE_NAME + " " + aBodyCommand;
		String aCallCommand = "call " + PROCEDURE_NAME + " ";
		setCommand(aDefineCommand);
		setCommand(aCallCommand);
//    	movable().move(inputXDelta(), inputYDelta());
    }
     @Override
 	protected void executeOperations(Object aLocatable) throws Exception {
 		move();
 	}
    

}
