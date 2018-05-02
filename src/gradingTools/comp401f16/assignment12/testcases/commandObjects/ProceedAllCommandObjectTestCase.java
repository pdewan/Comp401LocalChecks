package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import java.lang.reflect.InvocationTargetException;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;
@MaxValue(5)
@IsExtra(true)
public class ProceedAllCommandObjectTestCase extends WaitingAvatarsAnimationTestCase {
	public static final String TAG = "ProceedAllCommand";
	protected void doProceedAll() throws Exception {
		Runnable aRunnable =  (Runnable) instantiateClass();
//		aRunnable.run();
		try {
			invokeRunMethod(aRunnable);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Class findProceedAllCommandClass() {
		return BasicProjectIntrospection.findClassByTags(TAG);
	}
	protected String instantiatedTag() {
		return TAG;
	}	
	protected Class[] constructorArgs() {
		return constructorArgs;
	}
	@Override
	protected boolean doTest() throws Throwable {
		initConstructor();
		return super.doTest();
	}
}
