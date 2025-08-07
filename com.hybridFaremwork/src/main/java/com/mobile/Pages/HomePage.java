package com.mobile.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.MobileBase;

public class HomePage extends MobileBase {

	@FindBy(id = "View menu")
	private WebElement humBergerMenu;

	@FindBy(id = "Login Menu Item")
	private WebElement loginItem;

	@FindBy(id = "nameET")
	private WebElement userName;

	@FindBy(id = "passwordET")
	private WebElement passWord;

	@FindBy(id = "buttonLL")
	private WebElement loginBtn;

	public HomePage clickHumberger() {
		clickON(humBergerMenu);
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
