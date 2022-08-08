package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.YourCartPagePOMClass;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_010_VerifythePriceOfBikeLighOnYourCartPage extends TestBaseClass
{
	@Test
	public void verifyPriceOfBikeLightOnYourCartPage() throws IOException 
	{
		log.info("TC_010_Started");
		HomePagePOMClasss hp =new HomePagePOMClasss(driver);
		hp.addToCartBikeLight();
		hp.clickCartButton();
		
		YourCartPagePOMClass yc=new YourCartPagePOMClass(driver);
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String ActualResult =yc.gettextFromYourCartPage();
		String ExpectedResult="$9.99";
		Assert.assertEquals(ExpectedResult, ActualResult);
		yc.clickContinueShoppingButton();
		
	}

}
