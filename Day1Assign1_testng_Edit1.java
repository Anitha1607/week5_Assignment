package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assign1_testng_Edit1 extends BaseclassforLeaf {
@Test
	public void email(){
		
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");

	}

}
