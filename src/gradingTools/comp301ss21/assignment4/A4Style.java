package gradingTools.comp301ss21.assignment4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import gradingTools.comp301ss21.assignment4.style.A4CommonPropertiesAreInherited;
import gradingTools.comp301ss21.assignment4.style.A4CommonSignaturesAreInherited;
import gradingTools.comp301ss21.assignment4.style.A4Encapsulation;
import gradingTools.comp301ss21.assignment4.style.A4InterfaceAsType;
import gradingTools.comp301ss21.assignment4.style.A4MnemonicNames;
import gradingTools.comp301ss21.assignment4.style.A4NamedConstants;
import gradingTools.comp301ss21.assignment4.style.A4NamingConventions;
import gradingTools.comp301ss21.assignment4.style.A4NoHiddenFields;
import gradingTools.comp301ss21.assignment4.style.A4NoStarImports;
import gradingTools.comp301ss21.assignment4.style.A4NonPublicAccessModifiersMatched;
import gradingTools.comp301ss21.assignment4.style.A4PackageDeclarations;
import gradingTools.comp301ss21.assignment4.style.A4PublicMethodsOverride;
import gradingTools.comp301ss21.assignment4.style.A4SimplifyBooleanExpressions;
import gradingTools.comp301ss21.assignment4.style.A4SimplifyBooleanReturns;
@RunWith(Suite.class)
@Suite.SuiteClasses({
A4PackageDeclarations.class,
A4SimplifyBooleanExpressions.class,
A4SimplifyBooleanReturns.class,
A4NoHiddenFields.class,
A4NamingConventions.class,
A4InterfaceAsType.class,
A4NamedConstants.class,
A4NoStarImports.class,
A4PublicMethodsOverride.class,
A4MnemonicNames.class,
A4Encapsulation.class,
A4NonPublicAccessModifiersMatched.class,
A4CommonPropertiesAreInherited.class,
A4CommonSignaturesAreInherited.class


})
public class A4Style {

	
}
