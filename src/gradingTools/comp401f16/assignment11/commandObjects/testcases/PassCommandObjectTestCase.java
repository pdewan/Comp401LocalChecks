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
public class PassCommandObjectTestCase extends FailCommandObjectTestCase  {
	
//	Class instantiatedClass;
//	Class bridgeSceneInterface;	
//	Constructor constructor;
	public static final String TAG = "PassCommand";

	protected String instantiatedTag() {
		return TAG;
	}	
//	protected Class[] constructorArgs() {
//		return new Class[] {bridgeSceneInterface};
//	}
	public PassCommandObjectTestCase() {
		
	}
	public static Class findPassCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
//	protected void init() throws Throwable {
//		instantiatedClass = findPassCommandClass();
//		bridgeSceneInterface = BasicProjectIntrospection.findInterface(TestBridgeScene.class);
////		constructor = instantiatedClass.getConstructor(
////				 bridgeSceneInterface);
//	}
	protected void doPostApproachOperation() {
		passed();

	}
	@Override
	protected void doPassed () {
		super.doPassOrFailed();
//		fractionComplete = 0;
//		 try {
//			
//		
////			Runnable aCommandObject = (Runnable) constructor.newInstance(BasicProjectIntrospection.getRealObject(bridgeScene()));
//		    Runnable aCommandObject = (Runnable) instantiateClass(BasicProjectIntrospection.getRealObject(bridgeScene()));
//
//			 aCommandObject.run();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			assertTrue(e.getMessage(), false);
//		} 
		 
	}
//	protected TestAvatar firstAvatar() {
//		return bridgeScene().getLancelot();
//	}
//	@Override
//	protected boolean doTest() throws Throwable {
//		init();
//		initConstructor();
//		create();
//		setDependentObjects();
//		approach(firstAvatar());		
//		passed();
//		return true;
//		
//	}
}
