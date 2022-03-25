package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assign1_testng_Edit5 extends BaseclassforLeaf {
@Test
	public void textdisable() {
		
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isDisplayed());

	}

}
