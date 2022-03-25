package week5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTabMethods {
	
	public ChromeDriver driver;
	public String excelFilePath;
@Parameters({"URL"})	
	
@BeforeMethod
public void BeforeMethod(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url);
}

@AfterMethod
public void AfterMethod() {
	driver.close();
}

@DataProvider(name="Dynamic_Data")
public String[][] testdata() throws IOException{
	String[][] data= ReadExcel1.getdata(excelFilePath);
	 return data;
}
@DataProvider(name="Dynamic_Data1")
public String[][] testdata1() throws IOException{
	String[][] data= ReadExcel2.getdata(excelFilePath);
	 return data;
}
@DataProvider(name="Dynamic_Data2")
public String[][] testdata2() throws IOException{
	String[][] data= ReadExcel3.getdata(excelFilePath);
	 return data;
}
@DataProvider(name="Dynamic_Data3")
public String[][] testdata3() throws IOException{
	String[][] data= ReadExcel4.getdata(excelFilePath);
	 return data;
}

}


