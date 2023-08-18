package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

//	Handling Drop Down
	 public void dropdown(WebElement ele,String text) {
		 Select s = new Select(ele);
		 s.selectByVisibleText(text);
	 }
	 
//	 Handling mouse hover
	 public void mouseHover(WebDriver driver,WebElement ele) {
		 Actions a=new Actions(driver);
		 a.moveToElement(ele).perform();
	 }
	 
//	 Handling Double Click
	 public void doubleClick(WebDriver driver,WebElement ele) {
		 Actions a=new Actions(driver);
		 a.doubleClick(ele).perform();
	 }
	 
//	Handling Right click
	 public void rightclick(WebDriver driver,WebElement ele) {
		 Actions a= new Actions(driver);
		 a.contextClick(ele).perform();
	 }
	 
//	 Handling drag and drop
	 public void dragdrop(WebDriver driver,WebElement src,WebElement target) {
		 Actions a=new Actions(driver);
		 a.dragAndDrop(src, target);
	 }
	 
//	 shifting control to frame
	 public void switchFrame(WebDriver driver) {
		 driver.switchTo().frame(0);	 
	 }


//	shifting control to normal web page
	 public void switchbackframe(WebDriver driver) {
		 driver.switchTo().defaultContent();
	 }
	 
//	 shifting control to popup
	 public void alertPopup(WebDriver driver) {
		 driver.switchTo().alert().accept();;
	 }
	 
//	 shifting control to child window
	 public void switchingtabs(WebDriver driver) {
		 Set<String> child = driver.getWindowHandles();
		 for(String b:child) {
			 driver.switchTo().window(b);
		 }
	 }

//handling scroll bar
	 public void scrollCar(WebDriver driver,int x,int y) {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("windows.scrollBy("+x+","+y+")");
	 }
}