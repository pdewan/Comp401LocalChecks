package gradingTools.comp401f16.assignment12.testcases;

import java.awt.Color;
import java.lang.reflect.Method;

import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import util.trace.Tracer;
import bus.uigen.widgets.TextFieldFactory;
import bus.uigen.widgets.swing.SwingTextFieldFactory;
import gradingTools.shared.testcases.MethodExecutionTest;
@MaxValue(10)
@IsExtra(true)
public class SwingTextFieldFactoryTestCase extends MethodExecutionTest{
	protected static final double HAS_FACTORY_CLASS_CREDIT = 0.3;
	protected static final String TEXT = "hello";
	protected static final JTextField EXAMPLE_FIELD = new JTextField(TEXT);
	protected static final Color DEFAULT_FOREGROUND = EXAMPLE_FIELD.getForeground();
	protected static final Color DEFAULT_BACKGROUND = EXAMPLE_FIELD.getBackground();

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
		Tracer.info(this,"Creating text field for " + TEXT + " using " + aFactory);

		JTextField aJTextField = (JTextField) aMethod.invoke(aFactory, TEXT);
		assertTrue ("Text property of " + aJTextField + " is not " + TEXT,
				TEXT.equals(aJTextField.getText()));
		Color aForeground = aJTextField.getForeground();
		Color aBackground = aJTextField.getBackground();
		assertTrue("Foreground color property of " + aJTextField + " is same as default value " + DEFAULT_FOREGROUND,
				!aForeground.equals(DEFAULT_FOREGROUND));
		assertTrue("Background color property of " + aJTextField + " is same as default value " + DEFAULT_BACKGROUND,
				!aBackground.equals(DEFAULT_BACKGROUND));
		return true;		
	}
}
