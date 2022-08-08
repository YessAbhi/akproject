package com.sauceDemo.TestCasses;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePagePOMClasss;
import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_004_VerifyFilterFunctionality  extends TestBaseClass
{
	@Test
	public void filterFunctionality() throws IOException 
	{
		log.info("TC_004_Started");
		HomePagePOMClasss hp=new HomePagePOMClasss(driver);
		hp.clickProductSortContainer();
		hp.clickDropDownOptoinAtoZ();
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String ActualResult =hp.getSlectedOptionText();
		String ExpectedResult ="NAME (A TO Z)";
		Assert.assertEquals(ExpectedResult,ActualResult );
		
		hp.clickProductSortContainer();
		hp.clickDropDownOptoinZtoA();
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String ActualResult1 =hp.getSlectedOptionText();
		String ExpectedResult1 ="NAME (Z TO A)";
		Assert.assertEquals(ExpectedResult1, ActualResult1);
		
		
		hp.clickProductSortContainer();
		hp.clickDropDownOptionPriceHL();
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String ActualResult2 =hp.getSlectedOptionText();
		String ExpectedResult2 ="PRICE (HIGH TO LOW)";
		Assert.assertEquals(ExpectedResult2,ActualResult2 );
		
		
		hp.clickProductSortContainer();
		hp.clickDropDownOptionPriceLH();
		ScreenShotClass.ScreenShot(driver);
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String ActualResult3 =hp.getSlectedOptionText();
		String ExpectedResult3 ="PRICE (LOW TO HIGH)";
		Assert.assertEquals(ExpectedResult3, ActualResult3);
		
		
	}

}
