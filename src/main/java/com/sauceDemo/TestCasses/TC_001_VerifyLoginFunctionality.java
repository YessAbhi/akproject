package com.sauceDemo.TestCasses;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.UtilityClasses.ScreenShotClass;

   public class TC_001_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void logInFunctionality() throws IOException 
	{
		log.info("TC_001_Started");
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String EPTital = "Swag Labs";
		String ACTitle =driver.getTitle();
		Assert.assertEquals(EPTital, ACTitle);
		System.out.println("hi");
	}

}
