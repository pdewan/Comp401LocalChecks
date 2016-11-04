package gradingTools.comp401f16.assignment9.testcases.interfaces;

import java.awt.Graphics2D;
import java.beans.PropertyChangeListener;

import util.annotations.Tags;
@Tags({"PaintListener"})
public interface TestPaintListener extends PropertyChangeListener{
	void paint(Graphics2D g);

}
