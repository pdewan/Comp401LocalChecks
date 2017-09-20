package gradingTools.comp401f16.assignment8.testcases;

import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.Assert;

import util.annotations.MaxValue;
import util.trace.Tracer;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.execution.ResultingOutErr;
import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveArthurTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.comp401f16.assignment6.testcases.BridgeSceneDynamicTestCase;
import gradingTools.comp401f16.assignment7.testcases.factory.BridgeSceneFactoryMethodTest;
import gradingTools.comp401f16.assignment8.testcases.factory.ConsoleSceneViewFactoryMethodTest;
import gradingTools.shared.testcases.shapes.LocatableTest;
@MaxValue(50)
public class ConsoleSceneViewOutputTestCase extends BridgeSceneDynamicTestCase {
	protected PropertyChangeListener consoleView;
	protected TestBridgeScene bridgeScene;
	protected boolean minPartsCorrect = false;
	protected boolean somePropertiesChange = false;
	protected boolean oldValueCorrespondsToNewValue = false;
	protected static final double MIN_PARTS_CREDIT = 0.7;
	protected static final double NEW_OLD_VALUE_CREDIT = 0.15;
	protected static final double SOME_PROPERTIES_CHANGE_CREDIT = 0.15;
	
	protected String minPartsMessage() {
		return minPartsCorrect?"":"No of unique event sources < 7. ";
	}
	protected String somePropertiesMessage() {
		return somePropertiesChange?"":"Old Value == New Value in less than 7 property notification. ";
	}
	protected String oldValueCorrespondsToNewValueMessage() {
		return oldValueCorrespondsToNewValue?"":"No new value before failed is an old value after failed. ";
	}
	protected String fullMessage() {
		return minPartsMessage() + somePropertiesMessage() + oldValueCorrespondsToNewValueMessage();
	}
	@Override
	protected Object create() {
		
		bridgeScene = (TestBridgeScene) getOrCreateObject(
				factoryClassTags(), 
				BridgeSceneFactoryMethodTest.FACTORY_METHOD_TAGS, 
				TestBridgeScene.class);
		consoleView = (PropertyChangeListener) getOrCreateObject(
				factoryClassTags(), 
				ConsoleSceneViewFactoryMethodTest.FACTORY_METHOD_TAGS, 
				PropertyChangeListener.class);
		return bridgeScene;
	}
	
	
   
    public static String[][] parsePropertyChanges(String lines) {
    	lines = lines.replaceAll("=;", "=\'\';");
        return Arrays.stream(lines.split("\n")).parallel()
                .filter((line) -> line.startsWith("java.beans.PropertyChangeEvent"))
                .map(ConsoleSceneViewOutputTestCase::parsePropertyChange)
                .toArray(String[][]::new);
    }
    public static String[] parsePropertyChange(String line) {
    	
    	try {
        line = line.substring(line.indexOf('[')+1, line.lastIndexOf(']'));
        return Arrays.stream(line.split("; ")).parallel()
                .map((s) -> s.split("=")[1]).toArray(String[]::new);
    	} catch (Exception e) {
    		return new String[]{};
//    		return Arrays.stream(line.split("; ")).parallel()
//                    .map((s) -> s.split("=")[0]).toArray(String[]::new);
    	}
    }
    
