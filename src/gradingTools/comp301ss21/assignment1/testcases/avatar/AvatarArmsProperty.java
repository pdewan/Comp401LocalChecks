package gradingTools.comp301ss21.assignment1.testcases.avatar;

import gradingTools.basics.sharedTestCase.checkstyle.CheckStylePropertyDefinedTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import util.annotations.Explanation;
import util.annotations.MaxValue;
@MaxValue(2)
@Explanation("Checks that property has the expected name and its interface type has expected name, tag, or pattern")
public class AvatarArmsProperty extends CheckStylePropertyDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public AvatarArmsProperty() {
		super("Comp301Tags\\.AVATAR", "Arms","Comp301Tags\\.ANGLE");
		// TODO Auto-generated constructor stub
	}
	
	protected Class precedingTest() {
		return TaggedAvatar.class;
	}

}
