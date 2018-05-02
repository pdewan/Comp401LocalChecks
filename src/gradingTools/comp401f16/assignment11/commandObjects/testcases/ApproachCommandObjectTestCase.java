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
public class ApproachCommandObjectTestCase extends BridgeSceneDynamicTestCase  {
	
//	Class instantiatedClass;
	Class bridgeSceneInterface;	
	Class avatarInterface;
//	Constructor constructor;
	public static final String TAG = "ApproachCommand";

	protected String instantiatedTag() {
		return TAG;
	}	
	protected Class[] constructorArgs() {
		return new Class[] {bridgeSceneInterface, avatarInterface};
	}
	
	public ApproachCommandObjectTestCase() {
		
	}
	public static Class findApproachCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
	
	protected void init() throws Throwable {
//		instantiatedClass = findApproachCommandClass();

//		approachCommandClass = BasicProjectIntrospection.findClassByTags("ApproachCommand");
		bridgeSceneInterface = BasicProjectIntrospection.findInterface(TestBridgeScene.class);
		avatarInterface = BasicProjectIntrospection.findInterface(TestAvatar.class);

//		constructor = instantiatedClass.getConstructor(
//				 bridgeSceneInterface, avatarInterface);
	}
	
//	protected void say (TestAvatar anAvatar, String aSaying) {
//		fractionComplete = 0;
//		 try {
//			
//		
//			Runnable aCommandObject = (Runnable) sayConstructor.newInstance(BasicProjectIntrospection.getRealObject(bridgeScene()), aSaying);
//			aCommandObject.run();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			assertTrue(e.getMessage(), false);
//		} 
//		 
//	}
	protected TestAvatar firstAvatar() {
		return bridgeScene().getLancelot();
	}
	protected void doApproach(TestAvatar anAvatar) {
		fractionComplete = 0;
		 try {
			
		
//			Runnable aCommandObject = (Runnable) constructor.newInstance(
//					BasicProjectIntrospection.getRealObject(bridgeScene()), 
//					BasicProjectIntrospection.getRealObject(firstAvatar()));
			Runnable aCommandObject = (Runnable) instantiateClass(
					BasicProjectIntrospection.getRealObject(bridgeScene()), 
					BasicProjectIntrospection.getRealObject(firstAvatar()));
//			aCommandObject.run();
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
	@Override
	public boolean doTest() throws Throwable {
		init();
		initConstructor();
		create();
		setDependentObjects();
		approach(firstAvatar());
//		say (guard(), firstSay);
//		say (firstAvatar(), secondSay);
//		say (guard(), thirdSay);
//		say (firstAvatar(), fourthSay);
		passed();
		return true;
		
	}
}
