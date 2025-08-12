package com.mobile.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Base.MobileBase;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductPage extends MobileBase {

	@AndroidFindBy(accessibility = "productTV")
	private WebElement titlePage;
	
	@AndroidFindBy(accessibility = "new UiSelector().text(\"Sauce Labs Backpack (red)\")")
	private WebElement product;
	
	

	WebElement el5 = driver.findElement(AppiumBy.accessibilityId("Increase item quantity"));
	// Code generation for action 'elementClick' is not currently supported
	WebElement el6 = driver.findElement(AppiumBy.accessibilityId("Confirms products for checkout"));
	// Code generation for action 'elementClick' is not currently supported
	WebElement el7 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el8 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el9 = driver.findElement(AppiumBy.accessibilityId("Tap to login with given credentials"));
	// Code generation for action 'elementClick' is not currently supported
	WebElement el10 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/fullNameET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el11 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/address1ET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el12 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cityET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el13 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/stateET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el14 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/zipET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el15 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/countryET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el16 = driver.findElement(AppiumBy.accessibilityId("Saves user info for checkout"));
	// Code generation for action 'elementClick' is not currently supported
	WebElement el18 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el19 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cardNumberET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el20 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/expirationDateET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el21 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/securityCodeET"));
	// Code generation for action 'elementSendKeys' is not currently supported
	WebElement el22 = driver.findElement(AppiumBy.accessibilityId("Saves payment info and launches screen to review checkout data"));
	// Code generation for action 'elementClick' is not currently supported
	WebElement el23 = driver.findElement(AppiumBy.accessibilityId("Completes the process of checkout"));
	// Code generation for action 'elementClick' is not currently supported

	
	
	
	
	
	
	
	

	public ProductPage() {
		this.driver = getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public String getTitle(String title) {
		return getAttribute(titlePage, "text");
	}
}
