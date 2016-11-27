package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.RotateLeftArmCommandTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.assertions.Asserter;
import util.models.PropertyListenerRegisterer;
@MaxValue(5)
@IsExtra(true)
public class RotateRightArmCommandObjectTestCase extends RotateLeftArmCommandObjectTestCase  {
	public static final String TAG = "RotateRightArmCommand";

	public static Class findRotateRightArmCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
	protected String instantiatedTag() {
		return TAG;
	}
//	public Class findRotateCommandClass() {
//		return findRotateRightArmCommandClass();
//	}
//	
	@Override
	protected void setLeafProxy() {
		leafProxy = avatar().getArms().getRightLine();
	}
	protected Object computeLeafProxy() {
		return avatar().getArms().getRightLine();
	}
	
	
	
	
	

}
