package gradingTools.comp401f16.assignment9.testcases.interfaces;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;

import util.annotations.Tags;

@Tags({"BridgeSceneController"})
public interface TestBridgeSceneController extends MouseListener, KeyListener, PropertyChangeListener, ActionListener {
	JButton getSay();

	JButton getPassed();

	JButton getFailed();

	JButton getApproach();
}
