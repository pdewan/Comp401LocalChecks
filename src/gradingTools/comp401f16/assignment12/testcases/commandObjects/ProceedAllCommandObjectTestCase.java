package gradingTools.comp401f16.assignment12.testcases.commandObjects;

import java.lang.reflect.InvocationTargetException;

import gradingTools.comp401f16.assignment12.waitnotify.testcases.WaitingAvatarsAnimationTestCase;

public class ProceedAllCommandObjectTestCase extends WaitingAvatarsAnimationTestCase {
	public static final String TAG = "ProceedAllCommand";
	protected void doProceedAll() throws Exception {
		Runnable aRunnable =  (Runnable) instantiateClass();
		aRunnable.run();
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
