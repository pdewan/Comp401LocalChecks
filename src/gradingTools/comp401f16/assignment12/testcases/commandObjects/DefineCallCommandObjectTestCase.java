package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.MoveCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.commandObjects.testcases.RepeatCommandObjectTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.list.OneLevelListMovesTestCase;
import gradingTools.comp401f16.assignment11.testcases.parsing.repeat.OneLevelRepeatTestCase;
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
public class DefineCallCommandObjectTestCase extends RepeatCommandObjectTestCase  {
	public static final String PROCEDURE_NAME = "doMoveCommandObject";
//	Class moveCommandClass;
//	Class instantiatedClass;
	Class callClass;
//	Class avatarInterface;
//	Constructor moveConstructor;
	Constructor callConstructor;

//	Constructor constructor;
	Runnable defineCommand;
	Runnable callCommand;
	
	public DefineCallCommandObjectTestCase() {
		
	}
	/*
	 * Not doing a repeat, bad IS-A
	 */
	protected int numRepeats() {
		return 1;
	}
	
	public static Class findCallCommandClass() {
		return BasicProjectIntrospection.findClassByTags("CallCommand");
	}
	public static Class findDefineCommandClass() {
		return BasicProjectIntrospection.findClassByTags("DefineCommand");
	}
	
	protected void init() throws Throwable{
//		moveCommandClass = BasicProjectIntrospection.findClassByTags("MoveCommand");
		moveCommandClass = MoveCommandObjectTestCase.findMoveCommandClass();

		instantiatedClass = findDefineCommandClass();
		callClass = findCallCommandClass();
//		commandListClass = BasicProjectIntrospection.findClassByTags("CommandListCommand");

		avatarInterface = BasicProjectIntrospection.findInterface(TestAvatar.class);
		moveConstructor = moveCommandClass.getConstructor(
					 avatarInterface, Integer.TYPE, Integer.TYPE);
//		Constructor[] aConstructors = repeatClass.getConstructors();
//		repeatConstructor = repeatClass.getConstructor(Integer.TYPE, Runnable.class);
//		repeatConstructor = aConstructors[0];
		constructor = JavaIntrospectUtility.
				getConstructorISA(instantiatedClass, String.class, Runnable.class);
		callConstructor = callClass.getConstructor(String.class);
		

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
	
	@Override
	protected void doMove() {
		
		fractionComplete = 0;
		 try {
			
			Object anAvatar = BasicProjectIntrospection.getRealObject(avatar());
			Runnable aCommand1 = createMoveCommand(0);
			defineCommand = (Runnable) (constructor.newInstance(PROCEDURE_NAME, aCommand1));
			
			defineCommand.run();
			callCommand = (Runnable) (callConstructor.newInstance(PROCEDURE_NAME));
			callCommand.run();
		
			
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
