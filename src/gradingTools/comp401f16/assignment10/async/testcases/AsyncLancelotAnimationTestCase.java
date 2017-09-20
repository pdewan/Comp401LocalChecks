package gradingTools.comp401f16.assignment10.async.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.models.PropertyListenerRegisterer;
import util.trace.Tracer;

public class AsyncLancelotAnimationTestCase extends AsyncArthurAnimationTestCase implements PropertyChangeListener {
	
	protected void executeOperations(Object aProxy) {
		recordPreviousThreads();
		Tracer.info(this,"Animating Lancelot");
		commandInterpreter().asynchronousLancelot();
		recordCurrentThreads();
		assertNewThreadCreated();
	}
	protected TestAvatar avatar() {
		return bridgeScene.getLancelot();
	}
}
