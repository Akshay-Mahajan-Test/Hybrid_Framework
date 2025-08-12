package com.mobile.Pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewProduct {

	@AndroidFindBy(accessibility = "new UiSelector().resourceId(\\\"com.saucelabs.mydemoapp.android:id/productIV\\\").instance(3)")
	private WebElement quantityOfProduct;
	
	@AndroidFindBy(accessibility = "Tap to add product to cart")
	private WebElement clickOnAddCart;
	
	@AndroidFindBy(accessibility = "com.saucelabs.mydemoapp.android:id/cartIV")
	private WebElement clickonCart;
	
}
