package gradingTools.comp401f16.assignment6.testcases;

import org.junit.Assert;

import util.annotations.MaxValue;
import util.trace.Tracer;
import grader.basics.junit.NotesAndScore;
import gradingTools.comp401f16.assignment.testInterfaces.TestAvatar;
import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveArthurTestCase;
import gradingTools.comp401f16.assignment5.testcases.move.arthur.BridgeSceneMoveTestCase;
import gradingTools.shared.testcases.shapes.LocatableTest;
@MaxValue(50)
public class BridgeSceneDynamicTestCase extends BridgeSceneMoveTestCase {
	protected boolean firstApproachWorks;
	protected final double APPROACH_CREDIT = 0.05; // 4 times, 	0.2 pts
	protected final double SAY_CREDIT = 0.05; // 9 times, 		0.45 pts
	protected final double LAST_SAY_CREDIT = 0.15; // once 		0.15
	protected final double Pass_CREDIT = 0.1; //once, 		0.1
	protected final double Fail_CREDIT = 0.1; // once, 		0.1
	protected final String firstSay = "Quest?";
	protected final String secondSay = "Grail";
	protected final String thirdSay = "Color?";
	protected final String fourthSay = "Blue";
	
	protected String toString(TestAvatar aTestAvatar) {
		return "Avatar(" +  aTestAvatar.getHead().getImageFileName() + ")";
	}
	protected void printFractionComplete() {
		Tracer.info(this,"Fraction complete:" + fractionComplete);
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
	protected String passErrorMessage() {
		return "After pass occupied should be false and knight turn false";
	}
	protected String failErrorMessage() {
		return "After fail occupied should be false and knight turn false";
	}
	protected double eachSayCredit() {
		return SAY_CREDIT;
	}
	protected double lastSayCredit() {
		return LAST_SAY_CREDIT;
	}
	protected String sayErrorMessage() {
		return "Say fail";
	}
	protected double passCredit() {
		return Pass_CREDIT;
	}
	
	protected double failCredit() {
		return Fail_CREDIT;
	}

//	protected TestBridgeScene bridgeScene() {
//		return (TestBridgeScene) rootProxy;
//	}
	protected void setDependentObjects() {
		bridgeScene = (TestBridgeScene) rootProxy;
	}
	@Override
	protected Class proxyClass() {
		return TestBridgeScene.class;
	}
	protected void assertTrue(String aMessage, boolean aCheck) {
//		if (!aCheck)
//		 Tracer.info(this,aMessage);
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
	protected void say (String aSaying) {
		bridgeScene().say(aSaying);
	}
	protected void say (TestAvatar anAvatar, String aSaying, double aCredit) {
		String anAvatarString = toString(anAvatar);

		Tracer.info(this, anAvatarString + " Say:\"" + aSaying + "\"");
		say(aSaying);
		String aText = anAvatar.getStringShape().getText();
//		assertTrue(toString(anAvatar) + " said  \"" + aText + "\" instead of \"" + aSaying + "\"",
//			aSaying.equals(aText));
		assertTrue(anAvatarString + " said  \"" + aText + "\" instead of \"" + aSaying + "\"",
				aSaying.equals(aText));
		fractionComplete += aCredit;
		printFractionComplete();

	}

	protected void say (TestAvatar anAvatar, String aSaying) {
		say(anAvatar, aSaying, eachSayCredit());

	}
	protected void doApproach(TestAvatar anAvatar) {
		bridgeScene().approach(anAvatar);
	}
	protected void approach (TestAvatar anAvatar) {
		Tracer.info(this,toString(anAvatar) + " Approaches");
		doApproach(anAvatar);
//		bridgeScene().approach(anAvatar);
//		Tracer.info(this, "Checking if bridge scene is occupied and it is not knight turn");
		assertTrue(correctApproachErrorMessage(), 
				bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += eachApproachCredit();
		printFractionComplete();
	}
	
//	protected void wrongApproach (TestAvatar anAvatar) {
//		Tracer.info(this,"Illegal Knight Approach");
//		bridgeScene().approach(anAvatar);
//		assertTrue(correctApproachErrorMessage(), 
//				bridgeScene().getOccupied() &&
//				!bridgeScene().getKnightTurn());
//		fractionComplete += eachApproachCredit();
//		printFractionComplete();
//	}
	protected void doPass() {
		bridgeScene().pass();
	}
	protected void passKnight() {
		Tracer.info(this,"Interacting Knight Pass");
		doPass();
//		bridgeScene().pass();
		assertTrue(passErrorMessage(), 
				!bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += passCredit();
		printFractionComplete();
	}
	protected void doPassOrFail() {
		bridgeScene().fail();
	}
	protected void checkFail() {
		assertTrue("After fail occupied should be false and knight turn false", 
				!bridgeScene().getOccupied() &&
				!bridgeScene().getKnightTurn());
		fractionComplete += passCredit();
		printFractionComplete();
	}
	protected void fail() {
		Tracer.info(this,"Interacting Knight Fail");
		doPassOrFail();
		checkFail();
//		bridgeScene().fail();
//		assertTrue("After fail occupied should be false and knight turn false", 
//				!bridgeScene().getOccupied() &&
//				!bridgeScene().getKnightTurn());
//		fractionComplete += passCredit();
//		printFractionComplete();
	}
	@Override
	protected void executeOperations(Object aLocatable) {
		approach(firstAvatar());
		say (guard(), firstSay);
		say (firstAvatar(), secondSay);
		say (guard(), thirdSay);
		say (firstAvatar(), fourthSay);
		passKnight();
		approach (secondAvatar());
		say (guard(), firstSay);
		say (secondAvatar(), secondSay);
		say (guard(), thirdSay);
		say (secondAvatar(), fourthSay);
		fail();
		approach(thirdAvatar());
		Tracer.info(this,"The next approach should not displace the current knight");
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
		return true;
	}
	@Override
	protected void setLeafProxy() {
		// TODO Auto-generated method stub
		
	}
	protected void setExpected(Object aLocatable) {
		
	}
	
}
