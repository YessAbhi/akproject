package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPagePOMClass 

{
	private WebDriver driver;

	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement AddToCartButton;
	public void clickAddToCartButton() 
	{
		AddToCartButton.click();
	}
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement BackToProductsButton;
	public void clickBackToProductsButton() 
	{
		BackToProductsButton.click();
	}
	
	@FindBy(xpath="//div[text()='carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.']")
	private WebElement info;
	public String getTextFromProductInfoPage() 
	{
		info.getText();
		return  info.getText();
	}
	
	public ProductInfoPagePOMClass(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
