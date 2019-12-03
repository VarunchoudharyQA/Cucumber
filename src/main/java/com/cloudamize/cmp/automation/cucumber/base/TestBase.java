package com.cloudamize.cmp.automation.cucumber.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cloucamize.cmp.automation.cucumber.pages.LoginPage;



public class TestBase 

{
	public static  WebDriver driver;


	public static Properties prop;
	
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/cloudamize/cmp/automation/"
					+ "/cucumber/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void openBrowser(){
		String browserName = prop.getProperty("browserchrome");
		
		if(browserName.equals("chrome")){
			String Chromepath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",Chromepath + "/chromedriver");		
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("Firefox")){
			String Firefoxpath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",Firefoxpath + "/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get(prop.getProperty("url"));		
	}
	
	public static void openBrowserInHeadlessMode() 
	{
		String browserName = prop.getProperty("browserchrome");
		if(browserName.equals("chrome")){
			String Chromepath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",Chromepath + "/chromedriver.exe");	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("--start-maximized");
			options.addArguments("disable-infobars");
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--headless"); 
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options); 
		}
		else if(browserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "/Applications/UIAutomation_Wireframe/cmp-automation-performance/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get(prop.getProperty("url"));
	}
		
	public static void Wait5() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void Wait10() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void loginToCloudamize() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName(prop.getProperty("username"));
		loginPage.enterPassword(System.getProperty("Password"));
		  loginPage.clickOnLoginButton();
	}
	
	public static WebElement waitUntilVisible(WebElement element) 
	{
		final int timeToWait = 10000;
		WebDriverWait wait = new WebDriverWait(driver, timeToWait);
		return wait.until(ExpectedConditions.visibilityOf(element));		
	}
	
	
	public static WebElement waitUntileClickable(By element) 
	{
		final int timeTowait = 10000;
		WebDriverWait wait = new WebDriverWait(driver, timeTowait);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static boolean isLoaderVisible() 
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.loadingIcon)));	
			return true;
		} catch (Exception e) {
			return false;
		} 
	}
	
	public static boolean isGridLoaderVisible() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constants.Gridloader)));
		return true; 
	}

	

		
}
