package trace.gradingTools.comp401;


import gradingTools.comp401f16.assignment1.testcases.AbstractNumberScanningTest;
import gradingTools.comp401f16.assignment1.testcases.IndexOfTest;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;
import gradingTools.comp401f16.assignment4.testcases.GraderRotatingLineInterface;
import gradingTools.comp401f16.assignment4.testcases.array.ApproachArrayTest;
import gradingTools.comp401f16.assignment4.testcases.commands.ApproachBeanTest;
import gradingTools.comp401f16.assignment4.testcases.commands.extra.CallBeanTest;
import gradingTools.comp401f16.assignment5.testcases.angle.AngleMoveLeftLineTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneArthurMoveHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.others.BridgeSceneGalahadMoveLeftArmTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.arthur.BridgeSceneArthurScaleHeadTestCase;
import gradingTools.comp401f16.assignment5.testcases.scale.others.BridgeSceneGalahadScaleLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.history.ApproachHistoryTest;
import trace.grader.basics.GraderBasicsTraceUtility;
import util.trace.ImplicitKeywordKind;
import util.trace.Tracer;


public class Comp401TraceUtility extends GraderBasicsTraceUtility {
	
	public static void setTracing() {
		GraderBasicsTraceUtility.setTracing();
		Tracer.setImplicitPrintKeywordKind(ImplicitKeywordKind.OBJECT_PACKAGE_NAME);		
		Tracer.setKeywordPrintStatus(AbstractNumberScanningTest.class, true);
		
		//A1
		Tracer.setKeywordPrintStatus(IndexOfTest.class, true);
		
		//A2
		Tracer.setKeywordPrintStatus(MultipleWordOutputTest.class, true);

		
		//A3		
		Tracer.setKeywordPrintStatus(WordBeanTest.class, true);

		//A4
		Tracer.setKeywordPrintStatus(GraderRotatingLineInterface.class, true); 
		Tracer.setKeywordPrintStatus(ApproachArrayTest.class, true); 		
		Tracer.setKeywordPrintStatus(ApproachBeanTest.class, true); 
		Tracer.setKeywordPrintStatus(CallBeanTest.class, true); 
		
		//A5
		Tracer.setKeywordPrintStatus(AngleMoveLeftLineTestCase.class, true); 
		Tracer.setKeywordPrintStatus(BridgeSceneArthurMoveHeadTestCase.class, true);		
		Tracer.setKeywordPrintStatus(BridgeSceneGalahadMoveLeftArmTestCase.class, true); 
		Tracer.setKeywordPrintStatus(BridgeSceneArthurScaleHeadTestCase.class, true); 
		Tracer.setKeywordPrintStatus(BridgeSceneGalahadScaleLeftArmTestCase.class, true); 
		
		//A6
		Tracer.setKeywordPrintStatus(BridgeSceneDynamicTestCase.class, true);
		Tracer.setKeywordPrintStatus(ApproachHistoryTest.class, true);

	}
}
