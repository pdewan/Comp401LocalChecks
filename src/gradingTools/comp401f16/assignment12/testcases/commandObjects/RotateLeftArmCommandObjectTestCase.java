package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
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
public class RotateLeftArmCommandObjectTestCase extends OneLevelListMovesTestCase  {
	public static final String TAG = "RotateLeftArmCommand";

	public static final int NUM_ROTATION_UNITS = 3;
//	Class instantiatedClass;
	Class avatarInterface;
//	Constructor constructor;
	
	public RotateLeftArmCommandObjectTestCase() {
		
	}
	public static Class findRotateLeftArmCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
	
//	public Class findRotateCommandClass() {
////		return BasicProjectIntrospection.findClassByTags("RotateLeftArmCommand");
//		return findRotateLeftArmCommandClass();
//	}
	protected String instantiatedTag() {
		return TAG;
	}	
	protected Class[] constructorArgs() {
		return new Class[] {avatarInterface, Integer.TYPE};
	}
	protected void init() throws Throwable{
//		moveCommandClass = BasicProjectIntrospection.findClassByTags("MoveCommand");
//		instantiatedClass = findRotateCommandClass();

		avatarInterface = BasicProjectIntrospection.findInterface(TestAvatar.class);
//		constructor = instantiatedClass.getConstructor(
//				 avatarInterface, Integer.TYPE);
		
	}
	protected Integer inputStudentXDelta() {
		return 0;
	}
	protected Integer inputStudentYDelta() {
		return 0;
	}
	@Override
	protected void doMove() throws Exception{
		
		doRotate();
	 }
	@Override
	protected void setActual(Object aLocatable) {
		super.setActual(aLocatable);
		setActualBounds();
		
	}
	
	protected void callRotate() throws Exception {
		 
				Object anAvatar = BasicProjectIntrospection.getRealObject(avatar());
			
//				Runnable aCommandObject = (Runnable) (constructor.newInstance(anAvatar, NUM_ROTATION_UNITS));
				Runnable aCommandObject = (Runnable) (instantiateClass(anAvatar, NUM_ROTATION_UNITS));

				aCommandObject.run();
				
			
	}
	
	protected void doRotate() throws Exception {
    	setOriginalBounds();

		fractionComplete = 0;
		callRotate();
//		 try {
//			
//			Object anAvatar = BasicProjectIntrospection.getRealObject(avatar());
//		
//			Runnable aCommandObject = (Runnable) (rotateConstructor.newInstance(anAvatar, NUM_UNITS));
//			aCommandObject.run();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			assertTrue(e.getMessage(), false);
//		} 

	    
		 
	 }
	@Override
	protected boolean checkOutput(Object aLocatable) {
		boolean result = super.checkOutput(aLocatable);
		assertBoundsChanged();
		return result;
	}

	
	protected boolean doTest() throws Throwable {
		init();
		initConstructor();
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
