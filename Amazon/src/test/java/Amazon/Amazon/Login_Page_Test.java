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
public class Login_Page_Test extends Base_Test  {
	
	Log_in_page loginpage ;
	Launch_page launchpage;
	


	
	@Test
	public void log_in() {
	extentTest = extent.startTest("Login_Page_Test");
	loginpage = new Log_in_page();
	launchpage= new Launch_page();
	//	setup()
	
	Reporter.log("Amazon pop_up is opened");
	launchpage.pop_up();
	launchpage.sign_in_option();
	Reporter.log("sign in page is opened");
	loginpage.login();
	
	
	}
}
