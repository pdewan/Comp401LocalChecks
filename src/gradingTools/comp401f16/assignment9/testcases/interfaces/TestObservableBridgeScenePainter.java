package gradingTools.comp401f16.assignment9.testcases.interfaces;

import java.awt.Graphics;
import java.util.List;

import util.annotations.Tags;

@Tags({"ObservableBridgeScenePainter"})
public interface TestObservableBridgeScenePainter {
	public void addPaintListener(TestPaintListener listener);
	public void repaint();
	public List getPaintListeners();
}
