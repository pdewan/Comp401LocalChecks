package gradingTools.comp301ss21.assignment4.controller;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerFactoryMethodDefined;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerSingletonFromFactory;
import gradingTools.comp301ss21.assignment4.coordination.BroadcastingClearanceManagerFactoryMethodDefined;
import gradingTools.comp301ss21.assignment4.coordination.BroadcastingClearanceManagerSingletonFromFactory;
import gradingTools.comp301ss21.assignment4.coordination.LockstepAvatars;
import gradingTools.comp301ss21.assignment4.coordination.WaitingAvatars;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	SceneControllerISAnActionListener.class,
	SceneControllerRegistersAsActionListener.class,	
	SceneControllerCallsApproach.class,
	SceneControllerCallsSay.class,
	SceneControllerCallsPassed.class,
	SceneControllerCallsFailed.class,	
	SceneControllerApproachButtonProperty.class,
	SceneControllerSayButtonProperty.class,
	SceneControllerPassedButtonProperty.class,
	SceneControllerISAPropertyChangeListener.class,
	SceneControllerRegistersAsPropertyChangeListener.class,
	SceneControllerCallsSetEnabled.class,
	BridgeSceneSingletonFromFactory.class,
	SceneControllerSingletonFromFactory.class,
	SceneControllerButtonDynamics.class,

//ConsoleSceneView.class



})
public class SceneControllerButtons {

}
