package gradingTools.comp301ss21.assignment4.exceptions;

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
import gradingTools.comp301ss21.assignment2.testcases.console_view.ConsoleSceneViewGetsBridgeScene;
import gradingTools.comp301ss21.assignment2.testcases.console_view.ConsoleSceneViewPrintsPropertyChangeEvent;
import gradingTools.comp301ss21.assignment2.testcases.console_view.ConsoleSceneViewRegistersWithLocatables;
import gradingTools.comp301ss21.assignment2.testcases.console_view.TaggedConsoleSceneView;
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
import gradingTools.comp301ss21.assignment4.abstractclasses.AbstractBoundedShape;
import gradingTools.comp301ss21.assignment4.abstractclasses.AbstractLocatable;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuiteA7;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaggedImpossibleAngle.class,
	CheckedImpossibleAngle.class,
	TaggedLegs.class,
	TaggedRestrictedLine.class,
	ArthurIsNotAContortionist.class,

//ConsoleSceneView.class



})
public class Exceptions {

	

}
