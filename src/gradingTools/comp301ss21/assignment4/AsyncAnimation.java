package gradingTools.comp301ss21.assignment4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedBoundedShape;
import gradingTools.comp301ss21.assignment2.testcases.inheritance.TaggedLocatable;
import gradingTools.comp301ss21.assignment4.abstractclasses.AbstractBoundedShape;
import gradingTools.comp301ss21.assignment4.abstractclasses.AbstractLocatable;
import gradingTools.comp301ss21.assignment4.async.AsyncArthurAnimation;
import gradingTools.comp301ss21.assignment4.async.AsyncGalahadAnimation;
import gradingTools.comp301ss21.assignment4.async.AsyncLancelotAnimation;
import gradingTools.comp301ss21.assignment4.async.AsyncRobinAnimation;
import util.annotations.MaxValue;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AsyncArthurAnimation.class,
	AsyncGalahadAnimation.class,
	AsyncLancelotAnimation.class,
	AsyncRobinAnimation.class,
//ConsoleSceneView.class



})
@MaxValue(50)
public class AsyncAnimation {

}
