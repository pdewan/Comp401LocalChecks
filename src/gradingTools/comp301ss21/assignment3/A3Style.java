package gradingTools.comp301ss21.assignment3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment3.testcases.style.A3CommonPropertiesAreInherited;
import gradingTools.comp301ss21.assignment3.testcases.style.A3CommonSignaturesAreInherited;
import gradingTools.comp301ss21.assignment3.testcases.style.A3Encapsulation;
import gradingTools.comp301ss21.assignment3.testcases.style.A3InterfaceAsType;
import gradingTools.comp301ss21.assignment3.testcases.style.A3MnemonicNames;
import gradingTools.comp301ss21.assignment3.testcases.style.A3NamedConstants;
import gradingTools.comp301ss21.assignment3.testcases.style.A3NamingConventions;
import gradingTools.comp301ss21.assignment3.testcases.style.A3NoHiddenFields;
import gradingTools.comp301ss21.assignment3.testcases.style.A3NoStarImports;
import gradingTools.comp301ss21.assignment3.testcases.style.A3NonPublicAccessModifiersMatched;
import gradingTools.comp301ss21.assignment3.testcases.style.A3PackageDeclarations;
import gradingTools.comp301ss21.assignment3.testcases.style.A3PublicMethodsOverride;
import gradingTools.comp301ss21.assignment3.testcases.style.A3SimplifyBooleanExpressions;
import gradingTools.comp301ss21.assignment3.testcases.style.A3SimplifyBooleanReturns;
@RunWith(Suite.class)
@Suite.SuiteClasses({
A3PackageDeclarations.class,
A3SimplifyBooleanExpressions.class,
A3SimplifyBooleanReturns.class,
A3NoHiddenFields.class,
A3NamingConventions.class,
A3InterfaceAsType.class,
A3NamedConstants.class,
A3NoStarImports.class,
A3PublicMethodsOverride.class,
A3MnemonicNames.class,
A3Encapsulation.class,
A3NonPublicAccessModifiersMatched.class,
A3CommonPropertiesAreInherited.class,
A3CommonSignaturesAreInherited.class


})
public class A3Style {

	
}
