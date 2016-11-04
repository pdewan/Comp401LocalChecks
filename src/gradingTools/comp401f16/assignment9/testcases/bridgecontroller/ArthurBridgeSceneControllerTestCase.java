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
public class ArthurBridgeSceneControllerTestCase 
	extends ConsoleSceneViewOutputTestCase 
	implements  Runnable{
	public static final double LISTENER_CREDIT =0.3;
	public static final double APPROACH_EVENTS_CREDIT = 0.5;
	public static final double FAILED_EVENTS_CREDIT = 0.2;
	protected boolean failedCalled = false;
	protected int numEventsFiredByApproach;
	protected int numEventsFiredByFailed;
	
	protected Object observableBridgeScenePainter;
	protected Object inheritingBridgeScenePainter;
	protected Object delegatingBridgeSceneView;
	protected boolean testSuccessful = false;
	protected void initState() {
		fractionComplete = 0;
		testSuccessful = false;
		
	}
	
	protected Component component;
	@Override
	protected Object create() {
		
		bridgeScene = (TestBridgeScene) getOrCreateObject(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		try {
			System.out.println("Trying to get inheriting painter");
			inheritingBridgeScenePainter =  getOrCreateObject(
					factoryClassTags(), 
					InheritingBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
					Object.class);
			Object realObject = BasicProjectIntrospection.getRealObject(inheritingBridgeScenePainter);
			component = (Component) realObject;
			return bridgeScene;
			
			} catch (Error e) {
				System.out.println("Could not find inheriting painter");

			}
		try  {
			System.out.println("Trying to get observable painter");

		observableBridgeScenePainter = (TestObservableBridgeScenePainter) getOrCreateObject(
				factoryClassTags(), 
				ObservableBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestObservableBridgeScenePainter.class);
		Object realObject = BasicProjectIntrospection.getRealObject(observableBridgeScenePainter);
		component = (Component) realObject; // code duplication yuk
		return bridgeScene;
		
		
		} catch (Exception e) {
			System.out.println ("Could not find observable painter");
			assertTrue("Could not find inheriting or observable painter", false);
		}
		return null;
	}
	
	
   
    
	
		
	
	protected boolean doTest() throws Throwable {
		initState();		
		rootProxy = create();

		Assignment9Suite.invokeMain();
		Thread aThread = new Thread(this);
		aThread.start();
		ThreadSupport.sleep(4000);
		System.out.println ("Finished submiting events");
		assertTrue (
				"C is not the same after first and second key type event ", 
				afterKeyType == afterSecondKeyType);
		
		

		return true;
		
		
	}
	public static MouseEvent buildMouseEvent(int x, int y, int type, Component origin) {
        return new MouseEvent(origin, type, System.currentTimeMillis(), 0, x, y, type == MouseEvent.MOUSE_CLICKED ? 1:0, false);
    }
	public static MouseEvent buildMousePressedEvent(int x, int y,  Component origin) {
        return buildMouseEvent(x, y, MouseEvent.MOUSE_PRESSED, origin);
    }
	public static MouseEvent buildMouseReleasedEvent(int x, int y,  Component origin) {
        return buildMouseEvent(x, y, MouseEvent.MOUSE_RELEASED, origin);
    }
	public static MouseEvent buildMouseClickedEvent(int x, int y,  Component origin) {
        return buildMouseEvent(x, y, MouseEvent.MOUSE_CLICKED, origin);
    }
    
    
    public static KeyEvent buildKeyEvent(char c, int keyCode, int type, Component origin) {
        int location;
        if (type == KeyEvent.KEY_TYPED) {
            keyCode = KeyEvent.VK_UNDEFINED;
            location = KeyEvent.KEY_LOCATION_UNKNOWN;
        } else {
            location = KeyEvent.KEY_LOCATION_STANDARD;
        }
        
        return new KeyEvent(origin, type, System.currentTimeMillis(), 0, keyCode, c, location);
    }
    public static KeyEvent buildKeyTypedEvent(char c, int keyCode, Component origin) {
    	return buildKeyEvent(c, keyCode, KeyEvent.KEY_TYPED, origin);
    }
    protected void dispatchMouseClicked (int x, int y) {
    	MouseEvent aMousePressed = buildMousePressedEvent(x, y, component);
		MouseEvent aMouseReleased = buildMouseReleasedEvent(x, y, component);
		MouseEvent aMouseClicked = buildMouseClickedEvent(x, y, component);
		component.dispatchEvent(aMousePressed);
		component.dispatchEvent(aMouseReleased);
		component.dispatchEvent(aMouseClicked);
    }
   
    protected void dispatchKeyAClicked () {
    	KeyEvent aKeyPressed = buildKeyEvent('a', KeyEvent.VK_A, KeyEvent.KEY_PRESSED, component);
    	KeyEvent aKeyTyped =	buildKeyEvent('a', KeyEvent.VK_UNDEFINED, KeyEvent.KEY_TYPED, component);
		KeyEvent aKeyReleased = buildKeyEvent('a', KeyEvent.VK_A, KeyEvent.KEY_RELEASED, component);
		component.dispatchEvent(aKeyPressed);
		component.dispatchEvent(aKeyTyped);
		component.dispatchEvent(aKeyReleased);

    }
    protected void dispatchKeyClicked () {
    	dispatchKeyAClicked();
    }
    
    protected int getX() {
    	return bridgeScene.getArthur().getArms().getLeftLine().getX();
    }
    protected void move() {
		bridgeScene.getArthur().move(100, 100);
    }
    protected int beforeClickX, beforeKeyType, afterKeyType, afterMove, afterSecondKeyType;
	@Override
	public void run() {
		beforeClickX = getX();
		System.out.println ("Before Mouse Click, x = " + beforeClickX);
		dispatchMouseClicked(0, 0);

		beforeKeyType=  getX();
		System.out.println ("Before Key Type, x = " + beforeKeyType);
		dispatchKeyClicked();
		afterKeyType = getX();
		System.out.println ("After Key Type, x = " + afterKeyType);
		move();
		afterMove = getX();
		System.out.println ("After Move Type, x = " + afterMove);
		dispatchKeyClicked();
		afterSecondKeyType = getX();
		System.out.println ("Before Second Key Type, x = " + afterSecondKeyType);
		testSuccessful = afterSecondKeyType == afterKeyType;
		if (testSuccessful) {
			System.out.println ("TEST SUCCESSFUL, x is the same after first and second key type event");
		} else {
			System.out.println ("TEST FAILeD, x is not the same after first and second key type event");
		}

		
		
//		MouseEvent aMousePressed = buildMousePressedEvent(0, 0, component);
//		MouseEvent aMouseReleased = buildMouseReleasedEvent(0, 0, component);
//		MouseEvent aMouseClicked = buildMouseClickedEvent(0, 0, component);
//		component.dispatchEvent(aMousePressed);
//		component.dispatchEvent(aMouseReleased);
//		component.dispatchEvent(aMouseClicked);
		

	}
	
}
