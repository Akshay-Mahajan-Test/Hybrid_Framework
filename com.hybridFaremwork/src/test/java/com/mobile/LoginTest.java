package com.mobile;

import org.testng.annotations.Test;

import com.Base.MobileBase;
import com.mobile.Pages.HomePage;
import com.mobile.Pages.ProductPage;

public class LoginTest extends MobileBase {

	HomePage homePage;
	ProductPage productPage;

	@Test
	public void validCredentials() {
		homePage = new HomePage();
		homePage.clickHumberger();
		homePage.clickonLoginIn();
		homePage.enterUserName("bod@example.com");
		homePage.enterPassWord("10203040");
		productPage = homePage.clickBtn();

	}

}
