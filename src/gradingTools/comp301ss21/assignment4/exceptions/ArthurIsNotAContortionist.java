package gradingTools.comp301ss21.assignment4.exceptions;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.trace.Tracer;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotAutomatableException;
import grader.basics.junit.TestCaseResult;
import grader.basics.project.BasicProjectIntrospection;
import grader.basics.project.NotGradableException;
import grader.basics.project.Project;
import grader.basics.testcase.PassFailJUnitTestCase;
import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment3.controller.SceneControllerSingletonFromFactory;
import gradingTools.comp401f16.assignment.testInterfaces.TestAngle;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment1.testcases.InvalidCharacterOutputTest;
import gradingTools.comp401f16.assignment11.parser.testcases.ParserFactoryMethodTest;
import gradingTools.comp401f16.assignment11.testcases.interfaces.TestParser;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanPropertyTest;
import gradingTools.comp401f16.assignment7.testcases.FactoryMethodsTestCase;
import gradingTools.comp401f16.assignment7.testcases.TestScanner;
import gradingTools.comp401f16.assignment7.testcases.factory.ScannerFactoryMethodTest;
import gradingTools.shared.testcases.shapes.interfaces.TestLine;
import gradingTools.shared.testcases.shapes.interfaces.TestRotatingLine;
@MaxValue(30)
public class ArthurIsNotAContortionist extends PassFailJUnitTestCase {
	protected final Class[] PRECEDING_TESTS = {
			BridgeSceneSingletonFromFactory.class,
			CheckedImpossibleAngle.class
	};
	@Override
	protected Class[] precedingTests() {
		return PRECEDING_TESTS;
	}
	protected TestBridgeScene getBridgeSceneFromFactory() {
		BridgeSceneSingletonFromFactory aSingleton =
				(BridgeSceneSingletonFromFactory) precedingTestInstances.get(0);
		 return aSingleton.bridgeScene();
	}
	protected void doSetAngle(TestRotatingLine aTestLine, double anAngle, boolean anException) {
		Tracer.info(this, "Disabling asynchronous execution of code and transparent exceptions");
		BasicProjectExecution.setUseMethodAndConstructorTimeOut(false);;
		BasicProjectExecution.setCatchException(false);
		try {
			aTestLine.setAngle(anAngle);
			if (anException) {
				assertTrue("angle " + anAngle + " did not throw  expected exception", false);
			} else {
				Tracer.info(this, "angle " + anAngle + " did not throw  exception as expected" );
			}
		} catch (Throwable e) {
			if (!anException) {
				assertTrue("angle " + anAngle + " threw unncessary exception", false);
			} else {
				Tracer.info(this, "angle " + anAngle + " threw expected exception" );
			}
		} finally {
			BasicProjectExecution.setUseMethodAndConstructorTimeOut(true);;
			BasicProjectExecution.setCatchException(true);
			Tracer.info(this, "Enabling asynchronous execution of code and transparent exceptions");


		}
	}
	@Override
	public TestCaseResult test(Project project, boolean autoGrade)
			throws NotAutomatableException, NotGradableException {
		try {
		TestBridgeScene aBridgeScene = getBridgeSceneFromFactory();
		Tracer.info(this, "Getting arthur from bridge scene");
		TestAvatar aTestAvatar = aBridgeScene.getArthur();
		Tracer.info(this, "Getting legs from arthur");
		TestAngle aTestAngle = aTestAvatar.getLegs();
		Tracer.info(this, "Getting  left line from legs");
		TestRotatingLine aTestLeftLine = aTestAngle.getLeftLine();
		Tracer.info(this, "Getting  left line from legs");
		TestRotatingLine aTestRightLine = aTestAngle.getRightLine();
//		BasicProjectExecution.setUseMethodAndConstructorTimeOut(false);;
//		BasicProjectExecution.setCatchException(false);
//		aTestLine.setAngle(0);
		Tracer.info(this, "left line <- PI/2");
		doSetAngle(aTestLeftLine, Math.PI/2, false);
		Tracer.info(this, "right line <- PI/2");

		doSetAngle(aTestRightLine, Math.PI/2, false);
		Tracer.info(this, "left line <- 0");

		doSetAngle(aTestLeftLine, 0, true);	
		Tracer.info(this, "right line <- Mat.PI");

		doSetAngle(aTestRightLine, Math.PI, true);
		
//		BasicProjectExecution.setUseMethodAndConstructorTimeOut(true);;
//		BasicProjectExecution.setCatchException(false);

		// TODO Auto-generated method stub
		return pass();
		} catch (Exception e) {
//			e.printStackTrace();
			BasicProjectExecution.setUseMethodAndConstructorTimeOut(true);;
			BasicProjectExecution.setCatchException(false);
//			assertTrue ("Exception in tested code:", false);
			return fail("Exception in tested code:" + e.getMessage());
		}
	}
	
}
