package gradingTools.comp401f16.assignment6.testcases.history;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import grader.basics.execution.GradingMode;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.comp401f16.assignment2.testcases.MultipleWordOutputTest;
import gradingTools.comp401f16.assignment2.testcases.ScannerBeanTest;
import gradingTools.comp401f16.assignment3.testcases.InputBeanTest;
import gradingTools.comp401f16.assignment3.testcases.WordBeanTest;
import gradingTools.comp401f16.assignment4.testcases.array.TokenArrayTest;
import gradingTools.shared.testcases.interfaces.TestHistory;

public abstract class TokenHistoryTest extends TokenArrayTest {
public static final String LIST = "TokenList";
	protected TestHistory tokenListOutput;
	protected Object actualTokenListOutput;
	
	@Override
	protected String[] getOutputPropertyNames() {
		return new String[]{LIST};
	}
	@Override
	protected Object outputTokenAt(int anIndex) {
		return tokenListOutput.elementAt(anIndex);
	}
	@Override
	protected void extractTokens() {
		Object anActualList = outputPropertyValues.get(LIST);
		if (actualTokenListOutput != null) {
			if (anActualList != tokenListOutput) {
				assertTrue("Multiple clearable histories created by scanner", false);
			} else {
				return;
			}
		}
		
		tokenListOutput = (TestHistory) BasicProjectIntrospection.
				createProxy(TestHistory.class, anActualList);
	}
	
	@Override
	protected int sizeOutputCollection() {
		return tokenListOutput.size();
	}
	@Override
	protected boolean isNullCollectionOutput() {
		return tokenListOutput == null;
	}
	protected double correctSizeCredit() {
		return outputCorrectSize?
		 0.2:0.0;
	}
	protected double correctSecondSizeCredit() {
		return secondOutputCorrectSize?
		 0.3:0.0;
	}
	
}
