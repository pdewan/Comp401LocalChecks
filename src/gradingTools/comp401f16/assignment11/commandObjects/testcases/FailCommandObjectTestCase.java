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
@MaxValue(5)
public class FailCommandObjectTestCase extends BridgeSceneDynamicTestCase  {
	
//	Class instantiatedClass;
	Class bridgeSceneInterface;	
//	Constructor constructor;
	public static final String TAG = "FailCommand";

	protected String instantiatedTag() {
		return TAG;
	}	
	protected Class[] constructorArgs() {
		return new Class[] {bridgeSceneInterface};
	}
	public FailCommandObjectTestCase() {
		
	}
	public static Class findFailCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
	
	protected void init() throws Throwable {
//		instantiatedClass = findFailCommandClass();
		bridgeSceneInterface = BasicProjectIntrospection.findInterface(TestBridgeScene.class);
//		constructor = instantiatedClass.getConstructor(
//				 bridgeSceneInterface);
	}
	@Override
	protected void doFail () {
		fractionComplete = 0;
		 try {
			
		
//			Runnable aCommandObject = (Runnable) constructor.newInstance(BasicProjectIntrospection.getRealObject(bridgeScene()));
			Runnable aCommandObject = (Runnable)  instantiateClass(BasicProjectIntrospection.getRealObject(bridgeScene()));

//			aCommandObject.run();
//			invokeRunMethod(aCommandObject);
			invokeRunMethod(aCommandObject);


			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
	}
	protected TestAvatar firstAvatar() {
		return bridgeScene().getLancelot();
	}
	protected void doPostApproachOperation() {
		fail();

	}
	@Override
	protected boolean doTest() throws Throwable {
		init();
		initConstructor();
		create();
		setDependentObjects();
		approach(firstAvatar());
		doPostApproachOperation();
//		failed();
		return true;
		
	}
}
