package com.testSuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Pages.LoginPage;
import com.Utility.Screenshots;

public class NewTest extends Base {

	WebDriver driver;

	@Test
	public void logintest() throws Exception {
//		driver.manage().window().maximize();
		LoginPage loginpage = new LoginPage(getDriver());
		loginpage.inputUsername();
		loginpage.inputPassword();
		//Screenshots.takeScreenshot(driver, "logintest");
		loginpage.login();

	}
}
