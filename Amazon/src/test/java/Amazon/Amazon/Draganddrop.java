package Amazon.Amazon;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

public static WebDriver driver;

@BeforeTest
	
	public static void setup()
	{
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91900\\eclipse-workspace\\Amazon\\src\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver= new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Utilities.Implicit_wait, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void starttest() throws InterruptedException {
		
	WebElement source= driver.findElement(By.xpath("//a[text()=' 5000 ']"));


	WebElement destination=driver.findElement(By.id("amt8"));
	Actions action= new Actions(driver);
	action.dragAndDrop(source,destination);
	
	}
	
	
@AfterTest
public void close() {
	
		driver.quit();

}
}