    protected String[][] approachPropertyChanges;
    

	
	
	
    protected void processPropertyChanges() {
    	fractionComplete = 0;
    	long numNotifications = approachPropertyChanges.length + failedPropertyChanges.length;

    	Tracer.info(this,"Number of properties notifications after approach and failed:" + numNotifications);
    	Tracer.info(this,"Testing if old values and new values are different in notifications");
    	long numNoChanges = Stream.concat(Arrays.stream(approachPropertyChanges), Arrays.stream(failedPropertyChanges))
                .parallel().unordered()
                .filter((properties) -> properties[1].equals(properties[2])) // new/old value
                .count();
    	long numChanges = numNotifications - numNoChanges;
    	
    	if (numNoChanges > 0) {
    		Tracer.info(this,numNoChanges + " have old value same as new value are thus redundant. No points taken off.");
    	}
    	somePropertiesChange = numChanges >= 7;
//    	allPropertiesChange = numChanges == approachPropertyChanges.length;

        if (!somePropertiesChange) {
        	Tracer.info(this,"properties with changed values: " + numChanges + " < 7" );

        } else {
        	fractionComplete += this.SOME_PROPERTIES_CHANGE_CREDIT;
        }
    	Tracer.info(this,"Finding the number of unique sources of property changes after approach");

        long uniqueSources = Stream.concat(Arrays.stream(approachPropertyChanges), Arrays.stream(failedPropertyChanges))
                .parallel().unordered()
                .map((properties) -> properties[4]) // source
                .distinct()
                .count();
        minPartsCorrect = uniqueSources >= 7;
        if (!minPartsCorrect) {
        	Tracer.info(this,"Unique scources " + uniqueSources + " < expected body parts:" + 7);

        } else {
        	fractionComplete += MIN_PARTS_CREDIT;
        }
        
        String[][] all = Arrays.copyOf(approachPropertyChanges, approachPropertyChanges.length + failedPropertyChanges.length);
        System.arraycopy(failedPropertyChanges, 0, all, approachPropertyChanges.length, failedPropertyChanges.length);
        // check for property with same source with an newValue equal to a past oldValue
        oldValueCorrespondsToNewValue = false;
        Tracer.info(this,"Testing if new values before failed are old values after it");
        for(int i = 0; !oldValueCorrespondsToNewValue && i < all.length; i ++) {
            String[] prop1 = all[i];
            for(int j = i; !oldValueCorrespondsToNewValue && j < all.length; j ++) {
                String[] prop2 = all[j];
                if (prop1[4].equals(prop2[4]) && prop1[0].equals(prop2[0])) {
                    if (prop1[2].equals(prop2[1])) {
                    	oldValueCorrespondsToNewValue = true;
                    	Tracer.info(this,"property: " + prop1[4] + "new value " +
                    			
                    			prop1[2] + " == old value " + prop2[1]);
                    } else {
//                    	Tracer.info(this,"property: " + prop1[4] + "old value" +
//                    			
//                    			prop1[0] + " != " + prop1[0]);
                    	
                    }
                }
            }
        }
        if (!oldValueCorrespondsToNewValue) {
        	Tracer.info(this,"No old value was a new value");
        } else {
        	fractionComplete += NEW_OLD_VALUE_CREDIT; 
        }
        if (fractionComplete != 1){
        	assertTrue(fullMessage(), false);
        }
    }
	
	protected void approach (TestAvatar anAvatar) {
		Tracer.info(this,toString(anAvatar) + " Approaches");
		BasicProjectExecution.redirectOutput();
		bridgeScene().approach(anAvatar);
		output= BasicProjectExecution.restoreAndGetOut();
		approachPropertyChanges = parsePropertyChanges(output);
		
//		boolean aRetval = Arrays.stream(output.split("\n"))
//                .parallel().unordered()
//                .map((line) -> line.matches("java\\.beans\\.PropertyChangeEvent\\[propertyName=.*; oldValue=.*; newValue=.*; propagationId=.*; source=.*\\]"))
//                .allMatch((b)->b==true);

				

		
//		printFractionComplete();
	}
    protected String[][] failedPropertyChanges;

	protected void failed() {
		Tracer.info(this,"Interacting Knight Failed");
		BasicProjectExecution.redirectOutput();
		bridgeScene().failed();
		output= BasicProjectExecution.restoreAndGetOut();
		failedPropertyChanges = parsePropertyChanges(output);
		
		
	}
	
	protected boolean doTest() throws Throwable {
		rootProxy = create();
		approach(firstAvatar());
		failed();
		processPropertyChanges();
		return true;
		
		
	}
	
}
