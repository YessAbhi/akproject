package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCopletPagePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement BackToHomePageButton;
	public void clickBackToHomePageButton() 
	{
		BackToHomePageButton.click();
	}
	
	
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	private WebElement txt;
	public String getTextFromLastPage() 
	{
		txt.getText();
		return txt.getText();
	}
	
	public OrderCopletPagePOMClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}	

}
