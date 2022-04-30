package Amazon.Amazon;

import org.junit.Before;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Screenshot.class)
public class Amazon_logo extends Base_Test  {
	
	Launch_page launchpage ;
	


	
	@Test
	public void diplay_logo() {
	launchpage = new Launch_page();
	//	setup()
	launchpage.logo_dispaly();
	Reporter.log("Logo is displayed");
	Reporter.log("Amazon pop_up is opened");
		launchpage.pop_up();
	launchpage.sign_in_option();
	Reporter.log("sign in page is opened");
	
	
	}
}
