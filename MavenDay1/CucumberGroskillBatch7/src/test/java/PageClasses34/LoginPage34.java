package PageClasses34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage34 extends BaseClass {
	
	WebDriver driver;
	
	public LoginPage34(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement submit;
	
	public void enterUserName(String userName)
	{
		uname.sendKeys(userName);
		
		
	}

	public void enterPassword(String password)
	{
		pwd.sendKeys(password);
		
		
	}

	public void clickLogin()
	{
		submit.click();
	}
	
	
	
	
	
	
	
	
	

}
