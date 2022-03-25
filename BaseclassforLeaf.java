package week5;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassforLeaf {
	public RemoteWebDriver driver;
	
	@BeforeMethod
	public void BeforeMethod() {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leafground.com/pages/Edit.html");

}
	@AfterMethod
	public void AfterMethod() {
		driver.close();
	}
}