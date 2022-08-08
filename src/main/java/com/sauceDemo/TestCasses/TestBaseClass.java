package com.sauceDemo.TestCasses;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.LogInPOMClass;
import com.sauceDemo.UtilityClasses.ScreenShotClass;


public class TestBaseClass 
{
	
	WebDriver driver;
	Logger log =Logger.getLogger("SauceDemo_project");
	
	@Parameters("browserName")
	@BeforeMethod
	public  void setUp(String browserName) throws IOException 
	{
	
		if(browserName.equals("chrome")) 
		{
		  System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe");
		  driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Throw the Error");
		}
	    PropertyConfigurator.configure("log4j.properties");
	    log.info("browser is open Successfully");
		driver.manage().window().maximize();
		log.info("browser Maximized Successfully");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		log.info("Site is open Successfully");
		
		
		LogInPOMClass lp = new LogInPOMClass(driver);
		lp.SendUserName();
		log.info("Username send Successfully");
		lp.SendPassword();
		log.info("Password send Successfully");
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		lp.ClickOnLoginButton();
		log.info("LogIn Button Clicked Successfully");	
	}
	
	
	@AfterMethod
	public void tearDown() throws IOException 
	{   
	
		HomePagePOMClasss hp = new HomePagePOMClasss(driver);
//		driver.navigate().back();
		hp.clickOpenManuButton();
		log.info("Logout button Clicked  Successfully");
		hp.clickLogOutButton();
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		driver.quit();
		log.info("Browser Closed Successfully");

	}

}
