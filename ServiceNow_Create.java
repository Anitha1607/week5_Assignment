package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ServiceNow_Create extends Servicenow {
	

@Test
	public void create() {
	
		driver.findElement(By.xpath("(//div[text()='Create New'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
				driver.switchTo().window(list.get(1));
				
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
				driver.switchTo().window(list.get(0));
				driver.switchTo().frame(0);
				driver.findElement(By.id("incident.short_description")).sendKeys("sampledemo1");
		String	 attribute = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
				 System.out.println("The incident number is:"+attribute);
				 driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
				driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(attribute,Keys.ENTER);
					
					  incidentnumber=driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
					  System.out.println("The Incident number1 is:"+incidentnumber);
					  if(attribute.equals(incidentnumber)) {
					  System.out.println("The incident number is Created"); } else {
					  System.out.println("The incident number is not Created"); }
					 
				
				
	}

}
