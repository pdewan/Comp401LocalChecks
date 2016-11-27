package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment12.testcases.commandInterpreterA12.SleepCommandTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;
import gradingTools.shared.testcases.MethodExecutionTest;
import gradingTools.shared.testcases.ProxyTest;

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
public class SleepCommandObjectTestCase extends SleepCommandTestCase  {
//	protected Class instantiatedClass;
//	protected Constructor constructor;

	public static Class findSleepCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
	public static final String TAG = "SleepCommand";

	protected String instantiatedTag() {
		return TAG;
	}	
	protected Class[] constructorArgs() {
		return new Class[] {Long.TYPE};
	}
//	public static Constructor findSleepConstructor(Class aClass) throws Exception {
//		return aClass.getConstructor(
//				 Long.TYPE);
//	}
	protected void executeSleep() throws Exception  {
		createSleepCommandObject().run();
	}
//	public static long presleepTime() {
//		long aPresleepTime = System.currentTimeMillis();
//	    System.out.println ("Pre sleep time:" + aPresleepTime);
//	    System.out.println ("Sleeping for (ms):" + SLEEP_TIME);
//	    return aPresleepTime;
//		
//	}
//	public static boolean checkSleep(long aPresleepTime, long aSleepTime ) {
//		long aPostsleepTime = System.currentTimeMillis();
//		 System.out.println ("Post sleep time:" + aPostsleepTime);
//		 return
//				 (aPostsleepTime - aPresleepTime) > SLEEP_TIME;
//	}
	
	protected Runnable createSleepCommandObject() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		return (Runnable) (constructor.newInstance(SLEEP_TIME));
	}
	
	protected void doSleep() {
		 try {
			 long aPresleepTime = presleepTime();
//			Runnable aCommandObject = (Runnable) (constructor.newInstance(SLEEP_TIME));
			Runnable aCommandObject = (Runnable) (instantiateClass(SLEEP_TIME));

			aCommandObject.run();

		
			 assertTrue ("Did not sleep for minimum time:" , 
					 checkSleep(aPresleepTime, SLEEP_TIME));
			
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
//	protected void initSleepConstructor() throws Exception {
//		instantiatedClass = findSleepCommandClass();
//		assertTrue("Could not find sleep class ", instantiatedClass != null);
//		constructor = findSleepConstructor(instantiatedClass);
//	}
	
	protected boolean doTest() throws Throwable {
//		initSleepConstructor();
		initConstructor();
		return super.doTest();		
	}


}
