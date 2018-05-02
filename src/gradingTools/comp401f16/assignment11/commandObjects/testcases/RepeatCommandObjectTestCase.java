package gradingTools.comp401f16.assignment11.commandObjects.testcases;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.commandObjects.testcases.MoveCommandObjectTestCase;
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
import util.trace.Tracer;
@MaxValue(10)
public class RepeatCommandObjectTestCase extends OneLevelRepeatTestCase  {
	
	protected Class moveCommandClass;
	protected Class repeatClass;
	protected Class avatarInterface;
	protected Constructor moveConstructor;
	protected Constructor repeatConstructor;
	protected Runnable repeatCommand;
	
	public RepeatCommandObjectTestCase() {
		
	}
	
	public static Class findRepeatCommandClass() {
		return BasicProjectIntrospection.findClassByTags("RepeatCommand");
	}
	
	protected void init() throws Throwable{
		moveCommandClass = MoveCommandObjectTestCase.findMoveCommandClass();
//		moveCommandClass = BasicProjectIntrospection.findClassByTags("MoveCommand");
		repeatClass = findRepeatCommandClass();
//		commandListClass = BasicProjectIntrospection.findClassByTags("CommandListCommand");

		avatarInterface = BasicProjectIntrospection.findInterface(TestAvatar.class);
		moveConstructor = moveCommandClass.getConstructor(
					 avatarInterface, Integer.TYPE, Integer.TYPE);
//		Constructor[] aConstructors = repeatClass.getConstructors();
//		repeatConstructor = repeatClass.getConstructor(Integer.TYPE, Runnable.class);
//		repeatConstructor = aConstructors[0];
		repeatConstructor = JavaIntrospectUtility.
				getConstructorISA(repeatClass, Integer.TYPE, Runnable.class);
		

	}
	protected Runnable createMoveCommand (int anIndex) throws Exception {
		int anXDelta = INPUT_STUDENT_X_DELTAS[anIndex];
		int aYDelta =INPUT_STUDENT_Y_DELTAS[anIndex];
		return createMoveCommand(anXDelta, aYDelta);
	}
	
	protected Runnable createMoveCommand(int anXDelta, int aYDelta) throws Exception {
		
				
				Object anAvatar = BasicProjectIntrospection.getRealObject(avatar());
			
				Runnable aCommandObject = (Runnable) (moveConstructor.newInstance(anAvatar, anXDelta, aYDelta));
				return aCommandObject;
				
			
	}
	
	@Override
	protected void doMove() {
		
		fractionComplete = 0;
		 try {
			
			Object anAvatar = BasicProjectIntrospection.getRealObject(avatar());
			Runnable aCommand1 = createMoveCommand(0);
			repeatCommand = (Runnable) (repeatConstructor.newInstance(NUM_REPEATS, aCommand1));
//			Tracer.info(this, "Calling run method on:" + repeatCommand);
//			repeatCommand.run();
			invokeRunMethod(repeatCommand);

		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(e.getMessage(), false);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

//		Runnable aMoveCommandObject = (Runnable)
//			BasicProjectIntrospection.
//				createInstance(Runnable.class, avatar(), inputXDelta(), inputYDelta()));
//			    
		 
	 }
	    	
	public boolean doTest() throws Throwable {
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
