package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_005VerifyAboutFunctionality extends TestBaseClass
{
	@Test
	public void aboutFunctionality() throws InterruptedException, IOException 
	{
		log.info("TC_005_Started");
		HomePagePOMClasss hp=new HomePagePOMClasss(driver);
		hp.clickOpenManuButton();
		hp.clickAboutButton();
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String ActualResult = hp.getTitelFromNewPage();
		String ExpectedResult="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		Assert.assertEquals(ExpectedResult, ActualResult);
		driver.navigate().back();
		log.info("Nevigate Back to SauceDemo site");
		driver.navigate().back();
	}
	

}
