package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//form//div[1]//input")
	private WebElement UserName;
	public void SendUserName() 
	{
		UserName.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//form//div[2]//input")
	private WebElement PassWord;
	public void SendPassword() 
	{
		PassWord.sendKeys("secret_sauce");	
	}
	
	@FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")
	private WebElement LoginButton;
	public void ClickOnLoginButton() 
	{
		LoginButton.click();	
	}
	
	
	public LogInPOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
