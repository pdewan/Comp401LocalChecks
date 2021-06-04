package gradingTools.comp301ss21.assignment2;

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
import gradingTools.comp301ss21.assignment2.testcases.ConsoleSceneView;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.style.A2NoHiddenFields;
import gradingTools.comp301ss21.assignment2.testcases.style.A2CommonPropertiesAreInherited;
import gradingTools.comp301ss21.assignment2.testcases.style.A2CommonSignaturesAreInherited;
import gradingTools.comp301ss21.assignment2.testcases.style.A2Encapsulation;
import gradingTools.comp301ss21.assignment2.testcases.style.A2InterfaceAsType;
import gradingTools.comp301ss21.assignment2.testcases.style.A2MnemonicNames;
import gradingTools.comp301ss21.assignment2.testcases.style.A2NonPublicAccessModifiersMatched;
import gradingTools.comp301ss21.assignment2.testcases.style.A2PackageDeclarations;
import gradingTools.comp301ss21.assignment2.testcases.style.A2NamedConstants;
import gradingTools.comp301ss21.assignment2.testcases.style.A2NamingConventions;
import gradingTools.comp301ss21.assignment2.testcases.style.A2NoStarImports;
import gradingTools.comp301ss21.assignment2.testcases.style.A2PublicMethodsOverride;
import gradingTools.comp301ss21.assignment2.testcases.style.A2SimplifyBooleanExpressions;
import gradingTools.comp301ss21.assignment2.testcases.style.A2SimplifyBooleanReturns;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneComponentScrollSuite;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment7.testcases.factory.FactoryMethodSuiteA7;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
@RunWith(Suite.class)
@Suite.SuiteClasses({
A2PackageDeclarations.class,
A2SimplifyBooleanExpressions.class,
A2SimplifyBooleanReturns.class,
A2NoHiddenFields.class,
A2NamingConventions.class,
A2InterfaceAsType.class,
A2NamedConstants.class,
A2NoStarImports.class,
A2PublicMethodsOverride.class,
A2MnemonicNames.class,
A2Encapsulation.class,
A2NonPublicAccessModifiersMatched.class,
A2CommonPropertiesAreInherited.class,
A2CommonSignaturesAreInherited.class


})
public class A2Style {

	public static void main (String[] args) {
		try {
			
			BasicJUnitUtils.interactiveTest(A2Style.class);


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static {
		BasicExecutionSpecificationSelector.getBasicExecutionSpecification().
		setCheckStyleConfiguration("unc_checks_301_A2.xml");
	}

}
