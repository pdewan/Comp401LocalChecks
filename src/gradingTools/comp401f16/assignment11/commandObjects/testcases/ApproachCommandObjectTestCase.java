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

public class ApproachCommandObjectTestCase extends BridgeSceneDynamicTestCase  {
	
	Class approachCommandClass;
	Class bridgeSceneInterface;	
	Class avatarInterface;
	Constructor approachConstructor;
	
	public ApproachCommandObjectTestCase() {
		
	}
	
	protected void init() throws Throwable {
		approachCommandClass = BasicProjectIntrospection.findClassByTags("ApproachCommand");
		bridgeSceneInterface = BasicProjectIntrospection.findInterface(TestBridgeScene.class);
		avatarInterface = BasicProjectIntrospection.findInterface(TestAvatar.class);

		approachConstructor = approachCommandClass.getConstructor(
				 bridgeSceneInterface, avatarInterface);
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
			
		
			Runnable aCommandObject = (Runnable) approachConstructor.newInstance(
					BasicProjectIntrospection.getRealObject(bridgeScene()), 
					BasicProjectIntrospection.getRealObject(firstAvatar()));
			aCommandObject.run();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		} 
	}
	@Override
	protected boolean doTest() throws Throwable {
		init();
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
