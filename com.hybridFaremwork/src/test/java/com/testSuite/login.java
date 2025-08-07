package com.testSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base.Base;
import com.web.Pages.LoginPage;

public class login extends Base {

	WebDriver driver;

	@Test
	public void logintest() throws Exception {
//		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(getDriver());
		loginpage.inputUsername(null);
		loginpage.inputPassword(null);
		//Screenshots.takeScreenshot(driver, "logintest");
		loginpage.login();

	}
}
