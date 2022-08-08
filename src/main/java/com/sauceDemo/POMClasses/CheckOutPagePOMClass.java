package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPagePOMClass 
{
	private WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement FirstName;
	public void sendFirstName() 
	{
		FirstName.sendKeys("Abhijeet");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement LastName;
	public void sendLastName() 
	{
		LastName.sendKeys("Khillare");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement PinCode;
	public void sendPinCode() 
	{
		PinCode.sendKeys("123456");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement ContinueButton;
	public void clickContinueButton()
	{
		ContinueButton.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement CancelButton;
	public void  clickCancelButton()
	{
		CancelButton.click();
		System.out.println("HII");
	}
	
	
	public CheckOutPagePOMClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
