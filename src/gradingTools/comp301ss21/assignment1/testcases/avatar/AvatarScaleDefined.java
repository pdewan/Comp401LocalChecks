package gradingTools.comp301ss21.assignment1.testcases.avatar;

import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodCalledTestCase;
import gradingTools.basics.sharedTestCase.checkstyle.CheckstyleMethodDefinedTestCase;
import gradingTools.comp301ss21.assignment1.testcases.line.fixed.TaggedRotatingLine;
import util.annotations.IsExtra;
import util.annotations.MaxValue;
@MaxValue(2)
@IsExtra(true)
public class AvatarScaleDefined extends CheckstyleMethodDefinedTestCase {
//	[INFO] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Expected signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. Good! [ExpectedSignatures]
//	[WARN] D:\dewan_backup\Java\grail13\.\src\greeting\Cls.java:6: Missing signature main:String[]->void in type greeting.Cls:[@Comp301Tags.GREETING_MAIN]. [ExpectedSignatures]
	public AvatarScaleDefined() {
		super("Comp301Tags\\.AVATAR", "scale:double->void");
		// TODO Auto-generated constructor stub
	}
	@Override
	protected Class precedingTest() {
		return  TaggedAvatar.class;
	}

}
