package com.cloudamize.cmp.automation.cucumber.step;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cloucamize.cmp.automation.cucumber.pages.LoginPage;
import com.cloudamize.cmp.automation.cucumber.base.Constants;
import com.cloudamize.cmp.automation.cucumber.base.TestBase;
import com.cloudamize.cmp.automation.cucumber.base.WriteUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPage_Response extends TestBase

{
	LoginPage loginPage;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	String startTime = dateFormat.format(date);
    long lStartTime;
    long loginEndTime;
    long totalTime;

	String filename = "ResponceTime.csv";

	public LoginPage_Response() {
		super();
	}


	@Given("^User is on cloudamize login page and have valid credentials$")
	public void User_is_on_cloudamize_login_page_and_have_valid_credentials() 
	{
		System.out.println("111111111");
		TestBase.openBrowser();
		loginPage = new LoginPage();
		Assert.assertTrue(loginPage.getUserNameTextBox().isDisplayed(), "Login Page username text box is not present");
		Assert.assertTrue(loginPage.getPasswordNameTextBox().isDisplayed(), "Login Page Password text box is not present");
	}
	
    @When("^User enter valid username and password$")
    public void User_enter_valid_username_and_password() 
    {
    	loginPage.enterUserName(prop.getProperty("username"));
		loginPage.enterPassword(prop.getProperty("password"));	
    }
	   
	@And("^click on login button$")
	public void click_on_login_button() 
	{
	    lStartTime = new Date().getTime();
		loginPage.clickOnLoginButton();
		if(TestBase.isLoaderVisible() == true) 
		{
			WebDriverWait wait = new WebDriverWait(driver, 3000);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Constants.loadingIcon)));
		}
		System.out.println(driver.findElement(By.xpath("//div[@id='nodeCountLabel']")).getText());
	     loginEndTime = System.currentTimeMillis();
         totalTime = ((loginEndTime - lStartTime) / 1000);
		
	}
	  
	@Then("^Application should redirect user to home page of cloudamize and response time will be reported$")
	public void Application_should_redirect_user_to_home_page_of_cloudamize_and_response_time_will_be_reported() throws InterruptedException 
	{
		WriteUtil.writeData(startTime, "" + totalTime + " " + "Second", "Login To Cloudmize Application", "Login");
		loginPage.logoutFromCloudamize();
		
	}
	
}
