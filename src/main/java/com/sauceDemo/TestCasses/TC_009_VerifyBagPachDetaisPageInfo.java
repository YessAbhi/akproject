package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.ProductInfoPagePOMClass;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_009_VerifyBagPachDetaisPageInfo extends TestBaseClass
{
	@Test
	public void verifyBagProductInfo() throws IOException 
	{
		log.info("TC_009_Started");
		HomePagePOMClasss hp =new HomePagePOMClasss(driver);
		
		hp.clickBackpachImagek();
		
		ProductInfoPagePOMClass pi=new ProductInfoPagePOMClass(driver);
		
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		
		String ExpectedResult ="carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		String ActualResult = pi.getTextFromProductInfoPage();
		Assert.assertEquals(ExpectedResult, ActualResult);
		pi.clickBackToProductsButton();
		
	}

}
