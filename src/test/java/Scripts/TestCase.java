package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase extends BaseClass {

	@Test
	public void tc() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddtoCartPage d=new AddtoCartPage(driver);
		utilies.doubleClick(driver, d.getAddbtn());
		d.carttocartbtn();
		utilies.alertPopup(driver);
	}
}
