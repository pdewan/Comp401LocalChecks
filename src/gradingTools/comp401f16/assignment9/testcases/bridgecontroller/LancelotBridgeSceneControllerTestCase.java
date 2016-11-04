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
public class LancelotBridgeSceneControllerTestCase 
	extends ArthurBridgeSceneControllerTestCase 
	{
	
	
    protected void dispatchKeyLClicked () {
    	KeyEvent aKeyPressed = buildKeyEvent('l', KeyEvent.VK_L, KeyEvent.KEY_PRESSED, component);
    	KeyEvent aKeyTyped =	buildKeyEvent('l', KeyEvent.VK_UNDEFINED, KeyEvent.KEY_TYPED, component);
		KeyEvent aKeyReleased = buildKeyEvent('l', KeyEvent.VK_L, KeyEvent.KEY_RELEASED, component);
		component.dispatchEvent(aKeyPressed);
		component.dispatchEvent(aKeyTyped);
		component.dispatchEvent(aKeyReleased);

    }
    protected void dispatchKeyClicked () {
    	dispatchKeyLClicked();
    }
    
    protected int getX() {
    	return bridgeScene.getLancelot().getArms().getLeftLine().getX();
    }
    protected void move() {
		bridgeScene.getLancelot().move(100, 100);
    }
   
	
}
