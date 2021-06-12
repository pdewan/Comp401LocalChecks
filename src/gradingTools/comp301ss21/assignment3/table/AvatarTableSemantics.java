package gradingTools.comp301ss21.assignment3.table;

import gradingTools.comp401f16.assignment.testInterfaces.TestBridgeScene;
import gradingTools.comp401f16.assignment7.testcases.FactoryMethodsTestCase;
import gradingTools.comp401f16.assignment7.testcases.StringTableTest;
import gradingTools.shared.testcases.interfaces.TestStringTable;
import tags301.Comp301Tags;
import util.annotations.MaxValue;
@MaxValue(10)
public class AvatarTableSemantics extends TableSemantics {
	
	protected final Class[] PRECEDING_TESTS = {
//			TaggedTable.class,
			NoIllegalGetOrPut.class,
			
	};
	@Override
	protected Class[] precedingTests() {
			return PRECEDING_TESTS;
	}
	
	protected boolean failedTestVetoes() {
    	return true;
    }
	protected TestBridgeScene bridgeScene;
	protected TestStringTable table;


	protected String[] bridgeClassTags() {
		return new String[] {Comp301Tags.BRIDGE_SCENE};
	}

	
	protected Class bridgeClass() {
		// TODO Auto-generated method stub
		return TestBridgeScene.class;
	}
	 protected String[] bridgeFactoryMethodTags() {
	    	return new String[] {"bridgeSceneFactoryMethod"};
	    }

    protected String[] tableClassTags() {
    	return new String[] {Comp301Tags.TABLE};
    }
    protected String[] tableFactoryMethodTags() {
    	return new String[] {"avatarTableFactoryMethod"};
    }
    protected Class tableClass() {
    	return TestStringTable.class;
    }
	

	@Override
	protected void setActual(Object aProxy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean checkOutput(Object aLocatable) {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected boolean check (String aName, Object anAvatar) {
		
		Object anActualObject = table.get(aName);
		if (anActualObject != anAvatar) {
			return checkLowerCase(aName, anAvatar);
//			assertTrue("Table value at key " + aName + " " + anActualObject + " != expected object " + anAvatar, false);
		}
		return true;
	}
	protected boolean checkLowerCase (String aName, Object anAvatar) {
		String aNameLowerCase = aName.toLowerCase();
		Object anActualObject = table.get(aNameLowerCase);
		if (anActualObject != anAvatar) {
			
			assertTrue("Table value at key " + aName + " " + anActualObject + " != expected object " + anAvatar, false);
		}
		return true;
	}
	protected boolean doTest() throws Throwable {
		bridgeScene = (TestBridgeScene) getObjectFromFactory(factoryClassTags(), bridgeFactoryMethodTags(), bridgeClass());
		table = (TestStringTable) getObjectFromFactory(factoryClassTags(), tableFactoryMethodTags(), tableClass());
		String aName = "Arthur";
		
		check ("Arthur", bridgeScene.getArthur());
		check ("Lancelot", bridgeScene.getLancelot());
		check ("Galahad", bridgeScene.getGalahad());
		check ("Robin", bridgeScene.getRobin());
		try {
		bridgeScene.approach("Arthur");
		boolean anOccupied = bridgeScene.getOccupied();
		if (!anOccupied) {
			assertTrue("Bridge scene not occupied after approach(\"Arthur\")", false);

		}
		} catch (Error e) {
			e.printStackTrace();
			assertTrue("Exception while calling approach(\"Arthur\")", false);
		}
		return true;
	}

}
