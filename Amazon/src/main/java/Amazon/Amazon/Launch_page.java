package Amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Launch_page extends Base_Test {

	
	
		
		@FindBy(id="nav-logo-sprites")
		 WebElement logo;
		@FindBy(xpath="//div[@class='nav-line-1-container']")
		 WebElement pop_up_point;
		@FindBy(xpath="//span[@class='nav-action-inner']") 
	     WebElement sign_in;
		
		
		public Launch_page()
		{
			PageFactory.initElements(driver, this);
		}
		
		
				
		public boolean logo_dispaly()
		{
			return logo.isDisplayed();
		}
		public boolean pop_up() 
		{
			Actions action= new Actions(driver);
			action.moveToElement(pop_up_point).build().perform();
			return pop_up_point.isDisplayed();
		}
		public void sign_in_option()
		{
			sign_in.click();
		}
		
	
}
