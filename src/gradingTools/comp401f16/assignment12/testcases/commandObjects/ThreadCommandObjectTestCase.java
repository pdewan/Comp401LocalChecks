package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.MoveCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.RepeatCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.OneLevelRepeatTestCase;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.ThreadCommandTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import util.annotations.MaxValue;
import util.assertions.Asserter;
import util.introspect.JavaIntrospectUtility;
import util.models.PropertyListenerRegisterer;
@MaxValue(20)
public class ThreadCommandObjectTestCase extends ThreadCommandTestCase  {
	public static final String TAG = "ThreadCommand";

//	Class instantiatedClass;
//	Class avatarInterface;
//	Constructor moveConstructor;
//	Constructor constructor;
	Runnable threadCommand;

	
	
	public ThreadCommandObjectTestCase() {
		
	}
	
	public static Class findThreadCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
	protected String instantiatedTag() {
		return TAG;
	}	
	protected Class[] constructorArgs() {
		return new Class[] {String.class};
	}
	protected void doThread() throws Exception {
		
//		instantiatedClass = findThreadCommandClass();
//		constructor = instantiatedClass.getConstructor(String.class);
//		threadCommand = (Runnable) (constructor.newInstance(PROCEDURE_NAME));

		threadCommand = (Runnable) instantiateClass(PROCEDURE_NAME);
		threadCommand.run();
	
		
	}
	protected void init() throws Throwable{

//		instantiatedClass = findThreadCommandClass();
//
//		
//		constructor = instantiatedClass.getConstructor(String.class);
		

	}
//	protected Runnable createMoveCommand (int anIndex) throws Exception {
//		int anXDelta = INPUT_STUDENT_X_DELTAS[anIndex];
//		int aYDelta =INPUT_STUDENT_Y_DELTAS[anIndex];
//		return createMoveCommand(anXDelta, aYDelta);
//	}
	
//	protected Runnable createMoveCommand(int anXDelta, int aYDelta) throws Exception {
//		
//				
//				Object anAvatar = BasicProjectIntrospection.getRealObject(avatar());
//			
//				Runnable aCommandObject = (Runnable) (moveConstructor.newInstance(anAvatar, anXDelta, aYDelta));
//				return aCommandObject;
//				
//			
//	}
	
//	@Override
//	protected void doMove() throws Exception {
//		
//		fractionComplete = 0;
////		 try {
//			
//			
//			threadCommand = (Runnable) (threadConstructor.newInstance(PROCEDURE_NAME));
//			threadCommand.run();
//		
//			
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////			assertTrue(e.getMessage(), false);
////		} 
//
////		Runnable aMoveCommandObject = (Runnable)
////			BasicProjectIntrospection.
////				createInstance(Runnable.class, avatar(), inputXDelta(), inputYDelta()));
////			    
//		 
//	 }
	    	
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
