package com.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Configure.PropertiesReader;
import com.Drivers.AppiumDriverManager;

import io.appium.java_client.AppiumDriver;

public class MobileBase {

	protected AppiumDriver driver;
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		String platform = PropertiesReader.getConfigureWeb("platform");
		driver= AppiumDriverManager.initDriver(platform);
	}
	
	@AfterMethod
	public void tearDown()
	{
		AppiumDriverManager.quitDriver();
	}
}
