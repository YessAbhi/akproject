package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.CheckOutPagePOMClass;
import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.POMClasses.OrderCopletPagePOMClass;
import com.sauceDemo.POMClasses.OrderOverviewPagePOMClass;
import com.sauceDemo.POMClasses.YourCartPagePOMClass;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_006_CheckOutFunctinality extends TestBaseClass
{
	@Test
	public void addTocartFunctionality() throws IOException 
	{
		log.info("TC_006_Started");
			HomePagePOMClasss hp =new HomePagePOMClasss(driver);
			hp.clickAddToCartButton();
			ScreenShotClass.ScreenShot(driver);
			log.info("Screenshot Taken");
			hp.clickCartButton();
			
			YourCartPagePOMClass cp =new YourCartPagePOMClass(driver);
			ScreenShotClass.ScreenShot(driver);
			log.info("Screenshot Taken");
			cp.clickCheckOutButton();
			
			CheckOutPagePOMClass cop =new CheckOutPagePOMClass(driver);
			cop.sendFirstName();
			cop.sendLastName();
			cop.sendPinCode();
			ScreenShotClass.ScreenShot(driver);
			log.info("Screenshot Taken");
			cop.clickContinueButton();
			
			OrderOverviewPagePOMClass op= new OrderOverviewPagePOMClass(driver);
			ScreenShotClass.ScreenShot(driver);
			log.info("Screenshot Taken");
			op.clickFinishButton();
			
			OrderCopletPagePOMClass oc = new OrderCopletPagePOMClass(driver);
			ScreenShotClass.ScreenShot(driver);
			log.info("Screenshot Taken");
			String ActualResult=oc.getTextFromLastPage();
			String ExpectedResult="THANK YOU FOR YOUR ORDER";
			oc.clickBackToHomePageButton();
			Assert.assertEquals(ExpectedResult, ActualResult);
			
			
		}

}
