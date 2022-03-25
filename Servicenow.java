package week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Servicenow {
	public RemoteWebDriver driver;
	public static String incidentnumber;
	
	@BeforeMethod
public void beforemethod() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://dev94202.service-now.com/navpage.do");
	driver.switchTo().frame(0);
	driver.findElement(By.id("user_name")).sendKeys("admin");
    driver.findElement(By.id("user_password")).sendKeys("Scintel@1604");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident",Keys.ENTER);
    
}
@AfterMethod
public void aftermethod() {
	driver.close();
}

}
