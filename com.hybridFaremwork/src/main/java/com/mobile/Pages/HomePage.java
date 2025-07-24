package com.mobile.Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class HomePage {
	
	AppiumDriver driver;
	WebDriverWait wait;
	
	@FindBy()
	private WebElement a;
	
	@FindBy()
	private WebElement b;
	
	@FindBy()
	private WebElement c;
	
	@FindBy()
	private WebElement d;
	
	@FindBy()
	private WebElement e;
	
	public HomePage (AppiumDriver driver)
	{
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	
}
