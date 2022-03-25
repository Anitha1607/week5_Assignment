package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ServiceNow_Update extends Servicenow  {
	



	
	@Test//(dependsOnMethods = "week5.ServiceNow_Create.create")
	public void update () throws InterruptedException{
		driver.findElement(By.linkText("All")).click();
		driver.switchTo().frame(0);		 
				driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentnumber,Keys.ENTER);
				
				
				driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
			
		driver.findElement(By.xpath("(//select[@role='listbox'])[4]")).click();
		Thread.sleep(1000);			
		WebElement state = driver.findElement(By.xpath("//option[text()='In Progress']"));
		state.click();
		String states = state.getText();
		System.out.println("The State is:"+states);
		
		driver.findElement(By.xpath("(//select[@role='listbox'])[7]")).click();
		WebElement urgency = driver.findElement(By.xpath("(//option[@value='1'])[5]"));
		urgency.click();
		String str=urgency.getAttribute("value");
		int urgency1=Integer.parseInt(str);
		System.out.println("The urgency is:"+urgency1);
		String priority	;
		if(urgency1==2) {
			 priority= driver.findElement(By.xpath("(//option[@value='4'])[2]")).getText();
			System.out.println("The priority value:"+priority);
		}
		else 
			if(urgency1==1) {
				 priority = driver.findElement(By.xpath("(//option[@value='3'])[5]")).getText();
				System.out.println("The priority value:"+priority);
		}
			else {
				
				 priority= driver.findElement(By.xpath("(//option[@value='5'])[2]")).getText();
				System.out.println("The priority value:"+priority);
			}
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		
		
		 String priority1=driver.findElement(By.xpath("//td[text()='3 - Moderate']")).getText();
		 System.out.println("The priority value:"+priority1);
	
			if(priority.equals(priority1)) {
				System.out.println("The priority is same");
			}
			else
			{
				System.out.println("The priority is not same");
			}
			
			String state1= driver.findElement(By.xpath("//td[text()='In Progress']")).getText();
			System.out.println("The state1 value:"+state1);
		
				if(state1.equals(states)) {
					System.out.println("The state is same");
				}
				else
				{
					System.out.println("The state is not same");
				}

	}
}
