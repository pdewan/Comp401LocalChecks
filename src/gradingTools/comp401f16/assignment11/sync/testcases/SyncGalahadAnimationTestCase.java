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
import util.trace.Tracer;

public class SyncGalahadAnimationTestCase extends SyncArthurAnimationTestCase {
	
	protected void doAsynchronousGalahad() {
		commandInterpreter().asynchronousGalahad();
//		bridgeScene.asynchronousGalahad();
//		doAsynchronousArthur();
	}
	protected void executeOperations(Object aProxy) {
		Tracer.info(this,"Animating Galahad");
		doAsynchronousGalahad();
//		commandInterpreter().asynchronousGalahad();
		Tracer.info(this,"Animating Galahad");
		doAsynchronousGalahad();
//		commandInterpreter().asynchronousGalahad();
	}
	protected TestAvatar avatar() {
		return bridgeScene.getGalahad();
	}
}
