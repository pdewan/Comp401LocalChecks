package gradingTools.comp401f16.assignment9.testcases.interfaces;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import util.annotations.Tags;

@Tags({"CommandInterpreterController"})
public interface TestCommandInterpreterController extends ActionListener{
	public JTextField getTextField();
	public JMenuItem getMenuItem();
	public JButton getMenuButton();
}
