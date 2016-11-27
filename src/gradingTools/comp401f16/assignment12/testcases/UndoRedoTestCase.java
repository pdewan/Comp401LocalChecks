package gradingTools.comp401f16.assignment12.testcases;

import gradingTools.comp401f16.assignment7.testcases.move.CommandInterpreterArthurMoveLeftArmTestCase;

public class UndoRedoTestCase extends CommandInterpreterArthurMoveLeftArmTestCase {
	protected boolean beforeMove = false;
	protected boolean beforeUndo = false;
	protected static final int UNDO_CREDIT = 05;
	
	protected void setExpectedMove() {
		if (beforeMove) {
			super.setExpectedMove();
		} else if (beforeUndo){
		expectedX = originalX - inputXDelta();
		expectedY = originalY - inputYDelta();
		} else {
			expectedX = originalX + inputXDelta();
			expectedY = originalY + inputYDelta();
		}
	}
	@Override
	protected void doMove() {
		if (beforeMove) {
			super.doMove();
		} else if (beforeUndo) {
			commandInterpreter().setCommand("undo ");
		} else {
			commandInterpreter().setCommand("redo ");
		}
	}
	protected  boolean doTest() throws Throwable {
		beforeMove = true;
		beforeUndo = true;
		boolean retVal = super.doTest();
		beforeMove = false;
		retVal = super.doTest();
		fractionComplete += UNDO_CREDIT;
		beforeUndo = false;
		retVal = super.doTest();

		return retVal;
	}
}
