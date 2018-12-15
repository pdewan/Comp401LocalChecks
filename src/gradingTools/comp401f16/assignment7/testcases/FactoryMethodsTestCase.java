package gradingTools.comp401f16.assignment7.testcases;

import grader.basics.execution.BasicProjectExecution;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.shared.testcases.ProxyTest;

import java.lang.reflect.Method;

import util.trace.Tracer;

public abstract class FactoryMethodsTestCase extends ProxyTest{
	protected String[] factoryClassTags = new String[] {"SingletonsCreator"};
	protected String[] factoryMethodTags = new String[] {};
	protected boolean foundFactoryMethod;
	protected boolean foundFactoryClass;
	protected boolean nullInstantiation;
	protected boolean correctInstantiatedClass;
	protected boolean singletonCheckPass;

	
	protected Object[] emptyObjectArgs = new Object[] {};
	
	protected String[] factoryClassTags() {
		return factoryClassTags;
	}
	
	protected String[] factoryMethodTags() {
		return factoryMethodTags;
	}
	protected boolean doSingletonCheck(Object aFirstInstantiation) throws Throwable {
		Object aSecondCreation = createUsingFactoryMethod();
		singletonCheckPass = aSecondCreation == aFirstInstantiation;
		return singletonCheckPass;
	}	
	
	
	protected Object getOrCreateObject (String[] factoryClassTag, String[] factoryMethodTag, Class instantiatedTypeClass) throws Throwable {
		Class<?> factoryClass = BasicProjectIntrospection.findClassByTags(factoryClassTags());
		foundFactoryClass = factoryClass != null;

		if (!foundFactoryClass) {
			Tracer.info(this,"Factory class:" + factoryClassTag + " not found.");			
			return BasicProjectIntrospection.createInstance(instantiatedTypeClass);
		}
		Method factoryMethod =	BasicProjectIntrospection.findUniqueMethodByTag(
				factoryClass, factoryMethodTag);
		foundFactoryMethod = factoryMethod != null;
		if (!foundFactoryMethod) {
			return BasicProjectIntrospection.createInstance(instantiatedTypeClass);
		}
		
		Object anInstance = BasicProjectExecution.timedInvoke(factoryClass, factoryMethod, emptyObjectArgs);
		nullInstantiation = anInstance == null;
		if (nullInstantiation) {
			return BasicProjectIntrospection.createInstance(instantiatedTypeClass);
			
		}
		Class aReturnedClass = anInstance.getClass();
		correctInstantiatedClass = aReturnedClass.equals(instantiatedTypeClass);
		if (!correctInstantiatedClass) {
			return BasicProjectIntrospection.createInstance(instantiatedTypeClass);
		}
		return anInstance;
		
	}
	protected Object createUsingFactoryMethod() throws Throwable {
		return getOrCreateObject(factoryClassTags(), factoryMethodTags(), proxyClass());
		
	}	
	
	
	
}
