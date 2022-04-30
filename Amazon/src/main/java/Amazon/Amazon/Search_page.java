package Amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Search_page extends Base_Test {

	
	
		
		@FindBy(id="twotabsearchtextbox")
		 WebElement search_bar;
		@FindBy(id="nav-search-submit-button")
		 WebElement search_button;
		@FindBy(xpath="//span[text()='SUGAR Cosmetics Smudge Me Not Liquid Mini Lipstick Set | Nude Set | Matte Finish - (Combo | Pack of 4)']")
	     WebElement product;
		@FindBy(xpath="//div[@aria-label='liquid lipstick']")
	     WebElement product_from_dropdown;
		
		
		
		public Search_page()
		{
			PageFactory.initElements(driver, this);
		}
		
		
				
		
		public void search() throws InterruptedException 
		{
			search_bar.sendKeys("liquid lipstick");
			Thread.sleep(5000);
			if(product_from_dropdown.isDisplayed())
			{
				product_from_dropdown.click();
			}
			else {
			search_button.click();
			}
			product.click();
			
			
		}
		
	
}
