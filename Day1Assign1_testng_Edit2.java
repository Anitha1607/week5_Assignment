package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assign1_testng_Edit2  extends BaseclassforLeaf {
@Test
	public  void text() {
	
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("ani",Keys.TAB);

	}

}
