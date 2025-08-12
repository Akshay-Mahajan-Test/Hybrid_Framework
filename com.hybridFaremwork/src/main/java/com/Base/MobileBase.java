package com.Base;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.Drivers.AppiumDriverManager;

import io.appium.java_client.AppiumDriver;

public class MobileBase extends AppiumDriverManager {

	protected AppiumDriver driver;

	public void webElementVisibility(WebElement e) {
		System.out.println("Element passed to webElementVisibility: " + e);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void clickON(WebElement e) {
		webElementVisibility(e);
		e.click();
	}

	public void sendKeysText(WebElement e, String keys) {
		webElementVisibility(e);
		e.sendKeys(keys);
	}

	public String getAttribute(WebElement e, String text) {
		webElementVisibility(e);
		return e.getAttribute(text);
	}

}
