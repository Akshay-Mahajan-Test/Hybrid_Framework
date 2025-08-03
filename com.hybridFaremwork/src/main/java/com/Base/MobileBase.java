package com.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Drivers.AppiumDriverManager;

import io.appium.java_client.AppiumDriver;

public class MobileBase {

	protected AppiumDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = AppiumDriverManager.initDriver("Android");

	}
	
	
	@AfterMethod
	public void tearDown() {
		AppiumDriverManager.quitDriver();
	}
}
