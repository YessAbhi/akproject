package com.sauceDemo.TestCasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.UtilityClasses.ScreenShotClass;

public class TC_002_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
	public void logoutFunctionality() throws IOException 
	{
		log.info("TC_002_Started");
		ScreenShotClass.ScreenShot(driver);
		log.info("Screenshot Taken");
		String EPTital = "Swag Labs";
		String ACTitle =driver.getTitle();
		Assert.assertEquals(EPTital, ACTitle);
	    
		
	}
}
