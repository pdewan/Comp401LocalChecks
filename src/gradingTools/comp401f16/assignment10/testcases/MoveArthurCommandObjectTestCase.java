package gradingTools.comp401f16.assignment10.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.models.PropertyListenerRegisterer;

public class MoveArthurCommandObjectTestCase extends BridgeSceneArthurMoveLeftArmTestCase  {
	

//	public MoveArthurCommandObjectTestCase() {
//		factoryMethodTags = BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS;
//	}
	
//	protected void createBridgeScene() {
//		bridgeScene = (TestBridgeScene) getOrCreateObject(
//				factoryClassTags(), 
//				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
//				TestBridgeScene.class);
//	}
//	
//	
	@Override
	protected void doMove() {
		 
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
