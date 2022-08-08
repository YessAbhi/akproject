package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderOverviewPagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement FinishButton;
	public void  clickFinishButton()
	{
		FinishButton.click();
	}
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement CancelButton;
	public void  clickCancelButton()
	{
		CancelButton.click();
	}
	
	
	public OrderOverviewPagePOMClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
