package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPagePOMClass 
{
	
	private WebDriver driver;
	
	
	@FindBy(xpath="//button[text()='Remove']")
	private WebElement RemoveButton;
	public void clickRemoveButton() 
	{
		RemoveButton.click();
	}
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement CheckOutButton;
	public void clickCheckOutButton() 
	{
		CheckOutButton.click();	
	}
	
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement ContinueShoppingButton;
	public void clickContinueShoppingButton() 
	{
		ContinueShoppingButton.click();	
	}
	
	@FindBy(xpath="//div[text()='9.99']")
	private WebElement priceOfBikeLight;
	public String gettextFromYourCartPage() 
	{
		priceOfBikeLight.getText();
		return priceOfBikeLight.getText();
	}
	
	
	public YourCartPagePOMClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}	

}
