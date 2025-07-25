package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.Configure.PropertiesReader;
import com.Drivers.DriverFactory;
import com.Utility.ExcelUtils;
import com.Utility.LoginUtils;

public class Base {

	protected WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeMethod
	public void setUp() throws Exception {
		String browserName = PropertiesReader.getConfigureWeb("browser");
		driver = DriverFactory.initDriver(browserName);
//		String baseURL = PropertiesReader.getValue("applicationUrl");
//		driver.get(baseURL);
		driver.get(PropertiesReader.getConfigureWeb("ApplicationUrl"));
		driver.manage().window().maximize();

		int implicitTime = Integer.parseInt(PropertiesReader.getConfigureWeb("ImplicitWait"));
		int pageloadTime = Integer.parseInt(PropertiesReader.getConfigureWeb("PageLoadTime"));

		driver.manage().timeouts().pageLoadTimeout(pageloadTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(implicitTime, TimeUnit.SECONDS);

		LoginUtils.loginwithCred(driver, ExcelUtils.writeToExcel(PropertiesReader.FILEPATH, "Login_Cred", 2, 2),
				ExcelUtils.writeToExcel(PropertiesReader.FILEPATH, "Login_Cred", 3, 3));
	}

	@AfterMethod
	public void QuitDriver() {
		DriverFactory.tearDown();
	}

}
