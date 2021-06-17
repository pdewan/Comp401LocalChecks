package gradingTools.comp301ss21.assignment4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment3.controller.SceneControllerFactoryMethodDefined;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerApproachButtonProperty;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerCallsApproach;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerCallsFailed;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerCallsPassed;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerCallsSay;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerISAnActionListener;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerPassedButtonProperty;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerRegistersAsActionListener;
import gradingTools.comp301ss21.assignment4.controller.SceneControllerSayButtonProperty;
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

//ConsoleSceneView.class



})
public class SceneControllerButtons {

}
