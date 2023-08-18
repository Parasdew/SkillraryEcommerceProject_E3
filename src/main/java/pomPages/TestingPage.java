package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

//	decelaration
	
//	address of selenium training
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumtraining;
	
//	address of cart
	@FindBy(id="mycart")
	private WebElement carttab;
	
//	address of facebook
	@FindBy(xpath="//i[@class='fa fa-bars']")
	private WebElement facebook;
	
//	Initilization
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	Utilization
	
	public WebElement getSeliniumTraining() {
		return seleniumtraining;
	}
	
	public WebElement getCarttab() {
		return carttab;
	}
	
	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebookicon() {
		facebook.click();
	}
}
