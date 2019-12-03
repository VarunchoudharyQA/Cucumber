package com.cloucamize.cmp.automation.cucumber.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cloudamize.cmp.automation.cucumber.base.Constants;
import com.cloudamize.cmp.automation.cucumber.base.TestBase;




public class LoginPage extends TestBase
{
	@FindBy(id = Constants.username) 
	public WebElement userNameTextBox;
	
	@FindBy(id = Constants.password)
	public WebElement passwordNameTextBox;
	
	@FindBy(id = Constants.LoginButton)
	public WebElement loginButton;
	
	@FindBy(xpath = Constants.computeNodes)
	public WebElement computeNodes;
	
	@FindBy(xpath = Constants.usernameLink)
    public WebElement usernameLink;
	
	@FindBy(xpath = Constants.logoutLink)
    public WebElement logoutLink;
	
	@FindBy(xpath = Constants.azureDetailsButton)
	public WebElement azureDeatilsButton;
	
	@FindBy(xpath = Constants.gridtitle)
	public WebElement gridTitle;
	

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getComputeNodes() {
		return computeNodes;
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}
	
	public void enterUserName(String username) {
		userNameTextBox.sendKeys(username);
		
	}
	public WebElement getPasswordNameTextBox() {
		return passwordNameTextBox;
	}
	public void enterPassword(String password) {
		passwordNameTextBox.sendKeys(password);;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void clickOnLoginButton() {
		 loginButton.click();
	}
	
	public WebElement getUsernameLink() {
		return usernameLink;
	}
	

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getAzureDeatilsButton() {
		return azureDeatilsButton;
	}
	
	public WebElement getGriddetails() {
		return gridTitle;
	}
	
	public void logoutFromCloudamize() throws InterruptedException{
		TestBase.Wait5();
		getUsernameLink().click();
		getLogoutLink().click();
	}

	
	public void loginCloudmize(String customer_email, String customer_password) 
	{
		enterUserName(customer_email);
		enterPassword(customer_password);
		clickOnLoginButton();
	}
	
	
	public void clickOnazureDeatilsButton() throws InterruptedException {
		TestBase.Wait5();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(Constants.ShowAzureViewDetails))).click();
	}
	
	
	
        
}
