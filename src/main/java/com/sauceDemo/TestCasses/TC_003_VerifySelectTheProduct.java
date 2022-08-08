package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_003_VerifySelectTheProduct extends TestBaseClass
{
	@Test
	public void addToCartSingleProduct() throws IOException 
	{
		
		log.info("TC_003_Started");
	   HomePagePOMClasss hp = new HomePagePOMClasss(driver);
	   hp.clickAddToCartButton();
	   ScreenShotClass.ScreenShot(driver);
	   log.info("Screenshot Taken");
	   String APR =hp.getTextFromCart();
	   String EPR = "1";
	   Assert.assertEquals(EPR, APR);
	   
	
	}
}
