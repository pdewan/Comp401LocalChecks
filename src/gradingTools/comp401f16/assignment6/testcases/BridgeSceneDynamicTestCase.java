package gradingTools.comp401f16.assignment6.testcases;

import org.junit.Assert;

import util.annotations.MaxValue;
import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.shared.testcases.shapes.LocatableTest;
@MaxValue(50)
public class BridgeSceneDynamicTestCase extends LocatableTest {
	protected boolean firstApproachWorks;
	protected final double APPROACH_CREDIT = 0.05; // 4 times, 	0.2 pts
	protected final double SAY_CREDIT = 0.05; // 9 times, 		0.45 pts
	protected final double LAST_SAY_CREDIT = 0.15; // once 		0.15
	protected final double PASSED_CREDIT = 0.1; //once, 		0.1
	protected final double FAILED_CREDIT = 0.1; // once, 		0.1
	protected final String firstSay = "Quest?";
	protected final String secondSay = "Grail";
	protected final String thirdSay = "Color?";
	protected final String fourthSay = "Blue";
	
	protected String toString(TestAvatar aTestAvatar) {
		return "Avatar(" +  aTestAvatar.getHead().getImageFileName() + ")";
	}
	protected void printFractionComplete() {
		System.out.println ("Fraction complete:" + fractionComplete);
	}

	protected String initialSceneUnoccupiedrMessage() {
		return "Scene Initially Occupied";
	}
	
	protected double eachApproachCredit() {
		return APPROACH_CREDIT;
	}
	protected String correctApproachErrorMessage() {
		return "After approach occupied should be true and knight turn false";
	}
//	protected String wrongApproachErrorMessage() {
//		return "After wrong approach occupied should be true and knight turn false";
//	}
	protected String passedErrorMessage() {
		return "After passed occupied should be false and knight turn false";
	}
	protected String failedErrorMessage() {
		return "After failed occupied should be false and knight turn false";
	}
	protected double eachSayCredit() {
		return SAY_CREDIT;
	}
	protected double lastSayCredit() {
		return LAST_SAY_CREDIT;
	}
	protected String sayErrorMessage() {
		return "Say failed";
	}
	protected double passedCredit() {
		return PASSED_CREDIT;
	}
	
	protected double failedCredit() {
		return FAILED_CREDIT;
	}

	protected TestBridgeScene bridgeScene() {
		return (TestBridgeScene) rootProxy;
	}
	
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	protected void assertTrue(String aMessage, boolean aCheck) {
//		if (!aCheck)
//		 System.out.println (aMessage);
		Assert.assertTrue(aMessage + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, aCheck);

//		Assert.assertTrue(aMessage + NotesAndScore.PERCENTAGE_MARKER + fractionComplete, aCheck);
	}
	protected boolean doTest() throws Throwable {
		create();
		
		setDependentObjects();
		executeOperations(rootProxy);
		setExpected(rootProxy);
		setActual(rootProxy);
		return checkOutput(rootProxy);
		
	}
	protected TestAvatar firstAvatar() {
		return bridgeScene().getArthur();
	}
	protected TestAvatar secondAvatar() {
		return bridgeScene().getLancelot();
	}
	protected TestAvatar thirdAvatar() {
		return bridgeScene().getGalahad();
	}
	protected TestAvatar fourthAvatar() {
		return bridgeScene().getRobin();
	}
	protected TestAvatar guard() {
		return bridgeScene().getGuard();
	}
	
	protected void say (TestAvatar anAvatar, String aSaying, double aCredit) {
		System.out.println("Say:\"" + aSaying + "\"");
		bridgeScene().say(aSaying);
		String aText = anAvatar.getStringShape().getText();
		assertTrue(toString(anAvatar) + " said  \"" + aText + "\" instead of \"" + aSaying + "\"",
			aSaying.equals(aText));
		fractionComplete += aCredit;
		printFractionComplete();

	}

	protected void say (TestAvatar anAvatar, String aSaying) {
		say(anAvatar, aSaying, eachSayCredit());

	}
	protected void approach (TestAvatar anAvatar) {
		System.out.println(toString(anAvatar) + " Approaches");
		bridgeScene().approach(anAvatar);
		assertTrue(correctApproachErrorMessage(), 
				bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += eachApproachCredit();
		printFractionComplete();
	}
	
//	protected void wrongApproach (TestAvatar anAvatar) {
//		System.out.println("Illegal Knight Approach");
//		bridgeScene().approach(anAvatar);
//		assertTrue(correctApproachErrorMessage(), 
//				bridgeScene().getOccupied() &&
//				!bridgeScene().getKnightTurn());
//		fractionComplete += eachApproachCredit();
//		printFractionComplete();
//	}
	protected void passed() {
		System.out.println("Interacting Knight Passed");
		bridgeScene().passed();
		assertTrue(passedErrorMessage(), 
				!bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += passedCredit();
		printFractionComplete();
	}
	protected void failed() {
		System.out.println("Interacting Knight Failed");
		bridgeScene().failed();
		assertTrue("After failed occupied should be false and knight turn false", 
				!bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += passedCredit();
		printFractionComplete();
	}
	@Override
	protected void executeOperations(Object aLocatable) {
		approach(firstAvatar());
		say (guard(), firstSay);
		say (firstAvatar(), secondSay);
		say (guard(), thirdSay);
		say (firstAvatar(), fourthSay);
		passed();
		approach (secondAvatar());
		say (guard(), firstSay);
		say (secondAvatar(), secondSay);
		say (guard(), thirdSay);
		say (secondAvatar(), fourthSay);
		failed();
		approach(thirdAvatar());
		approach(fourthAvatar());
		say (guard(), firstSay);
		say (thirdAvatar(), secondSay, lastSayCredit());

		
		
		

		// TODO Auto-generated method stub
		
	}
	@Override
	protected Object create() {
		return this.createRootProxy(); // get fresh one after each test
	}
	@Override
	protected void setActual(Object aLocatable) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected boolean checkOutput(Object aLocatable) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	protected void setLeafProxy() {
		// TODO Auto-generated method stub
		
	}
	
}
