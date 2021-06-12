package gradingTools.comp301ss21.assignment2.testcases.console_view;

import java.beans.PropertyChangeListener;

import gradingTools.comp301ss21.assignment2.testcases.factory.BridgeSceneSingletonFromFactory;
import gradingTools.comp301ss21.assignment2.testcases.factory.ConsoleSceneViewSingletonFromFactory;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment8.testcases.ConsoleSceneViewOutputTestCase;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import util.annotations.MaxValue;
@MaxValue(50)
public class ConsoleSceneView extends ConsoleSceneViewOutputTestCase{
	protected final Class[] PRECEDING_TESTS = {
			BridgeSceneSingletonFromFactory.class,
			ConsoleSceneViewSingletonFromFactory.class,
	};
	@Override
	protected Class[] precedingTests() {
			return PRECEDING_TESTS;
	}
	
	protected TestBridgeScene getBridgeSceneFromFactory() {
		BridgeSceneSingletonFromFactory aBridgeSceneFromFactory =
				(BridgeSceneSingletonFromFactory) precedingTestInstances.get(0);
		 return aBridgeSceneFromFactory.bridgeScene();
	}
	protected PropertyChangeListener getConsoleViewFromFactory() {
		ConsoleSceneViewSingletonFromFactory aConsoleSceneViewFromFactory =
				(ConsoleSceneViewSingletonFromFactory) precedingTestInstances.get(1);
		return aConsoleSceneViewFromFactory.consoleView();
		
//		return bridgeScene;
	}
}
