package Amazon.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Log_in_page extends Base_Test {

	
	
		
		@FindBy(id="ap_email1")
		 WebElement email_field;
		@FindBy(id="continue")
		 WebElement continue_button;
		@FindBy(id="ap_password") 
	     WebElement password;
		@FindBy(id="auth-signin-button") 
	     WebElement sign_in_button;
		
		
		public Log_in_page()
		{
			PageFactory.initElements(driver, this);
		}
		
		
				
		
		public void login() 
		{
			email_field.sendKeys("troyee.tr@gmail.com");
			continue_button.click();
			password.sendKeys("Troyee@2311");
			sign_in_button.click();
			
		}
		
	
}
