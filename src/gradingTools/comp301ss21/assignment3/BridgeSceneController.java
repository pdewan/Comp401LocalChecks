package gradingTools.comp301ss21.assignment3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.junit.BasicJUnitUtils;
import gradingTools.basics.sharedTestCase.checkstyle.HiddenFieldTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.NamingConventionsTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanExpressionTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.SimplifyBooleanReturnTestCase;
import gradingTools.comp301ss21.assignment1.A1Main;
import gradingTools.comp301ss21.assignment1.A1Style;
import gradingTools.comp301ss21.assignment1.Angle;
import gradingTools.comp301ss21.assignment1.BridgeScene;
import gradingTools.comp301ss21.assignment1.BridgeSceneScale;
import gradingTools.comp301ss21.assignment1.RotatingLine;
import gradingTools.comp301ss21.assignment1.SS21Assignment1Suite;
import gradingTools.comp301ss21.assignment2.testcases.console_view.ConsoleSceneView;
import gradingTools.comp301ss21.assignment2.testcases.console_view.ConsoleSceneViewISAPropertyChangeListener;
import gradingTools.comp301ss21.assignment2.testcases.factory.A2MainCallsBridgeSceneFactoryMethod;
import gradingTools.comp301ss21.assignment2.testcases.factory.AvatarCallsLegFactoryMethod;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneFactoryMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewFactoryMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.LegsFactoryMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.factory.TaggedFactory;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.A2ExpectedSuperTypes;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.BoundedShapeHeightEditableProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.BoundedShapeHeightProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.BoundedShapeWidthEditableProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.BoundedShapeWidthProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.LocatableXEditableProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.LocatableXProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.LocatableYEditableProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.LocatableYProperty;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedBoundedShape;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import gradingTools.comp301ss21.assignment3.controller.ArthurBridgeSceneController;
import gradingTools.comp301ss21.assignment3.controller.GalahadBridgeSceneController;
import gradingTools.comp301ss21.assignment3.controller.LancelotBridgeSceneController;
import gradingTools.comp301ss21.assignment3.controller.RobinBridgeSceneController;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerAccessesArthur;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerAccessesGalahad;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerAccessesLancelot;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerAccessesRobin;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerFactoryMethodDefined;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerISAKeyListener;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerISAMouseListener;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerRegistersAsKeyListener;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerRegistersAsMouseListener;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerSingletonFromFactory;
import gradingTools.comp301ss21.assignment3.controller.TaggedBridgeSceneController;
import gradingTools.comp301ss21.assignment3.inheriting_view.A3MainCallsInheritingPainterFactoryMethod;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterDraws;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterFactoryMethodDefined;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterPaintDefined;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterRegistersWithLeftLine;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterRegistersWithLocatables;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterRepaints;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingViewISAPropertyChangeListener;
import gradingTools.comp301ss21.assignment3.inheriting_view.TaggedInheritingPainter;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuiteA7;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.ArthurBridgeSceneControllerTestCase;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.GalahadBridgeSceneControllerTestCase;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.LancelotBridgeSceneControllerTestCase;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.RobinBridgeSceneControllerTestCase;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaggedBridgeSceneController.class,
	SceneControllerFactoryMethodDefined.class,
	SceneControllerSingletonFromFactory.class,
	SceneControllerISAMouseListener.class,
	SceneControllerISAKeyListener.class,
	SceneControllerRegistersAsMouseListener.class,
	SceneControllerRegistersAsKeyListener.class,
	SceneControllerAccessesArthur.class,
	SceneControllerAccessesGalahad.class,
	SceneControllerAccessesLancelot.class,
	SceneControllerAccessesRobin.class,


	ArthurBridgeSceneController.class,
	LancelotBridgeSceneController.class,
	GalahadBridgeSceneController.class,
	RobinBridgeSceneController.class
	
//ConsoleSceneView.class



})
public class BridgeSceneController {

	
}
