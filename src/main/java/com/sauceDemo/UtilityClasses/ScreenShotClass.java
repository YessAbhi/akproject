package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{

//	static WebDriver driver;
	public static void ScreenShot(WebDriver driver) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SF= ts.getScreenshotAs(OutputType.FILE);
		File DS=new File("./ScreenshotFolder/SauceDemo"+DateFormat()+".jpg");
		FileHandler.copy(SF, DS);
	}
	
	public static String DateFormat()
	{
		SimpleDateFormat Date = new SimpleDateFormat("yyyy-mm-dd HH-mm-ss-Ms");
		return Date.format(new Date());
		
	}

	

}
