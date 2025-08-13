package com.mobile.Pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Checkout {
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/fullNameET")
	private WebElement fullName;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/address1ET")
	private WebElement addressline1;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/address2ET")
	private WebElement addresslin2;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/cityET")
	private WebElement city;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/stateET")
	private WebElement state;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/zipET")
	private WebElement zipcode;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/countryET")
	private WebElement country;
	
	@AndroidFindBy(accessibility = "Saves user info for checkout")
	private WebElement toPayment;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/cardNumberET")
	private WebElement cardName;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/cardNumberET")
	private WebElement cardNumber;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/expirationDateET")
	private WebElement expiryDate;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/securityCodeET")
	private WebElement securityCode;
	
	@AndroidFindBy(accessibility = "Saves payment info and launches screen to review checkout data")
	private WebElement reviewOrder;
	
	
	
//	WebElement el10 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/fullNameET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el11 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/address1ET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el12 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cityET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el13 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/stateET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el14 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/zipET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el15 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/countryET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el16 = driver.findElement(AppiumBy.accessibilityId("Saves user info for checkout"));
//	// Code generation for action 'elementClick' is not currently supported
//	WebElement el18 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el19 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/cardNumberET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el20 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/expirationDateET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el21 = driver.findElement(AppiumBy.id("com.saucelabs.mydemoapp.android:id/securityCodeET"));
//	// Code generation for action 'elementSendKeys' is not currently supported
//	WebElement el22 = driver.findElement(AppiumBy.accessibilityId("Saves payment info and launches screen to review checkout data"));
//	// Code generation for action 'elementClick' is not currently supported
//	WebElement el23 = driver.findElement(AppiumBy.accessibilityId("Completes the process of checkout"));
//	// Code generation for action 'elementClick' is not currently supported
}
