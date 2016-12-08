package gradingTools.comp401f16.assignment7.testcases;

import util.annotations.Tags;

@Tags({"ScannerBean"})

public interface TestScanner {
	public String getScannedString();
	public void setScannedString(String aCommand) throws Exception;

}
