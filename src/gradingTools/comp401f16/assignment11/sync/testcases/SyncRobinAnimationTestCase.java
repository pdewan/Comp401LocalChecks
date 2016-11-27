package gradingTools.comp401f16.assignment11.sync.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncLancelotAnimationTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.models.PropertyListenerRegisterer;

public class SyncRobinAnimationTestCase extends SyncArthurAnimationTestCase {
	
	protected void executeOperations(Object aProxy) {
		System.out.println ("Animating Robin");
		commandInterpreter().asynchronousRobin();
		System.out.println ("Animating Robin");
		commandInterpreter().asynchronousRobin();
	}
	protected TestAvatar avatar() {
		return bridgeScene.getRobin();
	}
}
