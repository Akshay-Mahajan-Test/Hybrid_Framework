package com.Base;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileBase {

	protected AppiumDriver driver;

	public MobileBase()
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void webElementVisibility(WebElement e)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	public void clickON(WebElement e)
	{
		webElementVisibility(e);
		e.click();
	}
	
	public void sendKeysText(WebElement e, String keys)
	{
		webElementVisibility(e);
		e.sendKeys(keys);
	}
	
	public String getAttribute(WebElement e, String text)
	{
		webElementVisibility(e);
		return e.getAttribute(text);
	}
	
}
