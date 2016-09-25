package gradingTools.comp401f16.assignment2.testcases;

import gradingTools.comp401f16.assignment1.testcases.MultipleTokensOutputTest;
import util.annotations.Explanation;
import util.annotations.MaxValue;

@Explanation("Mixed Types of Tokens Output")
@MaxValue(10)
public class MixedOutputTest extends MultipleTokensOutputTest {
	protected String[] getClassNames(){
		return Assignment2Suite.MAIN_CLASS_NAME;
	}
	protected String[][] tokenLines = {
				{"My", "\"friend started a band named\"", "1023"}, 
				{"Mb" , "\"But they haven't gotten a gig yet\"", "000001", "Q"}};
	
	protected String[][] graderTokenLines = {
		{"\"12   3 and to the 4!  \"", "CAPS", "000231", "\"oneQuotedword\"", "I"}};
	
	@Override
	protected String[][] studentTokenLines() {
		return tokenLines;
	}
	
	@Override
	protected String[][] graderTokenLines() {
		return graderTokenLines;
	}

	protected String getClassName() {
		return Assignment2Suite.MAIN_CLASS_NAME[0];
	}
	
	protected String toOutputString (String aToken) {
		String prefix = "";
		char firstCharacter = aToken.charAt(0);
		
		if (Character.isDigit(firstCharacter)){
			prefix = MultipleNumberOutputTest.NUMBER_PREFIX;
			
		}else if (Character.isAlphabetic(firstCharacter)){
			prefix = MultipleWordOutputTest.WORD_PREFIX;
			
		}else if (firstCharacter == '\"'){
			prefix = MultipleQuoteOutputTest.QUOTE_PREFIX;
			aToken = aToken.substring(1, aToken.length() -1);
		}
		
		return prefix + aToken;
	}
}
