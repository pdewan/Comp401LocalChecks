package gradingTools.comp401f16.assignment9.testcases.interfaces;

import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.JTextField;

public interface TestCommandInterpreterView extends PropertyChangeListener {
	public void addControllerListener(ActionListener listener);
	JTextField getTextField();
}
