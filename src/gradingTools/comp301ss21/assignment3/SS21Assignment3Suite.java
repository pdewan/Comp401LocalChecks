package gradingTools.comp301ss21.assignment3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import grader.basics.config.BasicExecutionSpecificationSelector;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.BasicJUnitUtils;
import grader.basics.junit.GradableJUnitSuite;
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
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneFactoryMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewSingletonFromFactory;
import gradingTools.comp301ss21.assignment3.delegating_view.NewPaintListener;
import gradingTools.comp301ss21.assignment3.inheriting_view.A3MainCallsInheritingPainterFactoryMethod;
import gradingTools.comp301ss21.assignment3.inheriting_view.InheritingPainterFactoryMethodDefined;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuiteA7;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import gradingTools.comp401f16.assignment9.testcases.bridgecontroller.BridgeSceneControllerSuite;
import gradingTools.comp401f16.assignment9.testcases.factory.ExtraCreditFactoryMethodSuiteA9;
import gradingTools.comp401f16.assignment9.testcases.factory.FactoryMethodSuiteA9;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.NewPaintListenerTestCase;
import gradingTools.comp401f16.assignment9.testcases.observablepainter.ObservablePainterSuite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	A3Observables.class,
	A3ConsoleSceneView.class,
	InheritingPainter.class,
	DelegatingPainter.class,
	BridgeSceneController.class,
	NewPaintListener.class,
	Table.class,
	A3Style.class,
	A3MainCallsSetVisible.class
//	InheritingPainterFactoryMethodDefined.class,
//	A3MainCallsInheritngPainterFactoryMethod.class,
//	FactoryMethodSuiteA9.class,
//	ExtraCreditFactoryMethodSuiteA9.class,
//	ObservablePainterSuite.class,
//	BridgeSceneControllerSuite.class



})

public class SS21Assignment3Suite {
	static boolean runNewPaintListenerTest;
	public static void setRunNewPaintListenerTest(boolean newVal) {
		runNewPaintListenerTest = newVal;
		
	}
	
	public static boolean isRunNewPaintListenerTest() {
		return runNewPaintListenerTest;
		
	}

	public static final String MAIN_CLASS_NAME = "main.Assignment3";

	public static void main (String[] args) {
		try {
			BasicProjectExecution.setUseProcessTimeOut(false);
			GradableJUnitSuite aTopSuite = BasicJUnitUtils.interactiveTest(SS21Assignment3Suite.class);
			if (isRunNewPaintListenerTest()) {
			aTopSuite.test(NewPaintListener.class);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static {
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setCheckStyleConfiguration("unc_checks_301_A3.xml");
	}

}
