package gradingTools.comp401f16.assignment9.testcases.bridgecontroller;

import grader.basics.project.BasicProjectIntrospection;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment9.testcases.Assignment9Suite;
import gradingTools.comp401f16.assignment9.testcases.factory.BridgeSceneControllerFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.factory.InheritingBridgeScenePainterFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.factory.ObservableBridgeScenePainterFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestBridgeSceneController;
import gradingTools.comp401f16.assignment9.testcases.interfaces.TestObservableBridgeScenePainter;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import util.annotations.MaxValue;
import util.misc.ThreadSupport;
import util.trace.Tracer;
@MaxValue(10)
public class ArthurBridgeSceneControllerTestCase 
	extends ConsoleSceneViewOutputTestCase 
	implements  Runnable{
	public static final double LISTENER_CREDIT =0.3;
	public static final double APPROACH_EVENTS_CREDIT = 0.5;
	public static final double Fail_EVENTS_CREDIT = 0.2;
	protected boolean failCalled = false;
	protected int numEventsFiredByApproach;
	protected int numEventsFiredByFail;
	protected static final int MOUSE_X = 50;
	protected static final int MOUSE_Y = 50;
	protected static final int MOVE_X_INCREMENT = 20;
	protected static final int MOVE_Y_INCREMENET = 20;
	
	protected Object observableBridgeScenePainter;
	protected Object inheritingBridgeScenePainter;
	protected Object delegatingBridgeSceneView;
	protected TestBridgeSceneController bridgeSceneController;
	protected boolean testSuccessful = false;
	protected void initState() {
		fractionComplete = 0;
		testSuccessful = false;
		
	}
	
	protected Component component;
	protected void createController() {
		try {
		Tracer.info(PassFailJUnitTestCase.class,"Trying to get bridge scene controller");
		bridgeSceneController = (TestBridgeSceneController) getObjectFromFactory(
				factoryClassTags(), 
				BridgeSceneControllerFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeSceneController.class);
		return;
		} catch (Error e) {
			fractionComplete = 0;
			assertTrue("Could not get bridge scene controller", false);
		}
		

	}
	protected void createView() {
		try {
			Tracer.info(PassFailJUnitTestCase.class,"Trying to get inheriting painter");
			inheritingBridgeScenePainter =  getObjectFromFactory(
					factoryClassTags(), 
					InheritingBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
					Component.class);
			Object realObject = BasicProjectIntrospection.getRealObject(inheritingBridgeScenePainter);
			component = (Component) realObject;
			if (realObject == null) {
				Tracer.info(PassFailJUnitTestCase.class,"Null inheriting painter");
			} else {
			return;
			}
			
			} catch (Error e) {
				Tracer.info(PassFailJUnitTestCase.class,"Could not find inheriting painter");

			}
		try  {
			Tracer.info(PassFailJUnitTestCase.class,"Trying to get observable painter");

		observableBridgeScenePainter = (TestObservableBridgeScenePainter) getObjectFromFactory(
				factoryClassTags(), 
				ObservableBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestObservableBridgeScenePainter.class);
		 
		Object realObject = BasicProjectIntrospection.getRealObject(observableBridgeScenePainter);
		component = (Component) realObject; // code duplication yuk
		if (realObject == null) {
			Tracer.info(PassFailJUnitTestCase.class,"Null observable painter");
			assertTrue("Could not find non null inheriting or observable painter", false);

		}
//		return bridgeScene;
		
		
		} catch (Error e) {
			fractionComplete = 0;
			Tracer.info(PassFailJUnitTestCase.class,"Could not find observable painter");
			assertTrue("Could not find inheriting or observable painter", false);
		}
		return;
	}
	@Override
	protected Object create() {
		
		bridgeScene = (TestBridgeScene) getObjectFromFactory(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		createView();
		createController();
		return bridgeScene;
//		try {
//			Tracer.info(this,"Trying to get inheriting painter");
//			inheritingBridgeScenePainter =  getOrCreateObject(
//					factoryClassTags(), 
//					InheritingBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
//					Object.class);
//			Object realObject = BasicProjectIntrospection.getRealObject(inheritingBridgeScenePainter);
//			component = (Component) realObject;
//			return bridgeScene;
//			
//			} catch (Error e) {
//				Tracer.info(this,"Could not find inheriting painter");
//
//			}
//		try  {
//			Tracer.info(this,"Trying to get observable painter");
//
//		observableBridgeScenePainter = (TestObservableBridgeScenePainter) getOrCreateObject(
//				factoryClassTags(), 
//				ObservableBridgeScenePainterFactoryMethodTest.FACTORY_METHOD_TAGS, 
//				TestObservableBridgeScenePainter.class);
//		Object realObject = BasicProjectIntrospection.getRealObject(observableBridgeScenePainter);
//		component = (Component) realObject; // code duplication yuk
//		return bridgeScene;
//		
//		
//		} catch (Exception e) {
//			Tracer.info(this,"Could not find observable painter");
//			assertTrue("Could not find inheriting or observable painter", false);
//		}
//		return null;
	}
	
	
   
    
	
		
	
	protected boolean doTest() throws Throwable {
		initState();		
		rootProxy = create();
		if (component == null) {
			assertTrue("Could not find painting component:", false);
		}

//		Thread aThread = new Thread(this);
//		aThread.start();
//		ThreadSupport.sleep(4000);
		run();
		Tracer.info(this,"Finished submiting events");
		assertTrue (
				"The x coordinate is not the same after first and second key type event ", 
				afterKeyType == afterSecondKeyType);
		
		

		return true;
		
		
	}
	public static MouseEvent buildMouseEvent(int x, int y, int type, Component origin) {
		Tracer.info(ArthurBridgeSceneControllerTestCase.class,"Building mouse event with component:" + origin);
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
    /*
     * Dispatching cannot be done until AWT thread finishes its tasks, it
     * is more realistic but requires new thread
     */
    protected void dispatchMouseClicked (int x, int y) {
    	MouseEvent aMousePressed = buildMousePressedEvent(x, y, component);
		MouseEvent aMouseReleased = buildMouseReleasedEvent(x, y, component);
		MouseEvent aMouseClicked = buildMouseClickedEvent(x, y, component);
		component.dispatchEvent(aMousePressed);
		component.dispatchEvent(aMouseReleased);
		component.dispatchEvent(aMouseClicked);
    }
    protected void callMouseClickedListeners (int x, int y) {
    	MouseEvent aMousePressed = buildMousePressedEvent(x, y, component);
		MouseEvent aMouseReleased = buildMouseReleasedEvent(x, y, component);
		MouseEvent aMouseClicked = buildMouseClickedEvent(x, y, component);
		bridgeSceneController.mousePressed(aMousePressed);
		bridgeSceneController.mouseReleased(aMouseReleased);
		bridgeSceneController.mouseClicked(aMouseReleased);
	
    }
   
    protected void dispatchKeyAClicked () {
    	KeyEvent aKeyPressed = buildKeyEvent('a', KeyEvent.VK_A, KeyEvent.KEY_PRESSED, component);
    	KeyEvent aKeyTyped =	buildKeyEvent('a', KeyEvent.VK_UNDEFINED, KeyEvent.KEY_TYPED, component);
		KeyEvent aKeyReleased = buildKeyEvent('a', KeyEvent.VK_A, KeyEvent.KEY_RELEASED, component);
		component.dispatchEvent(aKeyPressed);
		component.dispatchEvent(aKeyTyped);
		component.dispatchEvent(aKeyReleased);

    }
    
    protected void callKeyAClickedListeners () {
    	KeyEvent aKeyPressed = buildKeyEvent('a', KeyEvent.VK_A, KeyEvent.KEY_PRESSED, component);
    	KeyEvent aKeyTyped =	buildKeyEvent('a', KeyEvent.VK_UNDEFINED, KeyEvent.KEY_TYPED, component);
		KeyEvent aKeyReleased = buildKeyEvent('a', KeyEvent.VK_A, KeyEvent.KEY_RELEASED, component);
		bridgeSceneController.keyPressed(aKeyPressed);
		bridgeSceneController.keyTyped(aKeyTyped);
		bridgeSceneController.keyReleased(aKeyReleased);


    }
    protected void dispatchKeyClicked () {
    	dispatchKeyAClicked();
//    	callKeyAClickedListeners();
    }
    protected void callKeyClickedListeners () {
    	callKeyAClickedListeners();
    }
    
    protected int getX() {
    	return bridgeScene.getArthur().getArms().getLeftLine().getX();
    }
    protected void move() {
		bridgeScene.getArthur().move(MOVE_X_INCREMENT, MOVE_Y_INCREMENET);
    }
    protected int beforeClickX, beforeKeyType, afterKeyType, afterMove, afterSecondKeyType;
	@Override
	public void run() {
		beforeClickX = getX();
		Tracer.info(this,"Before Mouse Click, x = " + beforeClickX);
		callMouseClickedListeners(MOUSE_X, MOUSE_Y);

		beforeKeyType=  getX();
		Tracer.info(this,"Before Key Type, x = " + beforeKeyType);
//		dispatchKeyClicked();
		callKeyClickedListeners();
		afterKeyType = getX();
		Tracer.info(this,"After Key Type, x = " + afterKeyType);
		move();
		afterMove = getX();
		Tracer.info(this,"After Move , x = " + afterMove);
		testSuccessful = afterMove != afterKeyType;
		if (!testSuccessful) {
			Tracer.info(this,"MOVE DID NOT WORK, no change after move");
		}
//		dispatchKeyClicked();
		callKeyClickedListeners();
		afterSecondKeyType = getX();
		Tracer.info(this,"After Second Key Type, x = " + afterSecondKeyType);
		testSuccessful = testSuccessful && ( afterSecondKeyType == afterKeyType);
		if (testSuccessful) {
			Tracer.info(this,"TEST SUCCESSFUL, x is the same after first and second key type event");
		} else {
			Tracer.info(this,"TEST FAILED, x is not the same after first and second key type event");
		}

		
		
//		MouseEvent aMousePressed = buildMousePressedEvent(0, 0, component);
//		MouseEvent aMouseReleased = buildMouseReleasedEvent(0, 0, component);
//		MouseEvent aMouseClicked = buildMouseClickedEvent(0, 0, component);
//		component.dispatchEvent(aMousePressed);
//		component.dispatchEvent(aMouseReleased);
//		component.dispatchEvent(aMouseClicked);
		

	}
	
}
