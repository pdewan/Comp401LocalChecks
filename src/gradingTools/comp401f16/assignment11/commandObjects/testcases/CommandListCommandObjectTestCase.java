package gradingTools.comp401f16.assignment11.commandObjects.testcases;

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
import java.lang.reflect.Method;

import util.assertions.Asserter;
import util.models.PropertyListenerRegisterer;

public class CommandListCommandObjectTestCase extends OneLevelListMovesTestCase  {
	
	Class moveCommandClass;
	Class commandListClass;
	Class avatarInterface;
	Constructor moveConstructor;
	Constructor commandListConstructor;
	Runnable commandList;
	Method addMethod;
	
	public CommandListCommandObjectTestCase() {
		
	}
	public void addToCommandList(Runnable aCommandObject) throws Exception {
		addMethod.invoke(commandList, aCommandObject);
		
	}
	
	protected void init() throws Throwable{
		moveCommandClass = BasicProjectIntrospection.findClassByTags("MoveCommand");
		commandListClass = BasicProjectIntrospection.findClassByTags("CommandList");
//		commandListClass = BasicProjectIntrospection.findClassByTags("CommandListCommand");

		avatarInterface = BasicProjectIntrospection.findInterface(TestAvatar.class);
		moveConstructor = moveCommandClass.getConstructor(
					 avatarInterface, Integer.TYPE, Integer.TYPE);
		addMethod = commandListClass.getMethod("add", Runnable.class);
		commandListConstructor = commandListClass.getConstructor();
		
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
			commandList = (Runnable) (commandListConstructor.newInstance());
			Runnable aCommand1 = createMoveCommand(0);
			Runnable aCommand2 = createMoveCommand(1);
			Runnable aCommand3 = createMoveCommand(2);
			Runnable aCommand4 = createMoveCommand(3);
			addToCommandList(aCommand1);
			addToCommandList(aCommand2);
			addToCommandList(aCommand3);
			addToCommandList(aCommand4);
			commandList.run();


		
			
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
