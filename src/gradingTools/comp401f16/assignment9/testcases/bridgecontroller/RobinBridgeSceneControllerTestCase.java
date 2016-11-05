package gradingTools.comp401f16.assignment9.testcases.bridgecontroller;

import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment9.testcases.Assignment9Suite;
import gradingTools.comp401f16.assignment9.testcases.factory.InheritingBridgeScenePainterFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.factory.ObservableBridgeScenePainterFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestObservableBridgeScenePainter;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import util.annotations.MaxValue;
import util.misc.ThreadSupport;
@MaxValue(10)
public class RobinBridgeSceneControllerTestCase 
	extends ArthurBridgeSceneControllerTestCase 
	{
	
	
    protected void dispatchKeyRClicked () {
    	KeyEvent aKeyPressed = buildKeyEvent('r', KeyEvent.VK_R, KeyEvent.KEY_PRESSED, component);
    	KeyEvent aKeyTyped =	buildKeyEvent('r', KeyEvent.VK_UNDEFINED, KeyEvent.KEY_TYPED, component);
		KeyEvent aKeyReleased = buildKeyEvent('r', KeyEvent.VK_R, KeyEvent.KEY_RELEASED, component);
		component.dispatchEvent(aKeyPressed);
		component.dispatchEvent(aKeyTyped);
		component.dispatchEvent(aKeyReleased);

    }
    protected void dispatchKeyClicked () {
    	dispatchKeyRClicked();
    }
    protected void callKeyRClickedListeners () {
    	KeyEvent aKeyPressed = buildKeyEvent('r', KeyEvent.VK_R, KeyEvent.KEY_PRESSED, component);
    	KeyEvent aKeyTyped =	buildKeyEvent('r', KeyEvent.VK_UNDEFINED, KeyEvent.KEY_TYPED, component);
		KeyEvent aKeyReleased = buildKeyEvent('r', KeyEvent.VK_R, KeyEvent.KEY_RELEASED, component);
		bridgeSceneController.keyPressed(aKeyPressed);
		bridgeSceneController.keyTyped(aKeyTyped);
		bridgeSceneController.keyReleased(aKeyReleased);
    }
    
   
    protected void callKeyClickedListeners () {
    	callKeyRClickedListeners();
    }
    
    protected int getX() {
    	return bridgeScene.getRobin().getArms().getLeftLine().getX();
    }
    protected void move() {
		bridgeScene.getRobin().move(100, 100);
    }
   
	
}
