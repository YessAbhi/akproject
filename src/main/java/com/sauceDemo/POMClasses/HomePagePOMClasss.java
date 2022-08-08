package com.sauceDemo.POMClasses;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMClasss 
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement OpenManuButton;
	public void clickOpenManuButton() 
	{
		OpenManuButton.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogOutButton;
	public void clickLogOutButton() 
	{
		LogOutButton.click();
	}
	
	
	@FindBy(xpath="//a[text()='All Items']")
	private WebElement AllItemButton;
	public void clickAllItemButton() 
	{
		AllItemButton.click();
	}
	
	@FindBy(xpath="//a[text()='About']")
	private WebElement AboutButton;
	public void clickAboutButton() 
	{
		AboutButton.click();
	}
	public String getTitelFromNewPage() 
	{
		driver.getTitle();
		return driver.getTitle();
	}

	
	
	@FindBy(xpath="//a[text()='Reset App State']")
	private WebElement ResetAppState;
	public void clickResetAppState() 
	{
		ResetAppState.click();
	}
	
	@FindBy(xpath="//button[text()='Close Menu']")
	private WebElement CloseMenuButton;
	public void clickCloseMenuButton() 
	{
		CloseMenuButton.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement ProductSortContainer;
	public void clickProductSortContainer() 
	{
		ProductSortContainer.click();
	}
	
	@FindBy(xpath="//span[@class='active_option']")
     private WebElement Containertext;
	public String getSlectedOptionText() 
	{
		Containertext.getText();
		return Containertext.getText();
	}
	
	
	@FindBy(xpath="//option[text()='Name (A to Z)']")
	private WebElement DropDownOptoinAtoZ;
	public void clickDropDownOptoinAtoZ() 
	{
		DropDownOptoinAtoZ.click();
	}
	
	@FindBy(xpath="//option[text()='Name (Z to A)']")
	private WebElement DropDownOptoinZtoA;
	public void clickDropDownOptoinZtoA() 
	{
		DropDownOptoinZtoA.click();
	}
	
	
	@FindBy(xpath="//option[text()='Price (low to high)']")
	private WebElement DropDownOptionPriceLH;
	public void clickDropDownOptionPriceLH() 
	{
		DropDownOptionPriceLH.click();
	}
	
	@FindBy(xpath="//option[text()='Price (high to low)']")
	private WebElement DropDownOptionPriceHL;
	public void clickDropDownOptionPriceHL() 
	{
		DropDownOptionPriceHL.click();
	}
	
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement CartButton;
	public void clickCartButton() 
	{
		CartButton.click();
	}
	public String getTextFromCart() 
	{
		CartButton.getText();
		return CartButton.getText();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement AddToCartButton;
	public void clickAddToCartButton() 
	{
		AddToCartButton.click();
//		AddToCartButton.getText();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> AllItems;
	public void clickAllItems() 
	{
		for(WebElement i:AllItems) 
		{
			i.click();
		}
		
	}
	
	
	@FindBy(xpath="//a[text()='Twitter']")
	private WebElement TwitterLink;
	public void clickTwitterLink() 
	{
		TwitterLink.click();
	}
	
	@FindBy(xpath="//a[text()='Facebook']")
	private WebElement FaceBookLink;
	public void clickFaceBookLink() 
	{
		FaceBookLink.click();
	}
	
	
	@FindBy(xpath="//a[text()='LinkedIn']")
	private WebElement LinkedInLink;
	public void clickLinkedInLink() 
	{
		LinkedInLink.click();
	}  
	
	
	@FindBy(xpath="//img[@alt='Sauce Labs Backpack']")
	private WebElement BackpachImage;
	public void clickBackpachImagek() 
	{
		BackpachImage.click();
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement BikeLightAtc;
	public void addToCartBikeLight() 
	{
		BikeLightAtc.click();
	}
	
	
	public   HomePagePOMClasss(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		driver.navigate().back();
	}
	
	
}
