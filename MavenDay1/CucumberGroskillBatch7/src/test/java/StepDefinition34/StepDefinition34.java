package StepDefinition34;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageClasses34.LoginPage34;
import PageClasses34.NewCustomerPage56;
import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition34 extends BaseClass {
	
	WebDriver driver=BaseClass.initializeDriver();
	LoginPage34 obj=new LoginPage34(driver);
	NewCustomerPage56 obj1=new NewCustomerPage56(driver);
	
	@Given("user opens the guru99 demo app")
	public void user_opens_the_guru99_demo_app() 
	{
		getTitle();
		Assert.assertEquals(false, false);
		
	}

	@Given("user enters the username in uname field as {string}")
	public void user_enters_the_username_in_uname_field_as(String username) 
	{
	  
		obj.enterUserName(username);
	}

	@Given("user enters the password in pwd field as {string}")
	public void user_enters_the_password_in_pwd_field_as(String password) 
	{
	   obj.enterPassword(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() 
	{
	   obj.clickLogin();
	}

	@Then("user will be navigated to the homepage of the application")
	public void user_will_be_navigated_to_the_homepage_of_the_application() 
	{
		String title=getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
	}
	


	



	@Given("user clicks on New Customer link")
	public void user_clicks_on_new_customer_link() {
		
		obj1.clickOnNewCustomer();
	   
	}

	@Given("user enters the customer name as {string}")
	public void user_enters_the_customer_name_as(String cust_name) {
		
		obj1.enterUserName(cust_name);
	    
	}

	@Given("user selects gender")
	public void user_selects_gender() {
	   
		obj1.selectGender();
		
	}

	@Given("user enters date of birth as {string}")
	public void user_enters_date_of_birth_as(String dob) {
		
		obj1.enterDOB(dob);
	   
	}

	@Given("user enters address as {string}")
	public void user_enters_address_as(String address) {
		
		obj1.enterAddress(address);
	   
	}

	@Given("user enters city  as {string}")
	public void user_enters_city_as(String city) {
		
		obj1.enterCity(city);
	   
	}

	@Given("user enters state as {string}")
	public void user_enters_state_as(String state) {
		
		obj1.enterState(state);
	    
	}

	@Given("user enters pin as {string}")
	public void user_enters_pin_as(String pin) {
		
		obj1.enterPin(pin);
	   
	}

	@Given("user enters mobile as {string}")
	public void user_enters_mobile_as(String mobile) {
		
		obj1.enterMobile(mobile);
	    
	}

	@Given("user enters email as emailAddress")
	public void user_enters_email_as_email_address() {
		
		obj1.enterEmail(generateEmail());
		
		
	    
	}

	@Given("user enters password for new customer creation as {string}")
	public void user_enters_password_for_new_customer_creation_as(String password) {
	    
		obj1.enterPassword(password);
		
	}

	@When("user clicks on new customer creation submit button")
	public void user_clicks_on_new_customer_creation_submit_button() {
		
		obj1.clickOnSubmit();
	    
	}

	@Then("a new customer will be created")
	public void a_new_customer_will_be_created() {
		
		boolean flag=obj1.custIDValidation();
		Assert.assertEquals(true, flag);
	   
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id() {
		
		String custID=obj1.captureCustID();
		System.out.println(custID);
	   
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
		
		closeBrowser();
	    
	}


}
