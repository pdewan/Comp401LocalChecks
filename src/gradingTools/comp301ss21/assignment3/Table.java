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
import gradingTools.comp301ss21.assignment3.inheriting_view.A3MainCallsInheritingPainterFactoryMethod;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterDraws;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterFactoryMethodDefined;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterPaintDefined;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterRegistersWithLeftLine;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterRegistersWithLocatables;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterRepaints;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingViewISAPropertyChangeListener;
import gradingTools.comp301ss21.assignment3.inheriting_view.TaggedInheritingPainter;
import gradingTools.comp301ss21.assignment3.table.A3MainCallsGet;
import gradingTools.comp301ss21.assignment3.table.A3MainCallsPut;
import gradingTools.comp301ss21.assignment3.table.AvatarTableFactoryMethodDefined;
import gradingTools.comp301ss21.assignment3.table.AvatarTableSemantics;
import gradingTools.comp301ss21.assignment3.table.BridgeSceneAvatarApproachCalled;
import gradingTools.comp301ss21.assignment3.table.BridgeSceneCallsAvatarTableFactoryMethod;
import gradingTools.comp301ss21.assignment3.table.BridgeSceneStringApproachMethodDefined;
import gradingTools.comp301ss21.assignment3.table.NoIllegalGetOrPut;
import gradingTools.comp301ss21.assignment3.table.TableIsGeneric;
import gradingTools.comp301ss21.assignment3.table.TableSemantics;
import gradingTools.comp301ss21.assignment3.table.TaggedTable;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.StringTableTest;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuiteA7;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	TaggedTable.class,
	NoIllegalGetOrPut.class,
	TableSemantics.class,
	TableIsGeneric.class,
	AvatarTableFactoryMethodDefined.class,
	BridgeSceneCallsAvatarTableFactoryMethod.class,
	BridgeSceneStringApproachMethodDefined.class,
	BridgeSceneAvatarApproachCalled.class,
	AvatarTableSemantics.class,
	A3MainCallsPut.class,
	A3MainCallsGet.class,
	
//ConsoleSceneView.class



})
public class Table {

	
}
