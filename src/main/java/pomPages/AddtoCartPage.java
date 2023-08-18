package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {

//	Declaration
	
//	address of + button
	@FindBy(id="add")
	private WebElement addbtn;
	
//	address of add cart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	
//	Initilization
	
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	Utilization
	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void carttocartbtn() {
		cartbtn.click();
	}
}
