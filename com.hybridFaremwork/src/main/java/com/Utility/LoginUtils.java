package com.Utility;

import org.openqa.selenium.WebDriver;

import com.web.Pages.LoginPage;

public class LoginUtils {
	
	public static void loginwithCred (WebDriver driver, String userName, String passWord)
	{
		LoginPage login = new LoginPage(driver);
		login.inputUsername(userName);
		login.inputPassword(passWord);
		login.login();
	}

}
