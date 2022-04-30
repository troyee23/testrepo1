package Amazon.Amazon;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MMT {

public static WebDriver driver;

@BeforeTest
	
	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91900\\eclipse-workspace\\Amazon\\src\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!ETA!108599293!6504095653!491619965162!e!goibibo!c!&gclid=Cj0KCQjwmPSSBhCNARIsAH3cYgasNcpSI6J40jdZKg0nRdhBzfJoTqcDIk41WOeCVceYoLJ5Chmw2FgaAp_CEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Utilities.Implicit_wait, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void starttest() throws InterruptedException {
		
		
	WebElement ele= driver.findElement(By.xpath("//div[@class='sc-hiCibw dGZLZw']"));
	//ele.click();
	//Thread.sleep(5000);
	//WebElement textbox=driver.findElement(By.xpath("//input[@type='text']']"));
	Actions action= new Actions(driver);
	action.moveToElement(ele).click().sendKeys("ran").build().perform();
	//ele.sendKeys("ran");
	 List<WebElement> list = driver.findElements(By.xpath("//div[@class='sc-iAKWXU iyyKqe']"));
	 for(WebElement name:list)
	 {
		   String city = name.getText();
		   if(city.contains("Ranchi"))
		   {
			   name.click();
			   System.out.println("Ranchi is selected");
			   break;
			  
		   }
	 }
	 
	 
	 
	//	driver.findElement(By.xpath("//p[text()='Ranchi, India']")).click();
	}
		
	
	
	
@AfterTest
public void close() {
	
		driver.quit();

}
}

