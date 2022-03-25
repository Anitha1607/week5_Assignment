package week5;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ServiceNow_Delete extends Servicenow  {
	@Test(dependsOnMethods = "week5.ServiceNow_Create.create")
	public void delete() {
		driver.findElement(By.linkText("All")).click();
		driver.switchTo().frame(0);		 
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentnumber,Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		@SuppressWarnings("deprecation") 
		WebDriverWait wait = new WebDriverWait(driver,1000);
				  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='incident.number']")));
		
		String incidentno = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("The incident number:"+incidentno);
		driver.findElement(By.xpath("(//button[@type='submit'])[6]")).click();
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		
		
		  
		/*  //driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(
		//''ncidentnumber,Keys.ENTER);
*/		 
		String text=  driver.findElement(By.xpath("//tr[@class='list2_no_records']/td")).getText();
		System.out.println("The Incident is :"+text);
	}
}
