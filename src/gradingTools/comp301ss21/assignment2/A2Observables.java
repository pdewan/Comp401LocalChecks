package gradingTools.comp301ss21.assignment2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment2.testcases.observable.BoundedShapeAnnouncesPropertyChangeEvent;
import gradingTools.comp301ss21.assignment2.testcases.observable.BoundedShapeInstantiatesPropertyChangeEvent;
import gradingTools.comp301ss21.assignment2.testcases.observable.LocatableAnnouncesPropertyChangeEvent;
import gradingTools.comp301ss21.assignment2.testcases.observable.LocatableInstantiatesPropertyChangeEvent;
import gradingTools.comp301ss21.assignment2.testcases.observable.LocatablePropertyChangeListenersProperty;
import gradingTools.comp301ss21.assignment2.testcases.observable.Locatable_IS_A_PropertyListenerRegisterer;
import gradingTools.comp301ss21.assignment2.testcases.scroll.BridgeSceneScrollMethodDefined;
import gradingTools.comp301ss21.assignment2.testcases.semantics.BridgeSceneApproachMethodDefined;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneArthurScrollLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneArthurScrollRightLegTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneGalahadScrollLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneLancelotScrollLeftArmTestCase;
import gradingTools.comp401f16.assignment6.testcases.scroll.BridgeSceneRobinScrollLeftArmTestCase;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	Locatable_IS_A_PropertyListenerRegisterer.class,
	LocatablePropertyChangeListenersProperty.class,
	LocatableInstantiatesPropertyChangeEvent.class,
	LocatableAnnouncesPropertyChangeEvent.class,
	BoundedShapeInstantiatesPropertyChangeEvent.class,
	BoundedShapeAnnouncesPropertyChangeEvent.class

})

@IsExtra(true)
public class A2Observables {

	

}
