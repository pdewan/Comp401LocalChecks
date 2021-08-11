package gradingTools.comp301ss21.assignment4.async;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedBoundedShape;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import gradingTools.comp301ss21.assignment4.abstractclasses.AbstractBoundedShape;
import gradingTools.comp301ss21.assignment4.abstractclasses.AbstractLocatable;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AsyncArthurAnimation.class,
	AbstractionAsyncArthurAnimation.class,
	AsyncGalahadAnimation.class,
	AsyncLancelotAnimation.class,
	AsyncRobinAnimation.class,
//ConsoleSceneView.class



})
@MaxValue(50)
public class AsyncAnimation {

}
