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
	protected final double APPROACH_CREDIT = 0.5; // 4 times, 2 pts
	protected final double SAY_CREDIT = 0.04; // ten times, 4 pts
	protected final double PASSED_CREDIT = 0.2; //once
	protected final double FAILED_CREDIT = 0.2; // once
	protected final String firstSay = "Quest?";
	protected final String secondSay = "Grail";
	protected final String thirdSay = "Color?";
	protected final String fourthSay = "Blue";
	


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
	
	protected void say (TestAvatar anAvatar, String aSaying) {
		bridgeScene().say(aSaying);
		String aText = anAvatar.getStringShape().getText();
		assertTrue("Avatar  said " + aText + " instead of " + aSaying,
			aSaying.equals(aText));
		fractionComplete += eachSayCredit();

	}
	protected void correctApproach (TestAvatar anAvatar) {
		bridgeScene().approach(anAvatar);
		assertTrue(correctApproachErrorMessage(), 
				bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += eachApproachCredit();
	}
	
	protected void wrongApproach (TestAvatar anAvatar) {
		bridgeScene().approach(anAvatar);
		assertTrue(correctApproachErrorMessage(), 
				bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += eachApproachCredit();
	}
	protected void passed() {
		bridgeScene().passed();
		assertTrue(passedErrorMessage(), 
				!bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += passedCredit();
	}
	protected void failed() {
		bridgeScene().failed();
		assertTrue("After failed occupied should be false and knight turn false", 
				!bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += passedCredit();
	}
	@Override
	protected void executeOperations(Object aLocatable) {
		correctApproach(firstAvatar());
		say (guard(), firstSay);
		say (firstAvatar(), secondSay);
		say (guard(), thirdSay);
		say (firstAvatar(), fourthSay);
		passed();
		correctApproach (secondAvatar());
		say (guard(), firstSay);
		say (secondAvatar(), secondSay);
		say (guard(), thirdSay);
		say (secondAvatar(), fourthSay);
		failed();
		correctApproach(thirdAvatar());
		wrongApproach(fourthAvatar());
		say (guard(), firstSay);
		say (thirdAvatar(), secondSay);

		
		
		

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
