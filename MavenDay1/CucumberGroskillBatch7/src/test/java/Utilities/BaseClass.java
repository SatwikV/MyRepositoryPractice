package Utilities;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	static String browserName;
	public static WebDriver driver;
	
	
	
	public static WebDriver initializeDriver() 
	{
		try {
			browserName=FetchDataFromProperty.getDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			
			
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel.getURL(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			
		}
		
		if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL(1, 0));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			
		}
		
		return driver;
		
	}
	
	public static String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public static String generateEmail() {
	    String email= "user_" + java.util.UUID.randomUUID().toString().substring(0, 8) + "@gmail.com";
	    return email;
	    
	    
	}
	
	
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	public static void scrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)", "");
		
	}
	
	
	
	
	

}
