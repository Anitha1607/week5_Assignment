package week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ServiceNow_Assign extends Servicenow  {
	@Test
	public void assign() throws InterruptedException {
		driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
		driver.switchTo().frame(0);		 
		driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys(incidentnumber,Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-default'])[5]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
				driver.switchTo().window(list.get(1));
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("software",Keys.ENTER);
				driver.findElement(By.xpath("//a[text()='Software']")).click();
				driver.switchTo().window(list.get(0));
				driver.switchTo().frame(0);
			String assigned=driver.findElement(By.xpath("//input[@name='sys_display.incident.assignment_group']")).getAttribute("value");
				System.out.println("The assigned group1 is:"+assigned);
				
				driver.findElement(By.xpath("(//textarea[@placeholder='Work notes'])[2]")).sendKeys("hello");
				driver.findElement(By.xpath("//button[@class='btn btn-default activity-submit']")).click();
				driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
				String group1 = driver.findElement(By.xpath("(//a[@class='linked'])[2]")).getText();

				
				System.out.println("The assigned group is:"+group1);
if(assigned.equals(group1)) {
	System.out.println("The group is same");
}
else
{
	System.out.println("The group is not same");
}

	}

}
