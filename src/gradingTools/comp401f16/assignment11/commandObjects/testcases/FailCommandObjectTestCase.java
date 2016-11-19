package gradingTools.comp401f16.assignment11.commandObjects.testcases;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import util.assertions.Asserter;
import util.models.PropertyListenerRegisterer;

public class FailCommandObjectTestCase extends BridgeSceneDynamicTestCase  {
	
	Class failedCommandClass;
	Class bridgeSceneInterface;	
	Constructor failedConstructor;
	
	public FailCommandObjectTestCase() {
		
	}
	public static Class findFailCommandClass() {
		return BasicProjectIntrospection.findClassByTags("FailCommand");
	}
	
	protected void init() throws Throwable {
		failedCommandClass = findFailCommandClass();
		bridgeSceneInterface = BasicProjectIntrospection.findInterface(TestBridgeScene.class);
		failedConstructor = failedCommandClass.getConstructor(
				 bridgeSceneInterface);
	}
	@Override
	protected void doFailed () {
		fractionComplete = 0;
		 try {
			
		
			Runnable aCommandObject = (Runnable) failedConstructor.newInstance(BasicProjectIntrospection.getRealObject(bridgeScene()));
			aCommandObject.run();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		} 
		 
	}
	protected TestAvatar firstAvatar() {
		return bridgeScene().getLancelot();
	}
	@Override
	protected boolean doTest() throws Throwable {
		init();
		create();
		setDependentObjects();
		approach(firstAvatar());		
		failed();
		return true;
		
	}
}
