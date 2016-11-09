package gradingTools.comp401f16.assignment10.commandObjects.testcases;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
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

public class MoveCommandObjectTestCase extends BridgeSceneArthurMoveLeftArmTestCase  {
	
	Class moveCommandClass;
	Class avatarInterface;
	Constructor moveConstructor;
	
	public MoveCommandObjectTestCase() {
		
	}
	
	protected void init() throws Throwable{
		moveCommandClass = BasicProjectIntrospection.findClassByTags("MoveCommand");
		avatarInterface = BasicProjectIntrospection.findInterface(TestAvatar.class);
			moveConstructor = moveCommandClass.getConstructor(
					 avatarInterface, Integer.TYPE, Integer.TYPE);
		
	}
	
	@Override
	protected void doMove() {
		
		fractionComplete = 0;
		 try {
			
			Object anAvatar = BasicProjectIntrospection.getRealObject(avatar());
		
			Runnable aCommandObject = (Runnable) (moveConstructor.newInstance(anAvatar, inputXDelta(), inputYDelta()));
			aCommandObject.run();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		} 

//		Runnable aMoveCommandObject = (Runnable)
//			BasicProjectIntrospection.
//				createInstance(Runnable.class, avatar(), inputXDelta(), inputYDelta()));
//			    
		 
	 }
	    	
	protected boolean doTest() throws Throwable {
		init();
		return super.doTest();
	}
	
	
//	@Override
//	protected Object create() {
//		return createUsingFactoryMethod();
//	}
//	protected void executeOperations(Object aProxy) {
//		System.out.println ("Animating arthur");
//		bridgeScene.approach(avatar());
//	}
	
//	
//	protected TestAvatar avatar() {
//		return bridgeScene.getArthur();
//	}
	
//	@Override
//	protected boolean doTest() throws Throwable {
//		create();
//		setDependentObjects();
//		executeOperations(rootProxy);
//		
//		return true;
//	}
	

}
