package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Assign1_testng_Edit4 extends BaseclassforLeaf {
@Test
	public void clear() {
		
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

	}

}
