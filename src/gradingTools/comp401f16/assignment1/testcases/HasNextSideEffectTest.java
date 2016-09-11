package gradingTools.comp401f16.assignment1.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;

import util.annotations.IsExtra;
import util.annotations.MaxValue;
import grader.basics.execution.BasicProjectExecution;
import grader.basics.junit.NotesAndScore;
import grader.basics.project.BasicProjectIntrospection;
import gradingTools.shared.testcases.MethodExecutionTest;
@IsExtra(true)
@MaxValue(5)
public class HasNextSideEffectTest extends ScanningIteratorTest{
	

	protected void doExtraStep() {
		iterator.hasNext();
	}
	

}
