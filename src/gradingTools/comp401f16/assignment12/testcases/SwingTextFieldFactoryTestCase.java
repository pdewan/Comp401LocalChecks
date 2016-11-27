package gradingTools.comp401f16.assignment12.testcases;

import java.lang.reflect.Method;

import javax.swing.JTextField;

import bus.uigen.widgets.TextFieldFactory;
import bus.uigen.widgets.swing.SwingTextFieldFactory;
import gradingTools.shared.testcases.MethodExecutionTest;

public class SwingTextFieldFactoryTestCase extends MethodExecutionTest{
	protected static final double HAS_FACTORY_CLASS_CREDIT = 0.3;
	protected static final String TEXT = "hello";
	protected String instantiatedTag() {
		return "CustomSwingTextFieldFactory";
	}	
	protected Class[] constructorArgs() {
		return constructorArgs;
	}
	@Override
	protected boolean doTest() throws Throwable {
		initConstructor();
		Object anObject = instantiateClass();
		assertTrue(anObject + " not instance of " + SwingTextFieldFactory.class,  
				anObject instanceof SwingTextFieldFactory );
		SwingTextFieldFactory aFactory = (SwingTextFieldFactory) anObject;
		Method aMethod = SwingTextFieldFactory.class.getDeclaredMethod("createJTextField", String.class);
		aMethod.setAccessible(true);
		System.out.println ("Creating text field for " + TEXT + " using " + aFactory);

		JTextField aJTextField = (JTextField) aMethod.invoke(aFactory, TEXT);
		assertTrue ("Text property of " + aJTextField + " is not " + TEXT,
				TEXT.equals(aJTextField.getText()));
		return true;		
	}
}
