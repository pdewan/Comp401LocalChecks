package gradingTools.comp401f16.assignment12.waitnotify.testcases;

import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment10.async.testcases.AsyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment11.sync.testcases.SyncArthurAnimationTestCase;
import gradingTools.comp401f16.assignment12.testcases.BroadcastingClearanceManagerFactoryMethodTest;
import gradingTools.comp401f16.assignment12.testcases.interfaces.BroadcastingClearanceManager;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestCommandInterpreter;
import gradingTools.comp401f16.assignment7.testcases.interfaces.TestErrorResilientCommandInterpreter;
import gradingTools.shared.testcases.FactoryMethodTest;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.models.PropertyListenerRegisterer;

public class WaitingAvatarsAnimationTestCase extends AsyncArthurAnimationTestCase {
	protected Thread child2Thread, child3Thread, child4Thread;
	BroadcastingClearanceManager broadcastingClearanceManager;
	protected void createClearanceManager() {
		broadcastingClearanceManager = (BroadcastingClearanceManager) getOrCreateObject(
				factoryClassTags(), 
				BroadcastingClearanceManagerFactoryMethodTest.FACTORY_METHOD_TAGS, 
				BroadcastingClearanceManager.class);
	}
	protected void initData() {		
		super.initData();
		broadcastingClearanceManager = null;
	}
	protected void executeOperations(Object aProxy) {
			fractionComplete = 0;
			System.out.println ("Animating waiting Arthur");
			commandInterpreter().animateArthurWithWait();
			System.out.println ("Animating waiting Lancelot");
			commandInterpreter().animateLancelotWithWait();
			System.out.println ("Animating waiting Galahad");
			commandInterpreter().animateGalahadWithWait();
			System.out.println ("Animating waiting Robin");
			commandInterpreter().animateRobinWithWait();
			waitForStartedChildThreads();
			if (childThread != null) {				
				assertTrue("At least one thread created before proceedAll", false);				
			}
			
			broadcastingClearanceManager.proceedAll();
			waitForStartedChildThreads();
			
		}	
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		super.propertyChange(evt);
		Thread aChildThread = Thread.currentThread();		
		if (currentThreads.contains(aChildThread)) {
			return;
		}
		System.out.println("New thread:" + aChildThread);
		currentThreads.add(aChildThread);		
	}
 }
