package com.mobile.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Base.MobileBase;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends MobileBase {

	@AndroidFindBy(accessibility = "View menu")
	private WebElement humBergerMenu;

	@AndroidFindBy(accessibility = "Login Menu Item")
	private WebElement loginItem;

	@AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
	private WebElement userName;

	@AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
	private WebElement passWord;

	@AndroidFindBy(accessibility = "Tap to login with given credentials")
	private WebElement loginBtn;

	public HomePage() {
		this.driver = getDriver();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public HomePage clickHumberger() {
		clickON(humBergerMenu);
		return this;
	}

	public HomePage clickonLoginIn() {
		clickON(loginItem);
		return this;
	}

	public HomePage enterUserName(String user) {
		sendKeysText(userName, user);
		return this;
	}

	public HomePage enterPassWord(String Pass) {
		sendKeysText(passWord, Pass);
		return this;
	}

	public ProductPage clickBtn() {
		clickON(loginBtn);
		return new ProductPage();
	}
}
