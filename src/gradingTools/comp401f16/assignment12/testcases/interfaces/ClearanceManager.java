package gradingTools.comp401f16.assignment12.testcases.interfaces;

import util.models.PropertyListenerRegisterer;

public interface ClearanceManager extends PropertyListenerRegisterer{
	public void proceed();
	public void waitForProceed();	
	

}
