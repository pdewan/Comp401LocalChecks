package gradingTools.comp301ss21.assignment4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment4.coordination.BroadcastingClearanceManagerFactoryMethodDefined;
import gradingTools.comp301ss21.assignment4.coordination.BroadcastingClearanceManagerSingletonFromFactory;
import gradingTools.comp301ss21.assignment4.coordination.LockstepAvatars;
import gradingTools.comp301ss21.assignment4.coordination.WaitingAvatars;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	BroadcastingClearanceManagerFactoryMethodDefined.class,
	BroadcastingClearanceManagerSingletonFromFactory.class,
	WaitingAvatars.class,
	LockstepAvatars.class,
//ConsoleSceneView.class



})

public class CoordinatedAnimation {

}
