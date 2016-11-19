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

import util.annotations.MaxValue;
import util.assertions.Asserter;
import util.models.PropertyListenerRegisterer;
@MaxValue(10)
public class PassCommandObjectTestCase extends BridgeSceneDynamicTestCase  {
	
	Class passedCommandClass;
	Class bridgeSceneInterface;	
	Constructor passedConstructor;
	
	public PassCommandObjectTestCase() {
		
	}
	public static Class findPassCommandClass() {
		return BasicProjectIntrospection.findClassByTags("PassCommand");
	}
	protected void init() throws Throwable {
		passedCommandClass = findPassCommandClass();
		bridgeSceneInterface = BasicProjectIntrospection.findInterface(TestBridgeScene.class);
		passedConstructor = passedCommandClass.getConstructor(
				 bridgeSceneInterface);
	}
	@Override
	protected void doPassed () {
		fractionComplete = 0;
		 try {
			
		
			Runnable aCommandObject = (Runnable) passedConstructor.newInstance(BasicProjectIntrospection.getRealObject(bridgeScene()));
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
		passed();
		return true;
		
	}
}
