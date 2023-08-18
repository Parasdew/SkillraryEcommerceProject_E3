package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase1 extends BaseClass{

	@Test
	public void tc2() throws Throwable {
		SkillraryLoginPage s1= new SkillraryLoginPage(driver);
		s1.gearsbutton();
		s1.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilies.dropdown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
		utilies.dragdrop(driver, tp.getSeliniumTraining(), tp.getCarttab());
	}
}
